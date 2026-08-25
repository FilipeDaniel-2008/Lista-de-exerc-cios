ublic class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Filipe");

        estudante.insereNotas();

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Média: " + estudante.calculaMedia());
        System.out.println("Menor nota: " + estudante.menorNota());
    }
}
