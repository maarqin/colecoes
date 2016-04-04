
public class ListaEncadeada {

	private No lista;

	/**
	 * Inserir um {@link No} na lista em uma determinada posicao
	 * 
	 * @param valor
	 * @param pos
	 * @return
	 */
	public int inserir(Object valor, int pos) {

		No no = new No(valor);

		if( isEmpty() ){
			this.lista = no;
		} else {
			if( pos == 1 ){
				no.setProximo(this.lista);
				
				this.lista = no;
			} else {
				No aux = this.lista;
				int i = 1;
				while( aux.getProximo() != null ){
					if( ++i == pos ) break;

					aux = aux.getProximo();
				}
				no.setProximo(aux.getProximo());
				aux.setProximo(no);
			}
		}
		return pos;
	}

	/**
	 * Remover um {@link No} da lista de uma determinada posicao
	 * 
	 * @param pos
	 * @return
	 */
	public Object remover(int pos) {

		Object valor = null;
		
		if( pos == 1 ){
			valor = this.lista.getValor();
			
			this.lista = this.lista.getProximo();
		} else {
			No aux = this.lista;
			int i = 1;
			while( aux.getProximo() != null ){
				if( ++i == pos ) break;

				aux = aux.getProximo();
			}
			valor = aux.getProximo().getValor();
			aux.setProximo(aux.getProximo().getProximo());
		}
		return valor;
	}

	/**
	 * Verifica se a lista ja contem valores
	 * 
	 * @return
	 */
	private boolean isEmpty() {
		return ( this.lista == null ) ? true : false;
	}

}
