/*
 * GeneralExceptionLog.java
 * Propiedad del Centro Nacional de Cálculo del Instituto Politécnico Nacional
 * Todos los derechos reservados.
 */
package mx.ipn.cenac.dsi.bundles.puebla.exception;

/**
 * Excepción para errores generales que incluyan logger
 * 
 * @author Liliana Salazar
 */
public class GeneralExceptionLog extends Exception {

	private static final long serialVersionUID = 1L;

	public GeneralExceptionLog() {
	}
	
	public GeneralExceptionLog(String msg) {
		super(msg);
	}

	public GeneralExceptionLog(String msg, Throwable exAnid) {
		super(msg, exAnid);
	}
}