package genx.ewallet.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sf=null;
	
	static {
		sf = new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSf()
	{
		return sf;
	}

}
