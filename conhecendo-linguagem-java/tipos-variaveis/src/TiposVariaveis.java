public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);

        String resultado = variavel == true
                ? "É verdadeira!"
                : "É falsa!";

        System.out.println(resultado);
    }

}
