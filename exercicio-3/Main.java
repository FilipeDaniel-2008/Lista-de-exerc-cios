public static Estudante[] aprovados(Estudante[] estudantes) {
    int quantidadeAprovados = 0;

    for (Estudante estudante : estudantes) {
        if (estudante.calculaMedia() >= 6) {
            quantidadeAprovados++;
        }
    }
}
