package graffiti2019;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

import java.io.IOException;

/**
 * Singleton
 */
public class JacksonParse {

  private static JacksonParse jacksonParse = new JacksonParse();

  public static JacksonParse getInstance() {
    return jacksonParse;
  }

  private ObjectMapper mapper;

  private JacksonParse() {
    mapper = new ObjectMapper()
        .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
        // Enable to parse type Optional as an object we expect, not a string.
        .registerModule(new Jdk8Module());
  }

  /**
   * java Object -> JSON
   */
  public <T> String javaObjToJson(T obj) throws JsonProcessingException {
    return mapper.writeValueAsString(obj);
  }

  /**
   * JSON -> java Object
   */
  public <T> T jsonToJavaObj(String json, Class<? extends T> type) throws IOException {
    return mapper.readValue(json, type);
  }

}
