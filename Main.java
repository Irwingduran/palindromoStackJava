import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String input = scanner.nextLine();

        if (esPalindromo(input)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        Stack<Character> stack = new Stack<>();

        // Agregar caracteres de la cadena a la pila
        for (char c : cadena.toCharArray()) {
            stack.push(c);
        }

        // Comparar caracteres de la pila con la cadena original
        for (char c : cadena.toCharArray()) {
            if (stack.isEmpty() || stack.pop() != c) {
                return false; // No es un palíndromo
            }
        }

        return true; // Es un palíndromo
    }
}
