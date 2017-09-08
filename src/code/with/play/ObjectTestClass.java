package code.with.play;

import java.util.ArrayList;
import java.util.List;

/**
 * この前 Type String の tmp に final つけるかどうかで悩んだやつ。
 * List とちょっと違う
 */
public class ObjectTestClass {
  public static void main(String [] args) {
    TestterClass testterClass = new TestterClass();
    // ①
    testterClass.setValue("Hello I'm Testy");
    System.out.println(testterClass.getValue());

    // ②
    String tmpStr = testterClass.getValue();
    System.out.println(tmpStr);

    // ③
    testterClass.setValue("Am I will be changed?");
    System.out.println(testterClass.getValue());

    // ④
    System.out.println(tmpStr); // 変わらない

    System.out.println("-----------------------------------");

    List<String> list = new ArrayList<>();
    list.add("I ");
    list.add("am ");
    list.add("Happy");

  //  List<String> strList = Arrays.asList("I ", "am ", "Happy");

    // ①
    testterClass.setList(list);
    testterClass.getList().forEach(System.out::print);
    System.out.println("");

    // ②
    List<String> tmpList = testterClass.getList();
    tmpList.forEach(System.out::print);
    System.out.println("");

    // ③
    testterClass.getList().set(2, "so ");
    testterClass.getList().add("Happy");
    testterClass.getList().forEach(System.out::print);
    System.out.println("");

    // ④
    tmpList.forEach(System.out::print); // 変わる
  }
}

class TestterClass {
  private String value;
  public void setValue(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }

  private List<String> list;
  public List<String> getList() {
    return list;
  }
  public void setList(List<String> list) {
    this.list = list;
  }
}
