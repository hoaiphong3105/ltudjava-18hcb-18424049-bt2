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
import util.HibernateUtil;

/**
 *
 * @author hoaip
 */
public class NguoiDungDAO {

    public NguoiDung getByCode(String maNguoiDung) {
        List<NguoiDung> user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select sv from NguoiDung sv where sv.maNguoiDung =:username";
            Query query = session.createQuery(hql)
                    .setParameter("username", maNguoiDung);
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
        return user.get(0);
    }

    public String ChangePassword(String maNguoiDung, String mkmoi, int firstTime) {
        String msg = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            NguoiDung user = getByCode(maNguoiDung);
            user.setMatKhau(mkmoi);
            user.setDangNhapLanDau(0);
            session.update(user);
            transaction.commit();
            msg = "Thành công!";
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return msg;
    }
}
