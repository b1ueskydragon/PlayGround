package daily_coding_problem.p571;


/**
 * The first rod being 1,
 * the second (auxiliary) rod being 2,
 * and the last (goal) rod being 3.
 */
public class TowerOfHanoi {
  // The smallest is No.1, the biggest is No.N.
  public void towerOfHanoi(final int diskNum, final int moveFrom, final int moveTo) {
    if (diskNum == 0) return;

    // 1 ~ N-1
    // start -> auxiliary
    towerOfHanoi(diskNum - 1, moveFrom, 6 - moveFrom - moveTo); // to get auxiliary

    // N
    // start -> goal (same as nothing to do since the function is void and we set 1 and 3 as start and goal at first)
    System.out.printf("Move disk [%d]  %d to %d \n", diskNum, moveFrom, moveTo);

    // 1 ~ N-1 auxiliary->goal
    towerOfHanoi(diskNum - 1, 6 - moveFrom - moveTo, moveTo);
  }

  public static void main(String[] args) {
    final TowerOfHanoi underTest = new TowerOfHanoi();
    underTest.towerOfHanoi(0, 1, 3);
    System.out.println();
    underTest.towerOfHanoi(1, 1, 3);
    System.out.println();
    underTest.towerOfHanoi(2, 1, 3);
    System.out.println();
    underTest.towerOfHanoi(3, 1, 3);
  }

}
