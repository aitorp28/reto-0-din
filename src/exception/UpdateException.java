package exception;

/**
 * Esta clase extiende de la clase Exception.
 * contiene metodos para las excepciones de actualizacion.
 * 
 * @author aitor
 */
public class UpdateException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        
        /**
         * 
         * Este metodo controla las excepciones de actualizacion.
         * @param message recibe un mensaje
         */
	public UpdateException(String message) {
		super(message);
	}

	
	
}
