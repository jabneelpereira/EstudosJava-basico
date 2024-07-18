public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        /*
         * Estrutura Condicional simples, possibilita a escolha de um grupo de ações e
         * comportamentos a serem executados, quando ocorre uma validação de execução de
         * fluxo simples, if nesse caso so é iniciado caso a condição for verdadeira.
         */

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}
