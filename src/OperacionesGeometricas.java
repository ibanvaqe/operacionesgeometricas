package  com.zubiri.geometria;


import java.util.Scanner;

public class OperacionesGeometricas {


	public static void main (String[] args) {

	String seleccion;

	Scanner sc = new Scanner(System.in);

	System.out.print("\nIntroduce Circulo o Rectangulo");

	seleccion = sc.next();


	if (seleccion.equals("Circulo"))
	{

		float numero1, resultadoArea, resultadoCircun;
		Circulo operaciones = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa un número: ");
		numero1 = sc.nextFloat();
		operaciones.setRadio(numero1);

		resultadoArea = operaciones.getArea();
		resultadoCircun = operaciones.getCircu();

		System.out.println("\nEl resultado del AREA es: " + resultadoArea);
		System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircun);
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");

	}
	
	else if (seleccion.equals("Rectangulo"))
	{

		  double altura;
		  double base;
		  double result;

		  Rectangulo rectangulo= new Rectangulo();
		  System.out.print("Estamos trabajando con un rectangulo");

		  Scanner sc = new Scanner(System.in);
		  System.out.print("\ningresa la altura: ");
		  altura = sc.nextDouble();

		  System.out.print("\ningresa la base: ");
		  base = sc.nextDouble();
		  
		  rectangulo.setAltura(altura);
		  rectangulo.setBase(base);

	
		  result =  rectangulo.area();
		  System.out.println("El area del rectangulo: " + result); 
			
		  result =  rectangulo.perimetro();
		  System.out.println("El perimetro del rectangulo: " + result); 
	
	  }

	else 
	
	{
	

	System.out.println("la introduccion ha sido incorrecta");

	}

    }
}
	

