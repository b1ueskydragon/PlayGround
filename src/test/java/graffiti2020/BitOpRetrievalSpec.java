package graffiti2020;

import org.junit.jupiter.api.Test;

import java.util.List;

import static graffiti2020.BitOpRetrieval.retrievalAll;
import static org.junit.Assert.assertEquals;

class BitOpRetrievalSpec {

  @Test
  void generateBSTby3depthAsBFSOrder() {
    var depth = 3;
    var expected = List.of(
        "001",
        "011", "010",
        "111", "110", "101", "100");
    assertEquals(expected, retrievalAll(depth));
  }

  @Test
  void generateBSTby4depthAsBFSOrder() {
    var depth = 4;
    var expected = List.of(
        "0001",
        "0011", "0010",
        "0111", "0110", "0101", "0100",
        "1111", "1110", "1101", "1100", "1011", "1010", "1001", "1000");
    assertEquals(expected, retrievalAll(depth));
  }

  @Test
  void generateBSTby5depthAsBFSOrder() {
    var depth = 5;
    var expected = List.of(
        "00001",
        "00011", "00010",
        "00111", "00110", "00101", "00100",
        "01111", "01110", "01101", "01100", "01011", "01010", "01001", "01000",
        "11111", "11110", "11101", "11100", "11011", "11010", "11001", "11000", "10111", "10110", "10101", "10100", "10011", "10010", "10001", "10000");
    assertEquals(expected, retrievalAll(depth));
  }

}
