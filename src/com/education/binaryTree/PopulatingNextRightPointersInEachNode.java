package com.education.binaryTree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
  public Node connect(Node root) {
    if(Objects.isNull(root)){
      return null;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
      int size = queue.size();
      for(int i = 0 ; i < size ; i++){
        Node currentNode = queue.poll();
        if (i < size - 1) {
          Objects.requireNonNull(currentNode).next = queue.peek();
        }
        if(Objects.nonNull(currentNode.left)){
          queue.add(currentNode.left);
        }
        if(Objects.nonNull(currentNode.right)){
          queue.add(currentNode.right);
        }
      }
    }
    return root;
  }
}