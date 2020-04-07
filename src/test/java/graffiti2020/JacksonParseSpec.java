package graffiti2020;

import factory.TestObject;
import factory.TestObjectFactory;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static factory.TestObject.Page;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * For parsing Optional Type properly on Jackson, `registerModule(new Jdk8Module())` is required.
 */
class JacksonParseSpec {

  private JacksonParse underTest = JacksonParse.getInstance();

  @Test
  void couldParseAndViceVersa() throws Exception {
    final TestObjectFactory factory = new TestObjectFactory();

    final TestObject obj = factory.create(101, "202", null);
    final String parsedJson = underTest.javaObjToJson(obj);
    final TestObject deserializedObj = underTest.jsonToJavaObj(parsedJson, TestObject.class);
    final TestObject expected = new TestObject(101, "202", null);

    assertThat(deserializedObj.getId(), equalTo(expected.getId()));
    assertThat(deserializedObj.getStatus(), equalTo(expected.getStatus()));
    assertThat(deserializedObj.getPage(), equalTo(Optional.empty()));
  }

  @Test
  void couldParseAndViceVersaWhenHasOptionalValue() throws Exception {
    final TestObjectFactory factory = new TestObjectFactory();

    final TestObject obj = factory.create(101, "202", new Page("Nice Title"));
    final String parsedJson = underTest.javaObjToJson(obj);
    final TestObject deserializedObj = underTest.jsonToJavaObj(parsedJson, TestObject.class);
    final TestObject expected = new TestObject(101, "202", new Page("Nice Title"));
    assertThat(deserializedObj.getId(), equalTo(expected.getId()));

    assertThat(deserializedObj.getStatus(), equalTo(expected.getStatus()));
    assertThat(deserializedObj.getPage().get().getTitle(), equalTo("Nice Title"));
  }

}
