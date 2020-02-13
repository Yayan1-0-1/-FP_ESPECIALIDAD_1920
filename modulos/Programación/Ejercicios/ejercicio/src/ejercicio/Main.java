package ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in); // creo el escaner para toda la clase
		Ejer1 ejer = new Ejer1();
		System.out.println("¿Qué actividad vamos a realizar?");
		int codop = sc.nextInt();
	switch(codop)
	{
	case 1:
		ejer.actividad1(sc);
		break;
	case 2:
		ejer.Actividad2(sc);
		break;
	case 3:
		ejer.Actividad3(sc);
		break;
	case 4:
		ejer.Actividad4(sc);
		break;
	case 5:
		ejer.Actividad5(sc);
		break;
	case 6:
		ejer.Actividad6(sc);
		break;
	case 7:
		ejer.Actividad7(sc);
		break;
	case 8:
		ejer.Actividad8(sc);
		break;
	case 9:
		ejer.Actividad9(sc);
		break;
	case 10:
		ejer.Actividad10(sc);
		break;
	case 11 :
		ejer.Actividad11(sc);
		break;
	case 12 :
		ejer.Actividad12(sc);
		break;
	case 13 :
		ejer.Actividad13(sc);
		break;
	case 14 :
		ejer.Actividad14(sc);
		break;
	case 15:
		ejer.Actividad15(sc);
		break;
	case 16:
		ejer.Actividad16(sc);
		break;
	case 17:
		ejer.Actividad17(sc);
		break;
	case 18:
		ejer.Actividad18(sc);
		break;
	case 19:
		ejer.Actividad19(sc);
		break;
	case 20:
		ejer.Actividad20(sc);
		break;
	case 21:
		ejer.Actividad21(sc);
		break;
	case 22:
		ejer.Actividad22(sc);
	break;
	case 23:
		ejer.Actividad23(sc);
	break;
	case 24:
		ejer.Actividad24(sc);
	break;
	case 25:
		ejer.Actividad25(sc);
	break;
	case 26:
		ejer.Actividad26(sc);
	break;
	case 27:
		//ejer.Actividad27(sc);
	break;
	default: System.out.println("NO EXISTE EL EJERCICIO");
	break;
	
	}
	sc.close();
	}

}
