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

	
	public boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
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
	
	
	
	
	
	
	



}
