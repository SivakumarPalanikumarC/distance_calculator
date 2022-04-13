package distanceconvertor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class distanceconvertor implements ActionListener
{
    JFrame jf;
    JLabel L1, L2, L3, L4, L5;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JButton b1;
   
    distanceconvertor()
    {
         jf = new JFrame();
        
         jf.setSize(350,200);
         jf.setTitle("Converter");
        
         FlowLayout FL = new FlowLayout(FlowLayout.CENTER,20,20);
         jf.setLayout(FL);
        
         Font f1 = new Font("Freestyle Script", Font.BOLD, 20);
         Font f2 = new Font("Freestyle Script", Font.BOLD, 15);
         Dimension d1 = new Dimension(100,30);
         Dimension d2 = new Dimension(75,30);

         L1 = new JLabel("Miles : ", SwingConstants.RIGHT);
         L2 = new JLabel("Kilometers : ",SwingConstants.RIGHT);
         L3 = new JLabel("Yard : ",SwingConstants.RIGHT);
         L4 = new JLabel("Metre : ",SwingConstants.RIGHT);
         L5 = new JLabel("Inch : ",SwingConstants.RIGHT);
         L1.setFont(f1);
         L1.setPreferredSize(d1);
         L3.setFont(f1);
         L3.setPreferredSize(d1);
         L4.setFont(f1);
         L4.setPreferredSize(d1);
         L5.setFont(f1);
         L5.setPreferredSize(d1);
         L2.setFont(f1);
         L2.setPreferredSize(d1);
        
         tf1=new JTextField("",15);
         tf2=new JTextField("",15);
         tf3=new JTextField("",15);
         tf4=new JTextField("",15);
         tf5=new JTextField("",15);
        
         tf1.setFont(f1);
         tf2.setFont(f1);
         tf3.setFont(f1);
         tf4.setFont(f1);
         tf5.setFont(f1);
        
                 
         b1 = new JButton("Convert!");
         b1.setFont(f2);
         b1.setPreferredSize(d2);
            
         jf.add(L1);
        
         jf.add(tf1);
         jf.add(L2);
         jf.add(tf2);
         jf.add(L3);
         
         jf.add(tf3);
         jf.add(L4);
         
         jf.add(tf4);
         jf.add(L5);
         jf.add(tf4);
        
         b1.addActionListener(this);
                      
         jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
   
    public void actionPerformed(ActionEvent ae)
    {
         
         double n = Double.parseDouble(tf1.getText());
         double km = n*1.60934;
        
         tf3.setText(Double.toString(km));
         
         double o = Double.parseDouble(tf1.getText());
         double yd = o*1760;
        
         tf4.setText(Double.toString(yd));
         
         double p= Double.parseDouble(tf1.getText());
         double me = p*1.609;
        
         tf5.setText(Double.toString(me));
         
         double q = Double.parseDouble(tf1.getText());
         double i = q*1609.34;
        
         tf2.setText(Double.toString(i));
    }
   
    public static void main(String as[])
    {
         new distanceconvertor();
    }
}
