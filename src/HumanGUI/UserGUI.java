package HumanGUI;

import Human.User;
import TicketpGUI.TicketGUI;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import TicketingSystemGUI.HomeScreen;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.text.MaskFormatter;
import static ticketingsystem.TicketingSystem.y;


public class UserGUI extends JFrame  {
   ImageIcon background_image =new ImageIcon();
    
    JFrame Frame =new JFrame();
    JFrame Frame2 =new JFrame();
    JFrame Frame3 =new JFrame();
    JTextField Username=new JTextField("");
    JPasswordField Password =new JPasswordField("");
    JLabel Name=new JLabel("Username :  ");
    JLabel Pass=new JLabel("Password : ");
    JButton Submit =new JButton("Submit");
    JButton Submit1 =new JButton("Submit");
    JButton NewUser =new JButton("Sign Up");
    JButton Login =new JButton("login");
    JLabel Name1=new JLabel("First Name  ");
     JTextField FirstName=new JTextField("");
     JLabel MiddleName=new JLabel("Middle Name  ");
     JTextField MiddleNam=new JTextField(" ");
     JLabel LastName=new JLabel("Last Name  ");
     JTextField LastNam=new JTextField("");
     JLabel email=new JLabel("Email  ");
     JTextField email1=new JTextField(" ");
     JLabel telephone=new JLabel("telephone  ");
     JFormattedTextField telep;
     JLabel salary=new JLabel("Salary  ");
     JTextField ssalary=new JTextField("");
     JLabel Address=new JLabel("Address  ");
     JTextField Adress=new JTextField("");
     JLabel ID=new JLabel("ID  ");
     JTextField ID1=new JTextField(" ");
     JLabel SocialID=new JLabel("Social ID  ");
     JTextField sID=new JTextField(" ");
     JLabel username=new JLabel("username  ");
     JTextField Username1=new JTextField("");
     JLabel password=new JLabel("password  ");
     JPasswordField Password1=new JPasswordField("");
     JLabel Birthdate=new JLabel("birthdate  ");
     JTextField birthdate=new JTextField("");
     JLabel CompName=new JLabel("comp Name  ");
     JTextField companyName=new JTextField("");
     JLabel NoOfEmployees=new JLabel("Employees no.  ");
     JTextField employeess=new JTextField("");
     JButton Home = new JButton("Home Screen");
     JButton Home2 = new JButton("Main Screen");
      private MaskFormatter mask ;
     protected  User UserS = new User();
     
     
    
     private void SignUp(){
    
     
        Frame3.setTitle("Sign up");
        Frame3.setResizable(false);
        Frame3.setLayout(null);     
        Frame3.setSize(600,600);
        Frame3.setVisible(true);
        Frame3.getContentPane().add(Name1);
        Name1.setBounds(10,0,110,20);
        Name1.setForeground(Color.WHITE);
        FirstName.setBounds(90,0,110,20);
        Frame3.getContentPane().add(FirstName);
        Frame3.getContentPane().add(MiddleName);
        MiddleName.setBounds(10,30,110,20);
        MiddleName.setForeground(Color.WHITE);
        MiddleNam.setBounds(90,30,110,20);
        Frame3.getContentPane().add(MiddleNam);
        Frame3.getContentPane().add(LastName);
        LastName.setBounds(10,60,110,20);
        LastName.setForeground(Color.WHITE);
        LastNam.setBounds(90,60,110,20);
        Frame3.getContentPane().add(LastNam);
        Frame3.getContentPane().add(ID);
        ID.setBounds(10,90,110,20);
        ID.setForeground(Color.WHITE);
        ID1.setBounds(90,90,110,20);
        Frame3.getContentPane().add(ID1);
        Frame3.getContentPane().add(username);
        username.setBounds(10,120,110,20);
        username.setForeground(Color.WHITE);
        Username1.setBounds(90,120,110,20);
        Frame3.getContentPane().add(Username1);
        Frame3.getContentPane().add(password);
        password.setBounds(10,180,110,20);
        password.setForeground(Color.WHITE);
        Password1.setBounds(90,180,110,20);
        Frame3.getContentPane().add(Password1);
        Frame3.getContentPane().add(email);
        email.setBounds(10,210,110,20);
        email.setForeground(Color.WHITE);
        email1.setBounds(90,210,110,20);
        Frame3.getContentPane().add(email1);
        Frame3.getContentPane().add(telephone);
        telephone.setBounds(10,240,110,20);
        telephone.setForeground(Color.WHITE);
        telep.setBounds(90,240,110,20);
        Frame3.getContentPane().add(telep);
        Frame3.getContentPane().add(Address);
        Address.setBounds(10,290,110,20);
        Address.setForeground(Color.WHITE);
        Adress.setBounds(90,290,110,20);
        Frame3.getContentPane().add(Adress);
        Frame3.getContentPane().add(SocialID);
        SocialID.setBounds(10,320,110,20);
        SocialID.setForeground(Color.WHITE);
        sID.setBounds(90,320,110,20);
        Frame3.getContentPane().add(sID);
        Frame3.getContentPane().add(salary);
        salary.setBounds(10,350,110,20);
        salary.setForeground(Color.WHITE);
        ssalary.setBounds(90,350,110,20);
        Frame3.getContentPane().add(ssalary);
        Frame3.getContentPane().add(Birthdate);
        Birthdate.setBounds(10,380,110,20);
        Birthdate.setForeground(Color.WHITE);
        birthdate.setBounds(90,380,110,20);
        Frame3.getContentPane().add(birthdate);
        Frame3.getContentPane().add(CompName);
        CompName.setBounds(10,410,110,20);
        CompName.setForeground(Color.WHITE);
        companyName.setBounds(90,410,110,20);
        Frame3.getContentPane().add(companyName);
        
        
         Frame3.getContentPane().add(Submit1);
        Submit1.setBounds(120,500,75,20);
        Frame3.getContentPane().add(Home);
        Home.setBounds(120,530,300,20);
     Frame3.setDefaultCloseOperation(EXIT_ON_CLOSE);
      background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame3.add(background);
      
     }
    
