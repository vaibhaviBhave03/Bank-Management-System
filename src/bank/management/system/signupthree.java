
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import java.awt.event.ActionListener;
import java.rmi.server.ExportException;
import java.awt.event.ActionEvent;



 class signupthree extends JFrame implements ActionListener {
    JRadioButton Saving,Fixed,Current,RD;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    

    
    
    signupthree(String formno){
       this.formno = formno;
        
        setLayout(null);
        
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
           // getContentPane().setBackground(Color.WHITE);
            getContentPane().setBackground(new java.awt.Color(173, 216, 230));
            setSize(850,800);
            setLocation(200,5);
            
            setVisible(true);
            
             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo2.png"));
        Image i2 = i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,80,80);
        add(image);
            
            JLabel formthree = new JLabel("Page 3 : Account Details");
            formthree.setBounds(200,20,600,40);
            formthree.setFont(new Font("Raleway",Font.BOLD,32));
            add(formthree); 
            
            JLabel form = new JLabel("Form No : ");
        form.setFont(new Font("Raleway", Font.BOLD,14));
        form.setBounds(650,10,100,30);
        add(form);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(730,10,60,30);
        add(l13);

            
            JLabel Account = new JLabel("Account Type :");
            Account.setBounds(100,80,250,30);
            Account.setFont(new Font("Raleway",Font.BOLD,22));
            add(Account); 
            
             Saving = new JRadioButton("Saving Account");
            Saving.setBounds(100,110,200,60);
           
            Saving.setBackground(new Color(173, 216, 230));
            add(Saving);
            
            Fixed = new JRadioButton("Fixed Deposit Account");
            Fixed.setBounds(350,110,200,60);
            Fixed.setBackground(new Color(173, 216, 230));
            add(Fixed);
            
             Current = new JRadioButton("Current Account");
            Current.setBounds(100,160,250,60);
            Current.setBackground(new Color(173, 216, 230));
            add(Current);
            
            RD = new JRadioButton("Recurring Deposit Account");
            RD.setBounds(350,160,500,60);
            RD.setBackground(new Color(173, 216, 230));
            add(RD);
            
            ButtonGroup type = new ButtonGroup();
            type.add(Saving);
            type.add(Fixed);
            type.add(Current);
            type.add(RD);
             
            
            JLabel Card = new JLabel("Card Number :");
            Card.setBounds(100,230,250,30);
            Card.setFont(new Font("Raleway",Font.BOLD,22));
            add(Card); 
            
             JLabel Number = new JLabel("XXXX-XXXX-XXXX-4124");
            Number.setBounds(350,230,400,30);
            Number.setFont(new Font("Raleway",Font.BOLD,22));
            add(Number); 
            
                JLabel info = new JLabel("This is your 16 Digit Card Number");
            info.setBounds(100,260,500,30);
            info.setFont(new Font("Raleway",Font.BOLD,12));
            add(info); 
            
               JLabel Pin = new JLabel("Pin:");
            Pin.setBounds(100,310,250,30);
            Pin.setFont(new Font("Raleway",Font.BOLD,22));
            add(Pin); 
            
               JLabel Pinno = new JLabel("XXXX");
            Pinno.setBounds(350,310,250,30);
            Pinno.setFont(new Font("Raleway",Font.BOLD,22));
            add(Pinno); 
            
               JLabel pindetail = new JLabel("This is your 4 Digit Password");
            pindetail.setBounds(100,340,500,30);
            pindetail.setFont(new Font("Raleway",Font.BOLD,12));
            add(pindetail); 
            
            
               JLabel Service = new JLabel("Service Required:");
            Service.setBounds(100,390,250,30);
            Service.setFont(new Font("Raleway",Font.BOLD,22));
            add(Service); 
            
            
            
            c1 = new JCheckBox("ATM CARD");
            //c1.setBackground(Color.WHITE);
             c1.setBackground(new Color(173, 216, 230));
             c1.setFont(new Font("Raleway",Font.BOLD,16));
            c1.setBounds(100,440,250,20);
            add(c1);
            
            c2 = new JCheckBox("INTERNET BANKING");
            c2.setBackground(new Color(173, 216, 230));
             c2.setFont(new Font("Raleway",Font.BOLD,16));
            c2.setBounds(350,440,250,30);
            add(c2);
            
             c3 = new JCheckBox("MOBILE BANKING");
            c3.setBackground(new Color(173, 216, 230));
             c3.setFont(new Font("Raleway",Font.BOLD,16));
            c3.setBounds(100,480,250,30);
            add(c3);
            
             c4 = new JCheckBox("EMAIL & SMS ALERTS");
            c4.setBackground(new Color(173, 216, 230));
             c4.setFont(new Font("Raleway",Font.BOLD,16));
            c4.setBounds(350,480,250,30);
            add(c4);
            
             c5 = new JCheckBox("CHEQUE BOOK");
            c5.setBackground(new Color(173, 216, 230));
             c5.setFont(new Font("Raleway",Font.BOLD,16));
            c5.setBounds(100,520,250,30);
            add(c5);
            
            
            
               c6 = new JCheckBox("E-STATEMENT");
            c6.setBackground(new Color(173, 216, 230));
            c6.setFont(new Font("Raleway",Font.BOLD,16));
            c6.setBounds(350,520,250,30);
            add(c6);
            
            c7 = new JCheckBox("I Hereby declare that the above details are correct to the best of my knowledge");
            c7.setBackground(new Color(173, 216, 230));
            c7.setFont(new Font("Raleway",Font.BOLD,15));
            c7.setBounds(100,560,700,30);
            add(c7);
            
            submit = new JButton("SUBMIT");
            submit.setBackground(Color.BLACK);
            submit.setForeground(Color.WHITE);
            submit.setFont(new Font("Raleway",Font.BOLD,15));
            submit.setBounds(180,600,150,30);
            
            submit.addActionListener(this);
            add(submit);
            
             cancel = new JButton("CANCEL");
            cancel.setBackground(Color.BLACK);
            cancel.setForeground(Color.WHITE);
            cancel.setFont(new Font("Raleway",Font.BOLD,15));
            cancel.setBounds(380,600,150,30);
            cancel.addActionListener(this);
            add(cancel);
            
            
            
        
    }
    

    
    public void actionPerformed(ActionEvent ae){
        String accountType =null;
      //  String formno;
        if(ae.getSource() == submit){
            
          
            if(Saving.isSelected()){
                accountType ="Saving";
            }
               else if(Fixed.isSelected()){
                accountType ="Fixed";
            }
            else if(Current.isSelected()){
                accountType = "Current";
            }
               else if(RD.isSelected()){
                accountType ="RD";
            }
        
            
            Random  random = new Random();
            String cardnumber ="" +Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
                   long first3 = (random.nextLong() % 9000L) + 1000L;
        String pinnumber = "" + Math.abs(first3);
            
             String facility = "";
             if(c1.isSelected()){
                 facility = facility +" ATM Card";
             }
             else if(c2.isSelected()){
                 facility = facility +" Internet Banking";
             }
               else if(c3.isSelected()){
                 facility = facility +" Mobile Banking";
             }
               else if(c4.isSelected()){
                 facility = facility +" Email & SMS alerts";
             }
               else if(c5.isSelected()){
                 facility = facility +" Cheque Book";
             }
               else if(c6.isSelected()){
                 facility = facility +" E-Statement";
             }
        
              
        
        try{
            if(accountType.equals("")){
                JOptionPane.showMessageDialog(null,"Account Type is Required");
        
        }
            else {
                Conn conn = new Conn();
                String query = "insert into signupthree values ('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query1 = "insert into login values ('"+formno+"','"+cardnumber+"','"+pinnumber+"')"; 
                conn.s.executeUpdate(query );
                 conn.s.executeUpdate(query1 );
                
                JOptionPane.showMessageDialog(null,"cardnumber : "+cardnumber+ "\n pin:"+ pinnumber);
               
                // new Transaction(pinnumber).setVisible(true);
              //  new Deposit(pinnumber).setVisible(false);
                //setVisible(false);
                // new balanceEnquiry(pinnumber).setVisible(false);
                 new Deposit(pinnumber).setVisible(true);
                  setVisible(false);
            }
        }
        
    
            
        catch(Exception e ){
            System.out.println(e);
        }
    }

    
       /* else if (ae.getSource() == cancel){
     setVisible(false);
     new Login().setVisible(true);}
*/
            
        
                }

    

        
    
    
    public static void main(String args[]){
        new signupthree("").setVisible(true);
        
        
    }
    
}
