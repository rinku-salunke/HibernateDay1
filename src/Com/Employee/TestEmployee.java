package Com.Employee;

import org.hibernate.Session;

public class TestEmployee {
public static void main(String[] args) {
	
	
	
	Employee e=new Employee();
	
	e.setEid(101);
	
	e.setEname("Mr.Jitendra");
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	session.save(e);
	
	session.beginTransaction().commit();
	
}
}
