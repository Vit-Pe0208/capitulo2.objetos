public class SeuNome {
    private String nome;
    private int idade;
    private String profissao;
    private String endereco;
    private String telefone;
    private String email;
    private String carro;
    private double salario;

    //Métodos Getters
    public String getNome(){
        return nome;
    }
    public String getProfissao(){
        return profissao;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }
    public String getCarro(){
        return carro;
    }
    
    
    public int getIdade(){
        
        return idade;

       
    }
    public double getSalario(){
        return salario;
    }
    
    //Métodos Setters
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setProfissao(String profissao){
        this.profissao=profissao;
     }

     public void setEndereco(String endereco){
        this.endereco=endereco;
     }
     public void setTelefone(String telefone){
        this.telefone=telefone;
     }
     public void setEmail(String email){
        this.email=email;
     }
     public void setCarro(String carro){
        
        this.carro=carro;    
     }
     public void setIdade(int idade){
        if (idade<0 || idade>120) {
            System.err.println("idade Inválida");
            
        
     }else{
        this.idade=idade;  }
      }   
     public void setSalario(double salario){
        this.salario=salario;
     }
      void exibirdados(){
        System.out.println("Nome: "+getNome());
        System.out.println("PROFISSÃO:"+getProfissao());
        System.out.println("ENDEREÇO: "+getEndereco());
        System.out.println("TELEFONE: "+getTelefone());
        System.out.println("EMAIL: "+getEmail());
        System.out.println("IDADE: "+getIdade());
        System.out.println("Salário: "+getSalario());
        System.out.println("Possui Carro: "+getCarro());
      }
     public static void main(String[] args) {
       
        SeuNome pessoa = new SeuNome();
        pessoa.setNome("Vitor");
        pessoa.setProfissao("vagabundo");
        pessoa.setEndereco("SHPS, conjunto A casa 11");
        pessoa.setTelefone("6199857-2553");
        pessoa.setEmail("vitorsilvapessoa@gmail.com");
        pessoa.setIdade(121);
        pessoa.setSalario(1200.0);
        pessoa.setCarro("Sim");
        pessoa.exibirdados();



      }

}
