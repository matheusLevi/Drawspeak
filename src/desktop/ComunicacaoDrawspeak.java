package desktop;
import java.util.Scanner;

public class ComunicacaoDrawspeak {

	static Scanner input = new Scanner(System.in);
	
	public static String lerOpcao (){
	
	String op;	
	
	op = input.next();
	
	return op;
		
	}
	
	public static int lerInteiro (){
		
	int inteiro;	
		
	inteiro = input.nextInt();	
		
	return inteiro;
	
	}
	
	public static String lerTema(){
	
	String tema;	
		
	tema = input.next();
	
	return tema;
		
	}
	
	public static String lerModulo(){
		
	String modulo;	
		
	modulo = input.next();	
		
	return modulo;
	
	}
	
	public static String lerImagem(){
		
		String arqImagem;
		
		arqImagem = input.next();	
			
		return arqImagem;
		
		}
	
	public static String lerSom(){
		
		String arqSom;
		
		arqSom = input.next();	
			
		return arqSom;
		
		}
	
    public static String lerTexto(){
		
    	String arqTexto;
    	
		arqTexto = input.next();	
			
		return arqTexto;
		
		}
	
}
