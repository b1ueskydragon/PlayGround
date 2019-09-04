package graffiti2019.jsons;

import java.util.List;

/**
 * Usage of this bean as an example; json-formatted RequestBody.
 */
public class MyNotification {

  private final String name; // NotNull
  private final Integer contentId; // NotNull
  private final List<Error> errors; // Optional; we want erase if the field is null

  public MyNotification(String name, Integer contentId, List<Error> errors) {
    this.name = name;
    this.contentId = contentId;
    this.errors = errors;
  }

  public String getName() {
    return this.name;
  }

  public Integer getContentId() {
    return this.contentId;
  }

  public List<Error> getErrors() {
    return errors;
  }

}
