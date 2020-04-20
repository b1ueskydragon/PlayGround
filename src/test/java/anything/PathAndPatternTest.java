package anything;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


class PathAndPatternTest {

  private final AtomicInteger x;

  PathAndPatternTest() {
    x = new AtomicInteger(-1);
  }

  @Test
  void testPathAndPattern() {
    final String uri = "/root/a/b/c/RESULT/20200420/filename.tsv.gz";
    final String uriB = "/root/a/b/c/RESULT/2020042011/filename.tsv.gz";

    final Pattern PATH_PATT = Pattern.compile("^/.+/\\d{4}\\d{2}\\d{2}\\d{0,2}/.+$");

    // (yyyymmdd|yyyymmddhh)
    final Pattern DATE_PATT = Pattern.compile("^\\d{4}\\d{2}\\d{2}\\d{0,2}$");

    final String fidnWithRelationship = Paths.get(uri).getParent().getParent().getFileName().toString();

    assertThat(fidnWithRelationship, equalTo("RESULT"));

    assertTrue(PATH_PATT.matcher(uri).matches());
    assertTrue(PATH_PATT.matcher(uriB).matches());

    final String[] dirs = uri.split("/");

    PathAndPatternTest _this = new PathAndPatternTest();
    for (String dir : dirs) {
      if (DATE_PATT.matcher(dir).matches()) break;
      _this.x.incrementAndGet();
    }

    assertThat(dirs[_this.x.get()], equalTo("RESULT"));

    // plain int; not a thread safe?
    int i;
    for (i = 0; i < dirs.length; i++) {
      if (DATE_PATT.matcher(dirs[i]).matches()) break;
    }

    assertThat(dirs[i - 1], equalTo("RESULT"));
  }

}