    public UserGUI() {
        try {
             mask = new MaskFormatter("(###)###-####-#");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
         
        
       Frame2.setTitle("User");
        Frame2.setLayout(null);     
        Frame2.setSize(600,600);
        Frame2.setVisible(true);
        Frame2.setResizable(false);
        Frame2.add(NewUser);
        NewUser.setBounds(100, 150, 400, 30);
        Frame2.add(Login);
        Login.setBounds(100, 250, 400, 30);
         Frame2.getContentPane().add(Home2);
        Home2.setBounds(200,320,200,20);
         telep= new JFormattedTextField(mask);
        
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);
       

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame2.add(background);
        
       
     
        Frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Submit.addActionListener(new ButtonWatcher1());
        Submit1.addActionListener(new ButtonWatcher1());
        NewUser.addActionListener(new ButtonWatcher());
        Login.addActionListener(new ButtonWatcher());
        Home.addActionListener(new ButtonWatcher1());
        Home2.addActionListener(new ButtonWatcher1());
        
        
    }
     
        
        
        
    /*@Override
    public void run(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss ");
    while(true){
    LocalDateTime local = LocalDateTime.now();
    Time.setText(dtf.format(local));
    try {
    Thread.sleep(1000);
    } catch (InterruptedException ex) {
    Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    }*/
     private void Login(){
         Frame.setTitle("Login");
        Frame.setLayout(null);     
        Frame.setSize(600,600);
        Frame.setVisible(true);
        Frame.setResizable(false);
        
        Frame.getContentPane().add(Name);
        Name.setBounds(100,50,110,20);
        Name.setForeground(Color.WHITE);
        Username.setBounds(180,50,110,20);
        Frame.getContentPane().add(Username);
        
        Frame.add(Pass);
        Pass.setBounds(100,100,110,20);
        Pass.setForeground(Color.WHITE);
        Password.setBounds(180,100,110,20);
        Frame.getContentPane().add(Password);
        
        Frame.getContentPane().add(Submit);
        Submit.setBounds(200,200,110,20);
        Frame.getContentPane().add(Home);
        Home.setBounds(100,280,300,20);
       
        
        
        background_image=new ImageIcon("C:\\Users\\Mohamed\\Desktop\\tst.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(600,600, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,600,600);
      Frame.add(background);
        
      Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
     }
        
    private class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed=ae.getSource();
            if(buttonPressed.equals(NewUser)){
                Frame2.setVisible(false);
                Frame3.setVisible(true);
                SignUp();
                
            }
                else if (buttonPressed.equals(Login)){
                    Frame2.setVisible(false);
                    Frame.setVisible(true);
                Login();
                
                 
                
}
}}
 private class ButtonWatcher1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object buttonPressed=ae.getSource();
