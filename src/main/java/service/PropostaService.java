package service;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import dao.FactoryDao;
import model.Proposta;

@Path("/proposta")
public class PropostaService {

	@GET
	@Path("/")
	@Produces("application/json")
	public ArrayList<Proposta> retrieve() {
		ArrayList<Proposta> todoList = new ArrayList<Proposta>();
		todoList = FactoryDao.getPropostaDAO().retrieve();
		return todoList;
	}

	@POST
	@Path("/create")
	@Consumes("application/json")
	@Produces("application/json")
	public Response create(Proposta proposta) {
		FactoryDao.getPropostaDAO().create(proposta);
		return Response.ok().header("Access-Control-Allow-Origin", "*")
			      .header("Access-Control-Allow-Credentials", "true")
			      .header("Access-Control-Allow-Headers",
			        "origin, content-type, accept, authorization")
			      .header("Access-Control-Allow-Methods", 
			        "GET, POST, PUT, DELETE, OPTIONS, HEAD").entity(new ServiceResponse(201, "Proposta Cadastrada")).build();
	}

	@DELETE
	@Path("/delete")
	@Produces("application/json")
	public Response delete(Proposta proposta) {
		FactoryDao.getPropostaDAO().delete(proposta.getId());
		return Response.ok().entity(new ServiceResponse(200, "Tarefa Excluída")).build();
	}

	@PUT
	@Path("/update")
	@Consumes("application/json")
	@Produces("application/json")
	public Response update(Proposta proposta) {
		FactoryDao.getPropostaDAO().update(proposta);
		return Response.ok().entity(new ServiceResponse(200, "Tarefa Atualizada")).build();
	}


}
