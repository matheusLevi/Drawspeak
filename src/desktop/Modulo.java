package desktop;

public class Modulo {

  public String nome,tema,imagem,som,texto;	
	
  public Modulo(String temaSelecionado, String novoNome, String novaImagem, String novoSom, String novoTexto){
	
   tema = temaSelecionado;
   nome = 	novoNome;
   imagem = novaImagem; 
   som = novoSom;   
   texto = novoTexto;
	
   }	
	
	public void detalhesModulo(Modulo modulo){
		
	System.out.println("Tema: " + modulo.tema);
	System.out.println("Nome: " + modulo.nome);
	System.out.println("imagem associada = " + modulo.imagem);
	System.out.println("som associado = " + modulo.som);
	System.out.println("texto associado = " + modulo.texto);	
	}
	

}
