
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;



public class withdrawl extends JFrame implements ActionListener{
    
    JButton back, withdraw;
    JTextField amount;
    String pinnumber;
    
    withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("DEPOSIT PAGE");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);
        
         amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
         withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
          back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,950);
        setLocation(300,0);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== withdraw){
            String number = amount.getText();
            
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to Withdraw");
                
            }
            else{
                try{
                Conn conn =new Conn();
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
                if(ae.getSource() != back && balance < Integer.parseInt(number)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs" +number+ " withdraw Successfully");
                setVisible (false);
                new Transaction(pinnumber).setVisible(true);
                        }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        else if(ae.getSource() == back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    }
    public static void main (String args[]){
        new withdrawl("");
        
    }
    
}

