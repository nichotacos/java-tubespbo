/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.backup.panelbackup;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import model.Pengguna;
import swing.ColorPallete;
import swing.component.dashboard.NoUserCard;
import swing.component.dashboard.UserCard;
import swing.events.EventUserCard;
import table.PenggunaTable;

/**
 *
 * @author AG SETO GALIH D
 */
public class ReadDataPembeli extends javax.swing.JPanel {

    private static ColorPallete cp = new ColorPallete();
    private UserCard userCard;
    private NoUserCard noUserCard = new NoUserCard();
    private EventUserCard event;
    private String namaUserGroup;

    public void setJudulForm(String text) {
        judulForm.setForeground(cp.getColor(0));
        judulForm.setText("Tabel Data " + text);
        judulDataPilihan.setForeground(cp.getColor(0));
        judulDataPilihan.setText("Kelola Data " + text);
    }

    public void setTableModel(AbstractTableModel tableModel) {
        this.customTable.setModel((PenggunaTable) tableModel);
    }

    public void showUserCard(Component panel) {
        panelCard.removeAll();
        panelCard.add(panel);
        panelCard.repaint();
        panelCard.revalidate();
    }

    /** Creates new form TestPanel */
    public ReadDataPembeli(AbstractTableModel tableModel, String namaUserGroup) {
        this.namaUserGroup = namaUserGroup;

        initComponents();

        showUserCard(noUserCard);

        setTableModel(tableModel);
        setJudulForm(namaUserGroup);
        searchField.setHint("Cari berdasarkan nama, kategori, dan lain-lain");
        initTableListener();
    }

    //method untuk memanggil event user card
    public void callEvent(EventUserCard eventCalled) {
        event = eventCalled;
    }

    private void initTableListener() {
        customTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                //get value dari table clicked
                if (namaUserGroup.equalsIgnoreCase("Pembeli")) {
                    int clickedRow = customTable.getSelectedRow();
                    TableModel tableModel = customTable.getModel();
                    Pengguna pengguna = (Pengguna) tableModel.getValueAt(clickedRow, 6);
                    //show user card panel
                    userCard = new UserCard(pengguna);
                    showUserCard(userCard);

                    //user card action listener
                    userCard.addBtnEditActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            //melempar event untuk dieksekusi ke panel/frame diatasnya yaitu SuperAdminView
                            //fungsinya untuk mengganti panel ReadDataPembeli ke panel UpdateDataPembeli
                            event.runEvent(pengguna);
                        }
                    });
                }
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        judulForm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customTable = new swing.component.CustomTable();
        jPanel2 = new javax.swing.JPanel();
        buttonRectangle1 = new swing.component.ButtonRectangle();
        searchField = new swing.component.TextFieldWithBackground();
        jPanel3 = new javax.swing.JPanel();
        buttonRectangle2 = new swing.component.ButtonRectangle();
        panelCard = new javax.swing.JPanel();
        judulDataPilihan = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulForm.setForeground(new java.awt.Color(0, 0, 0));
        judulForm.setText("Judul Form");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        customTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(customTable);

        jPanel2.setOpaque(false);

        buttonRectangle1.setText("Cari");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRectangle1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setOpaque(false);

        buttonRectangle2.setText("Tambah Data");

        panelCard.setOpaque(false);
        panelCard.setPreferredSize(new java.awt.Dimension(407, 80));
        panelCard.setLayout(new java.awt.BorderLayout());

        judulDataPilihan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulDataPilihan.setForeground(new java.awt.Color(0, 0, 0));
        judulDataPilihan.setText("Judul Pilihan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(panelCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(buttonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(judulDataPilihan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulDataPilihan)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(judulForm)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judulForm, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.component.ButtonRectangle buttonRectangle1;
    private swing.component.ButtonRectangle buttonRectangle2;
    private swing.component.CustomTable customTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judulDataPilihan;
    private javax.swing.JLabel judulForm;
    private javax.swing.JPanel panelCard;
    private swing.component.TextFieldWithBackground searchField;
    // End of variables declaration//GEN-END:variables
}
