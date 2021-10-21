import java.util.Locale;
import java.util.Scanner;

public class Encriptador {
    /* entradas : -texto -numero de desfase ( cuanto quiero que avance en comparacion en el alfaberto ej una a sea una c seria un 3)
        proceso: -desfazar los caracteres
        salida: texto cifrado
     */
    public static void main(String[] args){
        String texto = "Four spaces should be used as the unit of indentation. The exact construction of the indentation\n" +
                "(spaces vs. tabs) is unspecified. Tabs must be set exactly every 8 spaces (not 4).";
        Scanner teclado = new Scanner(System.in);
        texto = encriptador(texto,1); //cifrado
        System.out.println(texto);




    }
    public static String encriptador( String texto , int desfase){

        String textoCifrado = "";
        String caracteres = "abcdfghijklmnopqrstuvwxyz";
        System.out.println(caracteres.length());
        texto = texto.toLowerCase();
        for (int i =0;i< texto.length();i++){
            if(caracteres.contains(texto.charAt(i)+"")){//%26 nos permite crear un "loop" entre los 127 y 97 caracteres
                int num = ((texto.charAt(i)+desfase-97)%26+97);//97 primer numero que corresponde a una letra minuscula
                char aux = (char)num;
                textoCifrado = textoCifrado + aux;
            }else{
                textoCifrado = textoCifrado+texto.charAt(i);
            }
        }

        return textoCifrado;
    }

}
