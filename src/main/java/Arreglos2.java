public class Arreglos2 {
    public static void main(String[] args){
    /*String palabra = "hallo world tanke pzfg iv";
    concatenar(palabra);
    System.out.println(palabra);
  si imprimimos "palabra nos damos cuenta que no se aplica ningun cambio a palabra ya que palabra en
   concatenar solo existe en concatenar
     */
      int[] numeros;
      char[] caracteres;

      numeros = new int[15]; //arreglo de 15 elementos tipo int
      caracteres = new char[5]; //arregñp de 5 elementos tipo char

      double[] reales = new double[8]; //se puede hacer en una linea
      //declaracion con respecto a otra variable
      int numeroDeAlumnos = 45;
      int[] notas = new int[numeroDeAlumnos];
      System.out.println(numeros.length);

      //como llenar un arreglo
        int[] temperatura = {35,33,20,35,38,39};
        System.out.println(temperatura.length); // muestra la cantidad de elementos
        // lenar un arreglo (ver los datos de un arreglo)
        System.out.println(temperatura[5]);
        //transformacion de un numero entero a un caracter esto solo se puede hacer pq el caracter
        //es compatible es con el numero ya que el int es de 32 bit y char igual es de 32 bits
       /* int[] auto = new int[200];
        auto[(int)'a']= 10;
        System.out.println(auto['a']);

        int[] autos = new int [500];
        autos[0] = 2000;
        autos[1] = 1000;
        autos[2] = 500;
        autos[3] = 3000;
        autos[4] = 6000;
        autos[5] = 8000;
        //.... como podemos llenar estos elementos?
        */
        int[] autos = new int [20];
        for (int i=0;i<autos.length;i++ ){
            autos[i] = (int)(Math.random()*1000);// un elemento especifico

        }for (int i=0;i<autos.length;i++){
            System.out.println(autos[i]);
        }




    }
   /* public static void concatenar(String palabra){
        palabra = palabra+"otra palabra";
    }

    */


}
