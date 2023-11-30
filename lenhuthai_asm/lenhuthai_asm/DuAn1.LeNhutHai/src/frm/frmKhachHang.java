/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author huy
 */
public class frmKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form frmKhachHang
     */
    public frmKhachHang() {
        initComponents();
    }
    Calendar cal = Calendar.getInstance();

    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);

    Date dt = cal.getTime();
// Dinh dang lai hien thi thong tin ngay gio ra man hinh
    SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel_KhachHang = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        lblMaKhachHang_KhachHang = new javax.swing.JLabel();
        lblTenKhachHang_KhachHang = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        rbtnNam = new javax.swing.JRadioButton();
        rbtnNu = new javax.swing.JRadioButton();
        lblNgaySinh_KhachHang = new javax.swing.JLabel();
        lblGioiTinh_KhachHang = new javax.swing.JLabel();
        lblDiaChi_KhachHang = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblSDT_KhachHang = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        cbbLoaiKhachHang = new javax.swing.JComboBox<>();
        lblLoaiKhachHang_KhachHang = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextPane();
        btnThem_ = new javax.swing.JButton();
        btnReset_ = new javax.swing.JButton();
        cbbNgay = new javax.swing.JComboBox<>();
        cbbThang = new javax.swing.JComboBox<>();
        cbbNam = new javax.swing.JComboBox<>();
        lblLoiMaKhachHang_KhachHang4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_KhachHang.setPreferredSize(new java.awt.Dimension(500, 434));
        jPanel_KhachHang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel_KhachHangComponentShown(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Khách Hàng mới");

        lblMaKhachHang_KhachHang.setText("Mã KH");

        lblTenKhachHang_KhachHang.setText("Tên KH");

        txtMaKhachHang.setEditable(false);

        txtTenKhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenKhachHangFocusLost(evt);
            }
        });
        txtTenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHangActionPerformed(evt);
            }
        });
        txtTenKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKhachHangKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTenKhachHangKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtnNam);
        rbtnNam.setText("Nam");

        buttonGroup1.add(rbtnNu);
        rbtnNu.setText("Nữ");

        lblNgaySinh_KhachHang.setText("Ngày Sinh");

        lblGioiTinh_KhachHang.setText("Giới Tính");

        lblDiaChi_KhachHang.setText("Địa Chỉ");

        txtDiaChi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaChiFocusLost(evt);
            }
        });

        lblSDT_KhachHang.setText("SDT");

        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });

        cbbLoaiKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblLoaiKhachHang_KhachHang.setText("Loại KH");

        jLabel85.setText("Ghi Chú");

        jScrollPane25.setViewportView(txtGhiChu);

        btnThem_.setText("Thêm");
        btnThem_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_ActionPerformed(evt);
            }
        });

        btnReset_.setText("Reset");
        btnReset_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_ActionPerformed(evt);
            }
        });

        cbbThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangItemStateChanged(evt);
            }
        });
        cbbThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThangActionPerformed(evt);
            }
        });

        lblLoiMaKhachHang_KhachHang4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblLoiMaKhachHang_KhachHang4.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel_KhachHangLayout = new javax.swing.GroupLayout(jPanel_KhachHang);
        jPanel_KhachHang.setLayout(jPanel_KhachHangLayout);
        jPanel_KhachHangLayout.setHorizontalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTenKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNgaySinh_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGioiTinh_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDiaChi_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSDT_KhachHang)
                                    .addComponent(lblMaKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel85)
                                    .addComponent(lblLoaiKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReset_))))
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHangLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbbLoaiKhachHang, 0, 219, Short.MAX_VALUE)
                                        .addComponent(txtSDT))
                                    .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThem_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTenKhachHang)
                                        .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(rbtnNam))
                                                .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(rbtnNu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                                    .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel56)))
                .addContainerGap())
            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(lblLoiMaKhachHang_KhachHang4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(833, 833, 833)))
        );
        jPanel_KhachHangLayout.setVerticalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHangLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel56)
                .addGap(18, 18, 18)
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblMaKhachHang_KhachHang)
                                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblTenKhachHang_KhachHang)
                                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNgaySinh_KhachHang)
                                            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rbtnNam)
                                            .addComponent(lblGioiTinh_KhachHang)
                                            .addComponent(rbtnNu))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblDiaChi_KhachHang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSDT_KhachHang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbLoaiKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLoaiKhachHang_KhachHang))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset_)
                    .addComponent(btnThem_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel85)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHangLayout.createSequentialGroup()
                    .addContainerGap(398, Short.MAX_VALUE)
                    .addComponent(lblLoiMaKhachHang_KhachHang4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenKhachHangFocusLost
        lblTenKhachHang_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtTenKhachHangFocusLost

    private void txtTenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHangActionPerformed

    private void txtTenKhachHangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHangKeyPressed

    }//GEN-LAST:event_txtTenKhachHangKeyPressed

    private void txtTenKhachHangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHangKeyTyped

    }//GEN-LAST:event_txtTenKhachHangKeyTyped

    private void txtDiaChiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChiFocusLost
        lblDiaChi_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtDiaChiFocusLost

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        lblSDT_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtSDTFocusLost

    private void btnThem_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_ActionPerformed
        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, LoaiKhachHang, ChuThich;
        MaKhachHang = txtMaKhachHang.getText();
        TenKhachHang = txtTenKhachHang.getText();
        String ngay, thang, nam;
        ngay = cbbNgay.getSelectedItem().toString();
        thang = cbbThang.getSelectedItem().toString();
        nam = cbbNam.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;
        if (rbtnNam.isSelected()) {
            GioiTinh = "1";
        } else {
            GioiTinh = "0";
        }
        DiaChi = txtDiaChi.getText();
        SDT = txtSDT.getText();
        LoaiKhachHang =     lenhuthai_asm_gd2.LENHUTHAI_ASM_GD2.frmTC.GetCbbSelected(cbbLoaiKhachHang);
        ChuThich = txtGhiChu.getText();
        String cautruyvan = "insert into KhachHang values("
        + " N'" + TenKhachHang + "' , '" + NgaySinh + "' ," + GioiTinh
        + ",N'" + DiaChi + "','" + SDT + "'," + LoaiKhachHang + ", N'" + ChuThich + "')";
        boolean kiemtra = KiemTraNhapKhachHang(0);
        if (kiemtra) {
              lenhuthai_asm_gd2.LENHUTHAI_ASM_GD2.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
            System.out.println(cautruyvan);
            this.dispose();

        } else {
            System.out.println("Thêm Thất Bại");
        }
           lenhuthai_asm_gd2.LENHUTHAI_ASM_GD2.frmTC.layDuLieuKhachHang();
             lenhuthai_asm_gd2.LENHUTHAI_ASM_GD2.frmTC.SetCbbKhachHangfrm(txtTenKhachHang.getText());
    }//GEN-LAST:event_btnThem_ActionPerformed
