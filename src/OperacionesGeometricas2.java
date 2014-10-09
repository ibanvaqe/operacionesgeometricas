
import java.util.Scanner;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

//CLASSPAHT=:/home/zubiri/ProyectosJava; export CLASSPATH

public class OperacionesGeometricas2 {


	public static void main (String[] args) {

	char seleccion;

	Scanner sc = new Scanner(System.in);

	System.out.print("\nQue Quieres hacer? (C/R/S) ");

	seleccion = sc.next().charAt(0);

	while (seleccion != 'S')
	{
		if (seleccion  == 'C' || seleccion == 'c' )
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
		System.out.print("\nDesea hacer otra operacion? (C/R/S) ");

		seleccion = sc.next().charAt(0);
	}
	
	System.exit(0);
    }
}
	

