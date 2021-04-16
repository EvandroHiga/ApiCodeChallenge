package br.com.codechallenge.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import br.com.codechallenge.enums.Situacao;
import br.com.codechallenge.enums.TipoExame;
import br.com.codechallenge.modelo.Exame;

@ManagedBean
public class ExameDao {
	List<Exame> exames_list = new ArrayList<Exame>();
	
	//NoArg constructor
	public ExameDao(){mock();}
	
	
	//TODO Mock apenas para teste...
	private void mock() {
		exames_list.add(new Exame("NOME_EXAME_01", TipoExame.ANALISE, Situacao.ATIVO));
		exames_list.add(new Exame("NOME_EXAME_02", TipoExame.CLINICA, Situacao.INATIVO));
		exames_list.add(new Exame("NOME_EXAME_03", TipoExame.IMAGEM, Situacao.ATIVO));
	}
	
	
	public List<Exame> getAllExamesDao(){
		return exames_list;
	}
	
	public Exame getExameByIdDao(int id) throws IndexOutOfBoundsException {
		return exames_list.get(id);
	}
}
