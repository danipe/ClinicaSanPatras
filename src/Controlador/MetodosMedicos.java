package Controlador;
import java.util.ArrayList;
import java.util.Scanner;

import ModelDades.Medicos;

public class MetodosMedicos {
ArrayList <Medicos> misMedicos;
int codigoMedicoIncrementa;

	public MetodosMedicos() {
	misMedicos = new ArrayList<Medicos>();
	
}
	public MetodosMedicos(String nada){
		
	}
	
	//AQUI EMPIEZAN LOS METODOS DE MEDICOS
	public void menuMedicos(){
		int opcion = 0;
		do{
		Scanner entrada = new Scanner(System.in);
		System.out.println("--Medicos--");
		System.out.println("--1.Nuevo Medico--");
		System.out.println("--2.Modificar datos--");
		System.out.println("--3.Dar de baja Medico--");
		System.out.println("--4.Muestra Medicos--");
		System.out.println("--5.Volver al menu anterior--");
		opcion = entrada.nextInt();
		switch(opcion){
		case 1:
			nuevoMedico();
			break;
		case 2:
			modificoMedico();
			break;
		case 3:
			eliminoMedico();
			break;
		case 4:
			muestraMedicos();
			break;
		case 5:
			break;
			}
		}while(opcion !=5);
	}
	public void nuevoMedico(){
		Scanner entrada = new Scanner(System.in);
		Scanner intEntrada = new Scanner(System.in);
		Medicos mA = new Medicos();
		codigoMedicoIncrementa++;
		
		System.out.println("--Medicos--");
		System.out.println("Nombre:");
		mA.setNombre(entrada.nextLine());
		System.out.println("Apellidos:");
		mA.setApellido(entrada.nextLine());		
		System.out.println("Telefono:");
		mA.setTelefono(intEntrada.nextInt());
		System.out.println("Especialidad Medica:");
		mA.setEspecialidad(entrada.nextLine());
		Medicos mB = new Medicos(codigoMedicoIncrementa,mA.getNombre(),mA.getApellido(),mA.getTelefono(),mA.getEspecialidad());
		misMedicos.add(mB);
		System.out.println(mA.getNombre()+" "+mA.getApellido()+" se ha dado de alta.");
	}
	public void modificoMedico(){
		int miBusquedaCodigo = 0;
		int opcion = 0;
		Scanner entrada = new Scanner(System.in);
		Scanner intEntrada = new Scanner(System.in);
		System.out.println("--Medicos--");
		System.out.println("Inserte código de Médico.");//Aquí insertamos Cod.Medico para eliminar...
		miBusquedaCodigo = intEntrada.nextInt();
		for(int i = 0; i < misMedicos.size();i++){
				if(misMedicos.get(i).getCodigo() == miBusquedaCodigo){//..que tiene que coincidir con alguno de misMedicos
					System.out.println("Hola "+misMedicos.get(i).getNombre()+" "+misMedicos.get(i).getApellido()
									   +" su telefono es "+misMedicos.get(i).getTelefono());
					
					System.out.println("Pulse un número en la lista para modificar los datos:");
					System.out.println("1.Nombre\t2.Apellidos\t3.Telefono\t4.Especialidad\t5.Salir de aqui");
					opcion = intEntrada.nextInt();
					switch(opcion){
					case 1:
						System.out.println("Nuevo Nombre:");
						misMedicos.get(i).setNombre(entrada.nextLine());
						System.out.println(misMedicos.get(i).getNombre());
						break;
					case 2:
						System.out.println("Nuevos Apellidos:");
						misMedicos.get(i).setApellido(entrada.nextLine());	
						System.out.println(misMedicos.get(i).getApellido());
						break;
					case 3:
						System.out.println("Nueva Telefono:");
						misMedicos.get(i).setTelefono(intEntrada.nextInt());
						System.out.println(misMedicos.get(i).getTelefono());
						break;
					case 4:
						System.out.println("Nueva Especialidad:");
						misMedicos.get(i).setEspecialidad(entrada.nextLine());
						System.out.println(misMedicos.get(i).getEspecialidad());
						break;
					case 5:
						break;
									}
					
					}
				}
		
	}
	public void eliminoMedico(){
		Scanner entrada = new Scanner(System.in);
		int miCodigo = 0;
		System.out.println("Inserta el código de médico a eliminar");
		miCodigo = entrada.nextInt();
		if(miCodigo > 0){
		for(int i = 0; i<misMedicos.size();i++){
			if(miCodigo == misMedicos.get(i).getCodigo()){
				misMedicos.remove(i);
				System.out.println("Medico eliminado con exito");
				}
			}
		}
	}
	public void muestraMedicos(){//muestro misMedicos y sus datos "getCodigo()" de una manera decente con tabuladores "\t"
		for(int i = 0; i<misMedicos.size();i++){
			System.out.println(misMedicos.get(i).getCodigo()+"\t"+misMedicos.get(i).getNombre()+" "+misMedicos.get(i).getApellido()
								+"\t"+misMedicos.get(i).getEspecialidad()+"\t"+misMedicos.get(i).getTelefono());
		}
		System.out.println("");
	}
}
