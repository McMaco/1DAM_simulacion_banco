/***CLASE FONDO A PLAZO FIJO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 25/01/2019
 * CURSO: DM1B
 */

public class f_p_f {
	
	static int numfpf=0;
	
	//ATRIBUTOS
	public String nombre;
	public String apellido1;
	public String apellido2;
	private String num_obj;
	public String DNI;
	public String direccion;
	private double saldo;
	
	//CONSTRUCTOR
	f_p_f(String nomb, String ap1, String ap2, String n_obj, String dni, String dir, double sald){
		nombre=nomb;
		apellido1=ap1;
		apellido2=ap2;
		num_obj=n_obj;
		DNI=dni;
		direccion=dir;
		saldo=sald;
		numfpf++;
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	//METODOS SETTERS
	public f_p_f setNombre(String nomb) {
		this.nombre=nomb;
		return this;
	}
	
	public f_p_f setApellido1(String ap1) {
		this.apellido1=ap1;
		return this;
	}
	
	public f_p_f setApellido2(String ap2) {
		this.apellido2=ap2;
		return this;
	}
	
	public f_p_f setNum_obj(String n_obj) {
		this.num_obj=n_obj;
		return this;
	}
	
	public f_p_f setDNI(String dni) {
		this.DNI=dni;
		return this;
	}
	
	public f_p_f setDireccion(String dir) {
		this.direccion=dir;
		return this;
	}
	
	public f_p_f setSaldo(double sald) {
		this.saldo=sald;
		return this;
	}

	
	public static void eliminar() {
		if (numfpf>0) numfpf--;		
	}
}
