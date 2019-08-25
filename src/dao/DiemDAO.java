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

    public Diem getByCode(int id) {
        List<Diem> user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select sv from Diem sv where sv.id =:id";
            Query query = session.createQuery(hql)
                    .setParameter("id", id);
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

    public String UpdateById(Diem d) {
        String msg = "";
        NguoiDung sv = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            if ((sv = new NguoiDungDAO().getByCode(d.getMaSinhVien())) == null) {
                return "Sinh viên không tồn tại";
            }
            session.update(d);
            transaction.commit();
            msg = "Thành công!";
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return msg;
    }

    public List<Diem> getbyCourseAndClass(String maLop, String mamh) {
        List<Diem> user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "SELect sv "
                    + "FROM Diem as sv "
                    + "where sv.maLopTkb =:malop and sv.maMh =:mamh";
            Query query = session.createQuery(hql)
                    .setParameter("malop", maLop)
                    .setParameter("mamh", mamh);
            user = query.list();

        } catch (HibernateException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return user;
    }
}
