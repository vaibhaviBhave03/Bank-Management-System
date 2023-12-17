
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    //global defined variables
    JButton login,clear,signup;
     JPasswordField pinTextField;
     JTextField cardTextField;
    String pinnumber;
    String formno;
    //constructor
     Login(){
        this.pinnumber = pinnumber;
         this.formno = formno;
        setTitle("Automated Teller Machine");
       // super("Bank Management system");
         setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo2.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel label = new JLabel(i3);
         label.setBounds(70,10,100,100);
         add(label);
         
         
         JLabel text = new JLabel("WELCOME TO ATM");
         text.setBounds(220,40,400,40);
         text.setFont(new Font("Osward", Font.BOLD,32));
         add(text);
         //cardno text
          JLabel cardno = new JLabel("Card No :");
         cardno.setBounds(200,150,200,40);
         cardno.setFont(new Font("Raleway", Font.BOLD,25));
         add(cardno);
         
         //text beside card no 
         cardTextField = new JTextField();
         cardTextField.setBounds(350,150,220,40);
          cardTextField.setFont(new Font("Arial",Font.BOLD,16));
         add(cardTextField);
         
         //pin no text
          JLabel pinno = new JLabel("Pin No :");
         pinno.setBounds(200,230,200,40);
         pinno.setFont(new Font("Raleway", Font.BOLD,25));
         add(pinno);
         //textbox
           pinTextField = new JPasswordField();
         pinTextField.setBounds(350,230,220,40);
         pinTextField.setFont(new Font("Arial",Font.BOLD,18));
         add(pinTextField);
         
         //button
         login = new JButton("SIGN IN");
         login.setBounds(350,300,100,30);
         login.addActionListener(this);
         add(login);
         
         clear = new JButton("CLEAR");
         clear.setBounds(470,300,100,30);
         clear.addActionListener(this);
         add(clear);
         
         signup = new JButton("SIGN UP");
         signup.setBounds(350,350,220,30);
         signup.addActionListener(this);
         add(signup);
         //colorbutton
         signup.setBackground(Color.black);
         signup.setForeground(Color.WHITE);

         
         //getContentPane().setBackground(Color.WHITE);
         ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,800,480);
        add(iiimage);

         
         setSize(800, 480);
         setVisible(true);
         setLocation(350, 100);
     }
     
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
            
        }
        else if(ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber =cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber ='"+cardnumber+"' and pin = '"+pinnumber+"'";
            
        try{
            ResultSet rs = conn.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect card number or pin number");
            }  
        }
        catch(Exception e ){
            System.out.println(e);
        }
    }
        else if (ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        
    }
    }
    public static void main(String [] args){
        new Login().setVisible(true);
    }
    
}
