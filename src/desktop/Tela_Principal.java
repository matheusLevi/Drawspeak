package desktop;

public class Tela_Principal {

// Modificação 1
 
Painel painelDeTemas = new Painel();
MenuTemas menuT = new MenuTemas(); // Menu lateral que exibe os temas
MenuPrincipal menuPrincipal = new MenuPrincipal(); //Menu superior que exibe os servicos genéricos do aplicativo

public Tela_Principal(){
	
	painelDeTemas.x = 0;
	painelDeTemas.y = 0;
	painelDeTemas.altura=640;
	painelDeTemas.largura=480;
	painelDeTemas.corDeFundo = "Branco";
	
	menuT.servicos();
	
}
	
}
