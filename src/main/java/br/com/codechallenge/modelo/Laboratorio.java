package br.com.codechallenge.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.codechallenge.enums.Situacao;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Laboratorio {
	String nomeLab;
	String enderecoLab;
	Situacao situacaoLab;
	
	// NoArg constructor
	public Laboratorio() {}

	// AllArgs constructor
	public Laboratorio(String nomeLab, String enderecoLab, Situacao situacaoLab) {
		this.nomeLab = nomeLab;
		this.enderecoLab = enderecoLab;
		this.situacaoLab = situacaoLab;
	}

	public String getNomeLab() {
		return nomeLab;
	}

	public void setNomeLab(String nomeLab) {
		this.nomeLab = nomeLab;
	}

	public String getEnderecoLab() {
		return enderecoLab;
	}

	public void setEnderecoLab(String enderecoLab) {
		this.enderecoLab = enderecoLab;
	}

	public Situacao getSituacaoLab() {
		return situacaoLab;
	}

	public void setSituacaoLab(Situacao situacaoLab) {
		this.situacaoLab = situacaoLab;
	}	
	
}
