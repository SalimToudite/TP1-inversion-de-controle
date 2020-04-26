package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.IDAO;
import metier.IMetier;

public class presAvecSpring {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("config.xml");
		IDAO dao=(IDAO) ctx.getBean("d");
		System.out.println(dao.getTemperature());
		//IMetier metier=(IMetier) ctx.getBean("metier");
		IMetier metier= ctx.getBean(IMetier.class);

		System.out.println(metier.calcul());
		
	}

}
