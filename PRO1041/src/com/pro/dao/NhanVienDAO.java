
package com.pro.dao;

import com.pro.utils.xjdbc;
import com.pro.enity.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends ProDAO<NhanVien, String> {

    public void insert(NhanVien model) {
    try {
        String sql = "INSERT INTO NhanVien (MaNV, MatKhau, TenNV, GioiTinh, sodienthoai) VALUES (?, ?, ?, ?, ?)";
        xjdbc.update(sql,
                model.getMaNV(),
                model.getMatKhau(),
                model.getHoTen(),
                model.getGioiTinh(),
                model.getSodt()
        );
        System.out.println("Insert successful!");
    } catch (Exception e) {
        // Log
    }
    }
    
    public void update(NhanVien model) {
    String sql = "UPDATE NhanVien SET TenNV=?, MatKhau=?, Email=?, Gioitinh=? sodienthoai=? WHERE MaNV=?";
    xjdbc.update(sql,
            model.getHoTen(),
            model.getMatKhau(),
            model.getEmail(),
            model.getGioiTinh(),
            model.getSodt(),
            model.getMaNV()
    );
}


    public void delete(String MaNV) {
        String sql = "DELETE FROM NhanVien WHERE MaNV=?";
        xjdbc.update(sql, MaNV);
    }

    public List<NhanVien> selectAll() {
        String sql = "SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }

    public NhanVien selectById(String manv) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public NhanVien selectBySoDienThoai(String sodt) {
    String sql = "SELECT * FROM NhanVien WHERE sodienthoai=?";
    List<NhanVien> list = this.selectBySql(sql, sodt);
    return !list.isEmpty() ? list.get(0) : null;
}


    protected List<NhanVien> selectBySql(String sql, Object... args) {
    List<NhanVien> list = new ArrayList<>();
    try {
        ResultSet rs = null;
        try {
            rs = xjdbc.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setSodt(rs.getString("sodienthoai"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setHoTen(rs.getString("TenNV"));
                entity.setGioiTinh(rs.getString("GioiTinh"));
                entity.setMaNV(rs.getString("MaNV"));
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
