import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a Classe Scanner
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Preenxar as Informações corretamente da sua Conta Bancaria.");
       //Exibir as mensagens para o nosso usuário
       //Obter pela scanner os valores digitados no terminal
       System.out.println("Numero da Conta: ");
       int numeroDaConta = scanner.nextInt();
       scanner.nextLine();

       System.out.println("Agencia: ");
       String agencia = scanner.nextLine();

       System.out.println("Nome do Cliente: ");
       String nomeDoCliente = scanner.nextLine();
     
       System.out.println("Faça um deposito inicial para finalizar o Cadastro");
        double deposito = scanner.nextDouble();

        double saldo = deposito;


       //Exibir a mensagem conta criada
       System.out.println();
       System.out.println("Olá "+ nomeDoCliente +", obrigado por criar uma conta em nosso banco,sua agência é "
       + agencia +", conta "+ numeroDaConta +" e seu saldo "+ saldo +" já está disponível para saque.");
    }
}