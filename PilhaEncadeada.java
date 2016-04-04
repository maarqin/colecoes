
public class PilhaEncadeada {

	private No pilha;


	/**
	 * Empilhar objetos
	 * 
	 * @param objeto
	 */
	public void empilhar(Object objeto) {
		No no = new No(objeto);

		if( isEmpty() ){
			this.pilha = no;
		} else {
			No aux = this.pilha;
			while( aux.getProximo() != null ){
				aux = aux.getProximo();
			}
			aux.setProximo(no);
		}
	}

	/**
	 * Desempilhar objetos
	 * 
	 * @return
	 */
	public Object desempilhar() {
		
		Object valor = null;
		
		No aux = this.pilha;
		while( aux.getProximo().getProximo() != null ){
			aux = aux.getProximo();
		}
		valor = aux.getProximo().getValor();
		aux.setProximo(null);
		
		return valor;
	}

	/**
	 * Mostra o topo
	 * 
	 * @return
	 */
	public Object topo() {
		Object valor = null;

		No aux = this.pilha;
		while(aux.getProximo() != null){
			aux = aux.getProximo();
		}
		valor = aux.getValor();
		
		return valor;
	}

	/**
	 * Verifica se a lista ja contem valores
	 * 
	 * @return
	 */
	private boolean isEmpty() {
		return ( this.pilha == null ) ? true : false;
	}


}
