package dao;

import java.util.ArrayList;

import model.Proposta;

public interface IPropostaDao {
	public void create (Proposta proposta);
	public void update(Proposta proposta);
	public ArrayList<Proposta> retrieve();
	public void delete(Integer id);
}
