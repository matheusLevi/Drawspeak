package desktop;

import java.util.ArrayList;

public  class MenuPrincipal extends Menu{
    
	
	private String nomeLayout;
    protected ArrayList<String> servicos = new ArrayList<>();
	
	@Override
	public String layout(String novoLayout) {
		
	nomeLayout = novoLayout;
	
	return nomeLayout;
		
	}

	@Override
	public void servicos() {
	
		 int i;
			
		    servicos.add("Configurações");
			servicos.add("Vozes");
			servicos.add("Login");
			servicos.add("Encerrar Sessão");
			servicos.add("Ajuda Drawspeak");
			servicos.add("Sair");
			
			
			servicos.toString();
			
		    for(i=0;i<servicos.size();i++){	
			System.out.println(servicos.get(i));
			}
		
	}

	@Override
	public void servicos(ArrayList<String> padrao) {
		// TODO Auto-generated method stub
		
	}



    
	
	
}
