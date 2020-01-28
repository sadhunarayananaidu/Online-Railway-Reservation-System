import java.awt.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
public class login extends JFrame
{
JLabel l_name,l_pass;
 JTextField t_name;
 JPasswordField t_pass; 
 JButton button;
 Container c;
handler handle;
database db;
 login()
 {
 super("Login form");
 c=getContentPane();
 c.setLayout(new FlowLayout());
db=new database();
 handle =new handler();
l_name=new JLabel("Username");
 l_pass=new JLabel("Password");
 t_name=new JTextField(10);
 t_pass=new JPasswordField(10);
 button=new JButton("Login");
 button.addActionListener(handle);
c.add(l_name);
 c.add(t_name);
 c.add(l_pass);
 c.add(t_pass);
 c.add(button);
 //visual
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(250,200);
 }
 public static void main(String args[])
 {
 login sample=new login();
 
 }
class handler implements ActionListener
 {
public void actionPerformed(ActionEvent ae)
 {
if(ae.getSource()==button)
 {
 char[] temp_pwd=t_pass.getPassword();
 String pwd=null;
 pwd=String.copyValueOf(temp_pwd);
 // System.out.println("Username,Pwd:"+t_name.getText()+","+pwd);
  if(db.checkLogin(t_name.getText(),pwd))
 {
JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
 JOptionPane.INFORMATION_MESSAGE);
  new train_status().setVisible(true);
  
  
 }
 else
 {
JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
 JOptionPane.ERROR_MESSAGE);
 }
 }
 }
 }
}

