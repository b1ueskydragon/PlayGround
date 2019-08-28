package factory;

public class TestObjectFactory {

  public TestObject create(int id, String status) {
    return new TestObject(id, status);
  }

}
