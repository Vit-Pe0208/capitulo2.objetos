public class Livro {
    private String titulo;
    private int quantidade;
   

    public Livro(String titulo,int quantidade){
        this.titulo=titulo;
        this.quantidade=quantidade;
    }

    public String getTítulo(){
        return titulo;
    }
    public int getQuantidade(){
        return quantidade;
    }

   public void setQuantidade(int quantidade){
   if (quantidade<10) {
    System.err.println("Número precisa ser maior que 10!!!, retornando ao valor padrão");   
   }else{
    this.quantidade=quantidade;
   }
     }
   public void setTitulo(String titulo){
    this.titulo=titulo;
   }
   public void exibirLivro(){
    System.out.println("Livro: "+getTítulo());
    System.out.println("Quantidade: "+getQuantidade());
   }
    public static void main(String[] args) {
        Livro livro= new Livro("coração das trevas",10);
        livro.setTitulo("A rebelião das massas");
        livro.setQuantidade(345);
        livro.exibirLivro();
       

    }
}
