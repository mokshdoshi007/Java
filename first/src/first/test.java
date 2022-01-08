package first;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.bean;

public class test 
{
	public static void main(String[] args) 
	{
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory fact = cf.buildSessionFactory();
		Session session = fact.openSession();
		Transaction ts = session.beginTransaction();
		bean b = new bean();
		b.setId(1);
		b.setName("Moksh");
		b.setAge(19);
		b.setEmail("mokshdoshi007@gmail.com");
		session.save(b);
		ts.commit();
		session.close();
		System.out.println("Record Added");
	}
}