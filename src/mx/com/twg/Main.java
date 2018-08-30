package mx.com.twg;

import mx.com.twg.figuras.Circulo;
import mx.com.twg.figuras.Elipse;
import mx.com.twg.figuras.FiguraGeometrica;
import mx.com.twg.figuras.Rectangulo;

public class Main {

	public static void main(String[] args) {

		FiguraGeometrica figura;
		
		figura = new Elipse();
		determinarTipo(figura,"Elipse");
		
		figura = new Rectangulo();
		determinarTipo(figura,"Rectangulo");

	}
	
	public static void determinarTipo(FiguraGeometrica figura, String msg){

		if(figura instanceof Elipse){
			System.out.println("Es un Elipse de la figura "+msg);
		}
		
		if(figura instanceof Circulo){
			System.out.println("Es un Circulo de la figura "+msg);
		}
		
		if(figura instanceof Rectangulo){
			System.out.println("Es un Rectangulo de la figura "+msg);
		}
		
		if(figura instanceof FiguraGeometrica){
			System.out.println("Es una Figura Geometrica de la figura "+msg);
		}
		
		if(figura instanceof Object){
			System.out.println("Es un Object de la figura "+msg);
		}
		
		
	}

}
