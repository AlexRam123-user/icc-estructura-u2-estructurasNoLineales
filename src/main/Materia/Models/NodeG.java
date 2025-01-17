package main.Materia.Models;

import java.util.List;

public class NodeG {
    private int value;
    private List<NodeG> neighbors;
    private NodeG left;
    private NodeG right;

    public NodeG getRight() {
        return right;
    }

    public void setRight(NodeG right) {
        this.right = right;
    }

    public NodeG(int value) {
        this.value = value;
    }

    public NodeG(int value, List<NodeG> neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }

    public int getValue() {
        return value;
    }

    public List<NodeG> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(NodeG neighbor) {
        this.neighbors.add(neighbor);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeG getLeft() {
        return left;
    }

    public void setLeft(NodeG left) {
        this.left = left;
    }
}
