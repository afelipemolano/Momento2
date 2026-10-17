
import java.util.Scanner;

public class ModuloVentas {
    public static void main(String[] args) {
    
    //PARTE 1

        // Constantes
        final double PRODUCTO_BASICO = 15000.0;
        final double PRODUCTO_MEDIO = 30000.0;
        final double PRODUCTO_PREMIUM = 50000.0;
        final double PORCENTAJE_IVA = 0.19;
        
        // Variables
        double totalAcumulado = 0;
        int totalProductos = 0;
        int totalProductosPremium = 0;
        int opcion = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" ------------------------------------------ \n BIENVENID@ AL CATÁLOGO \n ------------------------------------------");

    // PARTE 2
        
        
        do {
            //Menú de productos
            /* System.out.println("\n--- MENÚ DE PRODUCTOS ---");
            System.out.println("1. Producto Básico ($" + PRODUCTO_BASICO + ")");
            System.out.println("2. Producto Medio ($" + PRODUCTO_MEDIO + ")");
            System.out.println("3. Producto Premium ($" + PRODUCTO_PREMIUM + ")");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: "); */
            
            //Menú de productos mejorado
            System.out.print("\n--- MENÚ DE PRODUCTOS ---\n1. Producto Básico ($" + PRODUCTO_BASICO + ")\n2. Producto Medio ($" + PRODUCTO_MEDIO + ")\n3. Producto Premium ($" + PRODUCTO_PREMIUM + ")\n4. Finalizar compra\nSeleccione una opción: ");

            opcion = sc.nextInt();

            //System.out.println("Usted ingresó la opción: " + opcion);

            // Evaluación con if y else if para obtener el totales acumulados de los precios y productos.
            if (opcion == 1) {

                totalAcumulado += PRODUCTO_BASICO;
                totalProductos++;
                System.out.println("--> Producto Básico agregado.");

            } else if (opcion == 2) {
                totalAcumulado += PRODUCTO_MEDIO;
                totalProductos++;
                System.out.println("--> Producto Medio agregado.");

            } else if (opcion == 3) {
                totalAcumulado += PRODUCTO_PREMIUM;
                totalProductos++;
                totalProductosPremium++;
                System.out.println("--> Producto Premium agregado.");

            } else if (opcion == 4) {
                System.out.println("\nCompra finalizada");

            } else {
                System.out.println("Opción no válida, intente nuevamente:");
            }

        } while (opcion != 4);

        // Condición en caso de no haber productos seleccionados y así evitar la división por cero
        if (totalProductos == 0) {
            System.out.println("\nNo se registraron productos en esta transacción. ¡Gracias por su visita!");
        } else {
            
            // Calculo de porcentaje de prendas premium
            double porcentajePremium = ((double) totalProductosPremium / totalProductos) * 100;

            // Cálculos de descuento e impuestos
            double descuento = 0;
            
            if (totalAcumulado > 100000) {
                descuento = totalAcumulado * 0.10;
            }

            double subtotalConDescuento = totalAcumulado - descuento;
            double iva = subtotalConDescuento * PORCENTAJE_IVA;
            double totalPagar = subtotalConDescuento + iva;


            // Factura Final
            System.out.println("\n========================================");
            System.out.println("             FACTURA DE VENTA            ");
            System.out.println("========================================");
            System.out.println("\nTotal de artículos comprados: " + totalProductos);
            System.out.println("Porcentaje de artículos Premium: " + String.format("%.1f", porcentajePremium) + "% \n----------------------------------------\n");
            System.out.println("Total parcial :               $" + totalAcumulado);

            if (totalAcumulado > 100000){
                System.out.println("Descuento (10%):              $ " + descuento);
            }
            System.out.println("----------------------------------------\nSubtotal:                     $" + subtotalConDescuento);
            System.out.println("IVA (19%):                    $ " + iva);
            System.out.println("\n---------------------------------------- \nTOTAL A PAGAR:                $" + totalPagar + "\n----------------------------------------");
            System.out.println("\n¡Gracias por su compra! \n¡Que tenga un excelente día!\n");
        }

        sc.close();
    }
    
}
