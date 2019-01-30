package controller;

import dao.FactoryDao;
import model.Proposta;

public void analisarProposta(Proposta proposta) {
		if (proposta.getRenda() <= 800) {
			proposta.setResultadoAnalise("Negado");
			proposta.setLimite("renda baixa");
		}
		if (proposta.getRenda() > 800 && proposta.getRenda() <= 2500) {			
			if(proposta.getDependentes() > 0){			
				proposta.setResultadoAnalise("Negado");
				proposta.setLimite("reprovado pela política de crédito");		
			} else {
				proposta.setResultadoAnalise("Aprovado");
				proposta.setLimite("entre 500 - 1000");		
			}
		}
		if (proposta.getRenda() > 2500 && proposta.getRenda() <= 5000) {
			if(proposta.getDependentes() > 0){
				int rendaPorDependente = proposta.getRenda()/proposta.getDependentes();
				if(rendaPorDependente < 1000) {
					proposta.setResultadoAnalise("Negado");
					proposta.setLimite("reprovado pela política de crédito");	
				} else {
					proposta.setResultadoAnalise("Aprovado");
					proposta.setLimite("entre 1000 - 1500");		
				}
			}
		}
		if (proposta.getRenda() > 5000 && proposta.getRenda() <= 10000) {
			if(proposta.getDependentes() > 0){
				int rendaPorDependente = proposta.getRenda()/proposta.getDependentes();
				if(rendaPorDependente < 1000) {
					proposta.setResultadoAnalise("Negado");
					proposta.setLimite("reprovado pela política de crédito");	
				} else {
					proposta.setResultadoAnalise("Aprovado");
					proposta.setLimite("superior 2000");		
				}
			}
		}
		FactoryDao.getPropostaDAO().create(proposta);
	}
