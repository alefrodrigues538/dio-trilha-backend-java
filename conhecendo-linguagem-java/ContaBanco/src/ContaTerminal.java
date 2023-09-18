import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  static int numero = 1021;
  static String agencia = "067-B";
  static String nomeCliente = "Mario Andrade";
  static double saldo = 237.48D;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o número da conta: ");
    numero = scanner.nextInt();

    System.out.println("Digite o número da agência: ");
    agencia = scanner.next();

    System.out.println("Digite o nome do cliente: ");
    nomeCliente = scanner.next();

    // Imprimindo os detalhes da conta
    System.out.println("Numero da conta: " + numero);
    System.out.println("Agência: " + agencia);
    System.out.println("Nome do Cliente: " + nomeCliente);
    System.out.println("O saldo da conta é de R$" + saldo);
    scanner.close();
  }

  public void depositar(double valor) {
    saldo += valor;
    System.out.println("O valor de R$" + valor + " foi adicionar.");
    System.out.println("O novo saldo é de R$" + saldo);
  }

  public void sacar(double valor) {
    if (saldo - valor >= 0) {
      System.out.println("O saque foi autorizado.");
      System.out.println("Foi realizado um saque no valor de R$" + valor);
      System.out.println("O novo saldo é de R$" + saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void exibirSaldo() {
    System.out.println("O saldo atual é de R$" + saldo);
  }

  public void exibirDetalhesConta() {
    System.out.println("Numero da conta: " + numero);
    System.out.println("Agência: " + agencia);
    System.out.println("Nome do Cliente: " + nomeCliente);
    System.out.println("O saldo da conta é de R$" + saldo);
  }
}
