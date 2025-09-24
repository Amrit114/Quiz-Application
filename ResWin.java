import java.awt.event.*;
import java.awt.*;
import java.util.*;
class ResWin extends Frame implements ActionListener
 {
     Image yes;
     Label per,dt,name,pass,percent;
     Button b9,b10;
     String uans="",uname="";
     TextField t,pw;
     ResWin(int r,float p)
     {
setSize(500,320);
       setLocation(300,200);
       setResizable(false);
       java.util.Date d=new java.util.Date();
       Font f=new Font("Arial", Font.BOLD,30);
        setLayout(null);
       dt=new Label("      Today is "+d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900));
       dt.setBackground(Color.yellow);
       dt.setForeground(Color.blue);
       per=new Label("   Multiple Choice Quiz");
       name=new Label("Thank You!");
       pass=new Label("Your Score:"+r);
       pass.setFont(new Font("Arial",Font.BOLD,20)); 
       per.setFont(f);
        per.setBackground(Color.blue);
        per.setForeground(Color.yellow);
        percent=new Label("Your Percent:"+p); 
       percent.setFont(new Font("Arial",Font.BOLD,20));
       yes=Toolkit.getDefaultToolkit().getImage("t.gif");
        
 
	b9=new Button("Retest");
        b9.setBackground(Color.green);
        b10=new Button("Exit");
        b10.setBackground(Color.green);

       per.setBounds(100,20,350,30);
       name.setBounds(60,75,150,20);
       pass.setBounds(70,90,150,40);
       percent.setBounds(70,130,220,40);
       b9.setBounds(280,220,100,30);
       b10.setBounds(390,220,100,30);
       dt.setBounds(100,260,350,30);
       dt.setFont(new Font("Arial", Font.BOLD,25));
       b9.setFont(new Font("Arial",Font.BOLD,15));
       b9.addActionListener(this);
       b10.setFont(new Font("Arial",Font.BOLD,15));
       b10.addActionListener(this);

       add(b9);add(dt);add(per);add(name);add(pass);add(percent);add(b10);
	setVisible(true);
    }
public void paint(Graphics g)
   {
        g.drawImage(yes,300,80,120,120,this);
   }

   public void actionPerformed(ActionEvent e)
   {
   if(e.getSource()==b9){
          new PMcq();
           setVisible(false);
}
   if(e.getSource()==b10)
       setVisible(false);  

   }
}