import java.util.ArrayList;
import java.util.Scanner;

public class MetodosPacientes {
int codigoPacienteAutoIncrementa;//Asignaremos un codigoIncrementable segun vayan añadiendo pacientes
ArrayList <Pacientes> misPacientes;//Creamos nuestro Array de objetos de la clase Pacientes


	public MetodosPacientes() {
		misPacientes = new ArrayList<Pacientes>();		
		
		
	}

//AQUI EMPIEZAN LOS METODOS DE PACIENTES
public void menuPacientes(){
	int opcion = 0;
	do{
	Scanner entrada = new Scanner(System.in);
	System.out.println("--Pacientes--");
	System.out.println("--1.Nuevo Paciente--");
	System.out.println("--2.Modificar datos--");
	System.out.println("--3.Dar de baja Paciente--");
	System.out.println("--4.Muestra pacientes--");
	System.out.println("--5.Volver al menu anterior--");
	opcion = entrada.nextInt();
	switch(opcion){
	case 1:
		nuevoPaciente();
		break;
	case 2:
		modificaPaciente();
		break;
	case 3:
		eliminarPaciente();
		break;
	case 4:
		muestraPacientes();
		break;
	case 5:
		break;
	}
	}while(opcion !=5);
}
public void nuevoPaciente(){
	Scanner entrada = new Scanner(System.in);
	Scanner intEntrada = new Scanner(System.in);
	Pacientes pA = new Pacientes();
	codigoPacienteAutoIncrementa++;//incrementamos el valor del codigo que luego asignaremos por parametro
	
	System.out.println("--Pacientes--");
	System.out.println("Nombre:");
	pA.setNombre(entrada.nextLine());//vease como ejemplo como llamamos al objeto pA que es un constructor de Pacientes
	System.out.println("Apellidos:");//que no necesita parametros para ser creado, entonces, 
	pA.setApellidos(entrada.nextLine());//con set le asignamos un valor a los atributos de la clase...	
	System.out.println("Direccion");//...que luego esos atributos de pA,seran los que usaremos para pB, un constructor de Pacientes...
	pA.setDireccion(entrada.nextLine());//...que si necesita el pase de parámetros para ser creado el objeto.
	System.out.println("Provincia:");
	pA.setProvincia(entrada.nextLine());
	System.out.println("Poblacion:");
	pA.setPoblacion(entrada.nextLine());
	System.out.println("Codigo Postal:");	
	pA.setCodidoPostal(intEntrada.nextInt());
	System.out.println("Telefono:");
	pA.setTelefono(intEntrada.nextInt());
	System.out.println("Fecha de nacimiento:");
	pA.setFechaNacimiento(entrada.nextLine());
	Pacientes pB = new Pacientes(codigoPacienteAutoIncrementa,pA.getNombre(),pA.getApellidos(),pA.getDireccion(),
				pA.getPoblacion(),pA.getProvincia(),pA.getCodidoPostal(),pA.getTelefono(),pA.getFechaNacimiento());
	misPacientes.add(pB);
	System.out.println(pA.getNombre()+" "+pA.getApellidos()+" se ha dado de alta.");	
	
}
public void modificaPaciente(){
	String miBusquedaNombre = "";
	String miBusquedaApellido = "";
	int opcion = 0;
	Scanner entrada = new Scanner(System.in);
	Scanner intEntrada = new Scanner(System.in);
	
	System.out.println("--Pacientes--");
	System.out.println("Dígame su nombre");
	miBusquedaNombre = entrada.nextLine();
	System.out.println("Dígame sus apellidos");
	miBusquedaApellido = entrada.nextLine();
	for(int i = 0; i < misPacientes.size();i++){//REALMENTE AQUI HACEMOS COMPROBACION DOBLE PARA ASEGURARNOS QUE AMBOS DATOS...
		if(misPacientes.get(i).getApellidos().equalsIgnoreCase(miBusquedaApellido)){
			for(int c = 0; c< misPacientes.size();c++){//...NOMBRE Y APELLIDOS COINCIDEN, COMO METODO DE SEGURIDAD ANTES DE MODIFICAR
				if(misPacientes.get(i).getNombre().equalsIgnoreCase(miBusquedaNombre)){
				System.out.println("Hola "+miBusquedaNombre+" "+miBusquedaApellido+" su telefono es "+misPacientes.get(i).getTelefono());
				System.out.println("Pulse un número en la lista para modificar los datos:");
				System.out.println("1.Nombre\t2.Apellidos\t3.Direccion\t4.Poblacion\n\n"
						+ "5.Provincia\t6.CodigoPostal\t7.Telefono\t8.FechaNacimiento\n\n9.Salir de aqui");
				opcion = intEntrada.nextInt();
				switch(opcion){//Un switch para saber qué dato desea cambiar el usuario
				case 1:
					System.out.println("Nuevo Nombre:");
					misPacientes.get(i).setNombre(entrada.nextLine());
					System.out.println(misPacientes.get(i).getNombre());//salida para comprobar el cambio
					break;
				case 2:
					System.out.println("Nuevos Apellidos:");
					misPacientes.get(i).setApellidos(entrada.nextLine());	
					System.out.println(misPacientes.get(i).getApellidos());
					break;
				case 3:
					System.out.println("Nueva direccion:");
					misPacientes.get(i).setDireccion(entrada.nextLine());
					System.out.println(misPacientes.get(i).getDireccion());
					break;
				case 4:
					System.out.println("Nueva Poblacion:");
					misPacientes.get(i).setPoblacion(entrada.nextLine());
					System.out.println(misPacientes.get(i).getPoblacion());
					break;
				case 5:
					System.out.println("Nueva Provincia:");
					misPacientes.get(i).setProvincia(entrada.nextLine());
					System.out.println(misPacientes.get(i).getProvincia());
					break;
				case 6:
					System.out.println("Nuevo CodigoPostal:");
					misPacientes.get(i).setCodidoPostal(intEntrada.nextInt());
					System.out.println(misPacientes.get(i).getCodidoPostal());
					break;
				case 7:
					System.out.println("Nuevo telefono");
					misPacientes.get(i).setTelefono(intEntrada.nextInt());
					System.out.println(misPacientes.get(i).getTelefono());
					break;
				case 8:
					System.out.println("Nueva fechaNacimiento:");
					misPacientes.get(i).setApellidos(entrada.nextLine());
					System.out.println(misPacientes.get(i).getFechaNacimiento());
					break;
								}
				
				}
			}
		}
	}

}
public void eliminarPaciente(){
	Scanner entrada = new Scanner(System.in);
	int miCodigo = 0;
	System.out.println("Código del paciente a eliminar: ");
	System.out.println("(Si tienes dudas ves a monstrar pacientes para saber el código)");
	miCodigo = entrada.nextInt();
	if(miCodigo > 0){//Por si meten código menor que 0
		for(int i = 0;i<misPacientes.size();i++){//Recorremos el tamaño del Array misPacientes y si coincide el codigo .remove(i)
			if(misPacientes.get(i).getCodido() == miCodigo){
				misPacientes.remove(i);	
				System.out.println("Eliminado con éxito.");
				}
			}
		}
	
}
public void muestraPacientes(){//for para recorrer "get(i)" todas las posiciones del Array misPacientes y monstrar datos decentemente
	for(int i = 0; i<misPacientes.size();i++){
		System.out.println("CODIGO:"+misPacientes.get(i).getCodido()+"\tNombre:"+misPacientes.get(i).getNombre()+" "
						   +misPacientes.get(i).getApellidos()+"\tDireccion:"+misPacientes.get(i).getDireccion()+"\tProvincia:"
				           +misPacientes.get(i).getProvincia()+"\tPoblacion:"+misPacientes.get(i).getPoblacion()+"\nCodPostal:"
				           +misPacientes.get(i).getCodidoPostal()+"\tTelefono:"+misPacientes.get(i).getTelefono()+"\tFechaNacimiento:"
				           +misPacientes.get(i).getFechaNacimiento());
		System.out.println("----------------------------------------------");
	}
}

}
