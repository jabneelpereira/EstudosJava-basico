public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Declaração de Variáveis

        int idade; // Tipo "int", nome "idade", com nenhum valor atribuído.
        int anoFabricacao = 2021; // tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2500; // tipo "double", nome "salarioMinimo", valor 2.500.

        idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        System.out.printf("Salario atual é: " + salario + "\n");

        // Posso realizar auteração da varival em qual quer momento da execução do
        // código
        salario = 1435.26;

        System.out.printf("Salario atual é: " + salario);

        // O final é usado para a não alteração da variavel durante toda a execução do
        // código

        final double VALOR_DE_pi = 3.14;

        /*
         * Busquei entender aqui a utilização das variaves do tipo inteiro e com partes
         * fracionárias.
         * Observe que o tipo long precisa terminar com L, o tipo float precisa terminar
         * com F.
         */

    }
}
