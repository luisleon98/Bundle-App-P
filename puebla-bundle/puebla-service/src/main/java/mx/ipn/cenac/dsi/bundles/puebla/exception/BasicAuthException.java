package mx.ipn.cenac.dsi.bundles.puebla.exception;

/**
 * Excepción para errores generales
 * 
 * @author @frramirezl
 */
public class BasicAuthException extends Exception {

	public BasicAuthException() {
	}

	public BasicAuthException(String msg) {
		super(msg);
	}

	public BasicAuthException(String msg, Throwable exAnid) {
		super(msg, exAnid);
	}
}