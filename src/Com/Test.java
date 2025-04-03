package Com;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {

	Student s=new Student();
	s.setRollno(1);
	s.setName("rinku");
	
	
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	session.save(s);
	
	session.beginTransaction().commit();
	
	
}
}


