/***CLASE PADRE
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 13/02/2019
 * CURSO: DM1B
 */
public abstract class padre {
	
	public String nombre;
	public String apellido1;
	public String apellido2;
	public String DNI;
	public String direccion;
	
	
	//METODOS GETTERS
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido1() {
		return this.apellido1;
	}
	
	public String getApellido2() {
		return this.apellido2;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	
	//METODOS SETTERS
	public padre setNombre(String nomb) {
		this.nombre=nomb;
		return this;
	}
	
	public padre setApellido1(String ap1) {
		this.apellido1=ap1;
		return this;
	}
	
	public padre setApellido2(String ap2) {
		this.apellido2=ap2;
		return this;
	}
	
	public padre setDNI(String dni) {
		this.DNI=dni;
		return this;
	}
	
	public padre setDireccion(String dir) {
		this.direccion=dir;
		return this;
	}
	

}
