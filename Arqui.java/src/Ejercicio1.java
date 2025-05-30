import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            if (num2 == 0) {
                throw new ArithmeticException("Error: No se puede dividir por cero.");
            }
            
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operación finalizada.");
        }
    }
}

