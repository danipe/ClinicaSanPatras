import java.util.Scanner;

public class Lanzadera {

	public Lanzadera() {
		
	}

	public static void main(String[] args) {
		
	MetodosPacientes misMetodosPacientes = new MetodosPacientes();
	MetodosMedicos misMetodosMedicos = new MetodosMedicos();
	MetodosIngresos misMetodosIngresos = new MetodosIngresos();
		int opcion = 0;
		do{
		Scanner entrada = new Scanner(System.in);	
		System.out.println("--MENU--");
		System.out.println("--SAN_PATRAS--");
		System.out.println("--1.Apartado PACIENTES(altas, bajas, modificaciones)--");
		System.out.println("--2.Apartado MEDICOS(altas, bajas, modificaciones)--");
		System.out.println("--3.Apartado INGRESOS HOSPITALARIOS--");
		System.out.println("--4.Salir, estoy sano(¨ . ¨)--");
		
		opcion = entrada.nextInt();
		switch(opcion){
		case 1:
			misMetodosPacientes.menuPacientes();
			break;
		case 2:
			misMetodosMedicos.menuMedicos();
			break;
		case 3:
		//Enviamos el ArrayList misMedicos de la clase MetodosMedicos
		//cuyo objeto hemos creado arriba en la "linea 12"(recordemos que el ArrayList lo creabamos en el constructor de MetodosMedicos
		//para que desde MetodosIngresos podamos acceder a él y sacar de ahí el médico que asignamos al Ingreso.			
			misMetodosIngresos.menuIngresos(misMetodosMedicos.misMedicos);
			break;
		case 4:
			break;
		}
		}while(opcion != 4);
	}
	

}
