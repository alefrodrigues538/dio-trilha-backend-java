package edu.alef.segundasemana;

/**
 * Por convenção, utiliza-se sempre as primeiras letras das palavaras
 * MAIUSCULAS.
 */
public class MinhaClasse {
  public static int somar(int val1, int val2) {
    return val1 + val2;
  }

  public static String nomeCompleto(String nome, String sobrenome) {
    return nome.concat(" ").concat(sobrenome);
  }

  public static void main(String[] args) {
    System.out.println(somar(1, 15));
    System.out.println(nomeCompleto("Alef", "Rodrigues"));
  }

}
