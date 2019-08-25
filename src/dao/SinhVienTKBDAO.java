/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.SinhVienTkb;
import pojo.ThoiKhoaBieu;
import util.HibernateUtil;

/**
 *
 * @author hoaip
 */
public class SinhVienTKBDAO {
    public String createSVTKB(SinhVienTkb svtkb) {
        String msg = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(svtkb);
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
}
