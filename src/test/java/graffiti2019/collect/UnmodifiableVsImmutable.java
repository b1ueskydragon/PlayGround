package graffiti2019.collect;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnmodifiableVsImmutable {

  @Test
  public void test_unmodifiable() {
    List<String> modifiableList = new ArrayList<>();
    modifiableList.add("a");
    assertThat(modifiableList, equalTo(List.of("a")));

    // wrapped
    List<String> unModifiableList = Collections.unmodifiableList(modifiableList);
    assertThat(unModifiableList, equalTo(List.of("a")));
    assertThrows(UnsupportedOperationException.class, () -> unModifiableList.add("b"));

    modifiableList.add("b");
    assertThat(modifiableList, equalTo(List.of("a", "b")));
    assertThat(unModifiableList, equalTo(List.of("a", "b")));
  }

  @Test
  public void test_immutable() {
    List<String> modifiableList = new ArrayList<>();
    modifiableList.add("a");
    assertThat(modifiableList, equalTo(List.of("a")));

    // wrapped
    // same as; Collections.unmodifiableList(new ArrayList<>(modifiableList))
    List<String> immutableList = List.copyOf(modifiableList);
    assertThat(immutableList, equalTo(List.of("a")));
    assertThrows(UnsupportedOperationException.class, () -> immutableList.add("b"));

    modifiableList.add("b");
    assertThat(modifiableList, equalTo(List.of("a", "b")));
    assertThat(immutableList, equalTo(List.of("a")));
  }

}
