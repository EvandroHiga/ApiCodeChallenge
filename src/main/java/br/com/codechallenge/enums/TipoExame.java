package br.com.codechallenge.enums;

public enum TipoExame {
	ANALISE('A'), CLINICA('C'), IMAGEM('I');
	
	private char tipoExameId;

	TipoExame(char tipoExameId) {
		this.tipoExameId = tipoExameId;
	}

	public char getTipoExameId() {
		return tipoExameId;
	}
	
}
