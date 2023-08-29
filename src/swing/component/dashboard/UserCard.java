/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.component.dashboard;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import model.Pengguna;
import model.Staff;

/**
 *
 * @author AG SETO GALIH D
 */
public class UserCard extends javax.swing.JPanel {

    private Pengguna pengguna = null;
    private Staff staff = null;

    public int getIdUser() {
        if (!pengguna.equals(null)) {
            return pengguna.getUser().getIdUser();
        } else {
            return staff.getUser().getIdUser();
        }
    }
//
//    public UserCard() {
//        initComponents();
//        initLeftPic("default");
//        initBtn();
//    }

    //untuk staff
    public UserCard(Staff staff) {
        this.staff = staff;
        initComponents();
        btnMakeStaff.setVisible(false);
        initLeftPic("default");
        initBtn();
        initAttributeAndLabel(staff.getNama(), staff.getAlamat(), staff.getNoTelp());
    }

    //untuk pengguna
    public UserCard(Pengguna pengguna) {
        this.pengguna = pengguna;
        initComponents();
        initLeftPic("default");
        initBtn();
        initAttributeAndLabel(pengguna.getNama(), pengguna.getAlamat(), pengguna.getNoTelp());
    }

    public void initAttributeAndLabel(String nama, String alamat, String noTelp) {
        lblNamaLengkap.setText(nama);
        lblAlamat.setText(alamat);
        lblNoTelp.setText(noTelp);
    }

    public void addBtnMakeStaffActionListener(ActionListener event) {
        btnMakeStaff.addActionListener(event);
    }

    public void addBtnDeleteActionListener(ActionListener event) {
        btnDelete.addActionListener(event);
    }

    public void addBtnEditActionListener(ActionListener event) {
        btnEdit.addActionListener(event);
    }

    public void initLeftPic(String role) {
        Icon icon = null;
        if (role.equalsIgnoreCase("default")) {
            icon = new FlatSVGIcon("img/icon/profile.svg", 1.4f);
        }

        iconProfPic.setIcon(icon);
    }

    public void initBtn() {
        btnEdit.setText("");
        btnDelete.setText("");

        btnEdit.setIcon(new FlatSVGIcon("img/icon/edit.svg", 0.5f));
        btnDelete.setIcon(new FlatSVGIcon("img/icon/delete.svg", 0.5f));
        btnMakeStaff.setIcon(new FlatSVGIcon("img/icon/makestaff.svg", 0.5f));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new swing.GradientPanelLeft();
        profilePanel = new javax.swing.JPanel();
        iconProfPic = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        lblNamaLengkap = new javax.swing.JLabel();
        lblNoTelp = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        btnDelete = new swing.component.ButtonRound();
        btnEdit = new swing.component.ButtonRound();
        btnMakeStaff = new swing.component.ButtonRound();

        setForeground(new java.awt.Color(102, 153, 255));
        setOpaque(false);

        profilePanel.setBackground(new java.awt.Color(255, 255, 255));
        profilePanel.setOpaque(false);
        profilePanel.setPreferredSize(new java.awt.Dimension(80, 80));

        iconProfPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(iconProfPic)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(iconProfPic)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        infoPanel.setOpaque(false);
        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNamaLengkap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNamaLengkap.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaLengkap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNamaLengkap.setText("namaLengkap");
        infoPanel.add(lblNamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        lblNoTelp.setForeground(new java.awt.Color(255, 255, 255));
        lblNoTelp.setText("noTelp");
        infoPanel.add(lblNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, -1, -1));

        lblAlamat.setForeground(new java.awt.Color(255, 255, 255));
        lblAlamat.setText("alamat");
        infoPanel.add(lblAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, -1, -1));

        btnDelete.setText("test");

        btnEdit.setText("test");

        btnMakeStaff.setText("Jadikan Staff");

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                        .addComponent(btnMakeStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMakeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.component.ButtonRound btnDelete;
    private swing.component.ButtonRound btnEdit;
    private swing.component.ButtonRound btnMakeStaff;
    private swing.GradientPanelLeft containerPanel;
    private javax.swing.JLabel iconProfPic;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblNamaLengkap;
    private javax.swing.JLabel lblNoTelp;
    private javax.swing.JPanel profilePanel;
    // End of variables declaration//GEN-END:variables
}
