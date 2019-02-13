/***CLASE CODICO CUENTA CLIENTE
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 25/01/2019
 * CURSO: DM1B
 */

public class c_c_c extends padre{
	
	public static int numcuentas=0;
	
	//ATRIBUTOS
	
	public String num_obj;
	public long saldo;
	
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
	public String getNum() {
		return this.num_obj;
	}
	
	public long getSaldo() {
		return this.saldo;
	}
	
	
	//METODOS SETTERS
	public c_c_c setNum_obj(String n_obj) {
		this.num_obj=n_obj;
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
