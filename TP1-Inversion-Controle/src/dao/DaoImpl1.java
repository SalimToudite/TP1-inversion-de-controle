package dao;

public class DaoImpl1 implements IDAO {

	@Override
	public double getTemperature() {
		System.out.println("Version de Base de donn�e :");
		return 20;
	}

}
