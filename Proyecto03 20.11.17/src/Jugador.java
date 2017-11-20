
public class Jugador {

	/*Atributos de la CLASS Jugador*/
	
	private String nombre;
	private String apellidos;
	private String PrimerApellido;
	private String SegundoApellido;
	private int edad;
	private int puntuacionJugador;
	private int identificacionNumerica;
	
	
	/*constructor de la clase*/
	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	/* ahora vamos a poner los Getters y setter (coger y poner) son metodos para coger esta informacion y colocarla donde requiere*/
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * aqui cuando en la ventanaPrincipal solicitemos Nombre sacara el indicado  entre parentesis
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * aqui cuando en la ventanaPrincipal solicitemos Apellidos sacara el indicado (en este caso lo tenemos por separado como PrimerApellido y SegundoApellido
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	
	
	
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return PrimerApellido;
	}

	/**
	 * aqui cuando en la ventanaPrincipal solicitemos PrimerApellido sacara el indicado entre parentesis
	 */
	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return SegundoApellido;
	}

	/**
	 * aqui cuando en la ventanaPrincipal solicitemos SegundoApellido sacara el indicado entre parentesis
	 */
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * aqui cuando en la ventanaPrincipal solicitemos EDAD sacara el indicado entre parentesis pero va con int por ser un numero
	 */
	public void setEdad(int edad) {
		//aqui ponemos el condicionante para que la edad sea comprendida entre 18 años (mayoria de edad) y 99
		if(edad<18){
			this.edad=18;
		}else if(edad>99){
			this.edad=99;
		}else{	
			this.edad = edad;
		}
	}


	/**
	 * @return the puntuacionJugador
	 */
	public int getPuntuacionJugador() {
		return puntuacionJugador;
	}

 
	/**
	 * @param puntuacionJugador the puntuacionJugador to set
	 */
	public void setPuntuacionJugador(int puntuacionJugador) {
		this.puntuacionJugador = puntuacionJugador;
	}


	/**
	 * @return the identificacionNumerica
	 */
	public int getIdentificacionNumerica() {
		return identificacionNumerica;
	}


	/**
	 * @param identificacionNumerica the identificacionNumerica to set
	 */
	public void setIdentificacionNumerica(int identificacionNumerica) {
		this.identificacionNumerica = identificacionNumerica;
	}

	/*aqui podemos añadir metodos utiles*/
	
	/*METODO a tener encuenta comprobar la edad (si es un numero positivo o negativo), una edad comprendida entre la mayoria de edad (18 años) o una edad no superior a 100 años*/
	/*un metodo para ver si la edad es correcta seria: publico y con el comando boolean comprobar edad()
	 * si la edad es mayor o menor que una valor numerico 
	 * devuelve FALSO y sino devuelve VERDADERO
	 */
	
	/*otro METODO seria el que imprima todos los datos del jugador*/
	
	
	public String toString() {
		return this.nombre+" "+this.PrimerApellido+" "+this.SegundoApellido+" "+this.edad;
	}
	
}
