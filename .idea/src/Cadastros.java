import java.util.ArrayList;
import java.util.List;
public class Cadastros {
	List<Filme> filmes=new ArrayList<>();
	List<Sessao> sessoes = new ArrayList<>();
	List<Carrinho> carrinho = new ArrayList<>();
	
	Filme filme = new Filme();
	public void cadastrarFilme1() {
		 filme.setTitulo("Homem-aranha");
		 filme.setDuracao("2:40 horas");
		 filmes.add(1,filme);
		 
		 filme.setTitulo("Matrix");
		 filme.setDuracao("2:30 horas");
		 filmes.add(2, filme);
		 
		 filme.setTitulo("Toy Story");
		 filme.setDuracao("2:10 horas");
		 filmes.add(3, filme);
	}
	
}
