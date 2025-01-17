import java.util.List;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Graph;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // runArbolBinario();
        // runEjercicio3();
        // runArbolAvl();
        //runEjercicio1();
        //runEjercicio2();
        //runEjercicio4();
        runGraph();
    }

    private static void runGraph(){
        Graph grafo = new Graph();
        grafo.addNode(5);
        grafo.addNode(7);
        grafo.addNode(9);
        grafo.addNode(11);
        grafo.addNode(3);
    
        grafo.printGraph();
    }

    public static void runEjercicio1() {
        System.out.println("Ejercicio 01: Insertar en un Árbol Binario de Búsqueda");
        InsertBSTTest bst = new InsertBSTTest();
        int[] valores = { 5, 3, 7, 2, 4, 6, 8 };

        for (int valor : valores) {
            bst.insert(valor);
        }

        bst.printTree();
    }

    public static void runEjercicio2() {
        System.out.println("\nEjercicio 02: Invertir un Árbol Binario");
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        root = invertBinaryTree.invertTree(root);

        InsertBSTTest bst = new InsertBSTTest();
        bst.printTree();
    }

    public static void runEjercicio4() {
        System.out.println("\nEjercicio 04: Calcular la Profundidad Máxima");
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        Depth maxDepth = new Depth();
        int depth = maxDepth.maxDepth(root);

        System.out.println("La profundidad máxima del árbol es: " + depth);
    }

    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();
        int[] valores = { 4, 2, 7, 1, 3, 6, 9 };

        // Insertar valores en el árbol binario
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        // Imprimir el árbol binario
        arbolBinario.printTree();

        // Obtener lista de niveles
        List<List<Node>> lista = levels.listLevels(arbolBinario.getRoot());

        // Imprimir los niveles
        System.out.println("Niveles del árbol:");
        for (int i = 0; i < lista.size(); i++) {
            for (Node node : lista.get(i)) {
                System.out.print(node.getValue() + " ");
            }
            System.out.println();
        }

    }

    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = { 40, 20, 60, 10, 30, 50, 70, 5, 15, 55 };

        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        // ingresar cada valor al arbol
        arbolBinario.printTree();

        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
        System.out.println("Recorrido Preorden :");

        arbolRecorridos.preOrderIterativo(arbolBinario.getRoot());

        System.out.println("\nRecorrido PreOrden (recursivo)");

        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido PosOrden (recursivo)");

        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido inOrden (recursivo)");

        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());

    }

    private static void runArbolAvl() {
        ArbolAVL arbolAVL = new ArbolAVL();
        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        for (int valor : values) {
            arbolAVL.insert(valor);
        }

        arbolAVL.printTree();
    }
}
