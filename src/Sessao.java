
public class Sessao{
	 String hora;
	 Double preco;
	

	
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
	    return "Hora: " + hora +  " Pre�o: " + preco;
	}
	
}
