
public class Medicos {
int codigo;
String nombre;
String apellido;
int telefono;
String especialidad;

	public Medicos(int codigo, String nombre, String apellido, int telefono, String especialidad) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.especialidad = especialidad;
		
		
	}
 public Medicos(){
	 
 }
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public String getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}
}
