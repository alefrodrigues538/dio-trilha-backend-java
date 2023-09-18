public class FormatadorCepExemplo {
  public static void main(String[] args) {
    try {
      formatarCep("2376506");
    } catch (CepInvalidoException e) {
      System.out.println("Cep invalido");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();

    // simulando um cep formatado
    return "23.765-064";
  }
}
