package Controlador;
import java.util.ArrayList;
import java.util.Scanner;

import ModelDades.Ingresos;
import ModelDades.Medicos;

public class MetodosIngresos {
int codigoIngresoAutoincrementa;	
ArrayList <Ingresos> misIngresos;


	public MetodosIngresos() {
	misIngresos = new ArrayList<Ingresos>();
	
	
	}
public void menuIngresos(ArrayList Medicazos){//vease que el menuIngresos recibe un ArrayList por parametro...
	int opcion = 0;//...que no es mas ni menos que el ArrayList de misMedicos salido del objeto MetodosMedicos
	Scanner entrada = new Scanner(System.in);
	do{
	System.out.println("--Ingresos--");
	System.out.println("--1.Nuevo Ingreso--");
	System.out.println("--2.Modificar Ingreso--");
	System.out.println("--3.Eliminar Ingreso--");
	System.out.println("--4.Muestra ingresos--");
	System.out.println("--5.Salir de aquí--");
	opcion = entrada.nextInt();
	switch(opcion){
	case 1:
		nuevoIngreso(Medicazos);
		break;
	case 2:
		modificarIngreso(Medicazos);
		break;
	case 3:
		eliminarIngreso();
		break;
	case 4:
		muestraIngresos();
		break;
	case 5:
		break;
		}
	}while(opcion != 5);
}
public void nuevoIngreso(ArrayList Medicazos){//recibimos por parametro el ArrayList de misMedicos para....
	
	int codigoMedico = 0;
	Ingresos iA = new Ingresos();
	Scanner entrada = new Scanner(System.in);
	Scanner intEntrada = new Scanner(System.in);
	
	System.out.println("Número de habitación:");
	iA.setNumHabitacion(intEntrada.nextInt());
	System.out.println("Numero de cama:");
	iA.setNumCama(intEntrada.nextInt());
	System.out.println("Fecha de ingreso:");
	iA.setFechaIngreso(entrada.nextLine());
	System.out.println("Introduce codigo para elegir médico");
	if(Medicazos.size()>0){
	for(int i = 0;i<Medicazos.size();i++){//asi monstrar los médicos y que la persona escoja con el codigo...
		
		System.out.print(((Medicos) Medicazos.get(i)).getCodigo()+"(Codigo)\t"+((Medicos) Medicazos.get(i)).getNombre()+" ");
		System.out.println(((Medicos) Medicazos.get(i)).getApellido());
	
	}
	codigoMedico = intEntrada.nextInt();
	for(int i = 0;i<Medicazos.size();i++){
		if(codigoMedico == ((Medicos) Medicazos.get(i)).getCodigo() ){//entonces si coindice con el codigo del array...
	iA.setMedico((Medicos) Medicazos.get(i));	//le asignamos ese médico al ingreso.	
		}
	}
	codigoIngresoAutoincrementa++;//Si encuentra un médico entonces ya insertamos el código de Ingreso, para evitar falsos incrementos.
	iA.setCodigoAutoIncrementa(codigoIngresoAutoincrementa);
	System.out.println("Introduce nombre del paciente:");
	iA.setPaciente(entrada.nextLine());	
	Ingresos iB = new Ingresos(iA.getCodigoAutoIncrementa(),iA.getNumHabitacion(),iA.getNumCama(),iA.getFechaIngreso(),
								iA.getPaciente(),iA.getMedico());
	misIngresos.add(iB);
	}else{
		System.out.println("No hay medicos dados de alta");
	}
}
public void modificarIngreso(ArrayList Medicazos){//recibe ArrayList de misMedicos por si hay que modificar Medico.
	int miBusquedaCodigo = 0;
	int opcion = 0;
	Scanner entrada = new Scanner(System.in);
	Scanner intEntrada = new Scanner(System.in);
	System.out.println("--Ingresos--");
	System.out.println("Inserte código de Ingreso a modificar.");
	miBusquedaCodigo = intEntrada.nextInt();
	for(int i = 0; i < misIngresos.size();i++){
			if(misIngresos.get(i).getCodigoAutoIncrementa() == miBusquedaCodigo){
				System.out.println("NumHabitacion:"+misIngresos.get(i).getNumHabitacion()+"\tNumCama"+misIngresos.get(i).getNumCama()
								   +"\tIngreso:"+misIngresos.get(i).getFechaIngreso()
								   +"\tMedico:"+misIngresos.get(i).getMedico().getNombre()+" "+misIngresos.get(i).getMedico().getApellido()
								   +"\tPaciente:"+misIngresos.get(i).getPaciente());
				
				System.out.println("Pulse un número en la lista para modificar los datos:");
				System.out.println("1.NumHabitacion\t2.NumCama\t3.FechaIngreso\t4.Medico\t5.Paciente\t6.Ssalir de aqui");
				opcion = intEntrada.nextInt();
				switch(opcion){
				case 1:
					System.out.println("Nueva Habitacion:");
					misIngresos.get(i).setNumHabitacion(intEntrada.nextInt());
					System.out.println(misIngresos.get(i).getNumHabitacion());
					break;
				case 2:
					System.out.println("Nueva Cama:");
					misIngresos.get(i).setNumCama(entrada.nextInt());	
					System.out.println(misIngresos.get(i).getNumCama());
					break;
				case 3:
					System.out.println("Nueva Fecha:");
					misIngresos.get(i).setFechaIngreso(intEntrada.nextLine());
					System.out.println(misIngresos.get(i).getFechaIngreso());
					break;
				case 4:
					int codigoMedico = 0;
					System.out.println("Nuevo Medico:");
					if(Medicazos.size()>0){//como le hemos pasado el ArrrayList de misMedicos por parametro podemos obtener...
						for(int x = 0;x<Medicazos.size();x++){
							//Los datos de los médicos, monstrarlos y pedirle al usuario que escoja uno..
							System.out.print(((Medicos) Medicazos.get(x)).getCodigo()+"(Codigo)\t"+((Medicos) Medicazos.get(x)).getNombre()+" ");
							System.out.println(((Medicos) Medicazos.get(x)).getApellido());
						
						}
						codigoMedico = intEntrada.nextInt();
						for(int c = 0;c<Medicazos.size();c++){
							if(codigoMedico == ((Medicos) Medicazos.get(c)).getCodigo() ){//...entonces asignarle un nuevo Medico de la lista
						misIngresos.get(c).setMedico((Medicos) Medicazos.get(c));		
							}
						}
					}
					break;
				case 5:
					System.out.println("Nuevo Paciente:");
					misIngresos.get(i).setPaciente(entrada.nextLine());
					System.out.println(misIngresos.get(i).getPaciente());
					break;
				case 6:
					break;
								}
				
				}
			}
}
public void eliminarIngreso(){
	String nombrePaciente = "";
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce el nombre del paciente y daremos de baja su Ingreso.");
	nombrePaciente = entrada.nextLine();
	for(int i= 0; i<misIngresos.size();i++){
		if(nombrePaciente.equalsIgnoreCase(misIngresos.get(i).getPaciente())){//Borramos el ingreso con el nombre del Paciente
			misIngresos.remove(i);
			System.out.println("Eliminado con exito");
		}
	}
}

public void muestraIngresos(){//Muestro datos de los Ingresos, y cada Ingresos con su Médico
	for(int i = 0; i<misIngresos.size();i++){
		System.out.println("Cod:"+misIngresos.get(i).getCodigoAutoIncrementa()+"\tHabitacion:"+misIngresos.get(i).getNumHabitacion()+"\tCama:"
				+misIngresos.get(i).getNumCama()+"\tPaciente:"+misIngresos.get(i).getPaciente());
		System.out.println("Medico:"+misIngresos.get(i).getMedico().getNombre()+" "+misIngresos.get(i).getMedico().getApellido()
				            +"\t"+misIngresos.get(i).getMedico().getTelefono());
		System.out.println("---------------------------------------------------------");
	}
}
}
