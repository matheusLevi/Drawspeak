package desktop;

import java.util.ArrayList;
import java.util.Scanner;

public class Repositorio_De_Texto{
		
		private ArrayList<String> txt = new ArrayList<>();	
		private Scanner leitor = new Scanner(System.in);
	   
		public void criarArquivoDeTexto(int numeroTexto, ArrayList<String> txt){
			
		int i;
		int size = txt.size();
		
		Scanner input = new Scanner(System.in);
		String tema;
			
		for(i=0;i<numeroTexto;i++){
			System.out.println("Digite o nome do "+ (i+1) + " Texto");
			tema = input.next();
			txt.add(tema);
		}
		
		txt.toString();
		
		System.out.println("\nNovo textos armazenados:");
		
		for(i=size;i<(size+numeroTexto);i++){	
				System.out.println(txt.get(i));
				}
		
		System.out.println();
		
		
		input.close();
		
		}
		
		
		public void exibirBibliotecaDeTexto(ArrayList<String> txt) {
			
			int i;	
					
			System.out.println("\nBiblioteca de Temas atual\n");
			
				for(i=0;i<txt.size();i++){	
					System.out.println(txt.get(i));
				}	
			
			
		}
		
		public String setTexto(){
			
			int i;
	        String textoCorrespondente;
	        	
	        System.out.println("Biblioteca de Textos: ");	
	        
	        for(i=0;i<txt.size();i++){	
				System.out.println(txt.get(i));
			}
	        
	        System.out.println("Qual desses textos o usu�rio deseja"
	        		+" anexar ao tema");
	        textoCorrespondente = leitor.next();
	        
	          if(txt.contains(textoCorrespondente)){
	        	  
	          System.out.println("A imagem " + textoCorrespondente +" foi indexada ao tema"
	          		+ " selecionado"); 
	          
	          
	          return textoCorrespondente;
	        	  
	          }
	          
	          else{System.out.println("Som inexistente");}
				
	          return null;
	          
	        	  
	          }
	          
	         

	}
		
