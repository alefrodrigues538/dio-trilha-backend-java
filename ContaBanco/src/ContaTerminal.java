import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  /**
   * <h2>Desafio conta bancária na trilha java básico.</h2>
   * <p>
   * Inicialmente, é solicitado ao usuário que informe os parametros da conta:
   * número, agencia e nomeCliente.
   * </p>
   * <p>
   * Logo em seguida, é mostrado no terminal os detalhes desta conta, juntamente
   * com o saldo.
   * </p>
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, informe o número da conta: ");
    int numero = scanner.nextInt();

    System.out.println("Agora informe o número da agência: ");
    String agencia = scanner.next();

    System.out.println("Informe agora o nome do cliente: ");
    String nomeCliente = scanner.next();

    System.out.println("Numero da conta: " + numero);
    System.out.println("Agência: " + agencia);
    System.out.println("Nome do Cliente: " + nomeCliente);
    System.out.println("O saldo da conta é de R$" + 237.48D);
  }
}
