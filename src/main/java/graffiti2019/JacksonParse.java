package graffiti2019;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    mapper = new ObjectMapper();
  }

  /**
   * java Object -> JSON
   */
  public String javaObjToJson(Object obj) throws JsonProcessingException {
    return mapper.writeValueAsString(obj);
  }

  /**
   * JSON -> java Object
   */
  public <T> T jsonToJavaObj(String json, Class<? extends T> type) throws IOException {
    return mapper.readValue(json, type);
  }

}
