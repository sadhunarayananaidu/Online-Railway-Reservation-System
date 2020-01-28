import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class reservation extends javax.swing.JFrame {

 

    public reservation() {
        initComponents();
         setSize(590,465);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("RESERVATION FORM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(209, 0, 170, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("TRAIN NUMBER:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(69, 66, 96, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("TRAIN NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(69, 92, 96, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("DATE OF JOURNEY:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(69, 147, 113, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("CLASS:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(69, 122, 44, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("SOURCE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(69, 188, 96, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("DESTINATION:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(69, 226, 86, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 235, 188));
        jLabel8.setText("NAME OF PASSENGER:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(69, 275, 120, 15);

        jButton1.setText("RESERVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(73, 397, 90, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(295, 397, 70, 23);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(295, 25, 87, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(295, 54, 87, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(295, 80, 87, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(295, 118, 87, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(295, 147, 87, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(295, 185, 87, 20);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(295, 223, 87, 20);

        jLabel9.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 236, 199));
        jLabel9.setText("PNR NO:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(69, 28, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("AGE:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(69, 313, 28, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 234, 220));
        jLabel11.setText("GENDER:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(69, 351, 100, 15);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(295, 272, 87, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(295, 310, 87, 20);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(295, 348, 87, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\11_railinfo2.jpg")); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 570, 420);

        pack();
    } 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
new train_status().setVisible(true);
this.hide();
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

String a=jTextField1.getText();
String b=jTextField2.getText();
String c=jTextField3.getText();
String d=jTextField4.getText();
String e=jTextField5.getText();
String f=jTextField6.getText();
String g=jTextField7.getText();
String h=jTextField8.getText();
String i=jTextField9.getText();
String j=jTextField10.getText();
if(a!=null && b!=null && c!=null && d!=null && e!=null && f!=null && f!=null && g!=null && h!=null && i!=null && j!=null)
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
String s1="insert into reservation(pnr_no,train_no,train_name,class,date,source,destination,name,age,gender) values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"');";
System.out.println("success");
s.executeUpdate(s1);
 JOptionPane.showMessageDialog(null,"you reserved the ticket");

}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1+"reservation failed");
}        // TODO add your handling code here:
    }                                        
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservation().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
}

