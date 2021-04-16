package br.com.codechallenge.service;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import br.com.codechallenge.dao.ExameDao;
import br.com.codechallenge.modelo.Exame;

@ManagedBean
public class ExameService {
	
	@Inject
	private ExameDao exameDao;
	
	public List<Exame> getAllExamesSvc(){
		return exameDao.getAllExamesDao();
	}
	
	public Exame getExameByIdSvc(int id) throws IndexOutOfBoundsException {
		return exameDao.getExameByIdDao(id);
	}
}
