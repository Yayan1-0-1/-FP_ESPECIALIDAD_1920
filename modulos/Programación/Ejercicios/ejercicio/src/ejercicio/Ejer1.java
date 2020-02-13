package ejercicio;

import java.util.Scanner; //llamamos la libreria del scanner


public class Ejer1
{
	public void actividad1(Scanner _sc)
	
	{
		int base1; //declaramos atributos 
		int altura1;
		int base2;
		int altura2;
		int area1;
		int area2;
		
		System.out.println("Dame la primera base"); //imprimo

		base1 = _sc.nextInt(); // importo lo leido a la variable
		System.out.println("Dame la primera altura");
		altura1 = _sc.nextInt();
		System.out.println("Dame la segunda base"); //imprimo
		base2 = _sc.nextInt(); // importo lo leido a la variable
		System.out.println("Dame la segunda altura");
		altura2 = _sc.nextInt();
		area1 = base1*altura1/2;
		area2 = base2*altura2/2;
		
		if (area1 > area2)
			System.out.println("El primer triangulo es mayor");
		else
			System.out.println("El segundo triangulo es mayor");//imprimo la base 
	}
	public void Actividad2(Scanner _sc)
	{
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("Horas trabajadas");
		a = _sc.nextInt();
		System.out.println("Tarifa de horas");
		b=_sc.nextInt();
		
		if (a < 40)
		{
			System.out.println(a*b+" Total a pagar");
		}
		else
		{
			c=a-40;
		d=2*(c+b)+a;
			System.out.println(d+" Total a pagar ");
		}
	}
	public void Actividad3(Scanner _sc)
	{
		int a;
		int b;
		int c;
		
		System.out.println("Introduce el primer valor");
		a= _sc.nextInt();
		System.out.println("Introduce el segundo valor");
		b= _sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("valor A "+a+" Valor B "+b);		
	}
	public void Actividad4(Scanner _sc)
	{
		int a;
		int b;
		int c;
		System.out.println("introduce el primer valor");
		a= _sc.nextInt();
		System.out.println("Introduce el segundo valor");
		b= _sc.nextInt();
		System.out.println("Introducel el tercer valor");
		c= _sc.nextInt();
		if (a > b)
		{
			if (a>c)
				System.out.println("A es mayor");		
		}
		else
		{
			if(b>c)
				System.out.println("B es mayor");
			else 
				System.out.println("C es mayor");
		}
	}
	public void Actividad5(Scanner _sc)
	{
		int a;
		int b;
		int c;
		System.out.println("Introduce 3 números");
		a= _sc.nextInt();
		b= _sc.nextInt();
		c= _sc.nextInt();
		if(a <0)
		{
			System.out.println(a*b*c);
		}
		else
			System.out.println(a+b+c);
	}
	public void Actividad6(Scanner _sc)
	{
		int a;
		
		System.out.println("Introduce un número");
		a= _sc.nextInt();
		if (a<0)
		{
			System.out.println("Error");
		}
		else 
		{
			System.out.println("Del número "+a+" ,su potencia es "+a*a+" y su raiz "+Math.sqrt(a));
		}
		
	}
	public void Actividad7(Scanner _sc)
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		System.out.println("Total alumnos en clases");
		a= _sc.nextDouble();
		System.out.println("Niños en clases");
		b= _sc.nextDouble();
	
		c=b/a*100;
		d=a-b;
		e=d/a*100;
		
