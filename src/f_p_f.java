/***CLASE FONDO A PLAZO FIJO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 25/01/2019
 * CURSO: DM1B
 */

public class f_p_f extends padre{
	
	static int numfpf=0;
	
	//ATRIBUTOS
	
	public String num_obj;
	public long saldo;
	
	//CONSTRUCTOR
	f_p_f(String nomb, String ap1, String ap2, String n_obj, String dni, String dir, long sald){
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
	public String getNum() {
		return this.num_obj;
	}
	
	public long getSaldo() {
		return this.saldo;
	}
	
	
	//METODOS SETTERS
	public f_p_f setNum_obj(String n_obj) {
		this.num_obj=n_obj;
		return this;
	}

	public f_p_f setSaldo(long sald) {
		this.saldo=sald;
		return this;
	}

	
	public static void eliminar() {
		if (numfpf>0) numfpf--;		
	}
}
