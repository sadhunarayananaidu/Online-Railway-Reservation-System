import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class passenger extends javax.swing.JFrame {
    public passenger() {
        initComponents();
         setSize(671,560);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("PASSENGER FORM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(196, 22, 170, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("PID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 68, 40, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("NAME OF PASSENGER:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 106, 134, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("AGE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 141, 50, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("GENDER:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 176, 60, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("ADDRESS:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 254, 80, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("CATAGORY:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 401, 80, 15);

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(83, 472, 90, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(273, 472, 80, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(229, 65, 133, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(229, 103, 133, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(229, 135, 133, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(229, 173, 133, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(229, 242, 175, 100);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(229, 395, 133, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Train-Station-HD-Wallpapers-3.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-550, -770, 1230, 1730);

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

String f=jTextArea1.getText();
String g=jTextField6.getText();
if(a!=null && b!=null && c!=null && d!=null && f!=null && f!=null && g!=null)
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
String s1="insert into passenger(pid,name,age,gender,address,catagory) values('"+a+"','"+b+"','"+c+"','"+d+"','"+f+"','"+g+"');";
System.out.println("success");
s.executeUpdate(s1);
JOptionPane.showMessageDialog(null,"your data is successfully inserted");
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
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
            java.util.logging.Logger.getLogger(passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passenger().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
   

    private Object jCheckBox1() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
