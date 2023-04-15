package Framewrk;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class JustAFRame extends Frame {
    JustAFRame(int a, int b){
       super("This is my first Frame!");
       setSize(a,b);
       setVisible(true);
       addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });
    }
}
public class MyAWTFrame{
    public static void main(String[] args) {
        JustAFRame frame =new JustAFRame(800,800);
    }
}
