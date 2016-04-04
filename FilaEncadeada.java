
public class FilaEncadeada {

	private No fila;
	

	/**
	 * Insere um {@link No} a fila
	 * 
	 * @param objeto
	 */
	public void enfileirar(Object objeto) {

		No no = new No(objeto);

		if( isEmpty() ){
			this.fila = no;
		} else {
			No aux = this.fila;
			while( aux.getProximo() != null ){
				aux = aux.getProximo();
			}
			aux.setProximo(no);
		}
	}

	/**
	 * Remove um elemento da fila
	 * 
	 * @return
	 */
	public Object desenfileirar() {
		
		Object valor = this.fila.getValor();
		this.fila = this.fila.getProximo();
		
		return valor;
	}
	
	/**
	 * Retorna sempre o primeiro valor da fila
	 * 
	 * @return
	 */
	public Object primeiro() {
		return this.fila.getValor();
	}

	/**
	 * Verifica se a lista ja contem valores
	 * 
	 * @return
	 */
	private boolean isEmpty() {
		return ( this.fila == null ) ? true : false;
	}


}
