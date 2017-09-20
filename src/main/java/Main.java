import Entity.Lector;
import config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Lector lector = new Lector();
        lector.setName("Cool");
        lector.setSurname("Boy");
        session.save(lector);
        transaction.commit();
        System.out.println();
        session.close();
        HibernateUtil.shutdown();
    }
}
