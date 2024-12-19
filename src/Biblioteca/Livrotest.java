package Biblioteca;

public class Livrotest {
    public static void main(String[] args) {
        Livro livro = new Livro(null, null, 0, null, null, null, 0, null, 0, 0);
        livro.setTitulo("A Rebelião Das Massas");
        livro.setAutor("José Ortega Y Gasset");
        livro.setEditora("Vide");
        livro.setGenero("Filosofia");
        livro.setIdioma("Português");
        livro.setAno(2016);
        livro.setPaginas(364);
        livro.setQuantidadeLivro(200000);
        livro.setISBN(9788567976111l);
        livro.setValor(64.56);
        livro.Informacao();

        

     }

}
