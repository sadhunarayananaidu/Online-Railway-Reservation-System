import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.*;

public class Cancellation extends javax.swing.JFrame {

    public Cancellation() {
        initComponents();
         setSize(600,480);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("CANCELLATION FORM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(244, 11, 170, 15);

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("PNR NO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 46, 42, 14);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("TRAIN NO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(48, 81, 53, 14);

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("TRAIN NAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(48, 116, 66, 14);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("DATE OF JOURNEY:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(48, 192, 96, 14);

        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("SOURCE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(48, 230, 45, 14);

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("DESTINATION:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(48, 268, 72, 14);

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("NAME OF PASSENGER:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(48, 288, 110, 14);

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("AGE:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(48, 319, 24, 14);

        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("GENDER:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(48, 350, 44, 14);

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 390, 60, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(318, 386, 70, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 43, 113, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(260, 75, 113, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(260, 113, 113, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(260, 151, 113, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(260, 189, 113, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(260, 227, 113, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(260, 265, 113, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(260, 290, 113, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(260, 316, 113, 20);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(260, 347, 113, 20);

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(48, 154, 66, 14);

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 390, 47, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Train-Station-HD-Wallpapers-3.jpg")); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 600, 430);

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
new train_status().setVisible(true);

    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
  
String a=jTextField1.getText();
Connection conn=null;
PreparedStatement pstmt=null;
ResultSet rs=null;
try{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql:///railway_reservation","root","");
pstmt=conn.prepareStatement("select * from reservation where pnr_no=?");
pstmt.setString(1,a);
rs=pstmt.executeQuery();
while(rs.next())
        {
         jTextField2.setText(rs.getString("train_no"));  
         jTextField3.setText(rs.getString("train_name"));  
         jTextField4.setText(rs.getString("class"));  
         jTextField5.setText(rs.getString("date"));  
         jTextField6.setText(rs.getString("source"));  
              jTextField7.setText(rs.getString("destination"));  
               jTextField8.setText(rs.getString("name"));  
                jTextField9.setText(rs.getString("age")); 
                jTextField10.setText(rs.getString("gender"));
                JOptionPane.showMessageDialog(null,"your data is selected");
                
                
        }
}catch(Exception u)
{
    JOptionPane.showMessageDialog(null,u);
    JOptionPane.showMessageDialog(null,a);
    
}
finally{
    try{
        conn.close();
        pstmt.close();
    }
    catch(Exception e1)
    {
        JOptionPane.showMessageDialog(null,e1);
    
    }
}   
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   try
   {
       String a=jTextField1.getText();
String my="com.mysql.jdbc.Driver";
String myUrl="jdbc:mysql://localhost/railway_reservation";
Class.forName(my);
Connection conn=DriverManager.getConnection(myUrl,"root","");
String query="delete from reservation where pnr_no=?";
PreparedStatement pstmt=conn.prepareStatement(query);
pstmt.setString(1,a);
pstmt.execute();
conn.close();
 JOptionPane.showMessageDialog(null,"your ticket is canceled");
    }                                        
catch(Exception e)
{
    System.err.println("Got an exception");
    System.err.println(e.getMessage());
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
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellation().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;

    private static class jTexField9 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField9() {
        }
    }

    private static class jTexField7 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField7() {
        }
    }

    private static class jTexField5 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField5() {
        }
    }

    private static class jTexField6 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField6() {
        }
    }

    private static class jTexField1 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField1() {
        }
    }

    private static class jTexField3 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField3() {
        }
    }

    private static class jTexField4 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField4() {
        }
    }

    private static class jTexField2 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField2() {
        }
    }

    private static class jTexField8 {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jTexField8() {
        }
    }
}
