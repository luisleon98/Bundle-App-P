/*
 * GeneralException.java
 * Propiedad del Centro Nacional de Cálculo del Instituto Politécnico Nacional
 * Todos los derechos reservados.
 */
package mx.ipn.cenac.dsi.bundles.puebla.exception;

/**
 * Excepción para errores generales
 * 
 * @author Miguel Angel Alejo Macias
 * @created 29 - Mar - 2016
 */
public class GeneralException extends Exception {

	private static final long serialVersionUID = 1L;

	public GeneralException() {
	}
	
	public GeneralException(String msg) {
		super(msg);
	}

	public GeneralException(String msg, Throwable exAnid) {
		super(msg, exAnid);
	}
}