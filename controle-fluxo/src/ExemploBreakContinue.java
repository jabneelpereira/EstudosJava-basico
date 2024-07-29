public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
            // continue;

            System.out.println(numero);

        }
        /*
         * Qual a saída no console ? Com o breack R= ele paro quando a condição numerro
         * == 3 foi verdadeira. Já com o continue R= apenas interrompe a iteração atual.
         */
    }
}
