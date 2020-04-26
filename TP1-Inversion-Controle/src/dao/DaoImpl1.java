package dao;

public class DaoImpl1 implements IDAO {

	@Override
	public double getTemperature() {
		System.out.println("Version de Base de donnée :");
		return 20;
	}

}
