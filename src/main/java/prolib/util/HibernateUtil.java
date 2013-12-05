package prolib.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil 
{
	private static final SessionFactory sessionFactory;
	static
	{
		try
		{
			//create SessionFactory
			sessionFactory = new Configuration().configure().buildSessionFactory(null); 
		}
		catch(Throwable ex)
		{
			System.out.println("Can't Initialize SessionFactory! Error:"+ ex.toString());
			throw new ExceptionInInitializerError(ex);
		}
	}
	private static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
