package com.pro.enity;

public class NhanVien {
    private String maNV;
//    private String matKhau;
    private String hoTen;   
    private String gioiTinh;
//    private String sodt;
    private String Email;
    


    @Override
    public String toString() {
        return this.hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

//    public String getMatKhau() {
//        return matKhau;
//    }
//
//    public void setMatKhau(String matKhau) {
//        this.matKhau = matKhau;
//    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
//    public String getSodt() {
//        return sodt;
//    }
//
//    public void setSodt(String sodt) {
//        this.sodt = sodt;
//    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getGioiTinh() {
    return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
    }

}

