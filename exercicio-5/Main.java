public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro");

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Disponível: " + livro.isDisponivel());

        livro.emprestar();

        System.out.println("Disponível após empréstimo: " + livro.isDisponivel());

        livro.devolver();

        System.out.println("Disponível após devolução: " + livro.isDisponivel());

        Periodico periodico = new Periodico("Revista Ciência", 10);

        System.out.println("Periódico: " + periodico.getTitulo());
        System.out.println("Volume: " + periodico.getNumeroVolume());
    }
}
