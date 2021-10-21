import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class IntroPOO {
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        // Random rnum = new Random();
        //  BigInteger bint = new BigInteger("0");
        Vehiculos v0 = new Vehiculos("camion",3,"HJK-DSC-55");
        System.out.println("el kilometraje de"+v0.getTipo()+"es "+v0.getKilometraje());
        System.out.println(v0.getRuedas());

    }
}