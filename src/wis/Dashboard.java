/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wis;

import java.awt.Frame;
import java.awt.Toolkit;

/**
 *
 * @author HAB VILLANUEVA
 */
public class Dashboard extends javax.swing.JFrame {

    private static empLogin login = new empLogin();
    private static Dashboard dashboard = new Dashboard();
    private static Toolkit tk = Toolkit.getDefaultToolkit();  
    private static int xSize;  
    private static int ySize;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadDB_item = new javax.swing.JMenuItem();
        logout_item = new javax.swing.JMenuItem();
        exit_item = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WIS - Dashboard");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setMaximumSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
        setMinimumSize(getMaximumSize());
        setPreferredSize(new java.awt.Dimension(500, 500));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        loadDB_item.setText("Load Database..");
        fileMenu.add(loadDB_item);

        logout_item.setMnemonic('l');
        logout_item.setText("Logout..");
        logout_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_itemActionPerformed(evt);
            }
        });
        fileMenu.add(logout_item);

        exit_item.setMnemonic('x');
        exit_item.setText("Exit");
        exit_item.setToolTipText("");
        exit_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_itemActionPerformed(evt);
            }
        });
        fileMenu.add(exit_item);

        jMenuBar1.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");
        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_itemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_itemActionPerformed

    private void logout_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_itemActionPerformed
       this.dispose();
       login.setVisible(true);
    }//GEN-LAST:event_logout_itemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
           
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dashboard.setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exit_item;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem loadDB_item;
    private javax.swing.JMenuItem logout_item;
    // End of variables declaration//GEN-END:variables
}
