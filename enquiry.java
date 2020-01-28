import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

public class enquiry extends javax.swing.JFrame {

    public enquiry() {
        initComponents();
         setSize(465,350);
        setLocationRelativeTo(null);
    }
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PNR ENQUIRY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(173, 29, 110, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("PNR NO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(28, 64, 70, 15);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(173, 120, 166, 96);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("PNR DETAILS:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(28, 133, 90, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(173, 61, 166, 20);

        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(67, 250, 90, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(259, 250, 100, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\57-500x600.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 490, 330);

        pack();
    } 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
new train_status().setVisible(true);        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 String a=jTextField1.getText();
 if(a!=null)
{
    JOptionPane.showMessageDialog(null,"please fill the above credinals");
}
else
{
Connection conn=null;
PreparedStatement pstmt=null;
ResultSet rs=null;
try{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql:///railway_reservation","root","");
pstmt=conn.prepareStatement("select * from enquiry where pnr=?");
pstmt.setString(1,a);
rs=pstmt.executeQuery();
while(rs.next())
        {
         jTextArea1.setText(rs.getString("pnr_details"));  
         
                
        }
}catch(Exception u)
{
    JOptionPane.showMessageDialog(null,u);
    
    
}
finally{
    try{
        conn.close();
        pstmt.close();
        rs.close();
    }
    catch(Exception u)
    {
        JOtionPane.showMessageDialog(null,u);
        }
}       
    }                                        
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enquiry().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;

    private static class jTexArea1 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexArea1() {
        }
    }

    private static class JOtionPane {

        private static void showMessageDialog(Object object, Exception u) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JOtionPane() {
        }
    }
}
