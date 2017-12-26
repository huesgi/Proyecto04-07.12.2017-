package Juego;
//package juego;

public class Jugador {
	private String nombre;
	private String apellidos;
	private String apellidos1;
	private String apellidos2;
	private int edad;
	private int puntos;
	private int id;
	
	// en referente al nombre
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// en referente al apellido
	
	public String getApellidos() {
		return apellidos;
	}
	
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	// en referente al apellido1
		
	public String getApellidos1() {
		return apellidos1;
	}
	
	public void setApellidos1(String apellidos1) {
		this.apellidos1 = apellidos1;
	}

	// en referente al apellido2
	
	public String getApellidos2() {
		return apellidos2;
	}
	

	public void setApellidos2(String apellidos2) {
		this.apellidos2 = apellidos2;
	}
	
	// en referente a la edad
	
	public int getEdad() {
		return edad;
	}
	
	 
	 
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// en referente a los puntos obtenidos
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	// en referente al identificador del jugador
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	

	public Jugador() {
		
	}

	
	// con esta comparativa comprobamos si es numerico una cadena de texto. 
	//Es la deficion del metodo
	// metodo (definido por nosotros) como "inNumeric"  
	public static boolean isNumeric(String cadena) {
		try {											//try es un "intenta hacer esto"
			Integer.parseInt(cadena);					//coge una cadena de texto e intenta convertira la un numero ENTERO (sin decimales)
			return true;								//comprobamos si es correcto
		} catch (NumberFormatException nfe) {			//sino lo es interceptarlo y hace una excepcion
			return false;
			
		}
	}
	
	
	public boolean sonEspacios(String cad)
	{
	for (int i =0; i<cad.length(); i++) {
	if(cad.charAt(i) != ' ')
		
	return false;
	}
	
	return true;
	}
	
	public String toString() {
		return this.nombre+" "+this.apellidos1+" "+this.apellidos2+" de "+this.edad+" años";
	}
	
	
	
	// le estamos enseñando a la clase JUGADOR como comprobar si la edad es valida
	// Creamos un metodo BOOLEAN indicando el metodo (definido por nosotros) como "isValidEdad" indicando que es un Int llamado "numero"
	public static boolean isValidEdad(int numero) {
		
		if (numero >18 && numero <99) {					//con el concepto "numero" le indicamos que si "numero" es mayor que 18 y menor que 99
		return true;									//nos devuelva como VERDADERO
		}
		else {											//pero por lo contrario automaticamente si no son estas normas
		return false;									//nos devuelva como INCORRECTO
		}
		
		
		
		
		
		
	}
	
	
	
	



}
