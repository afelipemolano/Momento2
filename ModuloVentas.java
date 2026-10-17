
import java.util.Scanner;

public class ModuloVentas {
    public static void main(String[] args) {
    
    //PARTE 1

        // Constantes
        final int PRODUCTO_BASICO = 15000;
        final int PRODUCTO_MEDIO = 30000;
        final int PRODUCTO_PREMIUM = 50000;
        
        // Variables
        int totalAcumulado = 0;
        int totalProductos = 0;
        int totalProductosPremium = 0;
        int opcion = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" ------------------------------------------ \n BIENVENID@ AL CATÁLOGO \n ------------------------------------------");

    // PARTE 2
        
        //Menú de productos
        do {
            /* System.out.println("\n--- MENÚ DE PRODUCTOS ---");
            System.out.println("1. Producto Básico ($" + PRODUCTO_BASICO + ")");
            System.out.println("2. Producto Medio ($" + PRODUCTO_MEDIO + ")");
            System.out.println("3. Producto Premium ($" + PRODUCTO_PREMIUM + ")");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: "); */
            
            System.out.print("\n--- MENÚ DE PRODUCTOS ---\n1. Producto Básico ($" + PRODUCTO_BASICO + ")\n2. Producto Medio ($" + PRODUCTO_MEDIO + ")\n3. Producto Premium ($" + PRODUCTO_PREMIUM + ")\n4. Finalizar compra\nSeleccione una opción: ");

            opcion = sc.nextInt();

            System.out.println("Usted ingresó la opción: " + opcion);

        } while (opcion != 4);

        System.out.println("\n¡Gracias por su compra!");
        
        


    }
    
}
