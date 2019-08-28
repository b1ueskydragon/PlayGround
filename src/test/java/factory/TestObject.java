package factory;

public class TestObject {

  private int id;

  private String status;

  TestObject(int id, String status) {
    this.id = id;
    this.status = status;
  }

  @Override
  public String toString() {
    return String.format("%s status: %s", id, status);
  }

}
