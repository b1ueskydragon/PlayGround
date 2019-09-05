package factory;

public class TestObject {

  private int id;

  private String status;

  public TestObject() { /* for Deserialization, object must have a zero-arg constructor */ }

  public TestObject(int id, String status) {
    this.id = id;
    this.status = status;
  }

  @Override
  public String toString() {
    return String.format("id: %s\tstatus: %s", id, status);
  }

}
