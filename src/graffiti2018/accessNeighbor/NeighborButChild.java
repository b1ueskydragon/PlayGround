package graffiti2018.accessNeighbor;

import graffiti2018.accessTest.ChildClass;

public class NeighborButChild extends ChildClass {
  public static void main(String... args) {
    System.out.println(new ChildClass().someString());
  }
}
