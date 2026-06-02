import controllers.SortPersonaMethods;
import java.util.ArrayList;
import java.util.List;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {

    // Generador aleatorio indicado en el paso 6 de la guía
    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona " + (i + 1);
            int edad = (int) (Math.random() * 101); // 0 a 100 años
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }

    public static void main(String[] args) {
        SortPersonaMethods ordenador = new SortPersonaMethods();
        List<Resultado> resultados = new ArrayList<>();
        int[] tamanos = {10000, 50000, 100000};

        System.out.println("Ejecutando pruebas de ordenamiento...\n");

        for (int size : tamanos) {
            
            // ESCENARIO 1: Completamente desordenado
            
            Persona[] baseDesordenada = generarPersonas(size);
            
            // Clones obligatorios para aislar las mediciones
            Persona[] copiaInsercionDes = baseDesordenada.clone();
            Persona[] copiaQuickDes = baseDesordenada.clone();

            // Medición Inserción
            Resultado rInsDes = Benchmarking.medirTiempo(() -> {
                ordenador.insertionSort(copiaInsercionDes);
                return null;
            }, "Inserción", "Desordenado", size);
            resultados.add(rInsDes);

            // Medición QuickSort
            Resultado rQuickDes = Benchmarking.medirTiempo(() -> {
                ordenador.quickSort(copiaQuickDes, 0, copiaQuickDes.length - 1);
                return null;
            }, "QuickSort", "Desordenado", size);
            resultados.add(rQuickDes);

            // ESCENARIO 2: Casi ordenado + 1 persona            

            // 1. Ordenamos inicialmente la base usando QuickSort
            ordenador.quickSort(baseDesordenada, 0, baseDesordenada.length - 1);

            // 2. Creamos arreglo con tamaño adicional e insertamos los datos + nueva persona al final
            Persona[] baseCasiOrdenada = new Persona[size + 1];
            System.arraycopy(baseDesordenada, 0, baseCasiOrdenada, 0, size);
            baseCasiOrdenada[size] = new Persona("Persona Extra", (int) (Math.random() * 101));

            // Clones independientes para el escenario casi ordenado
            Persona[] copiaInsercionCasi = baseCasiOrdenada.clone();
            Persona[] copiaQuickCasi = baseCasiOrdenada.clone();

            // Medición Inserción (Casi ordenado)
            Resultado rInsCasi = Benchmarking.medirTiempo(() -> {
                ordenador.insertionSort(copiaInsercionCasi);
                return null;
            }, "Inserción", "Casi ordenado + 1", baseCasiOrdenada.length);
            resultados.add(rInsCasi);

            // Medición QuickSort (Casi ordenado)
            Resultado rQuickCasi = Benchmarking.medirTiempo(() -> {
                ordenador.quickSort(copiaQuickCasi, 0, copiaQuickCasi.length - 1);
                return null;
            }, "QuickSort", "Casi ordenado + 1", baseCasiOrdenada.length);
            resultados.add(rQuickCasi);
        }

        // Imprimir resultados en consola con formato de salida de referencia
        System.out.println("\n----------------- SALIDA DE RESULTADOS -----------------");
        for (Resultado res : resultados) {
            res.mostrarInfo();
        }
    }
}