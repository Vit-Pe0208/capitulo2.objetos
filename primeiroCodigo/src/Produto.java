// Crie uma nova classe Produto com os atributos públicos que contenha nome, preço e quantidade, 
//não esqueça de adicionar o método getter para esses atributos. 
//No método main, crie um objeto "Produto" e exiba os valores desses atributos usando os getters.
public class Produto {
    public String nome;
    public int preço;
    public int quantidade;
    //método construtor
    public Produto(String nome,int preço,int quantidade){
        this.nome=nome;
        this.preço=preço;
        this.quantidade=quantidade;
    }

    //Método Getter
    public String getNome(){
        return nome;
    }
    public int getPreço(){
        return preço;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public static void main(String[] args) {
        Produto produto=new Produto("Arma",120,100);
        System.out.println("O produto "+produto.getNome()+ " com o preço de R$  "+produto.getPreço()+" foi vendido em "+produto.getQuantidade()+" Quantidades");
        
    }



}
