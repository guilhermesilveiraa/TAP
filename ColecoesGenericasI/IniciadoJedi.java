import java.lang.Math;

public class IniciadoJedi {
	String nome, especie;
	int anoNascimento;
	
	IniciadoJedi(){
		nome = null;
		especie = null;
		anoNascimento = 0;
	}
	IniciadoJedi(String nome, String especie, int anoNascimento){
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}
	String getAnoNascimento() {
		if(anoNascimento >= 0) {
			return ", nascimento=" + anoNascimento + " DBY)";
		}
		else {
			return ", nascimento=" + Math.abs(anoNascimento) + " ABY)";
		}
	}
	String getDescricao() {
		return nome + " (especie=" + especie + getAnoNascimento();  
	}
	
}