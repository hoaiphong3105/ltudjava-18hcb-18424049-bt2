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
import org.hibernate.Transaction;
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
//        List<NguoiDung> ds = null;
//        Session session = HibernateUtil.getSessionFactory()
//                .openSession();
//        try {
////            String hql = "select sv from pojo.NguoiDung sv";
////            Query query = session.createQuery(hql);
////            ds = query.list();
//            Query query = session.createSQLQuery(
//                    "CALL GetAllStudent(:p_id)")
//                    //.addEntity(NguoiDung.class)
//                    .setParameter("p_id", "1");
//            List result = query.list();
//            System.err.println(result.get(0));
//
//  Object[] results = (Object[]) (result.get(0));
//   System.out.println(results[0]);
//   System.out.println(results[1]);
//        } catch (HibernateException ex) {
//            //Log the exception
//            System.err.println("aa");
//            System.err.println(ex);
//        } finally {
//            session.close();
//        }

//      for(int i =0; i< ds.size();i++)
//      {
//          
//         System.err.println(ds.get(i).getHoTen());
//      }

Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Query query = session.createSQLQuery(
                    "CALL ChangePassword(:p_id, :p_mk_moi,:p_first_time)")
                    .setParameter("p_id", 1)
                    .setParameter("p_mk_moi", "111")
                    .setParameter("p_first_time", 0);
            transaction.commit();
            List result = query.list();
            if (result != null) {
               String msg = result.get(0).toString();
               System.err.println(msg);
            }
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
    }

}
