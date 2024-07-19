public class ResultadoEscolarTernarioEncadeado {
    public static void main(String[] args) {

        /*
         * O operador ternário ancadeado é um recurso para tomada de decisões com
         * objetivo similar ao do if/else, mas que é codificado em apenas uma linha.
         */

        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