		System.out.println(c +"% Es el total de niños");
		System.out.println(e +"% Es el total de niñas");
		
		
	}
	public void Actividad8(Scanner _sc)
	{
		String a;
		double b;
		double c;
		System.out.println("Mes de la compra");
		_sc.nextLine();
		a= _sc.nextLine();
		System.out.println("Factura");
		b= _sc.nextDouble();
		if(a.contentEquals("octubre"))
		{
		
		c=b-(15/b*100);
		System.out.println(c+" Total con descuento");
		}
		else
		{
		System.out.println(a+" total sin descuento");
		}
	}
	public void Actividad10(Scanner _sc)
	{
		double a,b,c,d,e,f,g,h;
		
		System.out.println("introduce las 6 notas");
		a = _sc.nextDouble();
		b = _sc.nextDouble();
		c = _sc.nextDouble();
		d = _sc.nextDouble();
		e = _sc.nextDouble();
		f = _sc.nextDouble();
		System.out.println("Introduce el precio de la matricula");
		h= _sc.nextDouble();
		g = (a+b+c+d+e+f)/6;
		if (g >= 4)
		{
			System.out.println(h-(30/h*100)+"Es el monto a pagar ");
		}
		else
		{
			System.out.println(h+(10/h*100)+"Es el monto + iva a pagar ");
		}
	}
	public void Actividad9(Scanner _sc)
	{
		int a;
		int b;
		a=0;
		
		while (a <10) 
		{
			
			b=a*a;
			System.out.println(b);
			a=a+1;
		}
	}
	public void Actividad11(Scanner _sc)
	{
		double a;
		String b;
		String c;
		
		System.out.println("Introduce la hora ");
		a=_sc.nextDouble();
		System.out.println("Introduce el turno");
		_sc.nextLine();
		b=_sc.nextLine();
		System.out.println("Introduce el tipo de día");
		c=_sc.nextLine();
		if (b.contentEquals("nocturno"))
			
			{
				if (c.contentEquals("Laboral"))
				{
				System.out.println("Nocturno laboral"+a*13.5);	
				}
				else
				{
				System.out.println("Nocturno festivo"+a*13+(0.15*13.5));
				}
			}	
		else
			{
				if(c.contentEquals("laboral")) 
				{
					System.out.println("Diurno laboral"+a*10);
				}
				else
				{
					System.out.println("Diurno festivo"+ a*10+(0.10*10));
				}
			}		
	}	
	public void Actividad12(Scanner _sc)
	{
		double a;
		double b;
		System.out.println("Introduce el número");
		a=_sc.nextDouble();
		b=a%2;
		
		if (a==0)
		{
			System.out.println("El número es 0");
		}
		else
		{
			if (b==0)
			{
				System.out.println("El número es par");
			}
			System.out.println("El número es impar");
		}
	
	}
	public void Actividad13(Scanner _sc)
	{
		int a;
		int b;
		System.out.println("Introduce el primer número");
		a=_sc.nextInt();
		System.out.println("Introduce el segundo número");
		b=_sc.nextInt();
		if(b==0)
			
		{
			System.out.println("El segundo número es 0");
		}
		else
		{
			
			System.out.println(a/b);
		}
	}
	public void Actividad14(Scanner _sc)
	{
		int a;
		int b;
		System.out.println("Introduce el primer número");
		a=_sc.nextInt();
		System.out.println("Introducel el segundo número");
		b=_sc.nextInt();
		if (a>0 && b>0)
		{
			System.out.println("los 2 son positivos");
		
		}
		else 
		{
			if (a>0 || b>0)
			{
				System.out.println("1 es positivo");
			}
			else
			{
				System.out.println("Ninguno es positivo");
			}
		}
	}
	public void Actividad15(Scanner _sc)
	{
		String a;
		System.out.println("Accede por titulo de bachiller o prueba de acceso");
		_sc.nextLine();
		a=_sc.nextLine();
		if (a.contentEquals("bachiller"))
		{
			System.out.println("Accedes por bachillerato");
		}
		else
		{
			System.out.println("Superas la prueba de acceso");
			String b=_sc.nextLine();
			if(b.contentEquals("Supero"))
			{
				System.out.println("Accede por prueba");
			}
			else
			{
				System.out.println("No accede");
			}
		}
	}
	public void Actividad16(Scanner _sc)
	{
		int a;
		int b;
		int c;
		System.out.println("Introduce el día");
		a=_sc.nextInt();
		System.out.println("Introduce el mes");
		b=_sc.nextInt();
		System.out.println("Introduce el ano");
		c=_sc.nextInt();
		if (c>0)
		{
			switch(b) 
			{
			case 1:
				if (a>0 && a<32)
				{	
				System.out.println(a+" de Enero de "+c);
				}
				break;
			case 2:
				if (a>0 && a<29)
				{	
				System.out.println(a+" de Febrero de "+c);
				}
				break;
			case 3:
				if (a>0 && a<32)
				{	
				System.out.println(a+" de Marzo de "+c);
				}
				break;
			case 4:
				if (a>0 && a<31)
				{	
				System.out.println(a+" de Abril de "+c);
				}
				break;
			case 5:
				if (a>0 && a<32)
				{	
				System.out.println(a+" de Mayo de "+c);
				}
				break;
			case 6:
				if (a>0 && a<31)
				{	
				System.out.println(a+" de Junio de "+c);
				}
				break;
			case 7:
				if (a>0 && a<32)
				{	
				System.out.println(a+" de Julio de "+c);
				}
				break;
			case 8:
				if (a>0 && a<32)
				{	
				System.out.println(a+" de Agosto de "+c);
				}
				break;
			case 9:
				if (a>0 && a<31)
				{	
				System.out.println(a+" de Septiembre de "+c);
				}
				break;
			case 10:
				if (a>0 && a<32)
				{	
				System.out.println(a+" de Octubre de "+c);
				}
				break;
			case 11:
				if (a>0 && a<31)
				{	
				System.out.println(a+" de Noviembre de "+c);
				}
				break;
			case 12:
				if (a>0 && a<32)
				{	
				System.out.println(a+" de Diciembre de "+c);
				}
				break;				
			}
		}
			else
			{
				System.out.println("Datos no validos");
			}
	}
	public void Actividad17(Scanner _sc)
	{
		double a;
		double b;
		double c;
		double d;
		System.out.println("introduce nota de practica");
		a=_sc.nextDouble();
		System.out.println("Introduce nota de problemas");
		b=_sc.nextDouble();
		System.out.println("Introduce la nota de teoria");
		c=_sc.nextDouble();
		
		
		d=a*0.1+b*0.50+c*0.40;
		System.out.println(d+" nota final");	
	}
	public void Actividad18(Scanner _sc)
	{
		int a;
		int b;
		int c;
		System.out.println("Introduce un número");
		a=_sc.nextInt();
		b=1;
		while (b<10)
		{
			++a;
			System.out.println(c=a*a);
			
			++b;
		}
	}
	public void Actividad19(Scanner _sc)
	{
		int a;
		int b;
		int c;
		System.out.println("Introduce un número");
		a=_sc.nextInt();
		b=0;
		if (a% 2==0)
			
			{
				c=a;
				while (b<a)
				{
					
					System.out.println(c=c+2);
					++b;
				}
			}
		else
			{	
				c=a+1;
				while (b<a)
				{
				System.out.println(c=c+2);
				++b;
				}
			
			}
	}
	public void Actividad20(Scanner _sc)
	{
		int a;
		int b;
		System.out.println("Inserte el número a múltiplicar");
		a=_sc.nextInt();
		b=0;
		while (b<10)
		{
			//b++;//++b;//Sumas uno, te da igual hacerlo antes o después del ;
			//System.out.println(b*a);//muestras el valor de b
			System.out.println(++b*a);//como ya le hemos sumado uno a b, tenemos que hacer el preincremento si o si
			
		}
	}
	public void Actividad21(Scanner _sc)
	{
		int a=0;
		int b=0;
		int c=0;
		
		do //obliga a entrar una vez al bucle 
			{	
				System.out.println("Inserta un número hasta llegar a negativoj");
				a=_sc.nextInt();
				if (a>0)
				{
					b=a+b;
					++c;
				}
			}
		while(a>=0); // condición del bucle
			System.out.println(b/c+" es la media de los números insertados");
			
	}

	public void Actividad22(Scanner _sc)
	{
		String a;
		int b=0;
		System.out.println("introduce la clave ");
		_sc.nextLine();
		a=_sc.nextLine();
		while(b<3 && !a.contentEquals("EUREKA"));// ! se agrega un not delate
		{
			System.out.println("Clave incorrecta, introduce la clave otra vez");
			a=_sc.nextLine();
			++b;// b=b+1
		}
		
		
			
			
	}
	public void Actividad23(Scanner _sc)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		
		System.out.println("Introduce el primer númerol");
		a=_sc.nextInt();
		c=a;
		d=a;
		
		e=0;
		f=0;
		while (a >0)
		{			
			if (c>a) //comparo si el ultimo resultado es menor que en el anterior 
			{
				c=a; // en caso de lser menor lo guarod en c
			}
			if (d<a)
			{
				d=a;
			}
			f=a+f; //guardo la suma de todos los números
			++e;
			System.out.println("Introduce otro número");
			a=_sc.nextInt();
			
		}
		System.out.println("Maximo "+d+" minimo "+c+ "Promedio"+(float)(f/e));
	}
	public void Actividad24(Scanner _sc)
	{
		int a=0;
		int b=0;
		int c=0;
		while (c<=100)
		{
			if (c %2==0)
			{
				++a;
			}
			if (c%3==0)
			{
				++b;
			}
		++c;
		}
		System.out.println("Numeros de "+a+"Numeros de "+b);
	}
	public void Actividad25(Scanner _sc)
	{
		int na=1;
		int nn=0;
		int a=0;
		int conteo=0;
		int n;
		
		System.out.println("Introduce un Numero");
		n=_sc.nextInt();
		while(conteo<n)
		
		{
			
			a=na;
			na=nn;
			nn=a+na;
			++conteo;
		}
		System.out.println(nn+" es el número");
	}
	public void Actividad26(Scanner _sc)
	{
	 int factorial1;
	 int factorial2;
	 
	 System.out.println("Introduce el primer número positivo");
	 factorial1=_sc.nextInt();
	 System.out.println("Introduce el segundo número positivo");
	 factorial2=_sc.nextInt();
	 if (factorial1>factorial2)
	 {
		 while (factorial2<factorial1)
		 {
			 System.out.println(++factorial2+"*");
		 }
	 }
	 else
	 {
		 while(factorial1<factorial2)
		 {
			 System.out.print(++factorial1+"*");
		 }

	 }
	}
}















