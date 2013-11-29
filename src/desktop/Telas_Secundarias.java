package desktop;

import java.util.Scanner;

public class Telas_Secundarias extends Tela_Principal{
	
	//Telas do Menu Principal
	Scanner input = new Scanner(System.in);
	
	public void telaConfiguracoes(){
		
	  Painel painelConfig = new Painel();	
		
	  painelConfig.x = 150;
	  painelConfig.y = 150;
	  
	  painelConfig.altura=100;
	  painelConfig.largura=120;
	  
	  System.out.println("Tela de Configurações exibida");
		
	}
	
	public void telaVozes(){
		
		  Painel painelVozes = new Painel();	
			
		  painelVozes.x = 150;
		  painelVozes.y = 150;
		  
		  painelVozes.altura=50;
		  painelVozes.largura=80;
		  
		  System.out.println("Tela de vozes exibida");
			
		}
	
	public void login(){
		
		  Painel painelLogin = new Painel();	
			
		  painelLogin.x = 150;
		  painelLogin.y = 150;
		  
		  painelLogin.altura=40;
		  painelLogin.largura=80;
		
		  System.out.println("Tela de login exibida");
			
		}
	

	
	public void encerrarSessao(){
		
		  System.out.println("Sessão atual encerrada");
			
		}
	
	public void ajudaDrawspeak(){
		
		  Painel painelAjuda = new Painel();	
			
		  painelAjuda.x = 150;
		  painelAjuda.y = 150;
		  
		  painelAjuda.altura=50;
		  painelAjuda.largura=80;
		
		
		  System.out.println("Ajuda do Drawspeak exibida");
			
		}
	
	public void sair(){
		
		  System.out.println("\nSystem.exit();\nSaindo do aplicativo\nDrawspeak encerrado");
			
		}
	
	//Telas do Menu de Temas
	
			
	/**
	public void telaTemas(String Biblioteca){
		
	
	System.out.println("Temas "+ Biblioteca + " exibidos");	
		
		
	}
	
	public int criarTemas(String opcao){
	
	int numTemas;	
		
	System.out.println("Quantos temas você deseja adquirir?");
	numTemas = input.nextInt();
	
	return numTemas;
			
	}
	
	**/
	
	//Telas do Menu de Volume
	
public void telaVolume(String servicoRequerido){
		
	  Painel painelVolume = new Painel();	
		
	  painelVolume.x = 30;
	  painelVolume.y = 50;
	  
	  painelVolume.altura=50;
	  painelVolume.largura=80;
	
		
		if(servicoRequerido.equals("Aumentar")){
			System.out.println("Volume");
			System.out.println("(-) |[][][][][]    | (+)");	
		}
		
		else if(servicoRequerido.equals("Diminuir")){
			System.out.println("Volume");
			System.out.println("(-) |[][][]    | (+)");
			}	
		}
	
	
	
		
	}


