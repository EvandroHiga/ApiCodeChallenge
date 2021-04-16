package br.com.codechallenge.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import br.com.codechallenge.enums.Situacao;
import br.com.codechallenge.modelo.Laboratorio;

@Named
@Singleton
public class LabDao {
	private List<Laboratorio> labs_list = new ArrayList<Laboratorio>();
	
	// NoArg constructor
	public LabDao(){
		
		System.out.println("\n\n" +"Chamando o const. LabDAO()"+ "\n\n");
		mockList();
	}
	
	//
	// TODO: MOCK BANCO > apenas para teste...
	//
	private void mockList() {
		labs_list.add(new Laboratorio("Fleury","Av. Paulista", Situacao.ATIVO));
		labs_list.add(new Laboratorio("Delboni","Av. Paes de Barros", Situacao.INATIVO));
		labs_list.add(new Laboratorio("A+","Av. Paulista", Situacao.INATIVO));
		labs_list.add(new Laboratorio("Lavosier","Av. Paes de Barros", Situacao.ATIVO));
	}
	
	public List<Laboratorio> getAllLabsDao() {
		return labs_list;
	}
	
	public Laboratorio getLabByIdDao(int id) throws IndexOutOfBoundsException {
		return labs_list.get(id);
	}
	
	public int cadastrarNovoLabDao(Laboratorio lab) {
		this.labs_list.add(lab);
		return labs_list.size() - 1;
	}
	
}
