package quiz2018.comparisonWithLambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * http://www.baeldung.com/java-8-sort-lambda
 */
public class Tester {

  @Test
  public void givenPreLambda_whenSortingEntitiesByName_thenCorrectlySorted() {
    List<Human> humans = new ArrayList<>();
    humans.add(new Human("Alex", 23));
    humans.add(new Human("Rick", 21));

    Collections.sort(humans, new Comparator<Human>() {
      @Override
      public int compare(Human h1, Human h2) {
        return h1.getName().compareTo(h2.getName());
      }
    });

    assertThat(humans.get(0), equalTo(new Human("Rick", 21)));
  }

  @Test
  public void whenSortingEntitiesByName_thenCorrectlySorted() {
    List<Human> humans = new ArrayList<>();
    humans.add(new Human("Alex", 23));
    humans.add(new Human("Rick", 21));

    humans.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));

    assertThat(humans.get(0), equalTo(new Human("Rick", 21)));
  }

  @Test
  public void
  givenLambdaShortForm_whenSortingEntitiesByName_thenCorrectlySorted() {
    List<Human> humans = new ArrayList<>();
    humans.add(new Human("Alex", 23));
    humans.add(new Human("Rick", 21));

    humans.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));

    assertThat(humans.get(0), equalTo(new Human("Rick", 21)));
  }

  @Test
  public void
  givenMethodDefinition_whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
    List<Human> humans = new ArrayList<>();
    humans.add(new Human("Alex", 23));
    humans.add(new Human("Rick", 21));

    humans.sort(Human::compareByNameThenAge);
    assertThat(humans.get(0), equalTo(new Human("Rick", 21)));
  }

  @Test
  public void
  givenInstanceMethod_whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
    List<Human> humans = new ArrayList<>();
    humans.add(new Human("Alex", 23));
    humans.add(new Human("Rick", 21));

    Collections.sort(
        humans, Comparator.comparing(Human::getName));
    assertThat(humans.get(0), equalTo(new Human("Rick", 21)));
  }

  @Test
  public void whenSortingEntitiesByNameReversed_thenCorrectlySorted() {
    List<Human> humans = new ArrayList<>();
    humans.add(new Human("Alex", 23));
    humans.add(new Human("Rick", 21));

    Comparator<Human> comparator
        = (h1, h2) -> h1.getName().compareTo(h2.getName());

    humans.sort(comparator.reversed());

    assertThat(humans.get(0), equalTo((new Human("Rick", 21))));
  }

  @Test
  public void whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
    List<Human> humans = new ArrayList<>();
    humans.add(new Human("Alex", 23));
    humans.add(new Human("Rick", 21));
    humans.add(new Human("Tommy", 10));

    humans.sort((lhs, rhs) -> {
      if (lhs.getName().equals(rhs.getName())) {
        return lhs.getAge() - rhs.getAge();
      } else {
        return lhs.getName().compareTo(rhs.getName());
      }
    });
    assertThat(humans.get(0), equalTo(new Human("Tommy", 10)));
  }

  @Test
  public void
  givenComposition_whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
    List<Human> humans = new ArrayList<>();
    humans.add(new Human("Alex", 23));
    humans.add(new Human("Rick", 21));
    humans.add(new Human("Tommy", 10));

    humans.sort(
        Comparator.comparing(Human::getName).thenComparing(Human::getAge)
    );

    assertThat(humans.get(0), equalTo(new Human("Tommy", 10)));
  }
}
