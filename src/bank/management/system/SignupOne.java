
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
   // long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,statesTextField,pincodeTextField;
    JButton next;
    JRadioButton male, female,Married,UnMarried,Others;
    JDateChooser date;
     
    
        Random ran = new Random();
     long first = (ran.nextLong() % 9000L)+ 1000L;
    String form = ""+Math.abs(first);
        
    //constructor
    SignupOne(){
       
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
        //layout dissasper
        setLayout(null);
        //frame
       //getContentPane().setBackground(Color.GREEN);
       getContentPane().setBackground(new java.awt.Color(137, 207, 239));
        setSize(850,800);
        setLocation(200,5);
        setVisible(true);
        //label
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo2.png"));
        Image i2 = i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,80,80);
        add(image);
        
        //create random no
    
    
     
  
        JLabel formno = new JLabel("APPLICATION FORM NO. " + form);
        formno.setFont(new Font("Raleway",Font.BOLD, 32));
        formno.setBounds(200,20,600,40);
        add(formno);
        
          JLabel PersonalDetails = new JLabel("Page 1 : Personal Details");
        PersonalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        PersonalDetails.setBounds(350,60,600,40);
        add(PersonalDetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font ("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        //textfield 
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font ("Raleway", Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font ("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        date = new JDateChooser();
        date.setBounds(300,240,400,30);
        date.setForeground(new Color(105,105,105));
        add(date);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font ("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
       
         male = new JRadioButton("Male");
         male.setBounds(300,290,60,30);
         male.setBackground(Color.WHITE);
         add(male);
         
          female = new JRadioButton("Female");
          female.setBounds(450,290,120,30);
          female.setBackground(Color.WHITE);
          add(female);
          
          ButtonGroup gendergroup = new ButtonGroup();
          gendergroup.add(male);
          gendergroup.add(female);
        
        
        JLabel email = new JLabel("Email address :");
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);   
        
         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway",Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
             Married = new JRadioButton("Married");
          Married.setBounds(300,390,120,30);
          Married.setBackground(Color.WHITE);
          add(Married);
          
               UnMarried = new JRadioButton("UnMarried");
          UnMarried.setBounds(450,390,120,30);
          UnMarried.setBackground(Color.WHITE);
          add(UnMarried);
          
              Others = new JRadioButton("Others");
          Others.setBounds(600,390,120,30);
          Others.setBackground(Color.WHITE);
          add(Others);
          
          ButtonGroup maritalGroup = new ButtonGroup();
          maritalGroup.add(Married);
          maritalGroup.add(UnMarried);
          maritalGroup.add(Others);
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font ("Raleway",Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel states = new JLabel("States :");
        states.setFont(new Font("Raleway",Font.BOLD, 20));
        states.setBounds(100,540,200,30);
        add(states);
        
         statesTextField = new JTextField();
        statesTextField.setFont(new Font ("Raleway",Font.BOLD, 14));
        statesTextField.setBounds(300,540,400,30);
        add(statesTextField);
        
         JLabel pincode = new JLabel("Pin Code :");
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
          pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font ("Raleway",Font.BOLD, 14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        JButton next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font ("Raleway", Font.BOLD, 14));
        next.setBounds(750,570,80,50);
          next.addActionListener(this);
        add(next);
      
        
        
    }
   
    public void actionPerformed (ActionEvent ae){
        String formno = form; //long to string
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
         //String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
     String dob =((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if (female.isSelected()){
            gender ="Female";
        }
        String  email = emailTextField.getText();
        String marital = null;
        if(Married.isSelected()){
            marital = "Married";
        }
        else if (UnMarried.isSelected()){
            marital ="UnMarried";
        }
         else if (Others.isSelected()){
            marital ="Others";
        }
        String address = addressTextField.getText();
         String city = cityTextField.getText();
          String states = statesTextField.getText();
           String pin = pincodeTextField.getText();
           
           try{
               if(name.equals("")){
                   JOptionPane.showMessageDialog(null, "Name text field is empty");
               }
               else{
                   Conn c = new Conn();
                   String query = "insert into signup values ('"+formno+"','"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"','"+states+"')";
               c.s.executeUpdate(query);
               setVisible(false);
               new signuptwo(formno).setVisible(true);
               }
           }
               catch (Exception e){
                   
                   System.out.println(e);
                       
                       }
           
        
    }
    
    public static void main (String args[]){
        new SignupOne().setVisible(true);
    }
}
