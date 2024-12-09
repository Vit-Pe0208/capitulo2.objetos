public class Produto1 {
    private String nome;
    private int quantidade;

    public Produto1(String nome,int quantidade){
        this.nome=nome;
        this.quantidade=quantidade;
    }
    public String getNome(){
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setQuantidade(int quantidade){
        if (quantidade<0) {
            System.err.println("Erro: Número inválido");            
        }else{
            this.quantidade=quantidade;   
        }      
    }
    public void exibirValor(){
        System.out.println("Nome: "+getNome());
        System.out.println("Quantidade: "+getQuantidade());    
     }
    public static void main(String[] args) {
        Produto1 produto=new Produto1("null",0);
        produto.setNome("feijão");
        produto.setQuantidade(-8);
        produto.exibirValor();

    }
    



}
