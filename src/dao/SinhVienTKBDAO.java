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

    public List<NguoiDung> getSVTkb(String maLop, String mamh) {
        List<NguoiDung> user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "SELect sv "
                    + "FROM NguoiDung as sv, SinhVienTkb as tkb "
                    + "where sv.maNguoiDung = tkb.maSinhVien and tkb.maLopTkb =:malop and tkb.maMonHoc =:mamh";
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
