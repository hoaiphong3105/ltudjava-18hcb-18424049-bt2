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
import pojo.LichPhucKhao;
import pojo.NguoiDung;
import pojo.YeuCauPhucKhao;
import util.HibernateUtil;

/**
 *
 * @author hoaip
 */
public class YeuCauPhucKhaoDAO {

    public String createYCPK(YeuCauPhucKhao pk) {
        String msg = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(pk);
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
    
    public List<YeuCauPhucKhao> getAll() {
        List<YeuCauPhucKhao> user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select sv from YeuCauPhucKhao sv";
            Query query = session.createQuery(hql);
            user = query.list();

        } catch (HibernateException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (user == null || user.isEmpty()) {
            return null;
        }
        return user;
    }
}
