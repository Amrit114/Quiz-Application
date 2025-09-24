import java.awt.event.*;
import java.awt.*;
import java.util.*;
class Timer extends Frame implements ActionListener, ItemListener,Runnable
 {
     
     Label tm;
     int sc=30;
          
     Timer()
     {
       setSize(600,320);
       setLocation(300,200);
       setResizable(false);
       setLayout(null);
             
       tm=new Label();
       tm.setFont(new Font("Arial",Font.BOLD,80));
       	tm.setBounds(120,80,450,150);
       
        add(tm);
	setVisible(true);
        
    }
   public void run()
     {
           try
           {
                while(true)
               {
                 if(sc==0)
                 {
                       sc=30;
                       repaint();
                }
if(sc<=30&&sc>=20)
                  tm.setForeground(Color.green);
               else if(sc<=19&&sc>=10)
                  tm.setForeground(Color.orange);
               else
                 tm.setForeground(Color.red);
                tm.setText("00:00:"+sc);
                Thread.sleep(1000);
                sc--; 
                }  
           }
catch(InterruptedException ie)
           {}
      }
    public void paint(Graphics g)
    {
     }
public void itemStateChanged(ItemEvent e)
     {
     }
public void actionPerformed(ActionEvent e)
   {
   }
public static void main(String args[]){
Timer ob = new Timer();
Thread t=new Thread(ob);
t.start();
}
}
