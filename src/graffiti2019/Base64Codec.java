package graffiti2019;

import org.apache.commons.codec.binary.Base64;

public class Base64Codec {

//  private static byte[] int2byte(int[] xs) {
//    int size = xs.length;
//    byte[] bytes = new byte[size << 2];
//
//    for (int i = 0; i < size; i++) {
//      int x = xs[i];
//      int j = i << 2;
//      bytes[j++] = (byte) (x & 0xff);
//      bytes[j++] = (byte) ((x >>> 8) & 0xff);
//      bytes[j++] = (byte) ((x >>> 16) & 0xff);
//      bytes[j] = (byte) ((x >>> 24) & 0xff);
//    }
//    return bytes;
//  }

  private static byte[] int2byte(int[] xs) {
    byte[] bytes = new byte[xs.length];
    int i = 0;
    for (int x : xs) bytes[i++] = (byte) (x & 0xff);
    return bytes;
  }

  public static void main(String... args) {
    // 16 length
    int[] intArray = {28, -109, -118, -79, -20, -33, -43, 96, 48, 109, -94, -46, -23, 17, 91, -5};
    byte[] byteArray = int2byte(intArray);
    String base64ed = Base64.encodeBase64String(byteArray);
    for (char c : base64ed.toCharArray()) System.out.print(c);
  }

}
