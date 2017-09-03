package code.with.play;
/**
 * 参考
 * http://enterprisegeeks.hatenablog.com/entry/2015/11/30/081118
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
  private String  name;
  private boolean maleFlag;
  private int     age;

  public String  getName() { return this.name; }
  public boolean isMale()  { return this.maleFlag; }
  public int     getAge()  { return this.age; }

  public Person(String name, boolean maleFlag, int age) {
    this.name = name;
    this.maleFlag = maleFlag;
    this.age = age;
  }
}

public class PersonUtil {

  public List<String> collectNamesStartsWith(List<Person> persons,
                                             String prefix) {
    List<String> names = new ArrayList<>();
    for (Person person : persons) {
      String name = person.getName();
      if (name.startsWith(prefix)) {
        names.add(name);
      }
    }
    return names;
  }

  public List<String> collectNamesStartsWithStream (List<Person> persons,
                                                      String prefix) {
    return persons.stream()
                  .map(p -> p.getName()) // Person::getName と同じ
                  .filter(s -> s.startsWith(prefix)) // ここまで Stream<String> 型
                  .collect(Collectors.toList()); // これにより List<String> に変換
  }


  public static void main(String [] args) {
    // データ
    List<Person> presidents = Arrays.asList( // 変換前の配列をあたかもListのように見せているだけ (長さ固定) *変えると実行時エラー*
        new Person("Richard Nixon", true, 56), // new することで可変になる
        new Person("Gerald Ford", true, 61),
        new Person("Jimmy Carter", true, 52),
        new Person("Ronald Reagan", true, 69),
        new Person("George Bush", true, 64),
        new Person("Bill Clinton", true, 46),
        new Person("George Bush", true, 54),
        new Person("Barack Obama", true, 47)
    );

    // for-each
    List<String> names
        = new PersonUtil().collectNamesStartsWith(presidents, "B");
    for (String name : names) {
      System.out.println(name);
    }

    // Java8
    new PersonUtil()
        .collectNamesStartsWithStream(presidents, "B")
        .forEach(System.out::println); // クラス::メソッド
  }
}