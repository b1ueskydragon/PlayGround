package graffiti2019.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DragonBuildDirectorSpec {

  @Test
  void test_construct() {
    final DragonBuilder builder = new DragonBuilderImpl();
    final DragonBuildDirector underTest = new DragonBuildDirector(builder);

    Dragon dragon = underTest.construct(11101, "skyblue");

    assertEquals(11101, dragon.getAge());
    assertEquals("skyblue", dragon.getColor());
  }

}
