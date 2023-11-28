
package com.pro.dao;

import com.pro.utils.xjdbc;
import com.pro.enity.TaiKhoan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDAO extends ProDAO<TaiKhoan, String> {

    public void insert(TaiKhoan model) {
        try {
            String sql = "INSERT INTO TaiKhoan (TenTK, Matkhau, VaiTro) VALUES (?, ?, ?)";
            xjdbc.update(sql,
                    model.getTenTK(),
                    model.getMK(),
                    model.getVaiTro()
            );
            System.out.println("Insert successful!");
        } catch (Exception e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
    }

    public void update(TaiKhoan model) {
        String sql = "UPDATE TaiKhoan SET TenTK=?, Matkhau=?, VaiTro=? WHERE TenTK=?";
        xjdbc.update(sql,
                model.getTenTK(),
                model.getMK(),
                model.getVaiTro(),
                model.getTenTK()
        );
    }

    public void delete(String TenTK) {
        String sql = "DELETE FROM TaiKhoan WHERE TenTK=?";
        xjdbc.update(sql, TenTK);
    }

    public List<TaiKhoan> selectAll() {
        String sql = "SELECT * FROM TaiKhoan";
        return selectBySql(sql);
    }

    public TaiKhoan selectById(String TenTK) {
        String sql = "SELECT * FROM TaiKhoan WHERE TenTK=?";
        List<TaiKhoan> list = selectBySql(sql, TenTK);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = xjdbc.query(sql, args);
                while (rs.next()) {
                    TaiKhoan entity = new TaiKhoan();
                    entity.setTenTK(rs.getString("TenTK"));
                    entity.setMK(rs.getString("Matkhau"));
                    entity.setVaiTro(rs.getString("VaiTro"));
                    list.add(entity);
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().close();
                    rs.close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}

