
public class Pacientes {

int codido;
String nombre;
String apellidos;
String direccion;
String poblacion;
String provincia;
int codidoPostal;
int telefono;
String fechaNacimiento;
public Pacientes(int codigo, String nombre, String apellidos, String direccion, String poblacion,
		String provincia, int codigoPostal, int telefono, String fechaNacimiento){
	
	this.codido = codigo;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.direccion = direccion;
	this.poblacion = poblacion;
	this.provincia = provincia;
	this.codidoPostal = codigoPostal;
	this.telefono = telefono;	
	this.fechaNacimiento = fechaNacimiento;	
	
}
	public Pacientes() {
		
	}
	public int getCodido() {
		return codido;
	}
	public void setCodido(int codido) {
		this.codido = codido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getCodidoPostal() {
		return codidoPostal;
	}
	public void setCodidoPostal(int codidoPostal) {
		this.codidoPostal = codidoPostal;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
