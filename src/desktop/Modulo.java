package desktop;

public class Modulo {

private String nome,tema,imagem,som,texto;	
	
  public Modulo(String temaSelecionado, String novoNome, String novaImagem, String novoSom, String novoTexto){
	
   tema = temaSelecionado;
   nome = 	novoNome;
   imagem = novaImagem; 
   som = novoSom;   
   texto = novoTexto;
	
   }	
	
	public void detalhesModulo(String nomeTema){
		
	System.out.println("Tema: " + tema);
	System.out.println("Nome: " + nome);
	System.out.println("imagem associada = " + imagem);
	System.out.println("som associado = " + som);
	System.out.println("texto associado = " + texto);	
	}
	

}
