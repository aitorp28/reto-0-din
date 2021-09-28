package exception;
/**
 * Esta clase extiende de la clase Exception.
 * contiene metodos para las excepciones de creacion.
 * @author aitor
 */
public class CreateException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        
        /**
         * Este metodo controla las excepciones de creacion.
         * @param message recibe un mensaje
         */
	public CreateException(String message) {
		super(message);
	}

	
	
}
