/**
 * 
 */
package dcc603.construtora;

/**
 * @author Eduardo
 *
 * Atencao! Esta classe eh um esqueleto. 
 * Voce pode (e deve) mudar e ampliar sua implementacao.
 *
 */
public class Projeto {
	
	public static final int ABERTO = 1;
	public static final int FECHADO = 2;
	
	protected int status = ABERTO;
	
	public boolean projetoFechadoCerto() {
		return (status == FECHADO);
	}

	public boolean projetoFechadoErrado() {
		return (status > 2);
	}

	public void fecharProjeto() {
		this.status = FECHADO;
	}
}
