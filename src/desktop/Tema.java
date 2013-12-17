package desktop;

import java.util.ArrayList;
//import java.util.Scanner;
import desktop.ComunicacaoDrawspeak;

public class Tema {

	
	private String nome;
	private  ArrayList<Modulo> tema = new ArrayList<>();
	private  ArrayList<String> nomeModulos = new ArrayList<>();
	
	public Tema(String nomeTema){
		
	nome = nomeTema;
	
	}
		
	
	public  void criarModulo(String nomeTema, Tema temaSelecionado, ArrayList<String> bibliotecaPadrao){
				
	  //Scanner input = new Scanner(System.in); 
	  //ComunicacaoDrawspeak leitor = new ComunicacaoDrawspeak();	
	  String nomeModulo,imagemSelecionada,somSelecionado,textoSelecionado;
	  		
	  //Repositorio_De_Imagens bibliotecaImagens = new Repositorio_De_Imagens();
	  Repositorio_De_Imagens repositorioImagens = new Repositorio_De_Imagens();
	  Repositorio_De_Sons repositorioSons = new Repositorio_De_Sons();
	  Repositorio_De_Texto bibliotecaTextos = new Repositorio_De_Texto();
	    
	  System.out.println("Digite o nome do módulo");	
	  nomeModulo = ComunicacaoDrawspeak.lerModulo();
	  System.out.println("Selecionar imagem");
	  imagemSelecionada = repositorioImagens.setImagem();
	  System.out.println("Selecionar Som");
	  somSelecionado = repositorioSons.setSom();
	  System.out.println("Selecionar Texto");
	  textoSelecionado = bibliotecaTextos.setTexto();
	  Modulo modulo = new Modulo(nomeTema,nomeModulo,imagemSelecionada,somSelecionado,textoSelecionado);
	  tema.add(modulo);
	  
	  System.out.println("Módulo " + nomeModulo + " criado");
	  
	  System.out.println("\nDetalhes do módulo");
	  
	  modulo.detalhesModulo(modulo);
	  
	  nomeModulos.add(nomeModulo);
	  
	}
	
	public void exibirModulos(){
	
	tema.toString();	
		
	int i;
	int size = tema.size();
	
	if(size==0){
		System.out.println("Não existem modulos neste tema");
	}
	
	else{
	
	System.out.println("Módulos do tema " + nome +"\n");
	
	for(i=0;i<size;i++){	
		System.out.println(tema.get(i));
		}
	
	}
	
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tema tema = new Tema("Memes");
		
		//tema.criarModulo("Memes");
		//tema.exibirModulos();
		
	}


