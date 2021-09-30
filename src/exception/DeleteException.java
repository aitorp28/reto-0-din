package exception;

/**
 * Esta clase extiende de la clase Exception.
 * contiene metodos para las excepciones de borrado.
 * @author aitor perez
 */
public class DeleteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        
        /**
         * 
         * Este metodo controla las excepciones de borrado.
         * @param message recibe un mensaje
         */
	public DeleteException(String message) {
		super(message);
	}

	
	
}
