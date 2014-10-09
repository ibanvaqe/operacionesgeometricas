
import java.util.Scanner;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

//CLASSPAHT=:/home/zubiri/ProyectosJava; export CLASSPATH

public class OperacionesGeometricas {


	public static void main (String[] args) {

	String seleccion;

	Scanner sc = new Scanner(System.in);

	System.out.print("\nQue quieres hacer ? (Circulo,Rectangulo o Terminar) ");

	seleccion = sc.next();

		if (seleccion.equalsIgnoreCase("Circulo") == true )
		{

			double radio;
			double result;
		
		
		
			System.out.print("\ningresa un número: ");
			radio = sc.nextDouble();
			Circulo circulo = new Circulo(radio);

			result = circulo.Circunferencia();
			System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + result);
	
			result = circulo.Area();
			System.out.println("\nEl resultado del AREA es: " + result);
		
	
		}
	
		else 
		{

			  double altura;
			  double base;
			  double area;
			  double perimetro;

			  
			  System.out.print("Estamos trabajando con un rectangulo");

			  
			  System.out.print("\ningresa la altura: ");
			  altura = sc.nextDouble();

			  System.out.print("\ningresa la base: ");
			  base = sc.nextDouble();
			  
			  Rectangulo rectangulo= new Rectangulo(altura,base);
	 		  area = rectangulo.area();
	
			  
			  System.out.println("El area del rectangulo: " + area); 
			
			  perimetro =  rectangulo.perimetro();
			  System.out.println("El perimetro del rectangulo: " + perimetro); 
	
		  }


    }
}
	

