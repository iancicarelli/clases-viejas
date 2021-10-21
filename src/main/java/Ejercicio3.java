import java.util.Scanner;

public class Ejercicio3 {
    /*
    entradas : tipo de producto / estado esperado / nuevo cliente
    proceso: calcular precio/ total boleta / total acumulado
    salida:mostrar totales
     */

    public static void main(String[] args){
        int maximmo = 5;
        String[] productos = {"juego","ropa","pelicula","libro"};
        int[] preciosProductos = {5000,5000,3000,10000};
        int [] productosVendidos = new int[4];
        String[] estados = {"bueno"," mas o menos","malo"};
        double[] estadosMultiplicador = {1.5,1,0.5};
        int[] estadosVendidos = new int[3];
        int clientes = 0;
        int totalVentas = 0;


        do {
            int compras = 0;
            do {
                verProductos(productos);
                int producto = seleccionarProducto(productos) - 1;

                verEstados(estados);
                int estado = seleccionarEstado(estados) - 1;
                System.out.println(productos[producto] + "---" + estados[estado]);

                int precioProducto = (int) (preciosProductos[producto] * estadosMultiplicador[estado]);
                System.out.println(" " + productos[producto] + " $ " + precioProducto);
                ++productosVendidos[producto];
                ++estadosVendidos[estado];
                compras++;
                totalVentas += precioProducto;
            }while (nuevaVenta()&& compras <5 );
            ++clientes;
        }while (nuevoCliente());
        verTotalProductos(productos,preciosProductos);
        verTotalEstados(estados,estadosVendidos);
        System.out.println("el total de la venta es: $"+totalVentas);
        System.out.println("el total de clientes es: "+clientes);

        System.out.println("Fin");
    }

    private static void verTotalEstados(String[] estados, int[] estadosVendidos) {
        System.out.println("--------estados totales-------");
        for (int i = 0; i< estados.length ; i++){
            System.out.println("["+estadosVendidos[i]+"]"+estados[i]);
        }

    }

    private static void verTotalProductos(String[] productos, int[] cantidad) {
        System.out.println("--------Productos total vendidos-------");
        int total = 0;
        for (int i = 0; i< productos.length ; i++){
            System.out.println("["+cantidad[i]+"]"+productos[i]);
            total += cantidad[i];
        }
        System.out.println("el total de productos vendidos es de :"+total);
    }

    private static boolean nuevoCliente() {
        int i = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("desea ingresar como un nuevo cliente?");
        System.out.println("[1] si"+"[otro valor] no ");
        try {
            i = teclado.nextInt();
        }catch (Exception e) {
            teclado.next();
            System.out.println("dato invalido");
        }
        return i == 1;
    }

    private static boolean nuevaVenta() {
        int i = 0;
        Scanner teclado = new Scanner(System.in);

            System.out.println("desea comprar otra cosa");
            System.out.println("[1] si"+"[otro valor] no ");
            try {
                i = teclado.nextInt();
            }catch (Exception e) {
                teclado.next();
                System.out.println("dato invalido");
            }
       return i == 1;
    }


    private static int seleccionarProducto(String[] productos) {
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("ingresa el numero de producto");
            try {
                i = teclado.nextInt();
            }catch (Exception e){
                teclado.next();
                System.out.println("dato invalido");
            }

        }while (i<=0 || i>productos.length);

        return i;
    }

    private static int seleccionarEstado(String[] estados) {
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("selecciona el numero del estado");
            try {
                i = teclado.nextInt();
            }catch (Exception e){
                teclado.next();
                System.out.println("dato invalido");
            }

        }while (i<=0 || i>estados.length);
        return  i;

    }


    private static void verProductos(String[] productos) {
        System.out.println("--------Productos-------");
        for (int i = 0; i< productos.length ; i++){
            System.out.println("["+(i+1)+"]"+productos[i]);
        }

    }

    private static void verEstados(String[] estados) {
        System.out.println("--------Estados-------");
        for (int i = 0; i < estados.length; i++) {
            System.out.println("[" + (i + 1) + "]" + estados[i] );
        }
    }
}
