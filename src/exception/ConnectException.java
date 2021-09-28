package exception;
/**
 * Esta clase extiende de la clase Exception.
 * contiene metodos para las excepciones de conexion.
 * @author aitor
 */
public class ConnectException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        
        /**
         * Este metodo controla las excepciones de conexion.
         * @param message recibe un mensaje
         */
	public ConnectException(String message) {
		super(message);
	}
	
}
