package graffiti2018;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

import static java.lang.System.out;

public class NumericRange {
  public static void main(String... args) {
    // printMax();
    // buf();
    getUInt32();
  }

  private static void printMax() {
    out.println(Integer.MAX_VALUE);
    out.println(Long.MAX_VALUE); // scala> Long.MaxValue

    Long maxValL = (Long.MAX_VALUE >> (2 * 16)) + 1;

    out.println(maxValL - 1 == Integer.MAX_VALUE);

    out.println(0xffffffffL);

    out.println((Integer.MAX_VALUE + 1) & 0xFFFFFFFFL);

    // (Long.MaxValue >> (2 * 16)) + 1 == 2147483648
    // ((Long.MaxValue >> (2 * 16)) * 2) + 1 == 4294967295. max value of unsigned int
  }

  private static void buf() {
    final long UNSIGNED_INT_MAX = 0xFFFFFFFFL;

    final int TOTAL_SIZE = 8; // TODO: 4 ?? 結局 0xFFFFFFFF は 2^32
    byte[] array = new byte[TOTAL_SIZE];

    ByteBuffer byteBuffer = ByteBuffer.wrap(array);
    byteBuffer.putLong(0, UNSIGNED_INT_MAX);

    out.println(byteBuffer.getLong(0));

    byte[] buf = new byte[4];
    buf[0] = (byte) UNSIGNED_INT_MAX;
    buf[1] = (byte) UNSIGNED_INT_MAX >> 8;
    buf[2] = (byte) UNSIGNED_INT_MAX >> 16;
    buf[3] = (byte) UNSIGNED_INT_MAX >> 24;

    long value = (buf[3] << 24) | (buf[2] << 16) | (buf[1] << 8) | buf[0];
    out.println(value);
  }

  private static long getUInt32() {
    byte[] bytes = new byte[4]; // c++> getBytes(4)

    bytes[0] = 1;
    bytes[1] = 1;
    bytes[2] = 1;
    bytes[3] = 1;

    long value = bytes[0] & 0xFF;
    out.println(value);
    value |= (bytes[1] << 8) & 0xFFFF;
    out.println(value);
    value |= (bytes[2] << 16) & 0xFFFFFF;
    out.println(value);
    value |= (bytes[3] << 24) & 0xFFFFFFFF;
    out.println(value);
    return value;
  }
}
