/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.NguoiDung;
import pojo.ThoiKhoaBieu;
import util.HibernateUtil;

/**
 *
 * @author hoaip
 */
public class ThoiKhoaBieuDAO {

    public String createTKB(ThoiKhoaBieu tkb) {
        String msg = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(tkb);
            transaction.commit();
            msg = "Thêm thành công!";
        } catch (HibernateException ex) {
            //Log the exception
            transaction.rollback();
            System.err.println(ex);
            msg = "Thêm thất bại!";
        } finally {
            session.close();
        }
        return msg;
    }

    public List<ThoiKhoaBieu> getByCousreAndClass(String mamh, String maLop) {
        List<ThoiKhoaBieu> tkbs = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select sv from ThoiKhoaBieu sv where sv.maMon =:maMon and sv.maLop = :maLop";
            Query query = session.createQuery(hql)
                    .setParameter("maMon", mamh)
                    .setParameter("maLop", maLop);
            tkbs = query.list();

        } catch (HibernateException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (tkbs == null || tkbs.isEmpty()) {
            return null;
        }
        return tkbs;
    }
    
    public List<ThoiKhoaBieu> getByClass(String maLop) {
        List<ThoiKhoaBieu> tkbs = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select sv from ThoiKhoaBieu sv where sv.maLop = :maLop";
            Query query = session.createQuery(hql)
                    .setParameter("maLop", maLop);
            tkbs = query.list();

        } catch (HibernateException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (tkbs == null || tkbs.isEmpty()) {
            return null;
        }
        return tkbs;
    }

}
