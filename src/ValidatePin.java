import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {
        // Declare o PIN válido
        int pinValido = 1234;

        // Crie um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite que o usuário insira o PIN
        System.out.println("Por favor, insira o PIN:");

        // Declare e inicialize uma variável para armazenar o PIN inserido pelo usuário
        int pinInserido = scanner.nextInt();

        // Use um loop while para repetir até que o PIN correto seja inserido
        while (pinInserido != pinValido) {
            System.out.println("PIN incorreto. Por favor, insira o PIN novamente:");
            pinInserido = scanner.nextInt();
        }

        // Se o loop while terminar, significa que o PIN correto foi inserido
        System.out.println("PIN correto inserido. Você agora tem acesso à sua conta.");
        
        // Feche o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}