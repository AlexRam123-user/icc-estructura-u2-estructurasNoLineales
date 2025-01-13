import java.util.List;

import main.Ejercicio_03_listLevels.ListLevels;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // runArbolBinario();
        //runEjercicio3();
        runArbolAvl();
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

    private static void runArbolAvl(){
        ArbolAVL arbolAVL = new ArbolAVL();
        int [] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};

        for(int valor : values){
            arbolAVL.insert(valor);
        }

        arbolAVL.printTree();
    }
}


