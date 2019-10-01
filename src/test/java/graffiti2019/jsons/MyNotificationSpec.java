package graffiti2019.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyNotificationSpec {

  private ObjectMapper mapper;

  private MyNotification underTest;

  @BeforeEach
  public void setUp() throws Exception {
    mapper = new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    underTest = new MyNotification("Shisa", 101, null);
  }

  @Test
  public void testSetIncludeNonNull() throws Exception {
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    var expected = "{\"name\":\"Shisa\",\"contentId\":101}";
    var actual = mapper.writeValueAsString(underTest);
    assertEquals(expected, actual);
  }

  @Test
  public void testDisableIncludeNonNull() throws Exception {
    var expected = "{\"name\":\"Shisa\",\"contentId\":101,\"errors\":null}";
    var actual = mapper.writeValueAsString(underTest);
    assertEquals(expected, actual);
  }

}
