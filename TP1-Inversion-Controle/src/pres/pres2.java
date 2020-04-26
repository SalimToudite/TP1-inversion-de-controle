package pres;

import java.io.File;
import java.util.Scanner;

import dao.IDAO;
import metier.IMetier;

public class pres2 {

	public static void main(String[] args) throws Exception {
		
		// Instantiation dynamique
				Scanner scanner = new Scanner(new File("Config.txt"));
				String daoClassName = scanner.nextLine();
				Class cDao = Class.forName(daoClassName);
				IDAO dao = (IDAO) cDao.newInstance();//fait appel au constructeur par défaut 
				System.out.println(dao.getTemperature());
				
				String metierClassName=scanner.nextLine();
		        Class cMetier=Class.forName(metierClassName);
		        IMetier metier=(IMetier) cMetier.newInstance();
		        java.lang.reflect.Method method=cMetier.getMethod("setDao",IDAO.class);
		        method.invoke(metier, dao);
		       System.out.println(metier.calcul());
	}

}
