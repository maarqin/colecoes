
public class No {

	private Object valor;
	private No proximo;
	
	public No(Object valor) {
		this.valor = valor;
		this.proximo = null;
	}
	
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}
