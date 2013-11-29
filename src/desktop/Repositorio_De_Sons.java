package desktop;

import java.util.ArrayList;
import java.util.Scanner;

public class Repositorio_De_Sons {
	
	   
		private ArrayList<String> som = new ArrayList<>();
        private Scanner leitor = new Scanner(System.in);
		
		public void criarArquivoDeSom(int numeroSom, ArrayList<String> som){
			
		int i;
		int size = som.size();
		
		Scanner input = new Scanner(System.in);
		String sound;
			
		for(i=0;i<numeroSom;i++){
			System.out.println("Digite o nome do "+ (i+1) + " Tema");
			sound = input.next();
			som.add(sound);
		}
		
		som.toString();
		
		System.out.println("\nNovos sons armazenados:");
		
		for(i=size;i<(size+numeroSom);i++){	
				System.out.println(som.get(i));
				}
		
		System.out.println();
		
		
				
		}
		
		
		public void exibirBibliotecaDeSom(ArrayList<String> som) {
			
			int i;	
					
			System.out.println("\nBiblioteca de Sons atual\n");
			
				for(i=0;i<som.size();i++){	
					System.out.println(som.get(i));
				}	
			
			
			
		}
		
		public String setSom(){
			
			
	        int i;
	        String somCorrespondente,op;
	        Scanner inputSom = new Scanner(System.in);
	        
	        System.out.println("Biblioteca de Sons: ");	
	        
	        for(i=0;i<som.size();i++){	
				System.out.println(som.get(i));
			}
	        
	        System.out.println("Qual desses Sons o usu�rio deseja"
	        		+" anexar ao tema");
	        somCorrespondente = leitor.next();
	        
	          if(som.contains(somCorrespondente)){
	        	  
	          System.out.println("O som " + somCorrespondente +" foi indexada ao tema"
	          		+ " selecionado"); 
	          
	          
	          return somCorrespondente;
	        	  
	          }
	          
	          else{
	        	  
	        	  System.out.println("Som inexistente");
	          
              System.out.println("\n� necess�rio armazenar um arquivo de som no Reposit�rio"
              		+ " de som\nVoc� gostaria de importar um arquivo de som do "
              		+ " gerenciador de arquivos? ");
              
              op = leitor.next();
              
              System.out.println("depois de op = leitor.next();");
              
           switch(op){
           case "s":
           case "S":
        	   
           int quantSom;
           //String imagemSelecionada;
           boolean somAnex=false;
        	   
           System.out.println("Digite quantos arquivos de sons deseja importar");
           quantSom = inputSom.nextInt(); 
           criarArquivoDeSom(quantSom, som);
           
           
           boolean verify2;	   
        	   
           do{
           
           String imagemSelecionada;
           int size = som.size();
           int numImg = quantSom;
           int cont=0;
           
           System.out.println("Reposit�rio de Sons Atual: \n");
           
           for(i=0;i<size;i++){	
				System.out.println(som.get(i));
				}
           
           if(cont==0){
           inputSom.nextLine();
           }
           
           System.out.println("\nSelecione uma dos arquivos de sons para anex�-lo ao modulo");
           imagemSelecionada = inputSom.nextLine();
           //System.out.println("depois do Scanner inputImage");
           verify2 = som.contains(imagemSelecionada);
           //System.out.println(verify2);
           if(verify2==true){
           somAnex=true;
           System.out.println("arquivo de som " + imagemSelecionada + " anexado\n");
           somCorrespondente = imagemSelecionada;
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
          
            return somCorrespondente;
	          
			}	
				

}
		
}