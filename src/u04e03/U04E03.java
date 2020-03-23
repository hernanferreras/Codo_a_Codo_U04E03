
package u04e03;
import java.util.Scanner;
public class U04E03 {
    public static void main(String args[]) {
      Scanner entrada = new Scanner (System.in);
      int num1, num2;
      float division;
      System.out.print("Ingrese el dividendo: ");
      num1 = entrada.nextInt();
      System.out.print("Ingrese el divisor: ");
      num2 = entrada.nextInt();
      division = (float) num1/num2;
      System.out.print("La division de los numeros es igual a; "+division);
    }
}