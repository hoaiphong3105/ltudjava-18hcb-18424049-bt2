/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18424049_bt2;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.NguoiDung;
import pojo.testD;
import util.HibernateUtil;

/**
 *
 * @author hoaip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<NguoiDung> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
//            String hql = "select sv from pojo.NguoiDung sv";
//            Query query = session.createQuery(hql);
//            ds = query.list();
            Query query = session.createSQLQuery(
                    "CALL GetAllStudent(:p_id)")
                    //.addEntity(NguoiDung.class)
                    .setParameter("p_id", "1");
            List result = query.list();
            System.err.println(result.get(0));

  Object[] results = (Object[]) (result.get(0));
   System.out.println(results[0]);
   System.out.println(results[1]);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println("aa");
            System.err.println(ex);
        } finally {
            session.close();
        }

//      for(int i =0; i< ds.size();i++)
//      {
//          
//         System.err.println(ds.get(i).getHoTen());
//      }
    }

}
