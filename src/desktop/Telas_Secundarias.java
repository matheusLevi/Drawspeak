package desktop;

import java.util.Scanner;

public class Telas_Secundarias extends Tela_Principal{
	
	//Telas do Menu Principal
	Scanner input = new Scanner(System.in);
	
	public void telaConfiguracoes(){
		
	  System.out.println("Tela de Configura��es exibida");
		
	}
	
	public void telaVozes(){
		
		  System.out.println("Tela de vozes exibida");
			
		}
	
	public void login(){
		
		  System.out.println("Tela de login exibida");
			
		}
	
	public void sessaoConvidado(){
		
		  System.out.println("Sess�o convidado ativado");
			
		}
	
	public void sessaoEu(){
		
		  System.out.println("Sess�o eu ativado");
			
		}
	
	public void encerrarSessao(){
		
		  System.out.println("Sess�o atual encerrada");
			
		}
	
	public void ajudaDrawspeak(){
		
		  System.out.println("Ajuda do Drawspeak exibida");
			
		}
	
	public void sair(){
		
		  System.out.println("\nSystem.exit();\nSaindo do aplicativo\nDrawspeak encerrado");
			
		}
	
	//Telas do Menu de Temas
	
			
	
	public void telaTemas(String Biblioteca){
		
	
	System.out.println("Temas "+ Biblioteca + " exibidos");	
		
		
	}
	
	public int criarTemas(String opcao){
	
	int numTemas;	
		
	System.out.println("Quantos temas voc� deseja adquirir?");
	numTemas = input.nextInt();
	
	return numTemas;
			
	}
	
	
	//Telas do Menu de Volume
	
public void telaVolume(String servicoRequerido){
		
		
		if(servicoRequerido.equals("Aumentar")){
			System.out.println("Volume");
			System.out.println("(-) |[][][][][]    | (+)");	
		}
		
		else if(servicoRequerido.equals("Diminuir")){
			System.out.println("Volume");
			System.out.println("(-) |[][][]    | (+)");
			}	
		}
	
	
	@Override
	public void telasSecundarias() {
		// TODO Auto-generated method stub
		
	}
		
		
	}


