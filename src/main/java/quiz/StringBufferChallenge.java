package quiz;

public class StringBufferChallenge {
  public static void main(String... args) {
    Object nullObj = null;
    StringBuffer buffer = new StringBuffer(10);
    buffer.append("nobugs ");
    buffer.append("project ");
    buffer.append(nullObj);
    buffer.insert(14, '!'); // int offset, char c
    System.out.println(buffer);
  }
}
