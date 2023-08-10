
public class TreinadorJedi {
	String titulacao,nome;
	
	TreinadorJedi(){
		titulacao = null;
		nome = null;
	}
	TreinadorJedi(String titulacao, String nome){
		this.titulacao = titulacao;
		this.nome = nome;
	}
	String getDescricao() {
		return titulacao + " " +  nome + ")";
	}
}