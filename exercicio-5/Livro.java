public class Livro extends Publicacao {
    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }
}

public class Livro extends Publicacao {
    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}


