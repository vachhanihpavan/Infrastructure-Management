/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaushik
 */
public class splash1 extends javax.swing.JFrame {

    /**
     * Creates new form splash1
     */
    public splash1() {
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

        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        p1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Infrastructure Management System");
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(36, 23, 760, 63);

        l1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        l1.setText("           99%");
        l1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(l1);
        l1.setBounds(381, 104, 127, 38);

        p1.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(p1);
        p1.setBounds(290, 150, 250, 36);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infrastructure.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(845, 450));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        splash1 Splash=new splash1();
        Splash.setVisible(true);
        Kaushik Start = new Kaushik();
        try
        {
            for(int i=0 ;i<=100;i++)
            {
                Thread.sleep(20);
                Splash.l1.setText(Integer.toString(i)+"%");
                Splash.p1.setValue(i);
                if(i==100)
                {
                    Splash.setVisible(false);
                    Start.setVisible(true);
                }
                            }
        }
         catch(Exception e)
        {
            
        }
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
            java.util.logging.Logger.getLogger(splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash1().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel l1;
    public javax.swing.JProgressBar p1;
    // End of variables declaration//GEN-END:variables
}
