package desktop;

import java.util.ArrayList;

public class MenuVolume extends Menu{

    private String nomeLayout;
	
	public String layout(String novoLayout) {
	
		nomeLayout = novoLayout;
		
		return nomeLayout;
	}

	@Override
	public void servicos() {
		
		System.out.println("Volume");
		System.out.println("(-) |[][][][]      | (+)");
		
	}

	@Override
	public void servicos(ArrayList<String> padrao) {
		// TODO Auto-generated method stub
		
	}

}
