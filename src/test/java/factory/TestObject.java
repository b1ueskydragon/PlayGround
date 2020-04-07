package factory;

import java.util.Optional;

public class TestObject {

  private int id;

  private String status;

  public TestObject() { /* for Deserialization, object must have a zero-arg constructor */ }

  public TestObject(int id, String status, Page page) {
    this.id = id;
    this.status = status;
    this.page = page;
  }

  public int getId() {
    return id;
  }

  public String getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return String.format("id: %s\tstatus: %s", id, status);
  }


  public static class Page {
    private String title;

    public Page() { /* for Deserialization, object must have a zero-arg constructor */ }

    public Page(String title) {
      this.title = title;
    }

    public String getTitle() {
      return title;
    }
  }

  private Page page;

  public Optional<Page> getPage() {
    return Optional.ofNullable(page);
  }
}