public boolean KiemTraNhapKhachHang(int ts) {
        String MaKhachHang, TenKhachHang, Ngaysinh, DiaChi, SDT;
        boolean kiemtra = false;
        MaKhachHang = txtMaKhachHang.getText();
        TenKhachHang = txtTenKhachHang.getText();
        String ngay, thang, nam, ThongBao = "";
        ngay = cbbNgay.getSelectedItem().toString();
        thang = cbbThang.getSelectedItem().toString();
        nam = cbbNam.getSelectedItem().toString();
        Ngaysinh = nam + "-" + thang + "-" + ngay;
        DiaChi = txtDiaChi.getText();
        SDT = txtSDT.getText();
        if (MaKhachHang.equals("") && ts == 1) {
            ThongBao += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
            lblMaKhachHang_KhachHang.setForeground(Color.red);
        }
        if (TenKhachHang.equals("")) {
            ThongBao += "bạn chưa Nhập Tên Khách Hàng\n";
            lblTenKhachHang_KhachHang.setForeground(Color.red);
        }
        if (DiaChi.equals("")) {
            lblDiaChi_KhachHang.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Địa Chỉ\n";
        }
        if (SDT.equals("")) {
            lblSDT_KhachHang.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Số ĐT \n";
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            lblDiaChi_KhachHang.setForeground(Color.black);
            lblSDT_KhachHang.setForeground(Color.black);
            lblMaKhachHang_KhachHang.setForeground(Color.black);
            lblTenKhachHang_KhachHang.setForeground(Color.black);
        } else {
            kiemtra = false;
            lenhuthai_asm_gd2.LENHUTHAI_ASM_GD2.frmTC.ThongBao(ThongBao, "lỗi nhập liệu", 2);
        }
        return kiemtra;
    }
    private void btnReset_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_ActionPerformed
    
        txtMaKhachHang.setText("");
        txtTenKhachHang.setText("");
        cbbNgay.setSelectedIndex(1);
        cbbThang.setSelectedIndex(1);
        cbbNam.setSelectedIndex(20);
        txtDiaChi.setText("");
        txtSDT.setText("");
        cbbLoaiKhachHang.setSelectedIndex(1);
        txtGhiChu.setText("");
  
    }//GEN-LAST:event_btnReset_ActionPerformed
