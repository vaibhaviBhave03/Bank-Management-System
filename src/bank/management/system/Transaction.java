
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Transaction extends JFrame implements ActionListener {
    JButton deposit,withdraw,fastcash,balanceEnquiry,ministatement,exit,pinchange;    
    String pinnumber;
    
    Transaction(String pinnumber){
        
        this.pinnumber = pinnumber;
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(150,230,500,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,14));
      image.add(text);
      
       deposit = new JButton("Deposit");
       deposit.setBounds(120,325,100,18);
        //text.setForeground(Color.WHITE);
        deposit.setFont(new Font("Raleway",Font.BOLD,12));
         deposit.addActionListener(this);
      image.add(deposit);
      
        withdraw = new JButton("Cash Withdrawl");
       withdraw.setBounds(270,325,130,18);
       // withdraw.setForeground(Color.WHITE);
        withdraw.setFont(new Font("Raleway",Font.BOLD,12));
         withdraw.addActionListener(this);
      image.add(withdraw);
      
          fastcash = new JButton("Fast Cash");
       fastcash.setBounds(120,350,100,18);
        //text.setForeground(Color.WHITE);
        fastcash.setFont(new Font("Raleway",Font.BOLD,12));
         fastcash.addActionListener(this);
      image.add(fastcash);
      
          ministatement = new JButton("Mini Statement");
       ministatement.setBounds(270,350,130,18);
        //text.setForeground(Color.WHITE);
        ministatement.setFont(new Font("Raleway",Font.BOLD,12));
        ministatement.addActionListener(this);
      image.add(ministatement);
      
         
                  pinchange = new JButton("Pin change");
       pinchange.setBounds(120,375,100,20);
        //text.setForeground(Color.WHITE);
        pinchange.setFont(new Font("Raleway",Font.BOLD,12));
         pinchange.addActionListener(this);
      image.add(pinchange);
      
         balanceEnquiry = new JButton("Balance Enquiry");
       balanceEnquiry.setBounds(270,375,130,20);
        //text.setForeground(Color.WHITE);
        balanceEnquiry.setFont(new Font("Raleway",Font.BOLD,12)); 
        balanceEnquiry.addActionListener(this);
      image.add(balanceEnquiry);
      
          exit = new JButton("Exit");
       exit.setBounds(270,410,130,20);
        //text.setForeground(Color.WHITE);
        exit.setFont(new Font("Raleway",Font.BOLD,12));
        exit.addActionListener(this);
      image.add(exit);
        
         setTitle("Transaction Page");
        setSize(700,700);
        setLocation(300,0);
    
        setVisible(true);
        
        
        
        
    }
    @Override
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }
        else if (ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
         else if (ae.getSource() == withdraw){
            setVisible(false);
            new withdrawl(pinnumber).setVisible(true);
        }
          else if (ae.getSource() == fastcash){
            setVisible(false);
            new fastcash(pinnumber).setVisible(true);
        }
          else if (ae.getSource() == pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
           else if (ae.getSource() == balanceEnquiry){
            setVisible(false);
            new balanceEnquiry(pinnumber).setVisible(true);
        }
           else if (ae.getSource() == ministatement){
            setVisible(false);
            new miniStatement(pinnumber).setVisible(true);
        }
        
    }
    
    public static void main (String args[]){
        new Transaction("").setVisible(true);
    }
}
