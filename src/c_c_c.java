/***CLASE CODICO CUENTA CLIENTE
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 25/01/2019
 * CURSO: DM1B
 */

public class c_c_c {
	
	static int numcuentas=0;
	
	//ATRIBUTOS
	public String nombre;
	public String apellido1;
	public String apellido2;
	private String num_obj;
	public String DNI;
	public String direccion;
	private long saldo;
	
	//CONSTRUCTOR
	c_c_c(String nomb, String ap1, String ap2, String n_obj, String dni, String dir, long sald){
		nombre=nomb;
		apellido1=ap1;
		apellido2=ap2;
		num_obj=n_obj;
		DNI=dni;
		direccion=dir;
		saldo=sald;
		numcuentas++;
	}
	
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
	
	public String getNum() {
		return this.num_obj;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public long getSaldo() {
		return this.saldo;
	}
	
	
	//METODOS SETTERS
	public c_c_c setNombre(String nomb) {
		this.nombre=nomb;
		return this;
	}
	
	public c_c_c setApellido1(String ap1) {
		this.apellido1=ap1;
		return this;
	}
	
	public c_c_c setApellido2(String ap2) {
		this.apellido2=ap2;
		return this;
	}
	
	public c_c_c setNum_obj(String n_obj) {
		this.num_obj=n_obj;
		return this;
	}
	
	public c_c_c setDNI(String dni) {
		this.DNI=dni;
		return this;
	}
	
	public c_c_c setDireccion(String dir) {
		this.direccion=dir;
		return this;
	}
	
	public c_c_c setSaldo(long sald) {
		this.saldo=sald;
		return this;
	}
	
	
	
	public static void eliminar() {
		if (numcuentas>0) numcuentas--;		
	}
	
	
}
