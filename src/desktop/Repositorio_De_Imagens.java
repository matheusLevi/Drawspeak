package desktop;

import java.util.ArrayList;
import java.util.Scanner;

public class Repositorio_De_Imagens  {
     
	
		//public class Biblioteca_De_Temas extends MenuTemas{
		private ArrayList<String> img = new ArrayList<>();
		//private Scanner leitor = new Scanner(System.in);
		ScannerDrawspeak leitor = new ScannerDrawspeak();
		
		public void criarNovoArquivoDeImagem(int numeroImagens, ArrayList<String> img){
		
		img.add("Me gusta");	
			
		int i;
		int size = img.size();
		
		//Scanner input = new Scanner(System.in);
		String imagem;
			
		for(i=0;i<numeroImagens;i++){
			//leitor.lerImagem();
			System.out.println("Digite o nome do "+ (i+1) + " Tema");
			imagem = leitor.lerImagem();
		    img.add(imagem);
		}
		
		img.toString();
		
		System.out.println("\nNovas imagens armazenadas:");
		
		for(i=size;i<(size+numeroImagens);i++){	
				System.out.println(img.get(i));
				}
		
		System.out.println();
		
		
		//input.close();
		
		}
		
		
		public void exibirBibliotecaDeImagens(ArrayList<String> img) {
			
			int i;	
					
			System.out.println("\nBiblioteca de Imagens atual\n");
			
				for(i=0;i<img.size();i++){	
					System.out.println(img.get(i));
				}	
			
	
		}
		
        public String setImagem(){
		
        int i;
        String imagemCorrespondente,op;
        //Scanner inputImage = new Scanner(System.in);
        	
        System.out.println("Biblioteca de Imagens: ");	
        
        for(i=0;i<img.size();i++){	
			System.out.println(img.get(i));
		}
        
        
        
        System.out.println("Qual dessas imagens o usuário deseja"
        		+" anexar ao tema");
        imagemCorrespondente = leitor.lerImagem();
        
          if(img.contains(imagemCorrespondente)){
        	  
          System.out.println("A imagem " + imagemCorrespondente +" foi indexada ao tema"
          		+ " selecionado");
          
          return imagemCorrespondente;
         	  
          }
          
          else{
        	  
        	  System.out.println("Imagem inexistente");
              System.out.println("\nÉ necessário armazenar um arquivo de imagem no Repositório"
              		+ " de imagens\nVocê gostaria de importar um arquivo de imagem do "
              		+ " gerenciador de arquivos? ");
              
              op = leitor.lerOpcao();
              
              System.out.println("depois de op = leitor.next();");
              
           switch(op){
           case "s":
           case "S":
        	   
           int quantImagens;
           //String imagemSelecionada;
           boolean imagemAnex=false;
        	   
           System.out.println("Digite quantas imagens deseja importar");
           quantImagens = leitor.lerInteiro(); 
           criarNovoArquivoDeImagem(quantImagens, img);
           
           
           boolean verify2;	   
        	 
           int cont=0;
           
           do{
           
           String imagemSelecionada;
           int size = img.size();
          // int numImg = quantImagens;
           //int cont=0;
           
           
           System.out.println("Repositório de Imagens Atual: \n");
           
           for(i=0;i<size;i++){	
				System.out.println(img.get(i));
				}
           
           
           
           //if(cont==0){
           //inputImage.nextLine();
          // cont++;
           //}
           
           //else{
           //System.out.println();	   
           //}
           
           System.out.println(cont);
           
           System.out.println("\nSelecione uma das imagens para anexá-la ao modulo");
           imagemSelecionada = leitor.lerImagem();
           //System.out.println("depois do Scanner inputImage");
           verify2 = img.contains(imagemSelecionada);
           //System.out.println(verify2);
           if(verify2==true){
           imagemAnex=true;
           System.out.println("imagem " + imagemSelecionada + " anexada\n");
           imagemCorrespondente = imagemSelecionada;
           }
          
                   
           else{
        	  
           System.out.println("inexistente");	   
        	   
           }
           
           
           //break;
           
           } while(imagemAnex == false);
           
           case"n":
           case"N":
        	
          return null;	   
           
           }   
          
            return imagemCorrespondente;
           
          }
		
			

          
		}	
        
			

}
	

