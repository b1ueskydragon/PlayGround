package graffiti2019.builder_link_all;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class DragonSpec {

  @Test
  void test_Builder_with_only_required_field() {
    Dragon dragon = Dragon.builder().name("Shisa").color("Orange").build();
    assertEquals("Shisa", dragon.getName());
    assertEquals("Orange", dragon.getColor());
  }

}
