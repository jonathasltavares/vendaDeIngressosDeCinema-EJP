
public class Sessao{
	 String hora;
	 Double preco;
	 int disponiveis;

	
	public int getDisponiveis() {
		return disponiveis;
	}
	public void setDisponiveis(int disponiveis) {
		this.disponiveis = disponiveis;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public String toString(){
	    return "Hora: " + hora +  " Preço: " + preco;
	}
	
}
