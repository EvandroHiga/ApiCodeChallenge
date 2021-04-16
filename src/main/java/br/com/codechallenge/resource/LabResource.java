package br.com.codechallenge.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.codechallenge.service.LabService;



/****************************************************************************************************************
// ENUM
// https://www.devmedia.com.br/tipos-enum-no-java/25729#:~:text=valueOf%20(String%20nome)%20%E2%80%93%20retorna,ordem%20do%20objeto%20na%20enumera%C3%A7%C3%A3o.

// Lombok :: Boilerplate code

// Swagger :: Documentacao

// Bean Validation 2.0
   https://docs.oracle.com/javaee/6/tutorial/doc/gircz.html
   https://www.baeldung.com/javax-validation
****************************************************************************************************************/



@Path("lab")
public class LabResource {
	
	@Inject private LabService labSvc;
	
	@Path("/busca/todos")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getAllLabs(){
		return labSvc.getAllLabsSvc();
	}
	
	@Path("/busca/todosAtivos")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getAllLabsAtivos() {
		return labSvc.getAllLabsAtivosSvc();
	}
	
	@Path("/busca/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getLabById(@PathParam("id") int id) {
		return labSvc.getLabByIdSvc(id);
	}
	
	@Path("/cadastra")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response cadastrarNovoLab(String laboratorioXml) {
		//TODO
//		return labSvc.cadastrarNovoLabSvc(laboratorioXml);
		this.labSvc.cadastrarNovoLabSvc(laboratorioXml);
		return this.getAllLabs();
	}
	
}