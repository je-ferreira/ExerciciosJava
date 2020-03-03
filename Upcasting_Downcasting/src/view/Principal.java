package view;

import negocio.*;

public class Principal {

	public static void main(String[] args) {
		
		//UPCASTING
		
		Quadrado objQuadradoUp = new Quadrado();
		objQuadradoUp.setLado(5);
		
		//atribui objeto da classe filha para gerar objeto da classe mae
		Figura objFiguraUp = objQuadradoUp;
		System.out.println(String.format("[Upcasting] Area da figura: %.2f cm²", objFiguraUp.calcularArea()));

		
		Figura f = new Quadrado();
		Quadrado q = (Quadrado)f;
		
		q.setLado(5);
		System.out.println((String.format("[Downcasting] Area do quadrado: %.2f cm²", q.calcularArea())));
	}

}
