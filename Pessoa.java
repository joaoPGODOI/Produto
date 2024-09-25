package tarefa;

import java.time.LocalDate;

public class main {

   public static void main(String[] args) {
		
	//criando objetos 
	   Pessoa p1 = new Pessoa("Madalena Godoi", 1.60, LocalDate.of(1970, 01, 01));
	   Pessoa p2 = new Pessoa("Daniel Pereira", 1.68, LocalDate.of(1968, 03, 11));
	   Pessoa p3 = new Pessoa("Leonardo Godoi", 1.69, LocalDate.of(2008, 01, 11));
	   
	   //exibir os dados das pessoas
	   
	   System.out.println(p1);
	   System.out.println(p2);
	   System.out.println(p3);
   } 
}
 

//criando a classe e o construtor

   class Pessoa{ 
        private String nome_Sobrenome;
        private double altura;
        private LocalDate data_Nascimento;
        private String email;
      
        public Pessoa(String nome_Sobrenome, double altura,LocalDate data_Nascimento){
    	  
    	   this.nome_Sobrenome = nome_Sobrenome;
    	   this.altura = altura;
    	   this.data_Nascimento = data_Nascimento;
    	   this.email = gerarEmail(nome_Sobrenome);
      
              if(data_Nascimento.isAfter(LocalDate.now())) {
    	          throw new IllegalArgumentException("A data de nascimento não pode ser posterior à data atual");  
              }
        }
   
   
    
   //método gerar e-mail
    private String gerarEmail(String nome_Sobrenome){
    	String[] partes = nome_Sobrenome.split(" ");
    	String nome = partes[0].toLowerCase();
    	String sobrenome = partes[partes.length - 1].toLowerCase();
        String dominio = "email.com";  
        return nome + "." + sobrenome + "@" + dominio;
    }
    public String toString() {
    	return "Nome:" + nome_Sobrenome + ",Altura:" + altura + ",Data de nascimento:" + data_Nascimento + ",Email:" + email;
    }
  }