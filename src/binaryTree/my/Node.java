package binaryTree.my;

import java.util.ArrayList;
import java.util.List;

/**
 * Reference: javax.swing.tree.TreeNode
 * @param <T> Type of node element
 */
public class Node<T>  { // TODO: T to int, implements and override TreeNode
  /* Initialization */
  private List<Node<T>> children = new ArrayList<Node<T>>();
  private Node<T> parent = null;
  private T data = null;

  /* constructors */
  public Node(T data) {
    this.data = data;
  }

  /* constructors */
  public Node(T data, Node<T> parent) {
    this.data = data;
    this.parent = parent;
  }

  public List<Node<T>> getChildren() {
    return children;
  }

  public void setParent(Node<T> parent) {
    parent.addChild(this);
    this.parent = parent;
  }

  public void addChild(T data) {
    Node<T> child = new Node<T>(data);
    child.setParent(this);
    this.children.add(child);
  }

  public void addChild(Node<T> child) {
    child.setParent(this);
    this.children.add(child);
  }

  public T getData() {
    return this.data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public boolean isRoot() {
    return (this.parent == null);
  }

  public boolean isLeaf() {
    if(this.children.size() == 0)
      return true;
    else
      return false;
  }

  public void removeParent() {
    this.parent = null;
  }
}
