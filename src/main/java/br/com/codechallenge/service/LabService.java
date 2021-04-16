package br.com.codechallenge.service;

import java.io.StringReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.codechallenge.dao.LabDao;
import br.com.codechallenge.enums.Situacao;
import br.com.codechallenge.modelo.Laboratorio;
import br.com.codechallenge.modelo.NoContent;

//TODO
@Named
@Singleton
public class LabService {
	
	@Inject private LabDao labDao;
	
	//NoArg constructor
	public LabService(){}
	
	/**
	 * 
	 */
	public Response getAllLabsSvc() {
		List<Laboratorio> labs = labDao.getAllLabsDao();
		GenericEntity<List<Laboratorio>> labsEntity = new GenericEntity<List<Laboratorio>>(labs) {};
		return Response.status(Status.OK).entity(labsEntity).build();
	}
	
	/**
	 * 
	 */
	public Response getAllLabsAtivosSvc() {
		List<Laboratorio> allLabs = labDao.getAllLabsDao();
		List<Laboratorio> allLabsAtivos = new ArrayList<Laboratorio>();
		
		for(Laboratorio lab : allLabs) {
			if(Situacao.ATIVO == lab.getSituacaoLab()) {
				allLabsAtivos.add(lab);
			}
		}
		
		GenericEntity<List<Laboratorio>> AllLabsAtivosEntity = new GenericEntity<List<Laboratorio>>(allLabsAtivos) {};
		return Response.ok().entity(AllLabsAtivosEntity).build();
	}
	
	/**
	 * 
	 */
	public Response getLabByIdSvc(int id) {
		try {
			Laboratorio laboratorio = labDao.getLabByIdDao(id);
			return Response.status(Status.OK).entity(laboratorio).build();
		} catch (IndexOutOfBoundsException exception) {
			return Response.status(Status.NOT_FOUND).entity(new NoContent()).build();
		}
	}
	
	/**
	 * 
	 */
	public Response cadastrarNovoLabSvc(String laboratorioXml) {
		int indexNovoLab = 0;
		
		try {
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(Laboratorio.class);
			
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Laboratorio lab = (Laboratorio) unmarshaller.unmarshal(new StringReader(laboratorioXml));
			
			indexNovoLab = labDao.cadastrarNovoLabDao(lab);
		} catch (JAXBException e) {
			//TODO tratar excecao
		}
		
		return Response.created(URI.create("lab/busca/" + String.valueOf(indexNovoLab))).build();
	}


}
