
public class SessaoJediMain {
	public static void main(String args[]) {
		/*Scanner scan = new Scanner(System.in);
		
		String nome = scan.next();
		String especie = scan.next();
		int anoNascimento = scan.nextInt();
		String titulacao = scan.next();

		
		IniciadoJedi a1 = new IniciadoJedi(nome,especie,anoNascimento);
		System.out.println(a1.getDescricao());
		
		TreinadorJedi b1 = new TreinadorJedi(titulacao,nome);
		System.out.println(b1.getDescricao());
		System.out.println("Ponha o nome da titulacao do treinador");
		String titulacaoTreinadorSessao = scan.nextLine();
		
		System.out.println("Ponha o nome do treinador da sessao");
		String nomeTreinadorSessao = scan.nextLine();
		
		TreinadorJedi treinadorSessao = new TreinadorJedi(titulacaoTreinadorSessao,nomeTreinadorSessao);
		
		System.out.println("Ponha o nome da Sessao");
		String nomeSessao = scan.nextLine();
		
		SessaoJedi sessao = new SessaoJedi(nomeSessao, treinadorSessao);
		
		for(int i = 1; i <=3; i++) {
			System.out.println("Ponha o nome do iniciado");
			String nomeIniciado = scan.nextLine();
			System.out.println("Ponha a especie do iniciado");
			String especieIniciado = scan.nextLine();
			System.out.println("Ponha o ano de nascimento do iniciado");
            int anoNascimentoIniciado = scan.nextInt();
            
            IniciadoJedi iniciadosSessao = new IniciadoJedi(nomeIniciado, especieIniciado, anoNascimentoIniciado);	
            sessao.addIniciado(iniciadosSessao);
		}
		
		System.out.println(sessao.getDescricao());*/
		
		IniciadoJedi i1 = new IniciadoJedi("Ashla", "Togruta", -23);
		IniciadoJedi i2 = new IniciadoJedi("Jempa", "Whiphid", -22);
		IniciadoJedi i3 = new IniciadoJedi("Liam", "Human", -21);
		TreinadorJedi t1 = new TreinadorJedi("High Jedi General", "Mace Windu");
		SessaoJedi s1 = new SessaoJedi("Invisibilidade", t1);
		s1.addIniciado(i1);
		s1.addIniciado(i2);
		s1.addIniciado(i3);
		System.out.println(s1.getDescricao());

	}
}