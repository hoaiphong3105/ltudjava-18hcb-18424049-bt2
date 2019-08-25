/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import pojo.NguoiDung;

/**
 *
 * @author hoaip
 */
public class Helper {

    private static boolean isLogin = false;
    private static NguoiDung CurUser;

    public static void setCurrentUser(NguoiDung user) {
        if (user == null) {
            isLogin = false;
            CurUser = null;
        } else {
            isLogin = true;
            CurUser = user;
        }
    }

    public static NguoiDung getCurrentUser() {
        return CurUser;
    }

    public boolean isLogin() {
        return isLogin;
    }
}
