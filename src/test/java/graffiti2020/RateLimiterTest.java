package graffiti2020;

import com.google.common.util.concurrent.RateLimiter;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("UnstableApiUsage")
public class RateLimiterTest {

  private static void myFunction() { }

  @Test
  public void shouldLimitPermitsWhenLimitedResourceGiven() {

    final RateLimiter rateLimiter = RateLimiter.create(100);

    long startTime = ZonedDateTime.now().getSecond();
    // acquire 1000 times.
    IntStream.range(0, 1000).forEach(i -> {
      rateLimiter.acquire();
      myFunction();
    });
    long elapsedTimeSeconds = ZonedDateTime.now().getSecond() - startTime;

    // only can execute 100 units per 1 second, and there are 1000 acquires.
    assertTrue(elapsedTimeSeconds >= 10);

  }

}
