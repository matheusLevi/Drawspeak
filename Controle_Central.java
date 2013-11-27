package desktop;

import java.util.Scanner;
import java.util.ArrayList;

public class Controle_Central {
	
private static ArrayList<String> bibliotecaPadrao = new ArrayList<>();

public static void exibirTelaSplash(){
	
		System.out.println("Tela Splash exibida");
		}
		
		
public boolean carregarMenuPrincipal() {
		
		System.out.println("Menu Principal");
		
		return true;
	}
	
	public boolean carregarTemasDaBiblioteca(String biblioteca) {
		
		System.out.println("Temas da Biblioteca " + biblioteca + 
				" exibidos");
		
		return true;
	}

	public boolean carregarBibliotecasTemas() {
		
		String bibliotecasPadrao;
		
		bibliotecaPadrao.add("Memes");
		bibliotecaPadrao.add("Necessidades Básicas");
		bibliotecaPadrao.add("Restaurante");
		bibliotecaPadrao.add("Casa");
		bibliotecaPadrao.add("Xadrez");
		bibliotecaPadrao.add("Matemática");
		bibliotecaPadrao.add("Jogos");
		bibliotecaPadrao.add("Transporte");
		
	    bibliotecasPadrao = bibliotecaPadrao.toString();
		
		System.out.println( bibliotecasPadrao +"\nBiblioteca de Temas exibido");
	
		return true;
	}
	
	public static void main(String[] args) {
		
	String bibliotecaSelecionada="Memes 1";
	String opcao1,opcao2,verificador;
	Scanner input = new Scanner(System.in);
	Scanner leitorVerify = new Scanner(System.in);
	
	boolean carregadoMenu=false,carregadoTemas=false,carregadoBiblioteca=false, error=false;
	boolean carregado=false;
	boolean verify=true;
	
	Controle_Central controle = new Controle_Central();
	MenuPrincipal menup = new MenuPrincipal();
	MenuTemas menut = new MenuTemas();
	MenuVolume volume = new MenuVolume();
	Telas_Secundarias tela2 = new Telas_Secundarias();
	Biblioteca_De_Temas bibliotecaT = new Biblioteca_De_Temas();
	
	exibirTelaSplash();
	carregadoMenu = controle.carregarMenuPrincipal();
	carregadoTemas = controle.carregarBibliotecasTemas();
	carregadoBiblioteca = controle.carregarTemasDaBiblioteca(bibliotecaSelecionada);
	
	//while(verify==true){
	
	while((carregado==false && error!=true) || (verify==true)){
	
	if((carregadoMenu==true) && (carregadoTemas == true) && 
			(carregadoBiblioteca == true)){
	carregado=true;
	System.out.println("Drawspeak carregado\n");
	System.out.println("\nUsuário, digita a opção correspondente ao que você usará no aplicativo\n\n"
			+ "Opções\n1)Menu Principal\n2)Menu de Temas\n3)Menu de Volume");
	opcao1 = input.next();
	  switch(opcao1){
	  
	  case "1":
      menup.layout("Preto");
      System.out.println("\nMenu Principal\n");
      menup.servicos();	  
	  System.out.println("\nQual serviço você deseja do Menu Principal?"); //Digitar nome do serviço do Menu Principal(sem espaços)
	  opcao2 = input.next();
	    if(opcao2.equals("Configurações")){
	    	tela2.telaConfiguracoes();}
	    
	    else if(opcao2.equals("Vozes")){
	    	tela2.telaVozes();
	    	
	    }
	    
        else if(opcao2.equals("Login")){
	    	tela2.login();
	    }
	    
        else if(opcao2.equals("SessãoConvidado")){
        	tela2.sessaoConvidado();
        	
	    }
	    
        else if(opcao2.equals("SessãoEu")){
        	tela2.sessaoEu();
	    }
	    
        else if(opcao2.equals("EncerrarSessão")){
        	tela2.encerrarSessao();
	    }
	    
        else if(opcao2.equals("AjudaDrawspeak")){
        	tela2.ajudaDrawspeak();
	    }
	    
        else if(opcao2.equals("Sair")){
        	tela2.sair();
        	System.exit(1);
	    }
	    
	    else{System.out.println("Comando inválido");}
	    break;
	    
	  case "2":
	  System.out.println("\nMenu de Temas\n");	  
	  menut.layout("Preto");
	  menut.servicos(bibliotecaPadrao);
	  System.out.println("\nQual tema você deseja do Menu de Temas?"); //Digitar nome do Tema selecionado
	  opcao2 = input.next();
	    if(opcao2.equals("Memes") || opcao2.equals("NecessidadesBásicas")|| opcao2.equals("Restaurante")
	    		|| opcao2.equals("Casa")|| opcao2.equals("Xadrez")|| opcao2.equals("Matemática")){
	    	tela2.telaTemas(opcao2);
	    	}
	    else if(opcao2.equals("AdquirirTemas")){
	    int numeroDeTemas = tela2.criarTemas(opcao2);
	    bibliotecaT.criarTemas(numeroDeTemas,bibliotecaPadrao);
	    bibliotecaT.exibirBibliotecaDeTemas(bibliotecaPadrao);
	    }
	    else{
	    	System.out.println("Comando Inválido");
	    	
	    }
	    
	  break;
	  
	  case "3": 
	  System.out.println();
	  volume.layout("Preto");
	  volume.servicos();
	  System.out.println("\nQual serviço você deseja do menu Volume?"); //Digite "Aumentar" ou "Diminuir"
	  opcao2=input.next();
	    if(opcao2.equals("Aumentar") || opcao2.equals("Diminuir")){
	    	tela2.telaVolume(opcao2);}
	    
	    else{
	    	System.out.println("Comando Inválido");
	    }
	    
	  break;
	  
	  }
	  
	System.out.println("\nDeseja acessar outro serviço do Drawspeak?(s/n)");
	verificador = leitorVerify.next();
		  
    if(verificador.equals("s") || verificador.equals("S")){
    continue;	
    }
		  	  
    else if(verificador.equals("n") || verificador.equals("N")){
	verify=false;	
	}
		    
    else{
    break;	
   }
	
	}
	
	else{
	
	System.out.println("Error");
	error=true;
	verify=false;
	}
	
	  }
	
	leitorVerify.close();
	input.close();
	
	    }
	    
	}
