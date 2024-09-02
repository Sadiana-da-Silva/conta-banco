import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Informe a sua agência.");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da conta.");
        int numero = Integer.valueOf(scanner.nextInt());

        System.out.println("Informe o saldo disponível na conta.");
        double saldo = Double.valueOf(scanner.nextDouble());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
