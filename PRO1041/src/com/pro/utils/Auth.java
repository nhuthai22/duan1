/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pro.utils;

import com.pro.enity.NhanVien;
import com.pro.enity.TaiKhoan;

public class Auth {
//    /**
//     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
//     */
    public static TaiKhoan user = null;
//    /**
//     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
//     */
//    public static void clear() {
//        Auth.user = null;
//    }
//    /**
//     * Kiểm tra xem đăng nhập hay chưa
//     */
//    public static boolean isLogin() {
//        return Auth.user != null;
//    }
    public static void setUser(TaiKhoan user) {
        Auth.user = user;
    }

    public static TaiKhoan getUser() {
        return user;
    }
     /**
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
//    public static boolean isManager() {
//        return Auth.isLogin() && user.getVaiTro();
//    }
}