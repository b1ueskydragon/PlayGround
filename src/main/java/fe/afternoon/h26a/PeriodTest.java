package fe.afternoon.h26a;

import java.util.Date;

public class PeriodTest {
  private static final long DELTA = 60 * 60 * 10000L;

  // case: コンストラクタが正しくない引数に対して例外を投げる
  private static void testException(Date start, Date end, Class<? extends RuntimeException> expected) {
    try {
      Period period = new Period(start, end);
    } catch (RuntimeException e) {
      if (e.getClass() == expected) return;
      throw new RuntimeException("unexpected exception", e);
    }
    throw new RuntimeException("no " + expected + "thrown");
  }

  // case: 期限の長さおよび方向(始点と終点の前後関係)の整合性を確認する
  private static void testConsistency(Period period, long length) {
    if (period.getLength() != length) {
      throw new RuntimeException("invalid getLength() value");
    }
    if (period.isBackward() != length < 0) {
      throw new RuntimeException("isBackward failed");
    }
  }

  // case: contains() が期間に含まれるデータ及び含まれないデータに対して正しく判定することを確認する
  // 引数が null の場合は例外を投げる
  private static void testContains(Period period, long[] valid, long[] invalid) {
    for (long time : valid) {
      if (!period.contains(new Date(time))) {
        throw new RuntimeException("failed with valid: " + time);
      }
    }
    for (long time : invalid) {
      if (period.contains(new Date(time))) {
        throw new RuntimeException("failed with invalid: " + time);
      }
    }
    try {
      period.contains(null);
      throw new RuntimeException("no NPE thrown");
    } catch (NullPointerException e) {
    }
  }

  public static void main(String[] args) {
    testException(null, new Date(0L), NullPointerException.class);
    testException(new Date(0L), null, NullPointerException.class);
    testException(new Date(-1L), new Date(0L), IllegalArgumentException.class);
    testException(new Date(0L), new Date(-1L), IllegalArgumentException.class);

    long now = System.currentTimeMillis();
    Date start = new Date(now);
    Date end = new Date(now + DELTA);
    final Period period = new Period(start, end);
    testConsistency(period, DELTA);
    testContains(period,
        new long[]{now, now + 1, now + DELTA - 1},
        new long[]{now - 1, now + DELTA, now + DELTA + 1});
    Date backwardEnd = new Date(now - DELTA);
    final Period backwardPeriod = new Period(start, backwardEnd);
    testContains(backwardPeriod,
        new long[]{now, now - 1, now - DELTA + 1},
        new long[]{now + 1, now - DELTA, now - DELTA - 1});

    final Period nullPeriod = new Period(start, start);
    testConsistency(nullPeriod, 0);
    testContains(nullPeriod, new long[0], new long[]{now - 1, now, now + 1});

    start.setTime(now - DELTA);
    end.setTime(now + DELTA * 2);
    testConsistency(period, DELTA);
    testContains(period,
        new long[] {now, now + 1, now + DELTA - 1},
        new long[] {now - 1, now + DELTA, now + DELTA + 1});
    Date newStart = period.getStart();
    newStart.setTime(newStart.getTime() - DELTA);
    Date newEnd = period.getEnd();
    newEnd.setTime(newEnd.getTime() + DELTA);
    testConsistency(period, DELTA);
    testContains(period,
        new long[] {now, now + 1, now + DELTA - 1},
        new long[] {now - 1, now + DELTA, now + DELTA + 1});
  }
}
