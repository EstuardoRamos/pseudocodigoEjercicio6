
import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        int edad, num1 = 0, n1 = 0, num2 = 0, n2 = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            System.out.print(" Ingrese una edad: ");
            edad = scanner.nextInt();
            if (edad >= 25) {
                n1 = n1 + 1;
                num1 += edad;
            } else if (edad < 18) {
                n2 = n2 + 1;
                num2 += edad;
            }

        }
        float promedio = num1 / n1;
        float promedio1 = num2 / n2;
        System.out.println("El promedio de las personas mayores e iguales a 25 es " + promedio);
        System.out.println("El promedio de las personas menores a 25 es " + promedio1);
    }

}

