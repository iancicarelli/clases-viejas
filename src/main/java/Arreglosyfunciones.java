public class Arreglosyfunciones {
    public static void main(String[] args){
        int [] numeros = new int[10];
        for (int i = 0; i<numeros.length; i++){
            numeros[i] = (int)(Math.random()*100);

            mostrar(numeros);
            sumar(numeros);
            System.out.println("--------------");
            mostrar(numeros);


        }

    }
    public static void sumar(int[] arreglo ){
        for (int i = 0; i<arreglo.length; i++){
            arreglo[i] += 2;
        }
    }
    public static void mostrar (int[] arreglo){
        for (int i = 0; i<arreglo.length; i++){
            System.out.println("["+arreglo[i]+"]");
        }
        System.out.println();
    }
}
