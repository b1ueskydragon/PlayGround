package factory;

import org.springframework.stereotype.Component;

@Component
public class TestObjectFactory {  // TODO to use, Autowired

  public TestObject create(int id, String status, TestObject.Page page) {
    return new TestObject(id, status, page);
  }

}
