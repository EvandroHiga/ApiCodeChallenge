package br.com.codechallenge.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.codechallenge.modelo.Exame;
import br.com.codechallenge.service.ExameService;

@Path("exame")
public class ExameResource {
	
	@Inject
	private ExameService exameSvc;
	
	@Path("/busca/todos")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Exame> getAllExames(){
		return exameSvc.getAllExamesSvc();
	}
	
	@Path("/busca/{id}") //TODO tratar o 'IndexOutOfBoundException'
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Exame getExameById(@PathParam("id") int id) {
		return exameSvc.getExameByIdSvc(id);
	}
}
