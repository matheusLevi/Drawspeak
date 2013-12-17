package desktop;

//import java.util.Scanner;
import desktop.ComunicacaoDrawspeak;
import java.util.ArrayList;

public class Controle_Central{
	
private ArrayList<String> bibliotecaPadrao = new ArrayList<>();  //poderia ir no modelo de dados
public ArrayList<Tema> bibliotecaPadraoTemas = new ArrayList<>();  //poderia ir no modelo de dados

	public void exibirTelaSplash()
	{
		System.out.println("Tela Splash exibida"); //tela secudária
	}		
	
	/**
	 * Carrega o menu principal.
	 * 
	 * @return
	 */
	public boolean carregarMenuPrincipal() {

		System.out.println("Menu Principal"); //Carregar na classe MenuPrincipal através da chamada de função da classe TelaPrincipal

		return true;
	}
	
	
	public boolean carregarBibliotecasTemas() { //**1 - Controle chama MenuPrincipal 
		                                        //  2 - MenuPrincipal chama MenuDeTemas
		                                        //  3 - MenuDeTemas chama BibliotecaDeTemas
		                                        //  4 - BibliotecaDeTemas chama DadosDrawspeak
		                                        //  5 - DadosDrawspeak retorna os dados(Temas) a BibliotecaDeTemas
		                                        //  6 - Biblioteca De Temas retorna os dados ao MenuDeTemas
		                                        //  7 - MenuDeTemas retorna valor booleano a MenuPrincipal
		                                        //  8 - MenuPrincipal retorna valor booleano ao controle
		String bibliotecasPadrao; 
		
		//extrairDadosDaBiblioteca();
		
		bibliotecaPadrao.add("Memes");
		Tema memes = new Tema("Memes");
		bibliotecaPadraoTemas.add(memes);
		bibliotecaPadrao.add("Necessidades Básicas");
		Tema necessidadesBasicas = new Tema("Necessidades Básicas");
		bibliotecaPadraoTemas.add(necessidadesBasicas);
		bibliotecaPadrao.add("Restaurante");
		Tema restaurante = new Tema("Restaurante");
		bibliotecaPadraoTemas.add(restaurante);
		bibliotecaPadrao.add("Casa");
		Tema casa = new Tema("Casa");
		bibliotecaPadraoTemas.add(casa);
		bibliotecaPadrao.add("Xadrez");
		Tema xadrez = new Tema("Xadrez");
		bibliotecaPadraoTemas.add(xadrez);
		bibliotecaPadrao.add("Matemática");
		Tema matematica = new Tema("Matemática");
		bibliotecaPadraoTemas.add(matematica);
		bibliotecaPadrao.add("Jogos");
		Tema jogos = new Tema("Jogos");
		bibliotecaPadraoTemas.add(jogos);
		
	    bibliotecasPadrao = bibliotecaPadrao.toString();
		
		System.out.println( bibliotecasPadrao +"\nBiblioteca de Temas exibido");
	
		return true;
	}
	
    public boolean carregarTemasDaBiblioteca(String biblioteca) {
		
		System.out.println("Temas da Biblioteca " + biblioteca +  //Carregar na classe MenuDeTemas
				" exibidos");
		
		return true;
	}

	public static void main(String[] args) {
		
	String bibliotecaSelecionada="Memes 1";
	String opcao1,opcao2,verificador;
	//Scanner input = new Scanner(System.in);
	//Scanner leitorVerify = new Scanner(System.in);
	//ComunicacaoDrawspeak leitor = new ComunicacaoDrawspeak();
	
	
	boolean carregadoMenu=false,carregadoTemas=false,carregadoBiblioteca=false, error=false;
	boolean carregado=false;
	boolean verify=true;
	boolean contain;
	
	Controle_Central controle = new Controle_Central();
	MenuPrincipal menup = new MenuPrincipal();
	MenuTemas menut = new MenuTemas();
	MenuVolume volume = new MenuVolume();
	Telas_Secundarias tela2 = new Telas_Secundarias();
	Biblioteca_De_Temas bibliotecaT = new Biblioteca_De_Temas(controle.bibliotecaPadraoTemas); //Alterar chamada para a classe DadosDrawspeak
	
	
	controle.exibirTelaSplash();
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
			+ "Opções\n1)Menu Principal\n2)Menu de Temas\n3)Menu de Volume\n4)Gerenciador de Temas");
	//opcao1 = input.next();
	
