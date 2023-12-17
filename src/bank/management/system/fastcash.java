
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class fastcash extends JFrame implements ActionListener {
    JButton deposit,withdraw,fastcash,balanceEnquiry,ministatement,back,pinchange;    
    String pinnumber;
    
    fastcash(String pinnumber){
        
        this.pinnumber = pinnumber;
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(150,230,500,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,14));
      image.add(text);
      
       deposit = new JButton("Rs 100");
       deposit.setBounds(120,325,100,18);
        //text.setForeground(Color.WHITE);
        deposit.setFont(new Font("Raleway",Font.BOLD,12));
         deposit.addActionListener(this);
      image.add(deposit);
      
        withdraw = new JButton("Rs 500");
       withdraw.setBounds(270,325,130,18);
       // withdraw.setForeground(Color.WHITE);
        withdraw.setFont(new Font("Raleway",Font.BOLD,12));
         withdraw.addActionListener(this);
      image.add(withdraw);
      
          fastcash = new JButton("Rs 1000");
       fastcash.setBounds(120,350,100,18);
        //text.setForeground(Color.WHITE);
        fastcash.setFont(new Font("Raleway",Font.BOLD,12));
         fastcash.addActionListener(this);
      image.add(fastcash);
      
          ministatement = new JButton("Rs 2000");
       ministatement.setBounds(270,350,130,18);
        //text.setForeground(Color.WHITE);
        ministatement.setFont(new Font("Raleway",Font.BOLD,12));
        ministatement.addActionListener(this);
      image.add(ministatement);
      
          pinchange = new JButton("Rs 5000");
       pinchange.setBounds(120,375,100,20);
        //text.setForeground(Color.WHITE);
        pinchange.setFont(new Font("Raleway",Font.BOLD,12));
         pinchange.addActionListener(this);
      image.add(pinchange);
      
         balanceEnquiry = new JButton("Rs 10000");
       balanceEnquiry.setBounds(270,375,130,20);
        //text.setForeground(Color.WHITE);
        balanceEnquiry.setFont(new Font("Raleway",Font.BOLD,12)); 
        balanceEnquiry.addActionListener(this);
      image.add(balanceEnquiry);
      
          back = new JButton("BACK");
       back.setBounds(270,410,130,20);
        //text.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway",Font.BOLD,12));
        back.addActionListener(this);
      image.add(back);
        
         setTitle("Transaction Page");
        setSize(700,700);
        setLocation(300,0);
    
        setVisible(true);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
           setVisible(false);
           new Transaction(pinnumber).setVisible(true);
        }
        else{
            String amount =((JButton)ae.getSource()).getText().substring(3);
            Conn conn = new Conn();
            try{
                ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance =0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                        
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"' ,'+withdraw+' , '"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs"+amount+" withdraw Succesfully");
                
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        
    }
    
    public static void main (String args[]){
        new fastcash("");
    }
}
