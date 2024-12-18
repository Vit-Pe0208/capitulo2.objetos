import  animais.*;

public class App9 {
    public static void main(String[] args) {
        //declarar array
        Animal[]animal=new Animal[5];
        //adicionar diferentes tipos de animais na array
        animal[0]=new Cachorro("rex");
        animal[1]=new Cachorro("Mimi");
        animal[2]= new Cachorro("Tatu");
        animal[3]=new Gato("Whiskers");
        animal[4]=new Gato("Tom");

        //iterar soibre array e chamar o método comer() em cada animal

        for(Animal animais :animal){
            animais.comer();
            animais.beber();
            
            
        }

        
    }


}
