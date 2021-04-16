package br.com.codechallenge.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.codechallenge.enums.Situacao;
import br.com.codechallenge.enums.TipoExame;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Exame {
	String nomeExame;
	TipoExame tipoExame;
	Situacao situacaoExame;
	
	// NoArg constructor
	public Exame() {}

	// AllArgs constructor
	public Exame(String nomeExame, TipoExame tipoExame, Situacao situacaoExame) {
		this.nomeExame = nomeExame;
		this.tipoExame = tipoExame;
		this.situacaoExame = situacaoExame;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public TipoExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TipoExame tipoExame) {
		this.tipoExame = tipoExame;
	}

	public Situacao getSituacaoExame() {
		return situacaoExame;
	}

	public void setSituacaoExame(Situacao situacaoExame) {
		this.situacaoExame = situacaoExame;
	}
	
}
