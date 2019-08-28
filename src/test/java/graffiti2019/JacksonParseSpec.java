package graffiti2019;

import factory.TestObjectFactory;
import org.junit.jupiter.api.Test;

class JacksonParseSpec {

  private JacksonParse underTest = JacksonParse.getInstance();

  private TestObjectFactory factory = new TestObjectFactory();

  @Test
  void test_javaObject_to_JSON() throws Exception {
    var json = "{\"id\":123, \"status\":\"200\"}";
    // TODO parse before compare
  }

  @Test
  void test_JSON_to_javaObject() throws Exception {

  }

}
