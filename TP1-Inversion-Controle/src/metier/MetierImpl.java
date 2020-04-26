package metier;

import dao.IDAO;

public class MetierImpl implements IMetier {

	
	private IDAO dao;
	
	public void setDao(IDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public double calcul() {
		
		return dao.getTemperature()*23;
	}
	public void init()
	{
		System.out.println("Instanciation de metierImplementation");
	}

}
