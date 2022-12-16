import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Recebe dados do scanner
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String  agencia = scanner.next();

        System.out.println("Por favor, digite o nome a ser registrado na conta:");
        String  nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor do seu saldo:");
        double saldo = scanner.nextDouble();
        
        //Entrega os dados lidos pelo scanner
        System.out.println("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque!".formatted(nomeCliente,agencia,numero,saldo));
    }
}
