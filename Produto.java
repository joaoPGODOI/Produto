package teste;

public class Main {

	public static void main(String[] args) {
          
		//criando objetos do produto
		
		Produto p1 = new Produto("xbox one", "microsoft", 1300.00,  3500.00 );
		Produto p2 = new Produto("playstation 5", "sony", 2000.00, 4400.00);
		Produto p3 = new Produto("headset","razer", 170.00, 340.00);
		Produto p4 = new Produto("Resident Evil 7","capcom", 36.60,91.50);
		
		
		//calculo do lucro de cada produto
		
		System.out.println("Retorno lucro" + " " + p1.nome + " " + p1.marca + "= " + p1.calculoLucro());
		System.out.println("Retorno lucro"  + " " + p2.nome + " " + p2.marca + "=" + p2.calculoLucro());
		System.out.println("Retorno lucro"+ " " + p3.nome + " " + p3.marca + "= " + p3.calculoLucro());
		System.out.println("Retorno lucro"+ " " + p4.nome + " " + p4.marca + "= " + p4.calculoLucro());	
	}

 }
        //criando classe construtor
       class Produto{
    	   String nome,marca;
    	   double preço_Custo, preço_Venda;
    	   
    	   	Produto(String nome,String marca,double preço_Custo,double preço_Venda){
    	   		this.nome = nome;
    	   		this.marca = marca;
    	   		this.preço_Custo = preço_Custo;
    	   		this.preço_Venda = preço_Venda;
    	   	}
       
       //Método de calculo lucro
       
            double calculoLucro() {
                return this.preço_Venda - preço_Custo;
            }
       }