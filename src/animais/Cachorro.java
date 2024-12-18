package animais;

public class Cachorro extends Animal {
    //Construtor da classe Cachorro que chama o construtor da classe pai (Animal)
    public Cachorro(String nome){
        super(nome);//chama o construtor da classe animal para inicializar o nome
    }
    public void latir(){
        System.out.printf("%s latiu\n",getNome());
    }
    public void lamber(){
        System.out.printf("%s lambeu\n",getNome());
    }
}
