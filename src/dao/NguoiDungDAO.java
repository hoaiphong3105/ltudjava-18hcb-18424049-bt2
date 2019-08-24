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

    public String ChangePassword(int id, String mkmoi, int firstTime) {
        String msg = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createSQLQuery(
                    "CALL ChangePassword(:p_id, :p_mk_moi,:p_first_time)")
                    .setParameter("p_id", id)
                    .setParameter("p_mk_moi", mkmoi)
                    .setParameter("p_first_time", firstTime);
            List result = query.list();
            if (result != null) {
                msg = result.get(0).toString();
            }
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return msg;
    }
}
