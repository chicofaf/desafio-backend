package controller;

import dao.FactoryDao;
import model.Proposta;

public class AnalisePropostaController {
	public void analisarProposta(Proposta proposta) {
		if (proposta.getRenda() < 1000) {
			proposta.setResultadoAnalise("Negado");
			proposta.setLimite("renda baixa");
		}
		FactoryDao.getPropostaDAO().create(proposta);
	}
}
