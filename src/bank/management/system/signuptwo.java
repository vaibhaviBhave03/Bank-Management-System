
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class signuptwo extends JFrame implements ActionListener {
    
    JTextField PancardTextField,AdhartextField;
      JComboBox cat,reli,inc,occ,edu;
     JRadioButton yes,No,accyes,accNo;
      JButton next1 ;
      String formno;
    
    
    signuptwo(String formno ){
              

        this.formno = formno;
        
               setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(149, 200, 216));
       //  getContentPane().setBackground(new java.awt.Color(137, 207, 239));
        setSize(850,800);
        setLocation(200,5);
        setVisible(true);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo2.png"));
        Image i2 = i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,80,80);
        add(image);
        
        JLabel formtwo = new JLabel("Page 2 : Additional Details");
        formtwo.setBounds(200,20,600,40);
        formtwo.setFont(new Font("Raleway", Font.BOLD, 32));
        add(formtwo);
        
            JLabel form = new JLabel("Form No : ");
        form.setFont(new Font("Raleway", Font.BOLD,14));
        form.setBounds(650,10,100,30);
        add(form);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(730,10,60,30);
        add(l13);
        
         JLabel religion = new JLabel("Religion :");
        religion.setBounds(100, 100,250,30);
        religion.setFont(new Font("Raleway", Font.BOLD, 22));
        add(religion);
        
        String valReligion [] ={"Hindu","Muslim","Sikh","Christian","Other"};
         reli = new JComboBox(valReligion);
        reli.setBounds(350,100,400,30);
        reli.setBackground(Color.WHITE);
        add(reli);
        
             
        
         JLabel Category = new JLabel("Category :");
        Category.setBounds(100, 150,250,30);
        Category.setFont(new Font("Raleway", Font.BOLD, 22));
        add(Category);
        
        String valCategory [] ={"General","OBC","SC","ST","Other"};
         cat = new JComboBox(valCategory);
        cat.setBounds(350,150,400,30);
        cat.setBackground(Color.WHITE);
        add(cat);
        
         JLabel Income = new JLabel("Income :");
        Income.setBounds(100, 200,250,30);
        Income.setFont(new Font("Raleway", Font.BOLD, 22));
        add(Income);
        
        
        String valIncome[] ={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
         inc = new JComboBox(valIncome);
          inc.setBounds(350,200,400,30);
        inc.setBackground(Color.WHITE);
        add(inc);
        
        
         JLabel EducationQualification = new JLabel("Education Qualification : ");
        EducationQualification .setBounds(100, 250,250,30);
        EducationQualification .setFont(new Font("Raleway", Font.BOLD, 22));
        add(EducationQualification );
        
        String valEducation[] ={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
         edu = new JComboBox(valEducation);
          edu.setBounds(350,250,400,30);
        edu.setBackground(Color.WHITE);
        add(edu);
        
         JLabel Occupation = new JLabel("Occupation:");
        Occupation.setBounds(100, 300,250,30);
        Occupation.setFont(new Font("Raleway", Font.BOLD, 22));
        add(Occupation);
        
           
        String valOccupation[] ={"Salaried","Self-Employmed","Business","Student","Retired","Others"};
         occ = new JComboBox(valOccupation);
          occ.setBounds(350,300,400,30);
        occ.setBackground(Color.WHITE);
        add(occ);
        
                 JLabel Pancard = new JLabel("PanCard Number :");
        Pancard.setBounds(100, 350,250,30);
        Pancard.setFont(new Font("Raleway", Font.BOLD, 22));
        add(Pancard);
        
       PancardTextField = new JTextField();
        PancardTextField.setBounds(350,350,400,30);
        PancardTextField.setFont(new Font ("Raleway", Font.BOLD, 14));
        add(PancardTextField);
        
                JLabel AadharCard = new JLabel("Aadhar Card :");
        AadharCard.setBounds(100, 400,250,30);
        AadharCard.setFont(new Font("Raleway", Font.BOLD, 22));
        add(AadharCard);
        
      AdhartextField = new JTextField();
        AdhartextField.setBounds(350,400,400,30);
        AdhartextField.setFont(new Font ("Raleway", Font.BOLD, 14));
        add(AdhartextField);
        
               JLabel SeniorCitizen = new JLabel("Senior Citizen :");
        SeniorCitizen.setBounds(100, 450,250,30);
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 22));
        add(SeniorCitizen);
        
       yes = new JRadioButton("YES");
        yes.setBounds(350,450,60,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
         No = new JRadioButton("NO");
        No.setBounds(450,450,60,30);
        No.setBackground(Color.WHITE);
        add(No) ;
        
        ButtonGroup senior = new ButtonGroup();
        senior.add(yes);
        senior.add(No);
        
        
               JLabel ExistingAcc = new JLabel("Existing Account :");
        ExistingAcc.setBounds(100, 500,250,30);
        ExistingAcc.setFont(new Font("Raleway", Font.BOLD, 22));
        add(ExistingAcc);
        
        
            accyes = new JRadioButton("YES");
        accyes.setBounds(350,500,60,30);
        accyes.setBackground(Color.WHITE);
        add(accyes);
        
        accNo = new JRadioButton("NO");
        accNo.setBounds(450,500,60,30);
        accNo.setBackground(Color.WHITE);
        add(accNo) ;
        
        ButtonGroup account = new ButtonGroup();
        account.add(accyes);
        account.add(accNo);
        
        
         next1 = new JButton("NEXT");
        next1.setBackground(Color.BLACK);
        next1.setForeground(Color.WHITE);
        next1.setBounds(350,550,120,30);
           next1.addActionListener(this);
        add(next1);
        
        
        
        
    }
  
   public void actionPerformed(ActionEvent ae){
     
       String sreligion = (String) reli.getSelectedItem();
         String scat = (String) cat.getSelectedItem();
          String sinc = (String) inc.getSelectedItem();
           String socc = (String) occ.getSelectedItem();
            String sedu = (String) edu.getSelectedItem();
           String pancard = PancardTextField.getText();
           String aadhar = AdhartextField.getText();
           String senior = null;
           if(yes.isSelected()){
               senior ="YES";
           }
           else if(No.isSelected()){
               senior ="NO";
           }
           
           String account = null;
           if(accyes.isSelected()){
               account ="YES";
           }
           else if(accNo.isSelected()){
               account ="NO";
           }
       
       try{
           Conn c = new Conn();
           String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scat+"','"+sinc+"','"+socc+"','"+sedu+"','"+pancard+"','"+aadhar+"','"+senior+"','"+account+"')";
      c.s.executeUpdate(query);
      
      //signup3 object trigger
      setVisible(false);
      new signupthree(formno).setVisible(true);
      
       }
       
       catch(Exception e){
           System.out.println(e);
       }
   }
    
    
    
    public static void main(String args[]){
        new signuptwo("");
        
        
        
    }
    
}
