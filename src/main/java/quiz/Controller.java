package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Controller {

  public List<Person> findPerson() throws SQLException {
    List<Person> personLIst = new ArrayList<Person>();

    Connection conn = null;
    Statement stmt = null;

    conn = DriverManager.getConnection("DB_URL", "USER", "PASS");
    conn.createStatement();

    return personLIst;
  }

}

// 宣言場所と方法がおかしいかも

//module com.modulestest.view {
//  requires java.base;
//}

// ?
class Person {

}
