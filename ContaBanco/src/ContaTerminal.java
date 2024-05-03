
/**
 * @author Sâmia Rocha
 */
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);

        // Solicitar e ler os dados da conta bancária.
        System.out.println("Por favor, digite o número da Agência: ");
        String numAgencia = tcl.nextLine();
        System.out.println("Por favor, digite o númeo da Conta: ");
        int numConta = tcl.nextInt();
        tcl.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor,digite o nome do Cliente: ");
        String nomeCliente = tcl.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = tcl.nextDouble();

        tcl.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! \nSua agência é: " + numAgencia + ", conta " + numConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }

}
