/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author kamal kumar
 */
public class MyFrame extends JFrame {
    float c1;
    Timer t=new Timer(500,new ActionListener(){
@Override
 public void actionPerformed(ActionEvent e) { 
cat c=readobj();
if(c.money!=c1) 
     setSize(0,0);
 }
});
    public String active()
    {  String s="";
        try{
        Scanner sc=new Scanner(new FileInputStream("active.txt"));
       while(sc.hasNext())
        s=sc.next();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        return s;
    }
    
    public cat readobj()
    { cat c;
         try {
 
            FileInputStream fileOut = new FileInputStream(active());
            ObjectInputStream objectOut = new ObjectInputStream(fileOut);
             c = (cat) objectOut.readObject();
            objectOut.close();
            return c;
        } catch (IOException | ClassNotFoundException ex) {
             System.out.println(ex);
        }
         return  null;
    }
    
    MyFrame()
    {
        cat c=readobj();
        c1=c.money;
        keylist app=new keylist();
        setSize(1200,750);
        add(app);
        app.init();
        app.start();
        t.start();
    }
}
