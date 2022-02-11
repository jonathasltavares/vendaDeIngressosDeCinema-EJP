import java.util.Scanner;


public class Menus {
	Filme filmes[] = new Filme[5];
	Sessao sessoes[] = new Sessao[5];
	Carrinho carrinho = new Carrinho();
	Filme filme = new Filme();
	Scanner menu = new Scanner(System.in);
	int opcao;
	int controle;
	
	public void menuPrincipal() {
		
		System.out.print("**-- MENU PRINCIPAL --**\n");
		System.out.print("|----------------------------|\n");
		System.out.print("| 1 - Filmes em cartaz       |\n");
		System.out.print("| 2 - Sair                   |\n");
		System.out.print("|----------------------------|\n");
		System.out.print("Digite uma opção: \n");
		opcao = menu.nextInt();

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
			menuPrincipal();
		}
	}

	public void menuFilmesEmCartaz() {
		int i = 1;
		for(Filme fi:filmes) {
   		 System.out.println("- Filme "+i+" -\nTitulo: "+fi.getTitulo());
   		 System.out.println("Duração: "+fi.getDuracao() );
   		 System.out.println("--------------------------------");
   		 i++;
   	 }
		System.out.println("0 - Voltar \n");
		System.out.println("Escolha uma opção: \n");
		opcao = menu.nextInt();

		switch (opcao) {
		case 0:
			menuPrincipal();
			break;
		case 1:
			carrinho.setTitulo(filmes[0].getTitulo());
			carrinho.setDuracao(filmes[0].getDuracao());
			menuSessoes();
			break;
		case 2:
			carrinho.setTitulo(filmes[1].getTitulo());
			carrinho.setDuracao(filmes[1].getDuracao());
			menuSessoes();
			break;
		case 3:
			carrinho.setTitulo(filmes[2].getTitulo());
			carrinho.setDuracao(filmes[2].getDuracao());
			menuSessoes();
			break;
		case 4:
			carrinho.setTitulo(filmes[3].getTitulo());
			carrinho.setDuracao(filmes[3].getDuracao());
			menuSessoes();
			break;
		case 5:
			carrinho.setTitulo(filmes[4].getTitulo());
			carrinho.setDuracao(filmes[4].getDuracao());
			menuSessoes();
			break;
		default:
			System.out.println("Opção inválida.");
			menuPrincipal();
		}
	}

	public void menuSessoes() {
		int i = 1;
		for(Sessao se:sessoes) {
   		 System.out.println("- Sessão "+i+" - \nPreço: R$"+se.getPreco());
   		 System.out.println("Hora: "+se.getHora()+"\nIngressos dispovíveis: "+se.getDisponiveis());
   		 System.out.println("--------------------------------");
   		 i++;
   	 }
		System.out.println("0 - Voltar \n");
		System.out.println("Escolha uma opção: \n");
		opcao = menu.nextInt();
        
		switch (opcao) {
		case 0:
			menuFilmesEmCartaz();
			break;
		case 1:
			carrinho.setPreco(sessoes[0].getPreco());
			carrinho.setHora(sessoes[0].getHora());
			controle = 0;
			comprarIngresso();
			break;
		case 2:
			carrinho.setPreco(sessoes[1].getPreco());
			carrinho.setHora(sessoes[1].getHora());
			controle = 1;
			comprarIngresso();
			break;
			
		case 3:
			carrinho.setPreco(sessoes[2].getPreco());
			carrinho.setHora(sessoes[2].getHora());
			controle = 2;
			comprarIngresso();
			break;
		case 4:
			carrinho.setPreco(sessoes[3].getPreco());
			carrinho.setHora(sessoes[3].getHora());
			controle = 3;
			comprarIngresso();
			break;
		case 5:
			carrinho.setPreco(sessoes[4].getPreco());
			carrinho.setHora(sessoes[4].getHora());
			controle = 4;
			comprarIngresso();
			break;
		default:
			System.out.println("Opção inválida.");
			menuPrincipal();
		}
	}
	
	public void comprarIngresso() {
		System.out.println("- CARRINHO DE COMPRAS -");
		System.out.println("Filme: "+carrinho.getTitulo());
		System.out.println("Duração: "+carrinho.getDuracao());
		System.out.println("Preço do ingresso: R$"+String.format("%.2f", carrinho.getPreco()));
		System.out.println("Hora: "+carrinho.getHora());
		System.out.println("ESCOLHA A QUANTIDADE DE INGRESSOS: \n");
		opcao = menu.nextInt();
        carrinho.setQuantidade(opcao);
		carrinho.setTotal(carrinho.getPreco()*carrinho.getQuantidade());
		if(carrinho.getQuantidade() > sessoes[controle].getDisponiveis()){
			System.out.println("Quantidade de ingressos desejados maior do que os ingressos disponíveis."
					+ "\nTente Novamente");
			System.out.println("Digite 0 para voltar para as sessões: ");
			
		}else if(sessoes[controle].getDisponiveis() >= 0){
			sessoes[controle].setDisponiveis(sessoes[controle].getDisponiveis()-carrinho.getQuantidade());
			menuFinal();
		}
		opcao = menu.nextInt();
		
		switch(opcao) {
			case 0:
				menuSessoes();
				break;
				
			default:
				System.exit(0);
				break;
		}
		
	}
	public void menuFinal() {
		System.out.println("NOTA FISCAL: \n\nFilme: "+carrinho.getTitulo()+
				"\nHora: "+carrinho.getHora()+" horas"+
				"\nPreço do ingresso: R$"+String.format("%.2f", carrinho.getPreco())+" reais"+
				"\nQuantidade de ingressos: "+carrinho.getQuantidade()+
				"\nTotal: R$"+String.format("%.2f", carrinho.getTotal())+" reais\n"
						+"BOM FILME!\n\n\n\nDigite 0 para voltar para o menu inicial: ");
			opcao = menu.nextInt();
			
		switch(opcao) {
			case 0:
				menuPrincipal();
				break;
				
			default:
				System.exit(0);
				break;
		}
		
	}
	public void cadastrar() {
		filmes[0] = new Filme();
		filmes[0].titulo = "Homem-Aranha";
		filmes[0].duracao = "2:28 horas";
		
		filmes[1] = new Filme();
		filmes[1].titulo = "Matrix";
		filmes[1].duracao = "2:28 horas";
		
		filmes[2] = new Filme();
		filmes[2].titulo = "Turma da Monica: Laços";
		filmes[2].duracao = "1:37 horas";
		
		filmes[3] = new Filme();
		filmes[3].titulo = "Duna";
		filmes[3].duracao = "2:35 horas";
		
		filmes[4] = new Filme();
		filmes[4].titulo = "Eternos";
		filmes[4].duracao = "2:37 horas";
		
		
		sessoes[0] = new Sessao();
		sessoes[0].hora = "15:30";
		sessoes[0].preco = 25.0;
		sessoes[0].disponiveis = 35;
		
		sessoes[1] = new Sessao();
		sessoes[1].hora = "16:00";
		sessoes[1].preco = 23.0;
		sessoes[1].disponiveis = 57;
		
		sessoes[2] = new Sessao();
		sessoes[2].hora = "17:15";
		sessoes[2].preco = 20.0;
		sessoes[2].disponiveis = 43;
		
		sessoes[3] = new Sessao();
		sessoes[3].hora = "19:00";
		sessoes[3].preco = 25.0;
		sessoes[3].disponiveis = 25;
		
		sessoes[4] = new Sessao();
		sessoes[4].hora = "20:00";
		sessoes[4].preco = 29.0;
		sessoes[4].disponiveis = 49;
		
		}
}