package desktop;
import java.util.Scanner;

public class ScannerDrawspeak {

	Scanner input = new Scanner(System.in);
	
	public String lerOpcao (){
	
	String op;	
	
	op = input.nextLine();
	
	return op;
		
	}
	
	public int lerInteiro (){
		
	int inteiro;	
		
	inteiro = input.nextInt();	
		
	return inteiro;
	
	}
	
	public String lerTema(){
	
	String tema;	
		
	tema = input.nextLine();
	
	return tema;
		
	}
	
	public String lerModulo(){
		
	String modulo;	
		
	modulo = input.nextLine();	
		
	return modulo;
	
	}
	
	public String lerImagem(){
		
		String arqImagem;
		
		arqImagem = input.nextLine();	
			
		return arqImagem;
		
		}
	
	public String lerSom(){
		
		String arqSom;
		
		arqSom = input.nextLine();	
			
		return arqSom;
		
		}
	
    public String lerTexto(){
		
    	String arqTexto;
    	
		arqTexto = input.nextLine();	
			
		return arqTexto;
		
		}
	
	
	
}
