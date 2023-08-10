import java.util.*;

public class SessaoJedi {
	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados;
	
	public SessaoJedi(String nome, TreinadorJedi treinador){
		this.nome = nome;
		this.treinador = treinador;
		this.iniciados = new ArrayList<>();
	}
	
	public void addIniciado(IniciadoJedi iniciado) {
		if(getIniciado(iniciado.nome) == null) {
			iniciados.add(iniciado);
		}
	}
	
	public IniciadoJedi getIniciado(String nome) {
		for(IniciadoJedi iniciadoAtual: iniciados) {
			if(iniciadoAtual.nome.equals(nome)) {
				return iniciadoAtual;
			}
		}
		return null;
	}
	
	public double getMediaAnoNascimento() {
		int soma = 0;
		for(IniciadoJedi iniciadoAtual: iniciados) {
			soma += iniciadoAtual.anoNascimento;
		}
		double media = soma / iniciados.size() ;
		return media;		
	}
	
	public String getDescricao() {
		ArrayList<String> inis = new ArrayList<>();

		int ordem = 1;
		String tema = "--> SESSÃO " + nome + " (Treinador: " + treinador.getDescricao();
		for(IniciadoJedi iniciadoAtual: iniciados) {
			String i = "Iniciado " + ordem + ": " + iniciadoAtual.getDescricao();
			inis.add(i);
			ordem ++;
		}
		
		return tema + inis;
		
		
	}
	
	
	
	
}