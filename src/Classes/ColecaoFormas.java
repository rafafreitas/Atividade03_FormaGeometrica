package Classes;

import java.util.ArrayList;

public class ColecaoFormas {
	ArrayList<FormaGeometrica> formas;
	
	
	public ColecaoFormas(){
		formas = new ArrayList<FormaGeometrica>();
	}
	
	public void adicionarForma(FormaGeometrica forma){
		if (forma.calcularArea() > 4)
			formas.add(forma);
		
		
		
	}
	
}
