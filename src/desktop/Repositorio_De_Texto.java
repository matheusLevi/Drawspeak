package desktop;

import java.util.ArrayList;

//import java.util.Scanner;
import desktop.ComunicacaoDrawspeak;

public class Repositorio_De_Texto{
		
		private ArrayList<String> txt = new ArrayList<>();	
		//private Scanner leitor = new Scanner(System.in);
	   
		public void criarArquivoDeTexto(int numeroTexto, ArrayList<String> txt){
			
		int i;
		int size = txt.size();
		
		//Scanner input = new Scanner(System.in);
		String tema;
			
		for(i=0;i<numeroTexto;i++){
			System.out.println("Digite o nome do "+ (i+1) + " Texto");
			tema = ComunicacaoDrawspeak.lerTexto();
			txt.add(tema);
		}
		
		txt.toString();
		
		System.out.println("\nNovo textos armazenados:");
		
		for(i=size;i<(size+numeroTexto);i++){	
				System.out.println(txt.get(i));
				}
		
		System.out.println();
		
		
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
	        String textoCorrespondente,op;
	        	
	        System.out.println("Biblioteca de Textos: ");	
	        
	        for(i=0;i<txt.size();i++){	
				System.out.println(txt.get(i));
			}
	        
	        System.out.println("Qual desses textos o usuário deseja"
	        		+" anexar ao tema");
	        textoCorrespondente = ComunicacaoDrawspeak.lerTexto();
	        
	          if(txt.contains(textoCorrespondente)){
	        	  
	          System.out.println("O texto " + textoCorrespondente +" foi indexado ao tema"
	          		+ " selecionado"); 
	          
	          
	          return textoCorrespondente;
	        	  
	          }
	          
	          else{
	        	  System.out.println("Texto inexistente");}
				
	          System.out.println("\nÉ necessário armazenar um arquivo de texto no Repositório"
	              		+ " de som\nVocê gostaria de importar um arquivo de som do "
	              		+ " gerenciador de arquivos? ");
	              
	              op = ComunicacaoDrawspeak.lerOpcao();
	              
	              System.out.println("depois de op = leitor.next();");
	              
	           switch(op){
	           case "s":
	           case "S":
	        	   
	           int quantSom;
	           //String imagemSelecionada;
	           boolean somAnex=false;
	        	   
	           System.out.println("Digite quantos arquivos de texto deseja importar");
	           quantSom = ComunicacaoDrawspeak.lerInteiro(); 
	           criarArquivoDeTexto(quantSom, txt);
	           
	           
	           boolean verify2;	   
	        	   
	           do{
	           
	           String textoSelecionado;
	           int size = txt.size();
	           
	          
	           
	           System.out.println("Repositório de Textos Atual: \n");
	           
	           for(i=0;i<size;i++){	
					System.out.println(txt.get(i));
					}
	           
	          
	           
	           System.out.println("\nSelecione uma dos arquivos de texto para anexá-lo ao modulo");
	           textoSelecionado = ComunicacaoDrawspeak.lerTexto();
	           //System.out.println("depois do Scanner inputImage");
	           verify2 = txt.contains(textoSelecionado);
	           //System.out.println(verify2);
	           if(verify2==true){
	           somAnex=true;
	           System.out.println("arquivo de texto " + textoSelecionado + " anexado\n");
	           textoCorrespondente = textoSelecionado;
	           return textoCorrespondente;
	           }
	          
	                   
	           else{
	        	  
	           System.out.println("inexistente");	   
	        	   
	           }
	          
	           break;
	           
	           } while(somAnex == false);
	           
	           case"n":
	           case"N":
	        	
	          return null;	   
	           
	           }   
	          
	            return textoCorrespondente;
		          
				}	
					

	}
			
	
