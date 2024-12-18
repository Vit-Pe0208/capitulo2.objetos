package Humano;

public class Homem extends humano {
    public Homem(String nome){
        super(nome);
    }
    public void héteroTop(){
        System.out.printf("%s é hétero top%n",getNome());
    }
    public void mijou(){
        System.out.printf("%s mija em pé%n", getNome());
    }





}
