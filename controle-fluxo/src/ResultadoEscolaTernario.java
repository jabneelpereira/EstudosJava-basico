public class ResultadoEscolaTernario {
    public static void main(String[] args) {
        /*
         * Abreviar nosso algoritmo condicional refatorando com o conceito de operador
         * ternário. O operador ternário é um recurso para tomada de decisões com
         * objetivo similar ao do if/else, mas que é codificado em apenas uma linha.
         */

        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
