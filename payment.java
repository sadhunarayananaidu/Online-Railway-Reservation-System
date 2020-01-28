import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class payment extends javax.swing.JFrame {
    public payment() {
        initComponents();
         setSize(400,400);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PAYMENT FORM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 11, 130, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("CARD TYPE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(41, 46, 90, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("CVV");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(41, 84, 46, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("CARD NUMBER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(41, 124, 90, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("HOLDER NAME:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(41, 162, 93, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("VALID DATE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(41, 200, 78, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("AMOUNT:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(41, 238, 56, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("BANK NAME:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(41, 273, 76, 15);

        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(69, 331, 51, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(259, 331, 55, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(184, 43, 81, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(184, 81, 81, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(184, 121, 81, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(184, 159, 81, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(184, 197, 81, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(184, 235, 81, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(184, 267, 81, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\trains-10a.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-350, -190, 750, 560);

        pack();
}                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
String a=jTextField1.getText();
String b=jTextField2.getText();
String c=jTextField3.getText();
String d=jTextField4.getText();
String e=jTextField5.getText();
String f=jTextField6.getText();
String g=jTextField7.getText();
if(a!=null && b!=null && c!=null && d!=null && e!=null && f!=null && f!=null && g!=null)
{
    JOptionPane.showMessageDialog(null,"please fill the above credinals");
}
else
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_reservation","root","");
Statement s=con.createStatement();
String s1="insert into payment(ctype,cvv,cnumber,hname,vdate,amount,bankname) values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"');";
System.out.println("success");
s.executeUpdate(s1);
 JOptionPane.showMessageDialog(null,"paid");

}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
}         
    }                                        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
new train_status().setVisible(true); 
this.hide();
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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
               
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
}

