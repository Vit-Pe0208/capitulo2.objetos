package Biblioteca;

public class Livro {
  private String titulo;
  private String autor;
  private int ano;
  private String editora;
  private Long isbn;
  private String genero;
  private int paginas;
  private String idioma;
  private int quantidadeLivro;
  private double valor;

  public Livro(String titulo,String autor,int ano,String editora,Long isbn,String genero,int paginas,String idioma,int quantidadeLivro,double valor){
           this.titulo=titulo;
           this.autor=autor;
           this.ano=ano;
           this.editora=editora;
           this.isbn=isbn;
           this.genero=genero;
           this.paginas=paginas;
           this.idioma=idioma;
           this.quantidadeLivro=quantidadeLivro;
           this.valor=valor;
  }
      public String getTitulo(){
        return titulo;
      }
      public String getAutor(){
        return autor;
      }
      public String getEditora(){
        return editora;
      }
      public String getGenero(){
        return genero;
      }
      public String getIdioma(){
        return idioma;
      }
      public int getAno(){
        return ano;
      }
      public Long getISBN(){
        return isbn;
      }
      public int getPaginas(){
        return paginas;
      }
      public int getQuantidadeLivro(){
        return quantidadeLivro;
      }
      public double getValor(){
        return valor;
      }

      public void setTitulo(String titulo){
        if(titulo.equals(" ")){
            System.err.println("não pode ser vazio ou nulos");
        }else{
            this.titulo=titulo;
        }
        
      }
      public void setAutor(String autor ){
        if(autor.equals(" ")){
            System.err.println("não pode ser vazio ou nulos");
        }else{
            this.autor=autor;
        }
      }
      public void setEditora(String editora ){
        this.editora=editora;
      }
      public void setGenero(String genero ){
        if (genero.equalsIgnoreCase("Poesia")||genero.equalsIgnoreCase("Teatro")||genero.equalsIgnoreCase("Prosa")||genero.equalsIgnoreCase("História")||genero.equalsIgnoreCase("CiÊncia")||genero.equalsIgnoreCase("Filosofia")) {
            this.genero=genero;
        }else{
            System.err.println("erro! no Gênero");
        }
        
      }
      public void setIdioma(String idioma ){
       this.idioma=idioma;
     }
     public void setAno(int ano){
      
        if (ano<1450 ||ano>=2024) {
          
          System.err.println("Erro no ano, voltando ao valor padrão");
        }else{
          this.ano=ano;  
        }
        
     }
     public void setISBN(Long isbn){
        if(isbn<=1000000000000l || isbn>=9999999999999l){
          System.err.println("Erro no ISBN, voltando ao valor padrão");
        }
        else{
          this.isbn=isbn;         
     }
    }
     public void setPaginas(int paginas){
        if (paginas>0) {
            this.paginas=paginas; 
        }else{
            System.err.println("erro no número de páginas! voltando ao valor padrão ");
        }
       
     }
     public void setQuantidadeLivro(int quantidadeLivro){
        if (quantidadeLivro>0) {
            this.quantidadeLivro=quantidadeLivro;       
        }else{
            System.err.println("Erro na quantidade de livros, voltando ao valor padrçao");
        }
        
     }
     public void setValor(double valor){
        if(valor>0){
            this.valor=valor;
        }else{
            System.out.println("Erro no valor, voltando ao valor padrão");
        }      
     }
     public void Informacao(){
      System.out.printf("Titulo: %s%n",getTitulo());
      System.out.printf("Autor:%s%n",getAutor());
      System.out.printf("Editora:%s%n",getEditora());
      System.out.printf("Gênero:%s%n",getGenero());
      System.out.printf("Idioma:%s%n",getIdioma());
      System.out.printf("Ano de publicação:%d%n",getAno());
      System.out.printf("Número de páginas:%d%n",getPaginas());
      System.out.printf("Estoque:%d%n",getQuantidadeLivro());
      System.out.printf("Número único de identificação:%d%n",getISBN());
      System.out.printf("valor R$:%.2f",getValor());



     }
    


      

      


}
