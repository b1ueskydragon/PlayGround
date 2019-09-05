package graffiti2019;

import factory.TestObject;
import factory.TestObjectFactory;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

class JacksonParseSpec {

  @Test
  void test_parse_obj_to_json_and_reparse_to_obj() throws Exception {
    var factory = new TestObjectFactory();
    var underTest = JacksonParse.getInstance();

    TestObject obj = factory.create(101, "202");
    String parsedJson = underTest.javaObjToJson(obj);
    TestObject reparsedObj = underTest.jsonToJavaObj(parsedJson, TestObject.class);

    var expected = new TestObject(101, "202");

    assertThat(reparsedObj.getId(), equalTo(expected.getId()));
    assertThat(reparsedObj.getStatus(), equalTo(expected.getStatus()));
  }

}
