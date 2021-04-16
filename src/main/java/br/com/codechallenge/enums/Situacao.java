package br.com.codechallenge.enums;

public enum Situacao {
	INATIVO(0),ATIVO(1);

	private int situacaoId;
	
	Situacao(int situacaoId){
		this.situacaoId = situacaoId;
	}
	
	public int getSituacaoId() {
		return situacaoId;
	}
	
}
