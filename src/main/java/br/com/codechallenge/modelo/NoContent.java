package br.com.codechallenge.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.codechallenge.util.Messages;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NoContent {
	private String noContent;
	
	//NoArg constructor
	public NoContent(){
		setMsgResponse();
	}
	
	private void setMsgResponse() {
		this.noContent = Messages.NO_CONTENT;
	}

	public String getNoContent() {
		return noContent;
	}
	
}
