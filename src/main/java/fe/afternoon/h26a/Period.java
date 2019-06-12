package fe.afternoon.h26a;

import java.util.Date;

public class Period {
  private static final Date EPOCH = new Date(0L);
  private final Date start, end;

  public Period(Date start, Date end) {
    if (start == null || end == null) {
      throw new NullPointerException();
    }
    this.start = start;
    this.end = end;
  }

  public Date getStart() {
    return (Date) start.clone(); // origin: start
  }

  public Date getEnd() {
    return (Date) end.clone(); // origin: end
  }

  public long getLength() {
    return end.getTime() - start.getTime();
  }

  public boolean isBackward() {
    return end.compareTo(start) < 0;
  }

  public boolean contains(Date time) {
    return (time.compareTo(start) >= 0
        && time.compareTo(end) < 0)
        || (time.compareTo(start) <= 0
        && time.compareTo(end) > 0);
  }
}
