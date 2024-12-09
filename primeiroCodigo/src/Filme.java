public class Filme {
    private String titulo;
    private int classificacao;

    public Filme(String titulo,int classificacao){
        this.titulo=titulo;
       this.classificacao=classificacao;
        }
    public String getTitulo(){
        return titulo;
    }
    public int getClassificacao(){
        return classificacao;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setClassificacao(int classificacao){
        if (classificacao<18) {
            System.err.println("classificação errada, voltando ao valor padrão 18");    
        } else {
            this.classificacao=classificacao; 
        }
    }
    public void exibirvalor(){
       System.out.println("nome: "+getTitulo());
       System.out.println("classificação indicativa: "+getClassificacao());
    }

  
    public static void main(String[] args) {
        Filme filme=new Filme(null,18);
        filme.setTitulo("Jogos vorazes");
        filme.setClassificacao(20);
        filme.exibirvalor();

       
      
     
    }

}
