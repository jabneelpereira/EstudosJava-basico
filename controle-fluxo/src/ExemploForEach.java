public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        /*
         * Forma abreviada
         * O uso do for / each está fortemente relacionado, com um cenário onde contenha
         * um array ou
         * coleção, e assim , a interação é baseada nos elementos da coleção.
         */
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
