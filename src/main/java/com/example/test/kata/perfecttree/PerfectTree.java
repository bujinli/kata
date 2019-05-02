package com.example.test.kata.perfecttree;

public class PerfectTree {

  private int depth = 0;

  public int isPerfectTree(Node root) {
    return validate(root, root.getSubNodeCount(), 1) ? this.depth : -1;
  }

  private boolean validate(Node node, int subNodeCount, int currentDepth) {
    boolean ret = false;
    if (node.isLeaf()) {
      if (this.depth == 0) {
        this.depth = currentDepth;
        ret = true;
      } else if (currentDepth != this.depth) {
        ret = false;
      } else {
        ret = true;
      }
    } else if (node.getSubNodeCount() != subNodeCount) {
      return false;
    } else {
      for (Node subNode : node.getSubNodes()) {
        ret = validate(subNode, subNodeCount, currentDepth + 1);
      }
    }
    return ret;
  }
  //
  //  private boolean validateDepth(Node node, int currentDepth) {
  //    boolean ret = false;
  //    if (node.getSubNodes().isEmpty()) {
  //      if (this.depth == 0) {
  //        this.depth = currentDepth;
  //        ret = true;
  //      } else if (currentDepth != this.depth) {
  //        ret = false;
  //      } else {
  //        ret = true;
  //      }
  //    } else {
  //      for (Node subNode : node.getSubNodes()) {
  //        ret = validateDepth(subNode, currentDepth + 1);
  //      }
  //    }
  //    return ret;
  //  }
}
