import java.util.Scanner;


public class Menus {
	Filme filmes[] = new Filme[5];
	Sessao sessoes[] = new Sessao[25];
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
			menuSessoes1();
			break;
		case 2:
			carrinho.setTitulo(filmes[1].getTitulo());
			carrinho.setDuracao(filmes[1].getDuracao());
			menuSessoes2();
			break;
		case 3:
			carrinho.setTitulo(filmes[2].getTitulo());
			carrinho.setDuracao(filmes[2].getDuracao());
			menuSessoes3();
			break;
		case 4:
			carrinho.setTitulo(filmes[3].getTitulo());
			carrinho.setDuracao(filmes[3].getDuracao());
			menuSessoes4();
			break;
		case 5:
			carrinho.setTitulo(filmes[4].getTitulo());
			carrinho.setDuracao(filmes[4].getDuracao());
			menuSessoes5();
			break;
		default:
			System.out.println("Opção inválida.");
			menuPrincipal();
		}
	}

	public void menuSessoes1() {
		int i = 1;
		for (int j = 0; j < 5; j++) {
   		 System.out.println("- Sessão "+i+" de "+filmes[0].getTitulo()+" - \nPreço: R$"+sessoes[j].getPreco());
   		 System.out.println("Hora: "+sessoes[j].getHora()+"\nIngressos dispovíveis: "+sessoes[j].getDisponiveis());
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
	
	public void menuSessoes2() {
		int i = 1;
		for (int j = 5; j < 10; j++) {
			System.out.println("- Sessão "+i+" de "+filmes[1].getTitulo()+" - \nPreço: R$"+sessoes[j].getPreco());
	   		 System.out.println("Hora: "+sessoes[j].getHora()+"\nIngressos dispovíveis: "+sessoes[j].getDisponiveis());
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
			controle = 5;
			comprarIngresso();
			break;
		case 2:
			carrinho.setPreco(sessoes[1].getPreco());
			carrinho.setHora(sessoes[1].getHora());
			controle = 6;
			comprarIngresso();
			break;
			
		case 3:
			carrinho.setPreco(sessoes[2].getPreco());
			carrinho.setHora(sessoes[2].getHora());
			controle = 7;
			comprarIngresso();
			break;
		case 4:
			carrinho.setPreco(sessoes[3].getPreco());
			carrinho.setHora(sessoes[3].getHora());
			controle = 8;
			comprarIngresso();
			break;
		case 5:
			carrinho.setPreco(sessoes[4].getPreco());
			carrinho.setHora(sessoes[4].getHora());
			controle = 9;
			comprarIngresso();
			break;
		default:
			System.out.println("Opção inválida.");
			menuPrincipal();
		}
	}
	public void menuSessoes3() {
		int i = 1;
		for (int j = 10; j < 15; j++) {
			System.out.println("- Sessão "+i+" de "+filmes[2].getTitulo()+" - \nPreço: R$"+sessoes[j].getPreco());
	   		 System.out.println("Hora: "+sessoes[j].getHora()+"\nIngressos dispovíveis: "+sessoes[j].getDisponiveis());
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
			controle = 10;
			comprarIngresso();
			break;
		case 2:
			carrinho.setPreco(sessoes[1].getPreco());
			carrinho.setHora(sessoes[1].getHora());
			controle = 11;
			comprarIngresso();
			break;
			
		case 3:
			carrinho.setPreco(sessoes[2].getPreco());
			carrinho.setHora(sessoes[2].getHora());
			controle = 12;
			comprarIngresso();
			break;
		case 4:
			carrinho.setPreco(sessoes[3].getPreco());
			carrinho.setHora(sessoes[3].getHora());
			controle = 13;
			comprarIngresso();
			break;
		case 5:
			carrinho.setPreco(sessoes[4].getPreco());
			carrinho.setHora(sessoes[4].getHora());
			controle = 14;
			comprarIngresso();
			break;
		default:
			System.out.println("Opção inválida.");
			menuPrincipal();
		}
	}
	
	public void menuSessoes4() {
		int i = 1;
		for (int j = 15; j < 20; j++) {
			System.out.println("- Sessão "+i+" de "+filmes[3].getTitulo()+" - \nPreço: R$"+sessoes[j].getPreco());
	   		 System.out.println("Hora: "+sessoes[j].getHora()+"\nIngressos dispovíveis: "+sessoes[j].getDisponiveis());
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
			controle = 15;
			comprarIngresso();
			break;
		case 2:
			carrinho.setPreco(sessoes[1].getPreco());
			carrinho.setHora(sessoes[1].getHora());
			controle = 16;
			comprarIngresso();
			break;
			
		case 3:
			carrinho.setPreco(sessoes[2].getPreco());
			carrinho.setHora(sessoes[2].getHora());
			controle = 17;
			comprarIngresso();
			break;
		case 4:
			carrinho.setPreco(sessoes[3].getPreco());
			carrinho.setHora(sessoes[3].getHora());
			controle = 18;
			comprarIngresso();
			break;
		case 5:
			carrinho.setPreco(sessoes[4].getPreco());
			carrinho.setHora(sessoes[4].getHora());
			controle = 19;
			comprarIngresso();
			break;
		default:
			System.out.println("Opção inválida.");
			menuPrincipal();
		}
	}
	public void menuSessoes5() {
		int i = 1;
		for (int j = 20; j < 25; j++) {
			System.out.println("- Sessão "+i+" de "+filmes[4].getTitulo()+" - \nPreço: R$"+sessoes[j].getPreco());
	   		 System.out.println("Hora: "+sessoes[j].getHora()+"\nIngressos dispovíveis: "+sessoes[j].getDisponiveis());
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
			controle = 20;
			comprarIngresso();
			break;
		case 2:
			carrinho.setPreco(sessoes[1].getPreco());
			carrinho.setHora(sessoes[1].getHora());
			controle = 21;
			comprarIngresso();
			break;
			
		case 3:
			carrinho.setPreco(sessoes[2].getPreco());
			carrinho.setHora(sessoes[2].getHora());
			controle = 22;
			comprarIngresso();
			break;
		case 4:
			carrinho.setPreco(sessoes[3].getPreco());
			carrinho.setHora(sessoes[3].getHora());
			controle = 23;
			comprarIngresso();
			break;
		case 5:
			carrinho.setPreco(sessoes[4].getPreco());
			carrinho.setHora(sessoes[4].getHora());
			controle = 24;
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
				menuFilmesEmCartaz();
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
		
		//sessoes homem aranha
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
		
		//sessoes matrix
		sessoes[5] = new Sessao();
		sessoes[5].hora = "13:15";
		sessoes[5].preco = 20.0;
		sessoes[5].disponiveis = 20;
		
		sessoes[6] = new Sessao();
		sessoes[6].hora = "14:30";
		sessoes[6].preco = 18.0;
		sessoes[6].disponiveis = 60;
		
		sessoes[7] = new Sessao();
		sessoes[7].hora = "20:52";
		sessoes[7].preco = 22.0;
		sessoes[7].disponiveis = 54;
		
		sessoes[8] = new Sessao();
		sessoes[8].hora = "22:00";
		sessoes[8].preco = 24.0;
		sessoes[8].disponiveis = 23;
		
		sessoes[9] = new Sessao();
		sessoes[9].hora = "13:50";
		sessoes[9].preco = 17.0;
		sessoes[9].disponiveis = 55;
		
		//sessoes turma da monica
		sessoes[10] = new Sessao();
		sessoes[10].hora = "12:30";
		sessoes[10].preco = 15.0;
		sessoes[10].disponiveis = 23;
		
		sessoes[11] = new Sessao();
		sessoes[11].hora = "15:30";
		sessoes[11].preco = 18.0;
		sessoes[11].disponiveis = 32;
		
		sessoes[12] = new Sessao();
		sessoes[12].hora = "16:00";
		sessoes[12].preco = 19.0;
		sessoes[12].disponiveis = 45;
		
		sessoes[13] = new Sessao();
		sessoes[13].hora = "17:30";
		sessoes[13].preco = 20.0;
		sessoes[13].disponiveis = 32;
		
		sessoes[14] = new Sessao();
		sessoes[14].hora = "16:30";
		sessoes[14].preco = 25.0;
		sessoes[14].disponiveis = 54;
		
		//sessoes duna
		sessoes[15] = new Sessao();
		sessoes[15].hora = "12:35";
		sessoes[15].preco = 17.0;
		sessoes[15].disponiveis = 28;
		
		sessoes[16] = new Sessao();
		sessoes[16].hora = "15:50";
		sessoes[16].preco = 18.0;
		sessoes[16].disponiveis = 36;
		
		sessoes[17] = new Sessao();
		sessoes[17].hora = "16:30";
		sessoes[17].preco = 17.0;
		sessoes[17].disponiveis = 50;
		
		sessoes[18] = new Sessao();
		sessoes[18].hora = "14:30";
		sessoes[18].preco = 18.0;
		sessoes[18].disponiveis = 29;
		
		sessoes[19] = new Sessao();
		sessoes[19].hora = "19:30";
		sessoes[19].preco = 25.0;
		sessoes[19].disponiveis = 23;
		
		//sessoes eternos
		sessoes[20] = new Sessao();
		sessoes[20].hora = "13:35";
		sessoes[20].preco = 15.0;
		sessoes[20].disponiveis = 24;
		
		sessoes[21] = new Sessao();
		sessoes[21].hora = "14:50";
		sessoes[21].preco = 19.0;
		sessoes[21].disponiveis = 57;
		
		sessoes[22] = new Sessao();
		sessoes[22].hora = "16:35";
		sessoes[22].preco = 22.0;
		sessoes[22].disponiveis = 54;
		
		sessoes[23] = new Sessao();
		sessoes[23].hora = "14:50";
		sessoes[23].preco = 18.0;
		sessoes[23].disponiveis = 43;
		
		sessoes[24] = new Sessao();
		sessoes[24].hora = "19:50";
		sessoes[24].preco = 23.0;
		sessoes[24].disponiveis = 23;
		
		}
}