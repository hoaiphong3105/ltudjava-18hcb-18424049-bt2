/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Diem;
import pojo.NguoiDung;
import util.HibernateUtil;

/**
 *
 * @author hoaip
 */
public class DiemDAO {

    public String createDiem(Diem d) {
        String msg = "";
        Session session = HibernateUtil.getSessionFactory().openSession();
        NguoiDung sv = null;
        if ((sv = new NguoiDungDAO().getByCode(d.getMaSinhVien())) == null) {
            return "Sinh viên không tồn tại";
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            d.setHoTen(sv.getHoTen());
            session.save(d);
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
