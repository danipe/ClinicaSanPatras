
public class Ingresos {
 int codigoAutoIncrementa;
 int numHabitacion;
 int numCama;
 String fechaIngreso;
 String paciente;
 Medicos medico;//vease que le pasamos un objeto Médico por parámetro a Ingresos
 public Ingresos(){
	 
 }

	public Ingresos(int codigoAutoIncrementa, int numHabitacion, int numCama, String fechaIngreso,
					String paciente, Medicos medico) {
		
		this.codigoAutoIncrementa = codigoAutoIncrementa;
		this.numHabitacion = numHabitacion;
		this.numCama = numCama;
		this.fechaIngreso = fechaIngreso;
		this.paciente = paciente;
		this.medico  = medico;	
	}

	public int getCodigoAutoIncrementa() {
		return codigoAutoIncrementa;
	}

	public void setCodigoAutoIncrementa(int codigoAutoIncrementa) {
		this.codigoAutoIncrementa = codigoAutoIncrementa;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public int getNumCama() {
		return numCama;
	}

	public void setNumCama(int numCama) {
		this.numCama = numCama;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public Medicos getMedico() {
		return medico;
	}

	public void setMedico(Medicos medico) {
		this.medico = medico;
	}
    



}
