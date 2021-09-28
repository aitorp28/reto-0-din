package exception;
/**
 * Esta clase extiende de la clase Exception.
 * contiene metodos para las excepciones de lectura.
 * @author aitor
 */
public class ReadException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        /**
         * Este metodo controla las excepciones de lectura.
         * @param message recibe un mensaje
         */
	public ReadException(String message) {
		super(message);
	}

	
	
}
