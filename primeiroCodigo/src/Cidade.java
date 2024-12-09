public class Cidade {
    private String nome;
    private int populacao;

    public String getNome(){
        return nome;
    }
    public int getPopulacao(){
        return populacao;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPopulacao(int populacao){
        this.populacao=populacao;
    }
    public static void main(String[] args) {
        Cidade cidade=new Cidade();
        cidade.setNome("Ceilândia");
        cidade.setPopulacao(287023);
        System.out.println("A cidade de "+cidade.getNome()+" tem mais de  "+cidade.getPopulacao()+" mil pessoas");
    }

}
