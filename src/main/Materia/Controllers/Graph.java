package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;

import main.Materia.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeG addNode(int value) {
        NodeG nodeGraph = new NodeG(value);
        nodes.add(nodeGraph);
        return nodeGraph;
    }

    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void printGraph() {
        for(NodeG nodeGraph : nodes){
            System.out.println("Vertice "+nodeGraph.getValue()+": ");
            for(NodeG nei : nodeGraph.getNeighbors()){
                System.out.println(nei.getValue() + " - ");
            }
            System.out.println();
        }
    }

    public void getDFS(NodeG startNode) {

    }

    private void getDFSUtil(NodeG node, boolean[] visited) {
        int nodeIndex = nodes.indexOf(node);
        if (nodeIndex == -1 || visited[nodeIndex])
            return;

        visited[nodeIndex] = true;
        System.out.print(node.getValue() + " ");

        for (NodeG neighbor : node.getNeighbors()) {
            getDFSUtil(neighbor, visited);
        }
    }

    public void getBFS(NodeG startNode) {

    }

    public int[][] getAdjacencyMatrix() {
        int size = nodes.size();
        int[][] adjacencyMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            NodeG node = nodes.get(i);
            for (NodeG neighbor : node.getNeighbors()) {
                int j = nodes.indexOf(neighbor);
                if (j != -1) {
                    adjacencyMatrix[i][j] = 1;
                }
            }
        }
        return adjacencyMatrix;
    }

    public void printAjacencyMatrix() {

    }
}
