package desktop;

import java.util.ArrayList;

public class MenuTemas extends Menu{

	private String nomeLayout;
	protected ArrayList<String> servicos = new ArrayList<>();
	
	
	@Override
	public String layout(String novoLayout) {
		
		nomeLayout = novoLayout;
		
		return nomeLayout;
	}

	@Override
	public void servicos(ArrayList<String> padrao) {

		int i;
		
		
		servicos = padrao;
		servicos.toString();
		
	  for(i=0;i<servicos.size();i++){	
		System.out.println(servicos.get(i));
		}
	  
	  System.out.println("\nAdquirir Temas");
	  System.out.println();
	  
	}

	@Override
	public void servicos() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public void servicos() {
		//System.out.println("\nMemes\nNecessidades Básicas\nRestaurante\nCasa\nXadrez\nMatemática");
		
	//}
	
	

}
