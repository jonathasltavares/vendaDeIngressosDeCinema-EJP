import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Menus {
	Carrinho carrinho = new Carrinho();
	Filme filme = new Filme();
	Sessao sessao  = new Sessao();
	Scanner menu = new Scanner(System.in);

	public void menuPrincipal() {
		
		String resposta = JOptionPane.showInputDialog(
				"CINEMA EJP\n"
				+ "\nESCOLHA UMA OPÇÃO:"
				+ "\n 1 - Filmes em cartaz "
				+ "\n3 - Sair ");
        int opcao = Integer.parseInt(resposta);

		switch (opcao) {
		case 1:
			menuFilmesEmCartaz();
			break;
		case 2:
			System.out.println("\nAté logo e obrigado pela preferência!");
			menu.close();
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}

	public void menuFilmesEmCartaz() {
		String resposta = JOptionPane.showInputDialog(
				"CINEMA EJP\n"
				+ "\nFILMES EM CARTAZ"
				+ "\n 1 - Homem Aranha "
				+ "\n 2 - Matrix "
				+ "\n3 - Sair ");
        int opcao = Integer.parseInt(resposta);

		switch (opcao) {
		case 1:
			filme.setTitulo("HOMEM-ARANHA");
			sessoesFilme1();
			break;
		case 2:
			filme.setTitulo("MATRIX");
			sessoesFilme2();
			break;
		case 3:
			System.out.println("\nAté logo e obrigado pela preferência!");
			menuPrincipal();
			menu.close();
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}

	public void sessoesFilme1() {
		String resposta = JOptionPane.showInputDialog(
				"CINEMA EJP\n"
				+ "\nSESSÕES DISPONIVEIS DE "+filme.getTitulo()
				+ "\n\n 1 - Sessão 1 (11:40h) R$ 21 "
				+ "\n 2 - Sessão 2 (15:30h) R$ 21 "
				+ "\n 3 - Sessão 3 (19h) R$ 20\n "
				+ "\n4 - Sair");
        int opcao = Integer.parseInt(resposta);
		
		switch (opcao) {
		case 1:
			carrinho.setTitulo(filme.getTitulo());
			sessao.setHora("11:40");
			sessao.setPreco(21.0);
			comprarIngresso();
			break;
		case 2:
			carrinho.setTitulo(filme.getTitulo());
			sessao.setHora("15:30");
			sessao.setPreco(21.0);
			comprarIngresso();
			break;
		case 3:
			carrinho.setTitulo(filme.getTitulo());
			sessao.setHora("19");
			sessao.setPreco(20.0);
			comprarIngresso();
			break;
		case 4:
			System.out.println("\nAté logo e obrigado pela preferência!");
			menuPrincipal();
			menu.close();
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}
	public void sessoesFilme2() {
		String resposta = JOptionPane.showInputDialog(
				"CINEMA EJP\n"
				+ "\nSESSÕES DISPONIVEIS DE "+filme.getTitulo()
				+ "\n\n 1 - Sessão 1 (12:50h) R$ 19 "
				+ "\n 2 - Sessão 2 (22:30h) R$ 21 "
				+ "\n 3 - Sessão 3 (15h) R$ 16\n "
				+ "\n 4 - Sair");
        int opcao = Integer.parseInt(resposta);
		
		switch (opcao) {
		case 1:
			carrinho.setTitulo(filme.getTitulo());
			sessao.setHora("12:50");
			sessao.setPreco(19.0);
			comprarIngresso();
			break;
		case 2:
			carrinho.setTitulo(filme.getTitulo());
			sessao.setHora("22:30");
			sessao.setPreco(21.0);
			comprarIngresso();
			break;
		case 3:
			carrinho.setTitulo(filme.getTitulo());
			sessao.setHora("15");
			sessao.setPreco(16.0);
			comprarIngresso();
			break;
		case 4:
			System.out.println("\nAté logo e obrigado pela preferência!");
			menuPrincipal();
			menu.close();
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}
	
	public void comprarIngresso() {
		carrinho.setTitulo(filme.getTitulo());
		carrinho.setHora(sessao.getHora());
		carrinho.setPreco(sessao.getPreco());
	
		String resposta = JOptionPane.showInputDialog(
				"CINEMA EJP\n"
				+ "\nCARRINHO DE COMPRAS"
				+ "\n Filme: "+carrinho.getTitulo()
				+ "\n Hora: "+carrinho.getHora()+" horas"
				+ "\nPreço: R$"+String.format("%.2f", carrinho.getPreco())+" reais\n"
				+ "\nInforme a quantidade de ingressos desejada: ");
        carrinho.setQuantidade(Integer.parseInt(resposta));
		carrinho.setTotal(carrinho.getPreco()*carrinho.getQuantidade());
		menuFinal();
	}
	public void menuFinal() {
		JOptionPane.showMessageDialog(null,"NOTA FISCAL: \n\nFilme: "+carrinho.getTitulo()+
				"\nHora: "+carrinho.getHora()+" horas"+
				"\nPreço do ingresso: R$"+String.format("%.2f", carrinho.getPreco())+" reais"+
				"\nQuantidade de ingressos: "+carrinho.getQuantidade()+
				"\nTotal: R$"+String.format("%.2f", carrinho.getTotal())+" reais\n"
						+ "BOM FILME!");
				System.exit(0);
		
	}

}