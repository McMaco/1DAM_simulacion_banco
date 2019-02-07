/***CLASE GESTOR DE CLASES DE BANCO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 25/01/2019
 * CURSO: DM1B
 */

import java.util.Scanner;

public class Gestor {
	
	public static long rep[] = new long[100];
	
	public static c_c_c cuentas[] = new c_c_c[100];
	public static f_p fondo_pensiones[] = new f_p[100];
	public static f_p_f fondo_plazo_fijo[] = new f_p_f[100];
	
	public static void main(String [] args) {
		
		String euros = " €", espacio_coma = ", ", espacio = " ", nomb = null, ap1 = null, ap2 = null, n_obj = null, dni = null, dir = null, IBAN = null, entidad = null, ofi = null, cd = null, n_cuenta = null, letra_dni = null, calle = null;
		int opc=0, opc1=0, opc2=0, u=0, n=0, i=0;
		long n_c = 0, n_dni = 0, a = 1111111111*9, n_calle = 0;
		boolean flag = true;
		long sald = 0;
		
		Scanner t = new Scanner(System.in);
		
		c_c_c uno = null;
		f_p dos = null;
		f_p_f tres = null;
		
		do {
			try {
				System.out.println("----------------");
				System.out.println("GESTION BANCARIA");
				System.out.println("----------------");
				System.out.println("1.- CREAR PRODUCTO");
				System.out.println("2.- BUSCAR PRODUCTO");
				System.out.println("3.- SALIR");
				System.out.println();
				System.out.print("Introduzca una opción del menú:");
				opc = t.nextInt();
			}
			
			catch(Exception e) {
				t.next();
				opc = 4;
			}
			
			switch(opc) {
			
			case 1://CREAR PRODUCTO
				do {
					try {
						System.out.println("--------------");
						System.out.println("CREAR PRODUCTO");
						System.out.println("--------------");
						System.out.println("1.- CREAR CUENTA CLIENTE");
						System.out.println("2.- CREAR FONDO DE PENSIONES");
						System.out.println("3.- CREAR FONDO A PLAZO FIJO");
						System.out.println("4.- VOLVER");
						System.out.println();
						System.out.print("Introduzca una opción del menú: ");
						opc = t.nextInt();
					}
					
					catch(Exception e) {
						t.next();
						opc = 0;
					}
					
					switch(opc) {
						
					case 1://CREAR CUENTA CLIENTE
						System.out.println("------------------------------");
						System.out.println("Creación de una cuenta cliente");
						System.out.println("------------------------------");
						do {
							try {
								System.out.print("Nombre: ");
								nomb = t.next();
							}
							catch(Exception e) {
								nomb = "a";
							}
							nomb = nomb.toUpperCase();
						}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
					
						do {
							try {
								System.out.print("Apellido 1: ");
								ap1 = t.next();
							}
							catch(Exception e) {
								ap1 = "a";
							}
							ap1 = ap1.toUpperCase();
						}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
						
						do {
							try {
								System.out.print("Apellido 2: ");
								ap2 = t.next();
							}
							catch(Exception e) {
								ap2 = "a";
							}
							ap2 = ap2.toUpperCase();
						}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
						
						IBAN = args[0];
						entidad = args[1];
						ofi = args[2];
						cd = args[3];

						do {
							n_c = (long) (Math.random() * (a - 1000000000) + 1000000000);
							for(u = 0; u<=n; u++) {
								if(n_c==rep[u]) {
									flag = false;
								}
							}
						}while(flag=false);
						n++;
						n_obj = IBAN + espacio + entidad + espacio + ofi + espacio + cd + espacio + n_c;
						
						do {
							try {
								System.out.print("Introduzca el número de su dni: ");
								n_dni = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								n_dni = 0;
							}
						}while((n_dni<10000000)||(n_dni>99999999));
						
						do {
							try {
								System.out.print("Introduzca la letra de su dni: ");
								letra_dni = t.next();
							}
							catch(Exception e) {
								letra_dni = "ab";
							}
							letra_dni = letra_dni.toUpperCase();
						} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
						
						dni = n_dni + letra_dni;
						
						t.nextLine();
						do {
							try {
								System.out.print("Introduzca su calle: ");
								calle = t.nextLine();
							}
							catch(Exception e) {
								t.next();
							}
							calle = calle.toUpperCase();
						}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
						
						
						do {
							try {
								System.out.print("Introduzca el número de su calle: ");
								n_calle = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								n_calle = 0;
							}
						}while((n_calle<1)||(n_calle>100));
						
						
						dir = calle + espacio_coma + n_calle;
						
						do {
							try {
								System.out.print("Introduzca el saldo de su cuenta: ");
								sald = t.nextLong();
							}
							catch(Exception e) {
								t.next();
								sald = -1;
							}
						}while(sald<0);
						
						System.out.println("------------");
						System.out.println("NUEVA CUENTA");
						System.out.println("------------");
						System.out.println();
						System.out.println("Nombre: "+ nomb);
						System.out.println("Apellido 1: "+ ap1);
						System.out.println("Apellido 2: "+ ap2);
						System.out.println("Número de cuenta: " + n_obj);
						System.out.println("DNI: "+ dni);
						System.out.println("Dirección: "+ dir);
						System.out.println("Saldo: "+ sald + euros);
						System.out.println();
						do {
							try {
								System.out.println("¿Desea modificar alguno de los datos?\n1-SI\n2-NO");
								opc1 = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								opc=0;
							}
						}while((opc1<1)||(opc1>2));
						
						if(opc1==1) {
							do {
								System.out.println("---------");
								System.out.println("MODIFICAR");
								System.out.println("---------");
								System.out.println("0.-SALIR");
								System.out.println("1.-Nombre");
								System.out.println("2.-Apellido 1");
								System.out.println("3.-Apellido 2");
								System.out.println("4.-Número de dni");
								System.out.println("5.-Letra de dni");
								System.out.println("6.-Calle");
								System.out.println("7.-Número de su calle");
								System.out.println("8.-Saldo");
								try {
									opc2 = t.nextInt();
								}
								catch(Exception e) {
									t.next();
									
								}
								switch(opc2) {
								
								case 1: //NOMBRE
									do {
										try {
											System.out.print("Nombre: ");
											nomb = t.next();
										}
										catch(Exception e) {
											nomb = "a";
										}
										nomb = nomb.toUpperCase();
									}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
								break;
								
								case 2: //APELLIDO 1
									do {
										try {
											System.out.print("Apellido 1: ");
											ap1 = t.next();
										}
										catch(Exception e) {
											ap1 = "a";
										}
										ap1 = ap1.toUpperCase();
									}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
								break;
								
								case 3: //APELLIDO 2
									do {
										try {
											System.out.print("Apellido 2: ");
											ap2 = t.next();
										}
										catch(Exception e) {
											ap2 = "a";
										}
										ap2 = ap2.toUpperCase();
									}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
								break;
								
								case 4: //NUMERO DE DNI
									do {
										try {
											System.out.print("Introduzca el número de su dni: ");
											n_dni = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											n_dni = 0;
										}
									}while((n_dni<10000000)||(n_dni>99999999));
								break;
								
								case 5: //LETRA DE DNI
									do {
										try {
											System.out.print("Introduzca la letra de su dni: ");
											letra_dni = t.next();
										}
										catch(Exception e) {
											letra_dni = "ab";
										}
										letra_dni = letra_dni.toUpperCase();
									} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
									dni = n_dni + letra_dni;
								break;
								
								case 6: //CALLE
									do {
										try {
											System.out.print("Introduzca su calle: ");
											calle = t.nextLine();
										}
										catch(Exception e) {
											t.next();
										}
										calle = calle.toUpperCase();
									}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
								break;
								
								case 7: //NUMERO DE SU CALLE
									do {
										try {
											System.out.print("Introduzca el número de su calle: ");
											n_calle = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											n_calle = 0;
										}
									}while((n_calle<1)||(n_calle>100));
									dir = calle + espacio_coma + n_calle;
								break;
								
								case 8: //SALDO
									do {
										try {
											System.out.print("Introduzca el saldo de su cuenta: ");
											sald = t.nextLong();
										}
										catch(Exception e) {
											t.next();
											sald = -1;
										}
									}while(sald<0);
								break;
								
								default: 
									System.out.println("Opción incorrecta");
								break;
								}
								
							}while(opc2!=0);
						}
						
						
						uno = new c_c_c(nomb, ap1, ap2, n_obj, dni, dir, sald);
						cuentas[(c_c_c.numcuentas)-1] = new c_c_c(nomb, ap1, ap2, n_obj, dni, dir, sald);
						
						System.out.println();
						
						System.out.println("---------------------------");
						System.out.println("CUENTA CREADA CORRECTAMENTE");
						System.out.println("---------------------------");
						System.out.println();
						
						System.out.println("Nombre: "+ nomb);
						System.out.println("Apellido 1: "+ ap1);
						System.out.println("Apellido 2: "+ ap2);
						System.out.println("Número de cuenta: " + n_obj);
						System.out.println("DNI: "+ dni);
						System.out.println("Dirección: "+ dir);
						System.out.println("Saldo: "+ sald + euros);
						
					break;
					
					case 2://CREAR FONDO DE PENSIONES
						System.out.println("---------------------------------");
						System.out.println("Creación de un fondo de pensiones");
						System.out.println("---------------------------------");
						do {
							try {
								System.out.print("Nombre: ");
								nomb = t.next();
							}
							catch(Exception e) {
								nomb = "a";
							}
							nomb = nomb.toUpperCase();
						} while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
					
						do {
							try {
								System.out.print("Apellido 1: ");
								ap1 = t.next();
							}
							catch(Exception e) {
								ap1 = "a";
							}
							ap1 = ap1.toUpperCase();
						} while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
						
						do {
							try {
								System.out.print("Apellido 2: ");
								ap2 = t.next();
							}
							catch(Exception e) {
								ap2 = "a";
							}
							ap2 = ap2.toUpperCase();
						} while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
						
						IBAN = args[0];
						entidad = args[1];
						ofi = args[2];
						cd = args[3];
						
						do {
							n_c = (long) (Math.random() * (a - 1000000000) + 1000000000);
							for(u = 0; u<=n; u++) {
								if(n_c==rep[u]) {
									flag = false;
								}
							}
						}while(flag=false);
						n++;
						n_obj = IBAN + entidad + ofi + cd + n_c;
						
						do {
							try {
								System.out.print("Introduzca el número de su dni: ");
								n_dni = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								n_dni = 0;
							}
						}while((n_dni<10000000)||(n_dni>99999999));
						
						do {
							try {
								System.out.print("Introduzca la letra de su dni: ");
								letra_dni = t.next();
								
							}
							catch(Exception e) {
								letra_dni = "ab";
							}
							letra_dni = letra_dni.toUpperCase();
						}while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
						
						dni = n_dni + letra_dni;
						
						t.nextLine();
						do {
							try {
								System.out.print("Introduzca su calle: ");
								calle = t.nextLine();
							}
							catch(Exception e) {
								t.next();
							}
							calle = calle.toUpperCase();
						}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
						
						do {
							try {
								System.out.print("Introduzca el número de su calle: ");
								n_calle = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								n_calle = 0;
							}
						}while((n_calle<1)||(n_calle>100));
						
						dir = calle + espacio_coma + n_calle;
						
						do {
							try {
								System.out.print("Introduzca el saldo de su cuenta: ");
								sald = t.nextLong();
							}
							catch(Exception e) {
								t.next();
								sald = -1;
							}
						}while(sald<0);
						
						System.out.println("------------------------");
						System.out.println("NUEVO FONDO DE PENSIONES");
						System.out.println("------------------------");
						System.out.println();
						System.out.println("Nombre: "+ nomb);
						System.out.println("Apellido 1: "+ ap1);
						System.out.println("Apellido 2: "+ ap2);
						System.out.println("Número de cuenta: " + n_obj);
						System.out.println("DNI: "+ dni);
						System.out.println("Dirección: "+ dir);
						System.out.println("Saldo: "+ sald + euros);
						System.out.println();
						do {
							try {
								System.out.println("¿Desea modificar alguno de los datos?\n1-SI\n2-NO");
								opc1 = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								opc=0;
							}
						}while((opc1<1)||(opc1>2));
						
						if(opc1==1) {
							do {
								System.out.println("---------");
								System.out.println("MODIFICAR");
								System.out.println("---------");
								System.out.println("0.-SALIR");
								System.out.println("1.-Nombre");
								System.out.println("2.-Apellido 1");
								System.out.println("3.-Apellido 2");
								System.out.println("4.-Número de dni");
								System.out.println("5.-Letra de dni");
								System.out.println("6.-Calle");
								System.out.println("7.-Número de su calle");
								System.out.println("8.-Saldo");
								try {
									opc2 = t.nextInt();
								}
								catch(Exception e) {
									t.next();
									
								}
								switch(opc2) {
								
								case 1: //NOMBRE
									do {
										try {
											System.out.print("Nombre: ");
											nomb = t.next();
										}
										catch(Exception e) {
											nomb = "a";
										}
										nomb = nomb.toUpperCase();
									}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
								break;
								
								case 2: //APELLIDO 1
									do {
										try {
											System.out.print("Apellido 1: ");
											ap1 = t.next();
										}
										catch(Exception e) {
											ap1 = "a";
										}
										ap1 = ap1.toUpperCase();
									}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
								break;
								
								case 3: //APELLIDO 2
									do {
										try {
											System.out.print("Apellido 2: ");
											ap2 = t.next();
										}
										catch(Exception e) {
											ap2 = "a";
										}
										ap2 = ap2.toUpperCase();
									}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
								break;
								
								case 4: //NUMERO DE DNI
									do {
										try {
											System.out.print("Introduzca el número de su dni: ");
											n_dni = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											n_dni = 0;
										}
									}while((n_dni<10000000)||(n_dni>99999999));
								break;
								
								case 5: //LETRA DE DNI
									do {
										try {
											System.out.print("Introduzca la letra de su dni: ");
											letra_dni = t.next();
										}
										catch(Exception e) {
											letra_dni = "ab";
										}
										letra_dni = letra_dni.toUpperCase();
									} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
									dni = n_dni + letra_dni;
								break;
								
								case 6: //CALLE
									do {
										try {
											System.out.print("Introduzca su calle: ");
											calle = t.nextLine();
										}
										catch(Exception e) {
											t.next();
										}
										calle = calle.toUpperCase();
									}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
								break;
								
								case 7: //NUMERO DE SU CALLE
									do {
										try {
											System.out.print("Introduzca el número de su calle: ");
											n_calle = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											n_calle = 0;
										}
									}while((n_calle<1)||(n_calle>100));
									dir = calle + espacio_coma + n_calle;
								break;
								
								case 8: //SALDO
									do {
										try {
											System.out.print("Introduzca el saldo de su cuenta: ");
											sald = t.nextLong();
										}
										catch(Exception e) {
											t.next();
											sald = -1;
										}
									}while(sald<0);
								break;
								
								default: 
									System.out.println("Opción incorrecta");
								break;
								}
								
							}while(opc2!=0);
						}
						
						dos = new f_p(nomb, ap1, ap2, n_obj, dni, dir, sald);
						fondo_pensiones[(f_p.numfp)-1] = new f_p(nomb, ap1, ap2, n_obj, dni, dir, sald);
						
						System.out.println();
						
						System.out.println("---------------------------------------");
						System.out.println("FONDO DE PENSIONES CREADO CORRECTAMENTE");
						System.out.println("---------------------------------------");
						System.out.println();
						
						System.out.println("Nombre: "+ nomb);
						System.out.println("Apellido 1: "+ ap1);
						System.out.println("Apellido 2: "+ ap2);
						System.out.println("Número de cuenta: " + n_obj);
						System.out.println("DNI: "+ dni);
						System.out.println("Dirección: "+ dir);
						System.out.println("Saldo: "+ sald + euros);
						
						
					break;
					
					case 3://CREAR FONDO A PLAZO FIJO
						System.out.println("---------------------------------");
						System.out.println("Creación de un fondo a plazo fijo");
						System.out.println("---------------------------------");
						do {
							try {
								System.out.print("Nombre: ");
								nomb = t.next();
							}
							catch(Exception e) {
								nomb = "a";
							}
							nomb = nomb.toUpperCase();
						} while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
					
						do {
							try {
								System.out.print("Apellido 1: ");
								ap1 = t.next();
							}
							catch(Exception e) {
								ap1 = "a";
							}
							ap1 = ap1.toUpperCase();
						} while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
						
						do {
							try {
								System.out.print("Apellido 2: ");
								ap2 = t.next();
							}
							catch(Exception e) {
								ap2 = "a";
							}
							ap2 = ap2.toUpperCase();
						} while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
						
						IBAN = args[0];
						entidad = args[1];
						ofi = args[2];
						cd = args[3];
						
						do {
							n_c = (long) (Math.random() * (a - 1000000000) + 1000000000);
							for(u = 0; u<=n; u++) {
								if(n_c==rep[u]) {
									flag = false;
								}
							}
						}while(flag=false);
						n++;
						n_obj = IBAN + entidad + ofi + cd + n_c;
						
						do {
							try {
								System.out.print("Introduzca el número de su dni: ");
								n_dni = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								n_dni = 0;
							}
						}while((n_dni<10000000)||(n_dni>99999999));
						
						do {
							try {
								System.out.print("Introduzca la letra de su dni: ");
								letra_dni = t.next();								
							}
							catch(Exception e) {
								letra_dni = "ab";
							}
							letra_dni = letra_dni.toUpperCase();
						} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
						
						dni = n_dni + letra_dni;
						
						t.nextLine();
						do {
							try {
								System.out.print("Introduzca su calle: ");
								calle = t.nextLine();
							}
							catch(Exception e) {
								t.next();
							}
							calle = calle.toUpperCase();
						}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
						
						do {
							try {
								System.out.print("Introduzca el número de su calle: ");
								n_calle = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								n_calle = 0;
							}
						}while((n_calle<1)||(n_calle>100));
						
						dir = calle + espacio_coma + n_calle;
						
						do {
							try {
								System.out.print("Introduzca el saldo de su cuenta: ");
								sald = t.nextLong();
							}
							catch(Exception e) {
								t.next();
								sald = -1;
							}
						}while(sald<0);
						
						System.out.println("------------------------");
						System.out.println("NUEVO FONDO A PLAZO FIJO");
						System.out.println("------------------------");
						System.out.println();
						System.out.println("Nombre: "+ nomb);
						System.out.println("Apellido 1: "+ ap1);
						System.out.println("Apellido 2: "+ ap2);
						System.out.println("Número de cuenta: " + n_obj);
						System.out.println("DNI: "+ dni);
						System.out.println("Dirección: "+ dir);
						System.out.println("Saldo: "+ sald + euros);
						System.out.println();
						do {
							try {
								System.out.println("¿Desea modificar alguno de los datos?\n1-SI\n2-NO");
								opc1 = t.nextInt();
							}
							catch(Exception e) {
								t.next();
								opc=0;
							}
						}while((opc1<1)||(opc1>2));
						
						if(opc1==1) {
							do {
								System.out.println("---------");
								System.out.println("MODIFICAR");
								System.out.println("---------");
								System.out.println("0.-SALIR");
								System.out.println("1.-Nombre");
								System.out.println("2.-Apellido 1");
								System.out.println("3.-Apellido 2");
								System.out.println("4.-Número de dni");
								System.out.println("5.-Letra de dni");
								System.out.println("6.-Calle");
								System.out.println("7.-Número de su calle");
								System.out.println("8.-Saldo");
								try {
									opc2 = t.nextInt();
								}
								catch(Exception e) {
									t.next();
									
								}
								switch(opc2) {
								
								case 1: //NOMBRE
									do {
										try {
											System.out.print("Nombre: ");
											nomb = t.next();
										}
										catch(Exception e) {
											nomb = "a";
										}
										nomb = nomb.toUpperCase();
									}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
								break;
								
								case 2: //APELLIDO 1
									do {
										try {
											System.out.print("Apellido 1: ");
											ap1 = t.next();
										}
										catch(Exception e) {
											ap1 = "a";
										}
										ap1 = ap1.toUpperCase();
									}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
								break;
								
								case 3: //APELLIDO 2
									do {
										try {
											System.out.print("Apellido 2: ");
											ap2 = t.next();
										}
										catch(Exception e) {
											ap2 = "a";
										}
										ap2 = ap2.toUpperCase();
									}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
								break;
								
								case 4: //NUMERO DE DNI
									do {
										try {
											System.out.print("Introduzca el número de su dni: ");
											n_dni = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											n_dni = 0;
										}
									}while((n_dni<10000000)||(n_dni>99999999));
								break;
								
								case 5: //LETRA DE DNI
									do {
										try {
											System.out.print("Introduzca la letra de su dni: ");
											letra_dni = t.next();
										}
										catch(Exception e) {
											letra_dni = "ab";
										}
										letra_dni = letra_dni.toUpperCase();
									} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
									dni = n_dni + letra_dni;
								break;
								
								case 6: //CALLE
									do {
										try {
											System.out.print("Introduzca su calle: ");
											calle = t.nextLine();
										}
										catch(Exception e) {
											t.next();
										}
										calle = calle.toUpperCase();
									}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
								break;
								
								case 7: //NUMERO DE SU CALLE
									do {
										try {
											System.out.print("Introduzca el número de su calle: ");
											n_calle = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											n_calle = 0;
										}
									}while((n_calle<1)||(n_calle>100));
									dir = calle + espacio_coma + n_calle;
								break;
								
								case 8: //SALDO
									do {
										try {
											System.out.print("Introduzca el saldo de su cuenta: ");
											sald = t.nextLong();
										}
										catch(Exception e) {
											t.next();
											sald = -1;
										}
									}while(sald<0);
								break;
								
								default: 
									System.out.println("Opción incorrecta");
								break;
								}
								
							}while(opc2!=0);
						}
						
						tres = new f_p_f(nomb, ap1, ap2, n_obj, dni, dir, sald);
						fondo_plazo_fijo[(f_p_f.numfpf)-1] = new f_p_f(nomb, ap1, ap2, n_obj, dni, dir, sald);
						
						System.out.println();
						
						System.out.println("---------------------------------------");
						System.out.println("FONDO A PLAZO FIJO CREADO CORRECTAMENTE");
						System.out.println("---------------------------------------");
						System.out.println();
						
						System.out.println("Nombre: "+ nomb);
						System.out.println("Apellido 1: "+ ap1);
						System.out.println("Apellido 2: "+ ap2);
						System.out.println("Número de cuenta: " + n_obj);
						System.out.println("DNI: "+ dni);
						System.out.println("Dirección: "+ dir);
						System.out.println("Saldo: "+ sald + euros);
					break;
					
					case 4://VOLVER
						System.out.println("Volviendo...");
					break;
					
					default:
						System.out.println("Opción incorrecta");
					break;
						
					}
				}while(opc!=4);
				
				
			break;
			
			case 2://BUSCAR PRODUCTO
				do {
					try {
						System.out.println("--------------");
						System.out.println("BUSCAR PRODUCTO");
						System.out.println("--------------");
						System.out.println("0.- VOLVER");
						System.out.println("1.- POR CLIENTE");
						System.out.println("2.- POR CÓDIGO");
						System.out.println();
						System.out.print("Introduzca una opción del menú: ");
						opc = t.nextInt();
					}
					
					catch(Exception e) {
						t.next();
						opc = 0;
					}
					
					switch(opc) {
					
					case 1:// POR CLIENTE (DNI)
						do {
							System.out.println("---------------------------");
							System.out.println("BUSCAR PRODUCTO POR CLIENTE");
							System.out.println("---------------------------");

							do {
								try {
									System.out.print("Introduzca el número de su dni: ");
									n_dni = t.nextInt();
								}
								catch(Exception e) {
									t.next();
									n_dni = 0;
								}
							}while((n_dni<10000000)||(n_dni>99999999));
							
							do {
								try {
									System.out.print("Introduzca la letra de su dni: ");
									letra_dni = t.next();
								}
								catch(Exception e) {
									letra_dni = "ab";
								}
								letra_dni = letra_dni.toUpperCase();
							} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
							
							dni = n_dni + letra_dni;
							
							for(i=0; i<=c_c_c.numcuentas; i++) {
								try {
									if(cuentas[i].DNI.equals(dni)) {
										System.out.println("-----------------");
										System.out.println("CUENTA ENCONTRADA");
										System.out.println("-----------------");
										System.out.println();
										System.out.println("Nombre: "+ cuentas[i].nombre);
										System.out.println("Apellido 1: "+ cuentas[i].apellido1);
										System.out.println("Apellido 2: "+ cuentas[i].apellido2);
										System.out.println("Número de cuenta: " + cuentas[i].num_obj);
										System.out.println("DNI: "+ cuentas[i].DNI);
										System.out.println("Dirección: "+ cuentas[i].direccion);
										System.out.println("Saldo: "+ cuentas[i].saldo + euros);
										System.out.println();
										do {
											try {
												System.out.println("--------------------");
												System.out.println("1.- MODIFICAR CUENTA");
												System.out.println("2.- BORRAR CUENTA");
												System.out.println("3.- VOLVER");
												System.out.println();
												System.out.println("Introduzca una opción de menú: ");
												opc1 = t.nextInt();
											}
											catch(Exception e) {
												t.next();
												opc1 = 4;
											}
											
											switch(opc1) {
											
											case 1:
												do {
													System.out.println("---------");
													System.out.println("MODIFICAR");
													System.out.println("---------");
													System.out.println("0.-SALIR");
													System.out.println("1.-Nombre");
													System.out.println("2.-Apellido 1");
													System.out.println("3.-Apellido 2");
													System.out.println("4.-Número de dni");
													System.out.println("5.-Letra de dni");
													System.out.println("6.-Calle");
													System.out.println("7.-Número de su calle");
													System.out.println("8.-Saldo");
													try {
														opc2 = t.nextInt();
													}
													catch(Exception e) {
														t.next();
														
													}
													switch(opc2) {
													
													case 1: //NOMBRE
														do {
															try {
																System.out.print("Nombre: ");
																nomb = t.next();
															}
															catch(Exception e) {
																nomb = "a";
															}
															nomb = nomb.toUpperCase();
														}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
													break;
													
													case 2: //APELLIDO 1
														do {
															try {
																System.out.print("Apellido 1: ");
																ap1 = t.next();
															}
															catch(Exception e) {
																ap1 = "a";
															}
															ap1 = ap1.toUpperCase();
														}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
													break;
													
													case 3: //APELLIDO 2
														do {
															try {
																System.out.print("Apellido 2: ");
																ap2 = t.next();
															}
															catch(Exception e) {
																ap2 = "a";
															}
															ap2 = ap2.toUpperCase();
														}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
													break;
													
													case 4: //NUMERO DE DNI
														do {
															try {
																System.out.print("Introduzca el número de su dni: ");
																n_dni = t.nextInt();
															}
															catch(Exception e) {
																t.next();
																n_dni = 0;
															}
														}while((n_dni<10000000)||(n_dni>99999999));
													break;
													
													case 5: //LETRA DE DNI
														do {
															try {
																System.out.print("Introduzca la letra de su dni: ");
																letra_dni = t.next();
															}
															catch(Exception e) {
																letra_dni = "ab";
															}
															letra_dni = letra_dni.toUpperCase();
														} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
														dni = n_dni + letra_dni;
													break;
													
													case 6: //CALLE
														do {
															try {
																System.out.print("Introduzca su calle: ");
																calle = t.nextLine();
															}
															catch(Exception e) {
																t.next();
															}
															calle = calle.toUpperCase();
														}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
													break;
													
													case 7: //NUMERO DE SU CALLE
														do {
															try {
																System.out.print("Introduzca el número de su calle: ");
																n_calle = t.nextInt();
															}
															catch(Exception e) {
																t.next();
																n_calle = 0;
															}
														}while((n_calle<1)||(n_calle>100));
														dir = calle + espacio_coma + n_calle;
													break;
													
													case 8: //SALDO
														do {
															try {
																System.out.print("Introduzca el saldo de su cuenta: ");
																sald = t.nextLong();
															}
															catch(Exception e) {
																t.next();
																sald = -1;
															}
														}while(sald<0);
													break;
													
													default: 
														System.out.println("Opción incorrecta");
													break;
													}
													
												}while(opc2!=0);
												
												cuentas[i] = new c_c_c(nomb, ap1, ap2, n_obj, dni, dir, sald);
	
											break;
											
											case 2: 
												
												System.out.println("CUENTA ELIMINADA");
												
												cuentas[i] = null;
											break;
											}
										}while(opc1!=3);
										
									}
								}
								catch(Exception e) {
									
								}
								
							}
							
							for(i=0; i<=f_p.numfp; i++) {
								try {
									if(fondo_pensiones[i].DNI.equals(dni)) {
										System.out.println("-----------------");
										System.out.println("FONDO DE PENSIONES ENCONTRADO");
										System.out.println("-----------------");
										System.out.println();
										System.out.println("Nombre: "+ fondo_pensiones[i].nombre);
										System.out.println("Apellido 1: "+ fondo_pensiones[i].apellido1);
										System.out.println("Apellido 2: "+ fondo_pensiones[i].apellido2);
										System.out.println("Número de cuenta: " + fondo_pensiones[i].num_obj);
										System.out.println("DNI: "+ fondo_pensiones[i].DNI);
										System.out.println("Dirección: "+ fondo_pensiones[i].direccion);
										System.out.println("Saldo: "+ fondo_pensiones[i].saldo + euros);
										System.out.println();
										do {
											try {
												System.out.println("--------------------");
												System.out.println("1.- MODIFICAR CUENTA");
												System.out.println("2.- BORRAR CUENTA");
												System.out.println("3.- VOLVER");
												System.out.println();
												System.out.println("Introduzca una opción de menú: ");
												opc1 = t.nextInt();
											}
											catch(Exception e) {
												t.next();
												opc1 = 4;
											}
											
											switch(opc1) {
											
											case 1:
												do {
													System.out.println("---------");
													System.out.println("MODIFICAR");
													System.out.println("---------");
													System.out.println("0.-SALIR");
													System.out.println("1.-Nombre");
													System.out.println("2.-Apellido 1");
													System.out.println("3.-Apellido 2");
													System.out.println("4.-Número de dni");
													System.out.println("5.-Letra de dni");
													System.out.println("6.-Calle");
													System.out.println("7.-Número de su calle");
													System.out.println("8.-Saldo");
													try {
														opc2 = t.nextInt();
													}
													catch(Exception e) {
														t.next();
														
													}
													switch(opc2) {
													
													case 0: //SALIR
														System.out.println("Volviendo...");
													break;
													
													case 1: //NOMBRE
														do {
															try {
																System.out.print("Nombre: ");
																nomb = t.next();
															}
															catch(Exception e) {
																nomb = "a";
															}
															nomb = nomb.toUpperCase();
														}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
													break;
													
													case 2: //APELLIDO 1
														do {
															try {
																System.out.print("Apellido 1: ");
																ap1 = t.next();
															}
															catch(Exception e) {
																ap1 = "a";
															}
															ap1 = ap1.toUpperCase();
														}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
													break;
													
													case 3: //APELLIDO 2
														do {
															try {
																System.out.print("Apellido 2: ");
																ap2 = t.next();
															}
															catch(Exception e) {
																ap2 = "a";
															}
															ap2 = ap2.toUpperCase();
														}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
													break;
													
													case 4: //NUMERO DE DNI
														do {
															try {
																System.out.print("Introduzca el número de su dni: ");
																n_dni = t.nextInt();
															}
															catch(Exception e) {
																t.next();
																n_dni = 0;
															}
														}while((n_dni<10000000)||(n_dni>99999999));
													break;
													
													case 5: //LETRA DE DNI
														do {
															try {
																System.out.print("Introduzca la letra de su dni: ");
																letra_dni = t.next();
															}
															catch(Exception e) {
																letra_dni = "ab";
															}
															letra_dni = letra_dni.toUpperCase();
														} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
														dni = n_dni + letra_dni;
													break;
													
													case 6: //CALLE
														do {
															try {
																System.out.print("Introduzca su calle: ");
																calle = t.nextLine();
															}
															catch(Exception e) {
																t.next();
															}
															calle = calle.toUpperCase();
														}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
													break;
													
													case 7: //NUMERO DE SU CALLE
														do {
															try {
																System.out.print("Introduzca el número de su calle: ");
																n_calle = t.nextInt();
															}
															catch(Exception e) {
																t.next();
																n_calle = 0;
															}
														}while((n_calle<1)||(n_calle>100));
														dir = calle + espacio_coma + n_calle;
													break;
													
													case 8: //SALDO
														do {
															try {
																System.out.print("Introduzca el saldo de su cuenta: ");
																sald = t.nextLong();
															}
															catch(Exception e) {
																t.next();
																sald = -1;
															}
														}while(sald<0);
													break;
													
													default: 
														System.out.println("Opción incorrecta");
													break;
													}
													
												}while(opc2!=0);
												
												fondo_pensiones[i] = new f_p(nomb, ap1, ap2, n_obj, dni, dir, sald);

											break;
											
											case 2: 
												
												System.out.println("FONDO DE PENSIONES ELIMINADO");
												
												fondo_pensiones[i] = null;
											break;
											}
										}while(opc1!=3);
										
									}
								}
								catch(Exception e) {
									
								}
								
								
							}
							
							for(i=0; i<=f_p_f.numfpf; i++) {
								try {
									if(fondo_plazo_fijo[i].DNI.equals(dni)) {
										System.out.println("-----------------");
										System.out.println("FONDO A PLAZO FIJO ENCONTRADA");
										System.out.println("-----------------");
										System.out.println();
										System.out.println("Nombre: "+ fondo_plazo_fijo[i].nombre);
										System.out.println("Apellido 1: "+ fondo_plazo_fijo[i].apellido1);
										System.out.println("Apellido 2: "+ fondo_plazo_fijo[i].apellido2);
										System.out.println("Número de cuenta: " + fondo_plazo_fijo[i].num_obj);
										System.out.println("DNI: "+ fondo_plazo_fijo[i].DNI);
										System.out.println("Dirección: "+ fondo_plazo_fijo[i].direccion);
										System.out.println("Saldo: "+ fondo_plazo_fijo[i].saldo + euros);
										System.out.println();
										do {
											try {
												System.out.println("--------------------");
												System.out.println("1.- MODIFICAR CUENTA");
												System.out.println("2.- BORRAR CUENTA");
												System.out.println("3.- VOLVER");
												System.out.println();
												System.out.println("Introduzca una opción de menú: ");
												opc1 = t.nextInt();
											}
											catch(Exception e) {
												t.next();
												opc1 = 4;
											}
											
											switch(opc1) {
											
											case 1:
												do {
													System.out.println("---------");
													System.out.println("MODIFICAR");
													System.out.println("---------");
													System.out.println("0.-SALIR");
													System.out.println("1.-Nombre");
													System.out.println("2.-Apellido 1");
													System.out.println("3.-Apellido 2");
													System.out.println("4.-Número de dni");
													System.out.println("5.-Letra de dni");
													System.out.println("6.-Calle");
													System.out.println("7.-Número de su calle");
													System.out.println("8.-Saldo");
													try {
														opc2 = t.nextInt();
													}
													catch(Exception e) {
														t.next();
														
													}
													switch(opc2) {
													
													case 1: //NOMBRE
														do {
															try {
																System.out.print("Nombre: ");
																nomb = t.next();
															}
															catch(Exception e) {
																nomb = "a";
															}
															nomb = nomb.toUpperCase();
														}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
													break;
													
													case 2: //APELLIDO 1
														do {
															try {
																System.out.print("Apellido 1: ");
																ap1 = t.next();
															}
															catch(Exception e) {
																ap1 = "a";
															}
															ap1 = ap1.toUpperCase();
														}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
													break;
													
													case 3: //APELLIDO 2
														do {
															try {
																System.out.print("Apellido 2: ");
																ap2 = t.next();
															}
															catch(Exception e) {
																ap2 = "a";
															}
															ap2 = ap2.toUpperCase();
														}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
													break;
													
													case 4: //NUMERO DE DNI
														do {
															try {
																System.out.print("Introduzca el número de su dni: ");
																n_dni = t.nextInt();
															}
															catch(Exception e) {
																t.next();
																n_dni = 0;
															}
														}while((n_dni<10000000)||(n_dni>99999999));
													break;
													
													case 5: //LETRA DE DNI
														do {
															try {
																System.out.print("Introduzca la letra de su dni: ");
																letra_dni = t.next();
															}
															catch(Exception e) {
																letra_dni = "ab";
															}
															letra_dni = letra_dni.toUpperCase();
														} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
														dni = n_dni + letra_dni;
													break;
													
													case 6: //CALLE
														do {
															try {
																System.out.print("Introduzca su calle: ");
																calle = t.nextLine();
															}
															catch(Exception e) {
																t.next();
															}
															calle = calle.toUpperCase();
														}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
													break;
													
													case 7: //NUMERO DE SU CALLE
														do {
															try {
																System.out.print("Introduzca el número de su calle: ");
																n_calle = t.nextInt();
															}
															catch(Exception e) {
																t.next();
																n_calle = 0;
															}
														}while((n_calle<1)||(n_calle>100));
														dir = calle + espacio_coma + n_calle;
													break;
													
													case 8: //SALDO
														do {
															try {
																System.out.print("Introduzca el saldo de su cuenta: ");
																sald = t.nextLong();
															}
															catch(Exception e) {
																t.next();
																sald = -1;
															}
														}while(sald<0);
													break;
													
													default: 
														System.out.println("Opción incorrecta");
													break;
													}
													
												}while(opc2!=0);
												
												fondo_plazo_fijo[i] = new f_p_f(nomb, ap1, ap2, n_obj, dni, dir, sald);

											break;
											
											case 2: 
												
												System.out.println("FONDO A PLAZO FIJO ELIMINADO");
												
												fondo_plazo_fijo[i] = null;
											break;
											}
										}while(opc1!=3);
										
									}
								}
								catch(Exception e) {
									
								}
								
							}
							
							do {
								try {
									System.out.println("¿DESEA SEGUIR BUSCANDO PRODUCTOS POR CLIENTE?");
									System.out.println("0.- NO");
									System.out.println("1.- SI");
									opc = t.nextInt();
								}
								catch(Exception e) {
									t.next();
									opc = -1;
								}
							}while((opc<0)||(opc>1));
							
						}while(opc!=0);
					break;
					
					case 2:// POR CODIGO (num_obj)
						do {
							System.out.println("------------------------------------");
							System.out.println("BUSCAR PRODUCTO POR CODIGO DE CUENTA");
							System.out.println("------------------------------------");
							
							do {
								System.out.println("Introduzca su código de cuenta: ");
								n_c = t.nextLong();
							}while((n_c<1000000000)||(n_c>a));
							
							n_obj = IBAN + espacio + entidad + espacio + ofi + espacio + cd + espacio + n_c;
							
							for(i=0; i<=c_c_c.numcuentas; i++) {
								if(cuentas[i].num_obj.equals(n_obj)) {
									System.out.println("-----------------");
									System.out.println("CUENTA ENCONTRADA");
									System.out.println("-----------------");
									System.out.println();
									System.out.println("Nombre: "+ cuentas[i].nombre);
									System.out.println("Apellido 1: "+ cuentas[i].apellido1);
									System.out.println("Apellido 2: "+ cuentas[i].apellido2);
									System.out.println("Número de cuenta: " + cuentas[i].num_obj);
									System.out.println("DNI: "+ cuentas[i].DNI);
									System.out.println("Dirección: "+ cuentas[i].direccion);
									System.out.println("Saldo: "+ cuentas[i].saldo + euros);
									System.out.println();
									do {
										try {
											System.out.println("--------------------");
											System.out.println("1.- MODIFICAR CUENTA");
											System.out.println("2.- BORRAR CUENTA");
											System.out.println("3.- VOLVER");
											System.out.println();
											System.out.println("Introduzca una opción de menú: ");
											opc1 = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											opc1 = 4;
										}
										
										switch(opc1) {
										
										case 1:
											do {
												System.out.println("---------");
												System.out.println("MODIFICAR");
												System.out.println("---------");
												System.out.println("0.-SALIR");
												System.out.println("1.-Nombre");
												System.out.println("2.-Apellido 1");
												System.out.println("3.-Apellido 2");
												System.out.println("4.-Número de dni");
												System.out.println("5.-Letra de dni");
												System.out.println("6.-Calle");
												System.out.println("7.-Número de su calle");
												System.out.println("8.-Saldo");
												try {
													opc2 = t.nextInt();
												}
												catch(Exception e) {
													t.next();
													
												}
												switch(opc2) {
												
												case 1: //NOMBRE
													do {
														try {
															System.out.print("Nombre: ");
															nomb = t.next();
														}
														catch(Exception e) {
															nomb = "a";
														}
														nomb = nomb.toUpperCase();
													}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
												break;
												
												case 2: //APELLIDO 1
													do {
														try {
															System.out.print("Apellido 1: ");
															ap1 = t.next();
														}
														catch(Exception e) {
															ap1 = "a";
														}
														ap1 = ap1.toUpperCase();
													}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
												break;
												
												case 3: //APELLIDO 2
													do {
														try {
															System.out.print("Apellido 2: ");
															ap2 = t.next();
														}
														catch(Exception e) {
															ap2 = "a";
														}
														ap2 = ap2.toUpperCase();
													}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
												break;
												
												case 4: //NUMERO DE DNI
													do {
														try {
															System.out.print("Introduzca el número de su dni: ");
															n_dni = t.nextInt();
														}
														catch(Exception e) {
															t.next();
															n_dni = 0;
														}
													}while((n_dni<10000000)||(n_dni>99999999));
												break;
												
												case 5: //LETRA DE DNI
													do {
														try {
															System.out.print("Introduzca la letra de su dni: ");
															letra_dni = t.next();
														}
														catch(Exception e) {
															letra_dni = "ab";
														}
														letra_dni = letra_dni.toUpperCase();
													} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
													dni = n_dni + letra_dni;
												break;
												
												case 6: //CALLE
													do {
														try {
															System.out.print("Introduzca su calle: ");
															calle = t.nextLine();
														}
														catch(Exception e) {
															t.next();
														}
														calle = calle.toUpperCase();
													}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
												break;
												
												case 7: //NUMERO DE SU CALLE
													do {
														try {
															System.out.print("Introduzca el número de su calle: ");
															n_calle = t.nextInt();
														}
														catch(Exception e) {
															t.next();
															n_calle = 0;
														}
													}while((n_calle<1)||(n_calle>100));
													dir = calle + espacio_coma + n_calle;
												break;
												
												case 8: //SALDO
													do {
														try {
															System.out.print("Introduzca el saldo de su cuenta: ");
															sald = t.nextLong();
														}
														catch(Exception e) {
															t.next();
															sald = -1;
														}
													}while(sald<0);
												break;
												
												default: 
													System.out.println("Opción incorrecta");
												break;
												}
												
											}while(opc2!=0);
											
											cuentas[i] = new c_c_c(nomb, ap1, ap2, n_obj, dni, dir, sald);

										break;
										
										case 2: 
										
											System.out.println("CUENTA ELIMINADA");
									
											cuentas[i] = null;
										break;
										}
									}while(opc1!=3);
									
								}
							}
							
							for(i=0; i<=f_p.numfp; i++) {
								if(fondo_pensiones[i].num_obj.equals(n_obj)) {
									System.out.println("-----------------");
									System.out.println("FONDO DE PENSIONES ENCONTRADO");
									System.out.println("-----------------");
									System.out.println();
									System.out.println("Nombre: "+ fondo_pensiones[i].nombre);
									System.out.println("Apellido 1: "+ fondo_pensiones[i].apellido1);
									System.out.println("Apellido 2: "+ fondo_pensiones[i].apellido2);
									System.out.println("Número de cuenta: " + fondo_pensiones[i].num_obj);
									System.out.println("DNI: "+ fondo_pensiones[i].DNI);
									System.out.println("Dirección: "+ fondo_pensiones[i].direccion);
									System.out.println("Saldo: "+ fondo_pensiones[i].saldo + euros);
									System.out.println();
									do {
										try {
											System.out.println("--------------------");
											System.out.println("1.- MODIFICAR CUENTA");
											System.out.println("2.- BORRAR CUENTA");
											System.out.println("3.- VOLVER");
											System.out.println();
											System.out.println("Introduzca una opción de menú: ");
											opc1 = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											opc1 = 4;
										}
										
										switch(opc1) {
										
										case 1:
											do {
												System.out.println("---------");
												System.out.println("MODIFICAR");
												System.out.println("---------");
												System.out.println("0.-SALIR");
												System.out.println("1.-Nombre");
												System.out.println("2.-Apellido 1");
												System.out.println("3.-Apellido 2");
												System.out.println("4.-Número de dni");
												System.out.println("5.-Letra de dni");
												System.out.println("6.-Calle");
												System.out.println("7.-Número de su calle");
												System.out.println("8.-Saldo");
												try {
													opc2 = t.nextInt();
												}
												catch(Exception e) {
													t.next();
													
												}
												switch(opc2) {
												
												case 1: //NOMBRE
													do {
														try {
															System.out.print("Nombre: ");
															nomb = t.next();
														}
														catch(Exception e) {
															nomb = "a";
														}
														nomb = nomb.toUpperCase();
													}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
												break;
												
												case 2: //APELLIDO 1
													do {
														try {
															System.out.print("Apellido 1: ");
															ap1 = t.next();
														}
														catch(Exception e) {
															ap1 = "a";
														}
														ap1 = ap1.toUpperCase();
													}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
												break;
												
												case 3: //APELLIDO 2
													do {
														try {
															System.out.print("Apellido 2: ");
															ap2 = t.next();
														}
														catch(Exception e) {
															ap2 = "a";
														}
														ap2 = ap2.toUpperCase();
													}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
												break;
												
												case 4: //NUMERO DE DNI
													do {
														try {
															System.out.print("Introduzca el número de su dni: ");
															n_dni = t.nextInt();
														}
														catch(Exception e) {
															t.next();
															n_dni = 0;
														}
													}while((n_dni<10000000)||(n_dni>99999999));
												break;
												
												case 5: //LETRA DE DNI
													do {
														try {
															System.out.print("Introduzca la letra de su dni: ");
															letra_dni = t.next();
														}
														catch(Exception e) {
															letra_dni = "ab";
														}
														letra_dni = letra_dni.toUpperCase();
													} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
													dni = n_dni + letra_dni;
												break;
												
												case 6: //CALLE
													do {
														try {
															System.out.print("Introduzca su calle: ");
															calle = t.nextLine();
														}
														catch(Exception e) {
															t.next();
														}
														calle = calle.toUpperCase();
													}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
												break;
												
												case 7: //NUMERO DE SU CALLE
													do {
														try {
															System.out.print("Introduzca el número de su calle: ");
															n_calle = t.nextInt();
														}
														catch(Exception e) {
															t.next();
															n_calle = 0;
														}
													}while((n_calle<1)||(n_calle>100));
													dir = calle + espacio_coma + n_calle;
												break;
												
												case 8: //SALDO
													do {
														try {
															System.out.print("Introduzca el saldo de su cuenta: ");
															sald = t.nextLong();
														}
														catch(Exception e) {
															t.next();
															sald = -1;
														}
													}while(sald<0);
												break;
												
												default: 
													System.out.println("Opción incorrecta");
												break;
												}
												
											}while(opc2!=0);
											
											fondo_pensiones[i] = new f_p(nomb, ap1, ap2, n_obj, dni, dir, sald);

										break;
										
										case 2: 
											System.out.println("FONDO DE PENSIONES ELIMINADO");
								
											fondo_pensiones[i] = null;
										break;
										}
									}while(opc1!=3);
									
								}
							}
							
							for(i=0; i<=f_p_f.numfpf; i++) {
								if(fondo_plazo_fijo[i].num_obj.equals(n_obj)) {
									System.out.println("-----------------");
									System.out.println("FONDO A PLAZO FIJO ENCONTRADO");
									System.out.println("-----------------");
									System.out.println();
									System.out.println("Nombre: "+ fondo_plazo_fijo[i].nombre);
									System.out.println("Apellido 1: "+ fondo_plazo_fijo[i].apellido1);
									System.out.println("Apellido 2: "+ fondo_plazo_fijo[i].apellido2);
									System.out.println("Número de cuenta: " + fondo_plazo_fijo[i].num_obj);
									System.out.println("DNI: "+ fondo_plazo_fijo[i].DNI);
									System.out.println("Dirección: "+ fondo_plazo_fijo[i].direccion);
									System.out.println("Saldo: "+ fondo_plazo_fijo[i].saldo + euros);
									System.out.println();
									do {
										try {
											System.out.println("--------------------");
											System.out.println("1.- MODIFICAR CUENTA");
											System.out.println("2.- BORRAR CUENTA");
											System.out.println("3.- VOLVER");
											System.out.println();
											System.out.println("Introduzca una opción de menú: ");
											opc1 = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											opc1 = 4;
										}
										
										switch(opc1) {
										
										case 1:
											do {
												System.out.println("---------");
												System.out.println("MODIFICAR");
												System.out.println("---------");
												System.out.println("0.-SALIR");
												System.out.println("1.-Nombre");
												System.out.println("2.-Apellido 1");
												System.out.println("3.-Apellido 2");
												System.out.println("4.-Número de dni");
												System.out.println("5.-Letra de dni");
												System.out.println("6.-Calle");
												System.out.println("7.-Número de su calle");
												System.out.println("8.-Saldo");
												try {
													opc2 = t.nextInt();
												}
												catch(Exception e) {
													t.next();
													
												}
												switch(opc2) {
												
												case 1: //NOMBRE
													do {
														try {
															System.out.print("Nombre: ");
															nomb = t.next();
														}
														catch(Exception e) {
															nomb = "a";
														}
														nomb = nomb.toUpperCase();
													}while ((nomb.length() < 2) || (nomb.length() > 15) || (nomb.matches(".*[^A-Z].*")));
												break;
												
												case 2: //APELLIDO 1
													do {
														try {
															System.out.print("Apellido 1: ");
															ap1 = t.next();
														}
														catch(Exception e) {
															ap1 = "a";
														}
														ap1 = ap1.toUpperCase();
													}while ((ap1.length() < 3) || (ap1.length() > 15) || (ap1.matches(".*[^A-Z].*")));
												break;
												
												case 3: //APELLIDO 2
													do {
														try {
															System.out.print("Apellido 2: ");
															ap2 = t.next();
														}
														catch(Exception e) {
															ap2 = "a";
														}
														ap2 = ap2.toUpperCase();
													}while ((ap2.length() < 3) || (ap2.length() > 15) || (ap2.matches(".*[^A-Z].*")));
												break;
												
												case 4: //NUMERO DE DNI
													do {
														try {
															System.out.print("Introduzca el número de su dni: ");
															n_dni = t.nextInt();
														}
														catch(Exception e) {
															t.next();
															n_dni = 0;
														}
													}while((n_dni<10000000)||(n_dni>99999999));
												break;
												
												case 5: //LETRA DE DNI
													do {
														try {
															System.out.print("Introduzca la letra de su dni: ");
															letra_dni = t.next();
														}
														catch(Exception e) {
															letra_dni = "ab";
														}
														letra_dni = letra_dni.toUpperCase();
													} while ((letra_dni.length() < 1) || (letra_dni.length() > 1) || (letra_dni.matches(".*[^A-Z].*")));
													dni = n_dni + letra_dni;
												break;
												
												case 6: //CALLE
													do {
														try {
															System.out.print("Introduzca su calle: ");
															calle = t.nextLine();
														}
														catch(Exception e) {
															t.next();
														}
														calle = calle.toUpperCase();
													}while((calle.length() < 4) || (calle.length() > 50) || (calle.matches(".*[^A-Z- ].*")));
												break;
												
												case 7: //NUMERO DE SU CALLE
													do {
														try {
															System.out.print("Introduzca el número de su calle: ");
															n_calle = t.nextInt();
														}
														catch(Exception e) {
															t.next();
															n_calle = 0;
														}
													}while((n_calle<1)||(n_calle>100));
													dir = calle + espacio_coma + n_calle;
												break;
												
												case 8: //SALDO
													do {
														try {
															System.out.print("Introduzca el saldo de su cuenta: ");
															sald = t.nextLong();
														}
														catch(Exception e) {
															t.next();
															sald = -1;
														}
													}while(sald<0);
												break;
												
												default: 
													System.out.println("Opción incorrecta");
												break;
												}
												
											}while(opc2!=0);
											
											fondo_plazo_fijo[i] = new f_p_f(nomb, ap1, ap2, n_obj, dni, dir, sald);

										break;
										
										case 2: 
											
											System.out.println("FONDO A PLAZO FIJO ELIMINADO");
				
											fondo_plazo_fijo[i] = null;
										break;
										}
									}while(opc1!=3);
									
								}
							}
							
							do {
								try {
									System.out.println("¿DESEA SEGUIR BUSCANDO PRODUCTOS POR CÓDIGO?");
									System.out.println("0.- NO");
									System.out.println("1.- SI");
									
									opc = t.nextInt();
								}
								catch(Exception e) {
									t.next();
									opc = -1;
								}
							}while((opc<0)||(opc>1));
						
						}while(opc!=0);
					break;
					
					default: 
						System.out.println("Opción incorrecta");
					break;
					
					}
				}while(opc!=0);
				
			break;
			
			case 3://SALIR
				System.out.print("                               ");
				System.out.println("--------------------------------");
				System.out.print("                               ");
				System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
				System.out.print("                               ");
				System.out.println("  ESPERO QUE HAYAS APRENDIDO");
				System.out.print("                               ");
				System.out.println("--------------------------------");
			break;
			
			default:
				System.out.println("Opción incorrecta");
			break;
				
			}
		}while(opc!=3);
	}

}
