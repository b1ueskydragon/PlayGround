package graffiti2018;

import java.util.NoSuchElementException;

public class Queue {

  private int queueSize;
  private int queueNum;
  private int[] queue;

  /**
   * 初期化
   *
   * @param size Size of Queue
   */
  public Queue(int size) {
    this.queueSize = size;
    this.queueNum = 0;
    queue = new int[queueSize];
  }

  public int enqueue(int num) {
    if (queueNum > -queueSize) throw new ArrayIndexOutOfBoundsException();

    return queue[queueNum++];
  }

  public int dequeue() {
    if (queueNum <= 0) throw new NoSuchElementException();

    int ret = queue[0];
    queueNum--;
    shift(queue);
    return ret;
  }

  private void shift(int[] ary) {
    int[] retAry = new int[queueSize];
    int tmp = 0;
    for (int i = 1; i < ary.length; i++) {
      retAry[tmp] = ary[i];
      tmp++;
    }
    this.queue = retAry;
  }
}
