package desktop;

import java.util.ArrayList;
//import java.util.Scanner;
import desktop.ComunicacaoDrawspeak;

public class Biblioteca_De_Temas {
	
	
	ArrayList<Tema> temas = new ArrayList<>();
	
	public Biblioteca_De_Temas(ArrayList<Tema> bibliotecaPadraoTemas){
	
	this.temas = bibliotecaPadraoTemas;

	}
	
    //Scanner input = new Scanner(System.in);
	//ComunicacaoDrawspeak leitor = new ComunicacaoDrawspeak();
	
	public  void criarTemas(int numeroTemas, ArrayList<String> bibliotecaPadrao){
		
	int i;
	int size = bibliotecaPadrao.size();
	
	
	
	String tema;
		
	for(i=0;i<numeroTemas;i++){
		System.out.println("Digite o nome do "+ (i+1) + " Tema");
		tema = ComunicacaoDrawspeak.lerTema();
		Tema tema1 = new Tema(tema);
		temas.add(tema1);
		bibliotecaPadrao.add(tema);
	}
	
	bibliotecaPadrao.toString();

	
	System.out.println("\nNovos temas armazenados:");
	
	for(i=size;i<(size+numeroTemas);i++){	
			System.out.println(bibliotecaPadrao.get(i));
			}
	
	//System.out.println();
    
	
		}
	
	
	public void exibirBibliotecaDeTemas(ArrayList<String> bibliotecaPadrao) {
		
		int i;	
				
		System.out.println("\nBiblioteca de Temas atual\n");
		
			for(i=0;i<bibliotecaPadrao.size();i++){	
				System.out.println(bibliotecaPadrao.get(i));
			}
				
	}
	
	 public boolean containsBiblioteca(String Tema, ArrayList<String> bibliotecaPadrao) {
	    	
		    boolean contem;
		    
		    contem = bibliotecaPadrao.contains(Tema);
		    
		    return contem;
		    	
		    }	
	
	 public boolean containsBiblioteca(Tema tema, ArrayList<Tema> bibliotecaPadraoTemas) {
	    	
		    boolean contem;
		    
		    contem = bibliotecaPadraoTemas.contains(tema);
		    
		    return contem;
		    	
		    }	
	
	 
	 
	 
}