int tam=0;
    private void cbbThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangItemStateChanged

        String thang = cbbThang.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        String thanght;
        if (tam == 0) {
            thanght = "0";
        } else {
            thanght = cbbNgay.getSelectedItem().toString();
        }
        tam = 1;

        if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 31; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 31) {
                cbbNgay.setSelectedItem(thanght);
            }
        } else if (thang.equals("1") || thang.equals("3") || thang.equals("5")
            || thang.equals("7") || thang.equals("8") || thang.equals("12") || thang.equals("10")) {

            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 32; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 32) {
                cbbNgay.setSelectedItem(thanght);
            }
        } else {
            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 29; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 29) {
                cbbNgay.setSelectedItem(thanght);
            }
        }
    }//GEN-LAST:event_cbbThangItemStateChanged

    private void cbbThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThangActionPerformed

    }//GEN-LAST:event_cbbThangActionPerformed

    private void jPanel_KhachHangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_KhachHangComponentShown
        rbtnNam.setSelected(true);
        lenhuthai_asm_gd2.LENHUTHAI_ASM_GD2.frmTC.layDuLieuKhachHang();
        cbbLoaiKhachHang.setModel(  lenhuthai_asm_gd2.LENHUTHAI_ASM_GD2.frmTC.LayDuLieucbb("LoaiKhachHang", "TenLoaiKhachHang", "MaLoaiKhachHang"));
        for (int i = 1; i < 32; i++) {
            cbbNgay.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThang.addItem(String.valueOf(i));
        }
        for (int i = 2016; i > 1950; i--) {
            cbbNam.addItem(String.valueOf(i));
        }
     
    }//GEN-LAST:event_jPanel_KhachHangComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          rbtnNam.setSelected(true);
        cbbLoaiKhachHang.setModel(lenhuthai_asm_gd2.LENHUTHAI_ASM_GD2.frmTC.LayDuLieucbb("LoaiKhachHang", "TenLoaiKhachHang", "MaLoaiKhachHang"));
        for (int i = 1; i < 32; i++) {
            cbbNgay.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThang.addItem(String.valueOf(i));
        }
        for (int i = year; i > 1950; i--) {
            cbbNam.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset_;
    private javax.swing.JButton btnThem_;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbLoaiKhachHang;
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JComboBox<String> cbbNgay;
    private javax.swing.JComboBox<String> cbbThang;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JPanel jPanel_KhachHang;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JLabel lblDiaChi_KhachHang;
    private javax.swing.JLabel lblGioiTinh_KhachHang;
    private javax.swing.JLabel lblLoaiKhachHang_KhachHang;
    private javax.swing.JLabel lblLoiMaKhachHang_KhachHang4;
    private javax.swing.JLabel lblMaKhachHang_KhachHang;
    private javax.swing.JLabel lblNgaySinh_KhachHang;
    private javax.swing.JLabel lblSDT_KhachHang;
    private javax.swing.JLabel lblTenKhachHang_KhachHang;
    private javax.swing.JRadioButton rbtnNam;
    private javax.swing.JRadioButton rbtnNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextPane txtGhiChu;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
