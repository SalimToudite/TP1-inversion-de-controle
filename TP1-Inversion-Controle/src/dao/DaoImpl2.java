package dao;

public class DaoImpl2 implements IDAO {

	@Override
	public double getTemperature() {
		System.out.println("Version capteur: ");
		return 17;
	}
	public void init() {
		System.out.println("Instanciation de DAOImplementation");
	}

}
