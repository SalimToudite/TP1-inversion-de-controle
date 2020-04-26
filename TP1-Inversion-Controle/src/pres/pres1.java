package pres;

import dao.DaoImpl1;
import metier.MetierImpl;

public class pres1 {

	public static void main(String[] args) {

		//Instantiation statique
				DaoImpl1 dao = new DaoImpl1();
				MetierImpl metier = new MetierImpl();
				metier.setDao(dao);
				System.out.println(metier.calcul());

	}

}
