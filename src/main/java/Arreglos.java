import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args){
        //arreglos
    String palabra = "ola a todos aquie estoy tratando de estudiarla";
    System.out.println(palabra.length());
    //cuenta la cantidad de caracteres en "palabra"

    //si quiero imprimir el primer caracter o saber el caracter numero 10 (preguntando por una poscion)
        System.out.println(palabra.charAt(44));
        System.out.println(palabra.length()-1); //ultimo caracter
    //comparar un String
        String palabra2 = "hallo world";
      if ("hallo world".equals(palabra)){
          System.out.println("las palabras son iguales");
      } else{
          System.out.println(("las palabras no son iguales"));
      }
        //contar caracter especificado 'a' es distinto que "a"
        int contadorA = 0;
        for(int i=0 ;i<palabra.length()-1 ;i++){
            if (palabra.charAt(i) == 'a'){
                ++contadorA;
            }
        }
        System.out.println(contadorA);

        int contadorO = 0;
        for(int i=0 ;i<palabra.length()-1 ;i++){
            if (palabra.charAt(i) == 'o'){
                ++contadorA;
            }
        }
        System.out.println(contadorO);
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un caracter");
        char caracter = teclado.next().charAt(0);
        // char caracter nos permite ingresar un caracter
        String texto = "jesus nacio en la amigdala del mundo aaaaa";
        int contador1 = 0;
        for(int i=0 ;i<texto.length()-1 ;i++){
            if (texto.charAt(i) == 'o'){
                ++contador1;
            }//esto nos permite contar los caracteres que introduscamos por consola
        }
        System.out.println(contador1);


    }



}
