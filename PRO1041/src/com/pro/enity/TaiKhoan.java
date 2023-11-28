
package com.pro.enity;


public class TaiKhoan {
    private String TenTK,MK,VaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String TenTK, String MK, String VaiTro) {
        this.TenTK = TenTK;
        this.MK = MK;
        this.VaiTro = VaiTro;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
    
}
