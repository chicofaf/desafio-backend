package dao;

public class FactoryDao {
	
	
	public static IPropostaDao getPropostaDAO(){
		return new PropostaDaoImpl();
	}
}