if(buttonPressed.equals(Submit1)){
    if(!FirstName.getText().isEmpty() && FirstName.getText().length()<=2 && !FirstName.getText().matches("[a-zA-Z]+") ){
                    JOptionPane.showMessageDialog(null, "Invalid First Name , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                    else if(!LastNam.getText().isEmpty() && LastNam.getText().length()<=2 && !LastNam.getText().matches("[a-zA-Z]+") ){
                    JOptionPane.showMessageDialog(null, "Invalid Last Name , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                     else if(!MiddleNam.getText().isEmpty() && MiddleNam.getText().length()<=2 && !MiddleNam.getText().matches("[a-zA-Z]+") ){
                    JOptionPane.showMessageDialog(null, "Invalid Middle Name , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                      else if(!ID1.getText().isEmpty() && ID1.getText().length()<=2 ){
                    JOptionPane.showMessageDialog(null, "Invalid ID , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                       else if(!sID.getText().isEmpty() && sID.getText().length()<=12 ){
                    JOptionPane.showMessageDialog(null, "Invalid Social ID , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
                       
                     else if(!Username1.getText().isEmpty() && Username1.getText().length()<=4 ){
                    JOptionPane.showMessageDialog(null, "Invalid Username , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }    
                     else if(!Password1.getText().isEmpty() && Password1.getText().length()<=4 ){
                    JOptionPane.showMessageDialog(null, "Invalid Password , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }    
                      else if(!Adress.getText().isEmpty() && Adress.getText().length()<=4 ){
                    JOptionPane.showMessageDialog(null, "Invalid Address , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }    
                       else if(!telep.getText().isEmpty() && telep.getText().length()<=0 && telep.getText().length()>=12 ){
                    JOptionPane.showMessageDialog(null, "Invalid Telephone Number , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }  
                       else if(!companyName.getText().isEmpty() && companyName.getText().length()<=2 ){
                    JOptionPane.showMessageDialog(null, "Invalid Company Name , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }  
                         else if(!email1.getText().isEmpty() && email1.getText().length()<=10&& !email1.getText().contains("@") && !email1.getText().contains(".com")){
                    JOptionPane.showMessageDialog(null, "Invalid email , Please enter another one" , "alert" , JOptionPane.ERROR_MESSAGE); 
                }
    else{
User  user = new User() ;
                 user.setFirstName(FirstName.getText());
        user.setLastName(LastNam.getText());
        user.setMiddleName(MiddleNam.getText());
        user.setId(ID1.getText());
        user.setSocialID(sID.getText());
        user.setEmail(email1.getText());
        user.setUserName(Username1.getText());
        user.setPassword(Password1.getText());
        user.setPhoneNumber(telep.getText());
        user.setAddress(Adress.getText());
        user.setBirthDate(birthdate.getText());
        user.setCompanyName(companyName.getText());
       
                try {
                    user.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        y.add(user);
                try {
                    user.WritingFile();
                } catch (IOException ex) {
                    Logger.getLogger(UserGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    user.ReadingFile();
                } catch (IOException ex) {
                    Logger.getLogger(SupplierGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        y.add(user);
                try {
                    user.WritingFile();
                } catch (IOException ex) {
                    Logger.getLogger(SupplierGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Sign up complete");
           Frame3.setVisible(false);
           TicketGUI sd = new TicketGUI();
            }

}
        else if(buttonPressed.equals(Submit)){
                if (UserS.LoginIn(Username.getText(),Password.getText())==true){
                 JOptionPane.showMessageDialog(null, "Login complete "+" Welcome ");
                 Frame.setVisible(false);
                 TicketGUI sd = new TicketGUI();
                }
            else {
             JOptionPane.showMessageDialog(null, "Login failed invalid username or password ");
                }}
      if (buttonPressed.equals(Home)){
                dispose();
            UserGUI x = new UserGUI();
            } 
       if (buttonPressed.equals(Home2)){
                dispose();
                 Frame2.setVisible(false);
            HomeScreen x = new HomeScreen();
            } 
}
 }}