	   // ---- Modificação 1
	
	opcao1 = ComunicacaoDrawspeak.lerOpcao();
	  switch(opcao1){
	  
	  case "1":
      menup.layout("Preto");
      System.out.println("\nMenu Principal\n");
      menup.servicos();	  
	  System.out.println("\nQual serviço você deseja do Menu Principal?");
	  
	  
	  //Digitar nome do serviço do Menu Principal(sem espaços)
	  
	  // ----- Modificação 2
	  
	  //opcao2 = input.next();
	  opcao2 = ComunicacaoDrawspeak.lerOpcao();
	    if(opcao2.equals("Configurações")){
	    	tela2.telaConfiguracoes();}
	    
	    else if(opcao2.equals("Vozes")){
	    	tela2.telaVozes();
	    	
	    }
	    
        else if(opcao2.equals("Login")){
	    	tela2.login();
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
	  menut.servicos(controle.bibliotecaPadrao);
	  System.out.println("\nQual tema você deseja do Menu de Temas?"); //Digitar nome do Tema selecionado
	  //opcao2 = input.next();
	  
	  //Modificação 3
	  
	  opcao2 = ComunicacaoDrawspeak.lerOpcao();
	  contain = bibliotecaT.containsBiblioteca(opcao2, controle.bibliotecaPadrao);
	    if(contain==true){
	    	System.out.println("Modulos do tema " + opcao2 + " exibidos");
	    	}
	    else if(opcao2.equals("AdquirirTemas")){ 	
	    int numeroDeTemas = tela2.criarTemas(opcao2);
	    bibliotecaT.criarTemas(numeroDeTemas,controle.bibliotecaPadrao);
	    bibliotecaT.exibirBibliotecaDeTemas(controle.bibliotecaPadrao);
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
	  //opcao2=input.next();
	  
	  //----- Modificação 4
	  
	  opcao2 = ComunicacaoDrawspeak.lerOpcao();
	    if(opcao2.equals("Aumentar") || opcao2.equals("Diminuir")){
	    	tela2.telaVolume(opcao2);
	    	}
	    
	    
	    // testando git.  
	    else{
	    	System.out.println("Comando Inválido");
	    }
	    
	  break;
	  
	  case "4":
	  System.out.println();
	  System.out.println("Escolha a opcao desejada?\n\n1)Criar Módulo de um Tema existente\n2)Modificar Módulo"
	  		+ " de um Tema existente\n3)Mudar arquivo de Imagem de um Módulo existente\n4)"
	  		+ "Mudar arquivo de Som de um Módulo existente\n5)Mudar arquivo de Texto de um Módulo existente");
	  //opcao2 = input.next();
	  
	  //------- Modificação 5
	  
	  opcao2 = ComunicacaoDrawspeak.lerOpcao();
	    if(opcao2.equals("1")){
	      bibliotecaT.exibirBibliotecaDeTemas(controle.bibliotecaPadrao);
	      System.out.println("\nSelecione o tema correspondente");
	      //opcao2 = input.next();
	      
	 //--------- Modificação 6     
	      
	      opcao2 = ComunicacaoDrawspeak.lerTema();
	      contain = bibliotecaT.containsBiblioteca(opcao2, controle.bibliotecaPadrao);
	      if(contain == true){
	      System.out.println("entrou no if"); 
	      Tema temaSelecionado = new Tema(opcao2);	  
	      
	      int indice;
	      String sTemaSelecionado;
	      
	      indice = controle.bibliotecaPadrao.indexOf(opcao2);
	      sTemaSelecionado = controle.bibliotecaPadrao.get(indice);
	      System.out.println("funcao get de StemaSelecionado retornou");
	      temaSelecionado = controle.bibliotecaPadraoTemas.get(indice);
	      System.out.println("funcao get de temaSelecionado retornou");
	      temaSelecionado.criarModulo(sTemaSelecionado, temaSelecionado, controle.bibliotecaPadrao);
	      //contain = bibliotecaT.containsBiblioteca(opcao2, bibliotecaPadraoTemas);
	      
	      }
	      else{
	    	  
	      }
	    }
	  
	  }
	  
	System.out.println("\nDeseja acessar outro serviço do Drawspeak?(s/n)");
	//verificador = leitorVerify.next();
	
	
	//--------- Modificação 7
	
	verificador = ComunicacaoDrawspeak.lerOpcao();
	
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
	

	
	    }
	
	}











/*package desktop;

import java.util.Scanner;
import java.util.ArrayList;

public class Controle_Central {
	
private static ArrayList<String> bibliotecaPadrao = new ArrayList<>();
public static ArrayList<Tema> bibliotecaPadraoTemas = new ArrayList<>();

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
		Tema memes = new Tema("Memes");
		bibliotecaPadraoTemas.add(memes);
		bibliotecaPadrao.add("Necessidades Básicas");
		Tema necessidadesBasicas = new Tema("Necessidades Básicas");
		bibliotecaPadraoTemas.add(necessidadesBasicas);
		bibliotecaPadrao.add("Restaurante");
		Tema restaurante = new Tema("Restaurante");
		bibliotecaPadraoTemas.add(restaurante);
		bibliotecaPadrao.add("Casa");
		Tema casa = new Tema("Casa");
		bibliotecaPadraoTemas.add(casa);
		bibliotecaPadrao.add("Xadrez");
		Tema xadrez = new Tema("Xadrez");
		bibliotecaPadraoTemas.add(xadrez);
		bibliotecaPadrao.add("Matemática");
		Tema matematica = new Tema("Matemática");
		bibliotecaPadraoTemas.add(matematica);
		bibliotecaPadrao.add("Jogos");
		Tema jogos = new Tema("Jogos");
		bibliotecaPadraoTemas.add(jogos);
		
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
	boolean contain;
	
	Controle_Central controle = new Controle_Central();
	MenuPrincipal menup = new MenuPrincipal();
	MenuTemas menut = new MenuTemas();
	MenuVolume volume = new MenuVolume();
	Telas_Secundarias tela2 = new Telas_Secundarias();
	Biblioteca_De_Temas bibliotecaT = new Biblioteca_De_Temas(bibliotecaPadraoTemas);
	
	
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
			+ "Opções\n1)Menu Principal\n2)Menu de Temas\n3)Menu de Volume\n4)Gerenciador de Temas");
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
	  contain = bibliotecaT.containsBiblioteca(opcao2, bibliotecaPadrao);
	    if(contain==true){
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
	    	tela2.telaVolume(opcao2);
	    	}
	    
	    
	    
	    else{
	    	System.out.println("Comando Inválido");
	    }
	    
	  break;
	  
	  case "4":
	  System.out.println();
	  System.out.println("Escolha a opcao desejada?\n\n1)Criar Módulo de um Tema existente\n2)Modificar Módulo"
	  		+ " de um Tema existente\n3)Mudar arquivo de Imagem de um Módulo existente\n4)"
	  		+ "Mudar arquivo de Som de um Módulo existente\n5)Mudar arquivo de Texto de um Módulo existente");
	  opcao2 = input.next();
	    if(opcao2.equals("1")){
	      bibliotecaT.exibirBibliotecaDeTemas(bibliotecaPadrao);
	      System.out.println("\nSelecione o tema correspondente");
	      opcao2 = input.next();
	      contain = bibliotecaT.containsBiblioteca(opcao2, bibliotecaPadrao);
	      if(contain == true){
	      System.out.println("entrou no if"); 
	      Tema temaSelecionado = new Tema();	  
	      int indice;
	      String sTemaSelecionado;
	      indice = bibliotecaPadrao.indexOf(opcao2);
	      sTemaSelecionado = bibliotecaPadrao.get(indice);
	      System.out.println("funcao get de StemaSelecionado retornou");
	      temaSelecionado = bibliotecaPadraoTemas.get(indice);
	      System.out.println("funcao get de temaSelecionado retornou");
	      temaSelecionado.criarModulo(sTemaSelecionado, temaSelecionado, bibliotecaPadrao);
	      //contain = bibliotecaT.containsBiblioteca(opcao2, bibliotecaPadraoTemas);
	      
	      }
	      else{
	    	  
	      }
	    }
	  
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
*/