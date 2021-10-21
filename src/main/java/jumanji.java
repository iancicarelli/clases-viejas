public class jumanji {
    /* entradas: jugadores(ctes 3), casillas (cte), dados(2 aleatorios)
        procesos: avanzar, ejecutarInstrucciones, fin (casilla 27) , contar jugadas , indicar quien gana
        instrucciones : casilla par , casilla inpar , casilla multiplo de 10 ,casilla numero primo , casilla 13 inicio
        salidas: tablero , jugadores , jugadas, ganador
     */

    public static void main(String[] args){
        int nJugadores = 3;
        int[] jugadores = new int[nJugadores];
        boolean nuevaJugada =true;
        int casillas = 27;
        int jugadas = 0;

        do {
            for (int i =0;i<jugadores.length;i++){
                jugadores[i] += dados(2);
                if (jugadores[i]>=casillas){
                    nuevaJugada = false;
                    break;
                }
                jugadores[i] = instrucciones(jugadores[i]); //jugadores es el numero
            }
            jugadas++;
            mostrar(jugadores);

        }while (nuevaJugada);
        int mayor = mayor(jugadores);
        System.out.println("el jugador"+mayor);
        System.out.println("gano en "+jugadas+"jugadas");




    }

    private static int mayor(int[] arr) {
        int mayor = arr[0];
        int n = 0;

        for (int i =0;i<arr.length;i++){
            if (mayor<arr[i]){
                mayor = arr[i];
                n = i;
            }
        }

        return n;
    }

    public static int instrucciones (int n){
        if (n == 13){
            System.out.println("13");
            return 0;
        }if (primo(n)){
            System.out.println("primo");
            return determinarPrimo(n);
        }if (n%10 ==0){
            System.out.println("10");
            return n+5;
        }if (n%2 == 1){
            System.out.println("impar");
            return  n-1;
        }else {
            System.out.println("par");
            return n+2;
        }
    }

    private static int determinarPrimo(int n) {
       do {
       --n;
       }while(!primo(n));//mientras que no sea primo
           return n;
    }

    private static boolean primo(int n) {//si es primo retorna 2 si no es falso
        int contador =0;
        for(int i =1; i<= n;i++) {
            if (n % 1 == 0) {
                contador++;
            }
        }
        return contador ==2;
    }

    private static void mostrar(int[] arr) {

        for (int i=0;i<arr.length;i++){
            System.out.print("["+arr[i]+"]");
        }
        System.out.println();
    }

    private static int dados(int n) {
        int acumulador = 0;
        for (int i=0;i<n;i++){
            acumulador+= (int) (Math.random()*6)+1;
        }
        return acumulador;
    }


}
