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
        frm_dang_nhap frm = new frm_dang_nhap(null, true);
        frm.setTitle("18424049 - Đăng nhập");
        frm.setLocationRelativeTo(null); // to center the JFrame
        frm.setVisible(true);
    }

}
