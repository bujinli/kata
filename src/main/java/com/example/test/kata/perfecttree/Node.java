package com.example.test.kata.perfecttree;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node {

  private int value;
  private List<Node> subNodes;

  public boolean isLeaf() {
    return subNodes.isEmpty();
  }

  public int getSubNodeCount() {
    return CollectionUtils.isEmpty(subNodes) ? 0 : this.subNodes.size();
  }

  public void addSubNode(Node node) {
    if (subNodes == null) {
      subNodes = new ArrayList<>();
    }
    this.subNodes.add(node);
  }

  public List<Node> getSubNodes() {
    return subNodes == null ? Collections.EMPTY_LIST : subNodes;
  }
}
