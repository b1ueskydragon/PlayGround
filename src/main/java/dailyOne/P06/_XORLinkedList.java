package dailyOne.P06;

public class _XORLinkedList<E> {

  private static class Node<E> {

    private E data;
    private int both;
    private int size;

    Node(E data) {
      this.data = data;
      this.both = 0;
      this.size = 0;
    }
  }

  private Node<E> lastNode;
  private int size;

  _XORLinkedList(Node<E> lastNode, int size) {
    this.lastNode = lastNode;
    this.size = 1;
  }

  private int samplePointer; // TODO 暫定
  private Node<E> sampleDeferencePointer; // TODO 暫定

  private int getPointer(Node<E> node) {
    return samplePointer; // TODO 暫定
  }

  private Node<E> deferencePointer(int index) {
    return sampleDeferencePointer; // TODO 暫定
  }

  public void add(Node<E> node) {
    this.lastNode.both = this.lastNode.both ^ getPointer(node);
    node.both = node.both ^ getPointer(this.lastNode);

    this.lastNode = node;
    this.size += node.size; // ?
  }

  private Node<E> currentNode;
  private int rightPoint;

  public Node<E> get(int index) {
    if (this.size - index <= 0 || index < 0) {
      return null;
    }
    currentNode = this.lastNode;
    rightPoint = 0;

    for (int i = 0; i < (this.size - index); i++) {
      currentNode = deferencePointer(currentNode.both ^ rightPoint);
      rightPoint = getPointer(currentNode);
    }
    return currentNode;
  }
}
