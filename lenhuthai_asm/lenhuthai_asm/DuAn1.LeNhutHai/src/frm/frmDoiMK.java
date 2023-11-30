
package frm;

import static frm.frmDangNhap.quyen;
import static frm.frmDangNhap.ten;
import static frm.frmDangNhap.user;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class frmDoiMK extends javax.swing.JFrame {

    
    public frmDoiMK() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCopyright = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlRegisterInfo = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnDoiMK = new javax.swing.JButton();
        txtNhapLaiPassword = new javax.swing.JPasswordField();
        lblPassword1 = new javax.swing.JLabel();
        lblUserName1 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        txtMKcu = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCopyright.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        jLabel1.setText("liên Hệ admin để được cấp quyền truy cập cao hơn");

        javax.swing.GroupLayout pnlCopyrightLayout = new javax.swing.GroupLayout(pnlCopyright);
        pnlCopyright.setLayout(pnlCopyrightLayout);
        pnlCopyrightLayout.setHorizontalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );
        pnlCopyrightLayout.setVerticalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        lblRegisterTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRegisterTitle.setForeground(new java.awt.Color(51, 102, 255));
        lblRegisterTitle.setText("Đổi mật khẩu");

        lblUserName.setText("Tên đăng nhập");

        lblPassword.setText("Mật khẩu mới");

        btnDoiMK.setForeground(new java.awt.Color(255, 153, 51));
        btnDoiMK.setText("Đổi MK");
        btnDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMKActionPerformed(evt);
            }
        });

        lblPassword1.setText("Nhập lại mật khẩu mới");

        lblUserName1.setText("Mật khẩu củ");

        btnHuy.setForeground(new java.awt.Color(255, 153, 51));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
        pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);
        pnlRegisterInfoLayout.setHorizontalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lblRegisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegisterInfoLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblPassword)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegisterInfoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword1)
                            .addComponent(lblUserName)
                            .addComponent(lblUserName1))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                                .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUserName)
                            .addComponent(txtNhapLaiPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMKcu))))
                .addGap(33, 33, 33))
        );
        pnlRegisterInfoLayout.setVerticalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblRegisterTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName1)
                    .addComponent(txtMKcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhapLaiPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword1))
                .addGap(18, 18, 18)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnDoiMK))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMKActionPerformed
                                         
    String userName = txtUserName.getText();
    String oldPassword = txtMKcu.getText(); // Old password
    String newPassword = String.valueOf(txtPassword.getPassword());
    String confirmNewPassword = String.valueOf(txtNhapLaiPassword.getPassword());

    // Check if any field is empty
    if (userName.isEmpty() || oldPassword.isEmpty() || newPassword.isEmpty() || confirmNewPassword.isEmpty()) {
        ThongBao("Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if new password matches the confirmed password
    if (!newPassword.equals(confirmNewPassword)) {
        ThongBao("Xác nhận mật khẩu mới không khớp", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the old password is correct (you should compare it with the stored password)
    if (!isOldPasswordCorrect(userName, oldPassword)) {
        ThongBao("Mật khẩu cũ không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Update the password in the database or wherever you store user information
    boolean passwordChanged = changePasswordInDatabase(userName, newPassword);

    if (passwordChanged) {
        ThongBao("Đổi mật khẩu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        
        // Close the change password form and go back to the login form
        frmDangNhap frmDN = new frmDangNhap();
        frmDN.setVisible(true);
        this.dispose();
    } else {
        ThongBao("Đổi mật khẩu thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    
    

    }//GEN-LAST:event_btnDoiMKActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
       huyBo();
    }//GEN-LAST:event_btnHuyActionPerformed
    public static void ThongBao(String noiDungThongBao,  String tieuDeThongBao, int icon ){
        JOptionPane.showMessageDialog( new JFrame(), noiDungThongBao,
                    tieuDeThongBao, icon );
    }
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
            java.util.logging.Logger.getLogger(frmDoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDoiMK().setVisible(true);
            }
        });
    }
    private void huyBo() {
        this.dispose();
    }
    
    private boolean isOldPasswordCorrect(String userName, String oldPassword) {
        // Implement your logic to check if the old password is correct
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Establish database connection
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1500;databaseName=QuanLySanPham", "sa", "123");

            // Check if the old password is correct
            String query = "SELECT * FROM Users WHERE TenDangNhap = ? AND Password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, oldPassword);
            resultSet = preparedStatement.executeQuery();

            return resultSet.next(); // If there is a match, return true
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private boolean changePasswordInDatabase(String userName, String newPassword) {
        // Implement your logic to update the password in the database
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establish database connection
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1500;databaseName=QuanLySanPham", "sa", "123");

            // Update the password
            String updateQuery = "UPDATE Users SET Password = ? WHERE TenDangNhap = ?";
            preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, userName);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0; // If at least one row is affected, return true
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JPanel pnlCopyright;
    private javax.swing.JPanel pnlRegisterInfo;
    private javax.swing.JPasswordField txtMKcu;
    private javax.swing.JPasswordField txtNhapLaiPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}



