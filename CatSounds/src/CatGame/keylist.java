/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//NEW FILES BRUH
package CatGame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author parhamss
 */
public class keylist extends Applet implements KeyListener {
    
    Random rand = new Random();
    protected int D=-1, a=1060,b=610,  i=1,j=1,k=1,m=1,n=1,  r=-2000,l=1,  x,y,z,s,w, money=0;
    
    private ImageIcon cat;
    private ImageIcon catR;
    private ImageIcon bush;
    private ImageIcon coin;
    private ImageIcon backg;
    private ImageIcon home;
    private ImageIcon pitza;
    private ImageIcon market;
    private ImageIcon book;
    private ImageIcon flower;
    private ImageIcon computer;
    private ImageIcon fruit;
    private ImageIcon ice;
    private ImageIcon tree; 
    private ImageIcon tree2;
    private ImageIcon tree3;
    private ImageIcon tree4;
    private ImageIcon tree5;
  //private ImageIcon darktree2;
  //private ImageIcon orangetree;
  //private ImageIcon orangetree2;
    
   
    
    public void init(){
     
        x=rand.nextInt(500)+200;
        y=rand.nextInt(700)+100;
        z=rand.nextInt(170)+210;
        s=rand.nextInt(320)+400;
        w=rand.nextInt(450)+550;
        cat         = new ImageIcon("cat.png");
        catR        = new ImageIcon("catR.png");
        bush        = new ImageIcon("bush.png");
        coin        = new ImageIcon("coin.png");
        backg       = new ImageIcon("green.JPG");
        home        = new ImageIcon("home.png");
        pitza       = new ImageIcon("pitza.png");
        market      = new ImageIcon("market.png");
        book        = new ImageIcon("book.png");
        flower      = new ImageIcon("flower.png");
        computer    = new ImageIcon("computer.png");
        fruit       = new ImageIcon("fruit.png");
        ice         = new ImageIcon("ice.png");
        tree        = new ImageIcon("tree.png");
        tree2       = new ImageIcon("tree2.png");
        tree3       = new ImageIcon("tree3.png");
        tree4       = new ImageIcon("tree4.png");
        tree5       = new ImageIcon("tree5.png");
      //darktree2   = new ImageIcon("darktree2.png");
      //orangetree  = new ImageIcon("orangetree.png");
      //orangetree2 = new ImageIcon("orangetree2.png");

        this.addKeyListener(this);
    }
   
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
    public void saveobj(cat C){
    try {
 
            FileOutputStream fileOut = new FileOutputStream(active());
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(C);
            objectOut.close();
 
        } catch (IOException ex) {
            System.out.println(ex);
        } 
    }
    
    public void anyone(){
        JOptionPane.showMessageDialog(null,"you collected "+money+" coins and total collected money = "+money*9);
       cat c=readobj();
       c.money+=money*9;
       if((c.happiness+19)>=100)
       {
           c.happiness=100;
           c.expgained(4);
       }  
       else
       {    
       switch(money)
       {
           case 5:c.happiness+=19;
                  break;
           case 2:c.happiness+=13;
               break;
           case 3:c.happiness+=10;
               break;
           case 4:c.happiness+=6;
               break;
           default:c.happiness+=2;
               break;
       }
       if(money>4)
           c.expgained(4);
       
       }
       
       saveobj(c);
       //dispose();
       setSize(0,0);
     
       new Home().setVisible(true);
      
       
    } 
    
    
    @Override
    public void paint (Graphics g){
        Graphics2D g2= (Graphics2D)g;
       
        
        setSize(1200,750);
        
        
        
      
        
        backg.paintIcon(this, g, 0, 0);                          //background
        
        g.setColor(Color.GRAY);
        g.fillRect(0, 75, 1200, 28);
        g.fillRect(100, 0, 28, 75);
        g.fillRect(0, 375, 1200, 28);
        g.fillRect(600, 0, 28, 375);
        g.fillRect(100, 400, 28, 350);
        g.fillRect(0, 600, 1200, 28);
        g.fillRect(1050, 100, 28, 500);
        g.fillRect(600, 625, 28, 125);
        
        g2.setColor(Color.white);
        g2.fillRect(0, 88, 1200, 2);
        g2.fillRect(0, 388, 1200, 2);
        g2.fillRect(0, 613, 1200, 2);
        g2.fillRect(113, 0, 2, 88);
        g2.fillRect(613, 0, 2, 388);
        g2.fillRect(113, 388, 2, 363);
        g2.fillRect(1063, 88, 2, 526);
        g2.fillRect(613, 613, 2, 138);
         
         
        cat.paintIcon        (this, g, l*a, l*b);
        catR.paintIcon       (this, g, r*a, r*b);
        
        coin.paintIcon       (this, g, i*100,  i*377);
        coin.paintIcon       (this, g, j*y,  j*100);
        coin.paintIcon       (this, g, k*1100, k*z);
        coin.paintIcon       (this, g, m*75,   m*s);
        coin.paintIcon       (this, g, n*w,  n*625);
        
        
        tree.paintIcon       (this, g, 1095, 65);
        tree2.paintIcon      (this, g, 650, 190);
        tree3.paintIcon      (this, g, 950, 210);               //BOOK
        tree4.paintIcon      (this, g, 745, 110);               //BOOK
        tree5.paintIcon      (this, g, 920,  85);
        
        
        
        tree.paintIcon       (this, g, 240, 215);
        tree2.paintIcon      (this, g, 63,  125);               //MARKET
        tree3.paintIcon      (this, g, 340, 100);               //PITZA
        tree4.paintIcon      (this, g, 450, 185);               
        tree5.paintIcon      (this, g, 200,  85);
        
        
        tree.paintIcon       (this, g, 720, 395);
        tree2.paintIcon      (this, g, 350, 418);
        tree2.paintIcon      (this, g, 630, 435);     
        tree3.paintIcon      (this, g, 140, 385);               //FRUIT
        tree4.paintIcon      (this, g, 510, 388);
        tree4.paintIcon      (this, g, -27, 375);
        tree5.paintIcon      (this, g, 995, 422);               //FLOWER
        tree5.paintIcon      (this, g, 240, 395);               //COMPUTER
        
        
        
        tree.paintIcon       (this, g, 250, 620);
        tree2.paintIcon      (this, g, 450, 630);
        tree3.paintIcon      (this, g, 730, 610);               //DOWN
        tree4.paintIcon      (this, g, 850, 635);               //DOWN
        
        home.paintIcon       (this, g, 1090,415);
        pitza.paintIcon      (this, g, 50 , 231);
        market.paintIcon     (this, g, 325, 227);
        book.paintIcon       (this, g, 755, 222);
        flower.paintIcon     (this, g, 170, 449);
        fruit.paintIcon      (this, g, 480, 454);
        computer.paintIcon   (this, g, 800, 445);
        ice.paintIcon        (this, g, 145, -74);
        flower.paintIcon     (this, g, 700, -76);
        
        
        
        
     
        /*bush.paintIcon(this, g, 100, 100);
        bush.paintIcon(this, g, 300, 300);
        bush.paintIcon(this, g, 356, 300);
        bush.paintIcon(this, g, 175, 250);
        bush.paintIcon(this, g, 480, 200);*/
       
        
        
    }



    @Override
    public void keyTyped(KeyEvent e) {}
      @Override
    public void keyReleased(KeyEvent e) {}

    
    @Override
    public void keyPressed(KeyEvent e) {
        
        
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            
            r=1;
            l=-2000;
           
            if ((1055 <a+5&&a+5< 1180)&&(530 <b&&b< 600)){                          //home
                if (i==-1)
                    money+=1;
                if (j==-1)
                    money+=1;
                if (k==-1)
                    money+=1;
                if (m==-1)
                    money+=1;
                if (n==-1)
                    money+=1;
                D=1;
                repaint();
               anyone();
             
            }
            if ((15  <a+5&&a+5< 220)&&(290 <b&&b< 375))         //pitza
               a-=5;
            if ((295 <a+5&&a+5< 483)&&(290 <b&&b< 372))         //market
               a-=5;
            if ((725 <a+5&&a+5< 915)&&(290 <b&&b< 372))         //book
               a-=5;
            if ((140 <a+5&&a+5< 335)&&(530 <b&&b< 600))         //flower
               a-=5;
            if ((455 <a+5&&a+5< 641)&&(540 <b&&b< 600))         //fruit
               a-=5;
            if ((770 <a+5&&a+5< 960)&&(530 <b&&b< 600))         //computer
               a-=5;
            if ((125 <a+5&&a+5< 305)&&(20  <b&&b<  75))         //ice
               a-=5;
            if ((670 <a+5&&a+5< 865)&&(20  <b&&b<  75))         //flower up
               a-=5;
            if ((125 <a+5&&a+5< 170)&&(500 <b&&b< 525))         //3
               a-=5;
            if ((715 <a+5&&a+5< 760)&&(725 <b&&b< 750))         //3
               a-=5;
            if ((325 <a+5&&a+5< 370)&&(215 <b&&b< 240))         //3
               a-=5;
            if ((935 <a+5&&a+5< 980)&&(325 <b&&b< 350))         //3
               a-=5;
            if ((70  <a+5&&a+5< 115)&&(235 <b&&b< 263))         //2
               a-=5;
            if ((457 <a+5&&a+5< 502)&&(740 <b&&b< 768))         //2
               a-=5;
            if ((657 <a+5&&a+5< 702)&&(300 <b&&b< 328))         //2
               a-=5;
            if ((357 <a+5&&a+5< 402)&&(528 <b&&b< 556))         //2
               a-=5;
            if ((637 <a+5&&a+5< 682)&&(545 <b&&b< 573))         //2
               a-=5;
            if ((-17 <a+5&&a+5<  27)&&(483 <b&&b< 513))         //4
               a-=5;
            if ((860 <a+5&&a+5< 905)&&(743 <b&&b< 773))         //4
               a-=5;
            if ((520 <a+5&&a+5< 565)&&(496 <b&&b< 526))         //4
               a-=5;
            if ((460 <a+5&&a+5< 505)&&(293 <b&&b< 323))         //4
               a-=5;
            if ((755 <a+5&&a+5< 800)&&(218 <b&&b< 248))         //4
               a-=5;
            if ((235 <a+5&&a+5< 280)&&(325 <b&&b< 355))         //1
               a-=5;
            if ((245 <a+5&&a+5< 290)&&(730 <b&&b< 760))         //1
               a-=5;
            if ((715 <a+5&&a+5< 760)&&(505 <b&&b< 535))         //1
               a-=5;
            if ((1090<a+5&&a+5<1135)&&(175 <b&&b< 205))         //1
               a-=5;
            if ((905 <a+5&&a+5< 945)&&(195 <b&&b< 225))         //5
               a-=5;
            if ((185 <a+5&&a+5< 225)&&(195 <b&&b< 225))         //5
               a-=5;
            if ((980 <a+5&&a+5<1020)&&(532 <b&&b< 562))         //5
               a-=5;
            if ((225 <a+5&&a+5< 265)&&(505 <b&&b< 535))         //5
               a-=5;
           
            
            if (a+5>1200)                                       //teleport
                a=-45;
           
          
            if ((x-35<a+5&&a+5<x+30)&&(355 <b&&b< 407))         //COIN
               i=-1;
            if ((y-35<a+5&&a+5<y+30)&&(78  <b&&b< 130))         //COIN
               j=-1;
            if ((1065<a+5&&a+5<1130)&&(z-22<b&&b<z+30))         //COIN
               k=-1;
            if ((40  <a+5&&a+5< 105)&&(s-22<b&&b<s+30))         //COIN
               m=-1;
            if ((w-35<a+5&&a+5<w+30)&&(603 <b&&b< 655))         //COIN
               n=-1;
            
            
            a+=5;
            
            
            
            if (a==0)
               a+=1;
        }
        
        else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            
           r=-2000;
            l=1;
            
            
            if ((1055 <a-5&&a-5< 1180)&&(530 <b&&b< 600)) {                     //home
               if (i==-1)
                    money+=1;
                if (j==-1)
                    money+=1;
                if (k==-1)
                    money+=1;
                if (m==-1)
                    money+=1;
                if (n==-1)
                    money+=1;
                D=1;
                repaint();
                anyone();
               
            } 
            
               
            if ((15  <a-5&&a-5< 220)&&(290 <b&&b< 375))         //pitza
               a+=5;
            if ((295 <a-5&&a-5< 483)&&(290 <b&&b< 372))         //market
               a+=5;
            if ((725 <a-5&&a-5< 915)&&(290 <b&&b< 372))         //book
               a+=5;
            if ((140 <a-5&&a-5< 335)&&(520 <b&&b< 600))         //flower
               a+=5;
            if ((455 <a-5&&a-5< 641)&&( 540<b&&b< 600))         //fruit
               a+=5;
            if ((770 <a-5&&a-5< 960)&&(530 <b&&b< 600))         //computer
               a+=5;
            if ((125 <a-5&&a-5< 305)&&(20  <b&&b<  75))         //ice
               a+=5;
            if ((670 <a-5&&a-5< 865)&&(20  <b&&b<  75))         //flower up
               a+=5;
            if ((125 <a-5&&a-5< 170)&&(500 <b&&b< 525))         //3
               a+=5;
            if ((715 <a-5&&a-5< 760)&&(725 <b&&b< 750))         //3
               a+=5;
            if ((325 <a-5&&a-5< 370)&&(215 <b&&b< 240))         //3
               a+=5;
            if ((935 <a-5&&a-5< 980)&&(325 <b&&b< 350))         //3
               a+=5;
            if ((70  <a-5&&a-5< 115)&&(235 <b&&b< 263))         //2
               a+=5;
            if ((457 <a-5&&a-5< 502)&&(740 <b&&b< 768))         //2
               a+=5;
            if ((657 <a-5&&a-5< 702)&&(300 <b&&b< 328))         //2
               a+=5;
            if ((357 <a-5&&a-5< 402)&&(528 <b&&b< 556))         //2
               a+=5;
            if ((637 <a-5&&a-5< 682)&&(545 <b&&b< 573))         //2
               a+=5;
            if ((-17 <a-5&&a-5<  27)&&(483 <b&&b< 513))         //4
               a+=5;
            if ((860 <a-5&&a-5< 905)&&(743 <b&&b< 773))         //4
               a+=5;
            if ((520 <a-5&&a-5< 565)&&(496 <b&&b< 526))         //4
               a+=5;
            if ((460 <a-5&&a-5< 505)&&(293 <b&&b< 323))         //4
               a+=5;
            if ((755 <a-5&&a-5< 800)&&(218 <b&&b< 248))         //4
               a+=5;
            if ((235 <a-5&&a-5< 280)&&(325 <b&&b< 355))         //1
               a+=5;
            if ((245 <a-5&&a-5< 290)&&(730 <b&&b< 760))         //1
               a+=5;
            if ((715 <a-5&&a-5 <760)&&(505 <b&&b< 535))         //1
               a+=5;
            if ((1090<a-5&&a-5<1135)&&(175 <b&&b< 205))         //1
               a+=5; 
            if ((905 <a-5&&a-5< 945)&&(195 <b&&b< 225))         //5
               a+=5;
            if ((185 <a-5&&a-5< 225)&&(195 <b&&b< 225))         //5
               a+=5;
            if ((980 <a-5&&a-5<1020)&&(532 <b&&b< 562))         //5
               a+=5;
            if ((225 <a-5&&a-5< 265)&&(505 <b&&b< 535))         //5
               a+=5;
            
            
            if (a-5<-45)                                        //teleport
                a=1200;
            
            
            if ((x-35<a-5&&a-5<x+30)&&(355 <b&&b< 407))         //COIN
               i=-1;
            if ((y-35<a-5&&a-5<y+30)&&(78  <b&&b< 130))         //COIN
               j=-1;
            if ((1065<a-5&&a-5<1130)&&(z-22<b&&b<z+30))         //COIN
               k=-1;
            if ((40  <a-5&&a-5< 105)&&(s-22<b&&b<s+30))         //COIN
               m=-1;
            if ((w-35<a-5&&a-5<w+30)&&(603 <b&&b< 655))         //COIN
               n=-1;
            
            
            a-=5;
            
            
            
            if (a==0)
                a-=1;
        }
        
        
        else if (e.getKeyCode()==KeyEvent.VK_UP){
            
            
            if ((1055 <a&&a< 1180)&&(530 <b-5&&b-5< 600)) {             //home
                if (i==-1)
                    money+=1;
                if (j==-1)
                    money+=1;
                if (k==-1)
                    money+=1;
                if (m==-1)
                    money+=1;
                if (n==-1)
                    money+=1;
                D=1;
                repaint();
                anyone();
            }
          
               
            if ((15  <a&&a< 220)&&(290 <b-5&&b-5< 375))         //pitza
               b+=5;
            if ((295 <a&&a< 483)&&(290 <b-5&&b-5< 372))         //market
               b+=5;
            if ((725 <a&&a< 915)&&(290 <b-5&&b-5< 372))         //book
               b+=5;
            if ((140 <a&&a< 335)&&(520 <b-5&&b-5< 600))         //flower
               b+=5;
            if ((455 <a&&a< 641)&&(540 <b-5&&b-5< 600))         //fruit
               b+=5;
            if ((770 <a&&a< 960)&&(530 <b-5&&b-5< 600))         //computer
               b+=5;
            if ((125 <a&&a< 305)&&(20  <b-5&&b-5<  75))         //ice
               b+=5;
            if ((670 <a&&a< 865)&&(20  <b-5&&b-5<  75))         //flower up
               b+=5;
            if ((125 <a&&a< 170)&&(500 <b-5&&b-5< 525))         //3
               b+=5;
            if ((715 <a&&a< 760)&&(725 <b-5&&b-5< 750))         //3
               b+=5;
            if ((325 <a&&a< 370)&&(215 <b-5&&b-5< 240))         //3
               b+=5;
            if ((935 <a&&a< 980)&&(325 <b-5&&b-5< 350))         //3
               b+=5;
            if ((70  <a&&a< 115)&&(235 <b-5&&b-5< 263))         //2
               b+=5;
            if ((457 <a&&a< 502)&&(740 <b-5&&b-5< 768))         //2
               b+=5;
            if ((657 <a&&a< 702)&&(300 <b-5&&b-5< 328))         //2
               b+=5;
            if ((357 <a&&a< 402)&&(528 <b-5&&b-5< 556))         //2
               b+=5;
            if ((637 <a&&a< 682)&&(545 <b-5&&b-5< 573))         //2
               b+=5;
            if ((-17 <a&&a<  27)&&(483 <b-5&&b-5< 513))         //4
               b+=5;
            if ((860 <a&&a< 905)&&(743 <b-5&&b-5< 773))         //4
               b+=5;
            if ((520 <a&&a< 565)&&(496 <b-5&&b-5< 526))         //4
               b+=5;
            if ((460 <a&&a< 505)&&(293 <b-5&&b-5< 323))         //4
               b+=5;
            if ((755 <a&&a< 800)&&(218 <b-5&&b-5< 248))         //4
               b+=5;
            if ((235 <a&&a< 280)&&(325 <b-5&&b-5< 355))         //1
               b+=5;
            if ((245 <a&&a< 290)&&(730 <b-5&&b-5< 760))         //1
               b+=5;
            if ((715 <a&&a< 760)&&(505 <b-5&&b-5< 535))         //1
               b+=5;
            if ((1090<a&&a<1135)&&(175 <b-5&&b-5< 205))         //1
               b+=5;
            if ((905 <a&&a< 945)&&(195 <b-5&&b-5< 225))         //5
               b+=5;
            if ((185 <a&&a< 225)&&(195 <b-5&&b-5< 225))         //5
               b+=5;
            if ((980 <a&&a<1020)&&(532 <b-5&&b-5< 562))         //5
               b+=5;
            if ((225 <a&&a< 265)&&(505 <b-5&&b-5< 535))         //5
               b+=5;
            
            
            if (b-5<-30)                                        //teleport
                b=750;
            
            
            if ((x-35<a&&a<x+30)&&(355 <b-5&&b-5< 407))         //COIN
               i=-1;
            if ((y-35<a&&a<y+30)&&(78  <b-5&&b-5< 130))         //COIN
               j=-1;
            if ((1065<a&&a<1130)&&(z-22<b-5&&b-5<z+30))         //COIN
               k=-1;
            if ((40  <a&&a< 105)&&(s-22<b-5&&b-5<s+30))         //COIN
               m=-1;
            if ((w-35<a&&a<w+30)&&(603 <b-5&&b-5< 655))         //COIN
               n=-1;
            
            
            b-=5; 
            if (b==0)
                b-=1;
        }
        
        
        else if (e.getKeyCode()==KeyEvent.VK_DOWN){
            
            
            if ((1055 <a&&a< 1180)&&(530 <b+5&&b+5< 600)) {         //home
                if (i==-1)
                    money+=1;
                if (j==-1)
                    money+=1;
                if (k==-1)
                    money+=1;
                if (m==-1)
                    money+=1;
                if (n==-1)
                    money+=1;
                D=1;
                repaint();
                anyone();
            }
            if ((15  <a&&a< 220)&&(290 <b+5&&b+5< 375))         //pitza
               b-=5;
            if ((295 <a&&a< 483)&&(290 <b+5&&b+5< 372))         //market
               b-=5;
            if ((725 <a&&a< 915)&&(290 <b+5&&b+5< 372))         //book
               b-=5;
            if ((140 <a&&a< 335)&&(520 <b+5&&b+5< 600))         //flower
               b-=5;
            if ((455 <a&&a< 641)&&(540 <b+5&&b+5< 600))         //fruit
               b-=5;
            if ((770 <a&&a< 960)&&(530 <b+5&&b+5< 600))         //computer
               b-=5;
            if ((125 <a&&a< 305)&&(20  <b+5&&b+5<  75))         //ice
               b-=5;
            if ((670 <a&&a< 865)&&(20  <b+5&&b+5<  75))         //flower up
               b-=5;
            if ((125 <a&&a< 170)&&(500 <b+5&&b+5< 525))         //3
               b-=5;
            if ((715 <a&&a< 760)&&(725 <b+5&&b+5< 750))         //3
               b-=5;
            if ((325 <a&&a< 370)&&(215 <b+5&&b+5< 240))         //3
               b-=5;
            if ((935 <a&&a< 980)&&(325 <b+5&&b+5< 350))         //3
               b-=5;
            if ((70  <a&&a< 115)&&(235 <b+5&&b+5< 263))         //2
               b-=5;
            if ((457 <a&&a< 502)&&(740 <b+5&&b+5< 768))         //2
               b-=5;
            if ((657 <a&&a< 702)&&(300 <b+5&&b+5< 328))         //2
               b-=5;
            if ((357 <a&&a< 402)&&(528 <b+5&&b+5< 556))         //2
               b-=5;
            if ((637 <a&&a< 682)&&(545 <b+5&&b+5< 573))         //2
               b-=5;
            if ((-17 <a&&a<  27)&&(483 <b+5&&b+5< 513))         //4
               b-=5;
            if ((860 <a&&a< 905)&&(743 <b+5&&b+5< 773))         //4
               b-=5;
            if ((520 <a&&a< 565)&&(496 <b+5&&b+5< 526))         //4
               b-=5;
            if ((460 <a&&a< 505)&&(293 <b+5&&b+5< 323))         //4
               b-=5;
            if ((755 <a&&a< 800)&&(218 <b+5&&b+5< 248))         //4
               b-=5;
            if ((235 <a&&a< 280)&&(325 <b+5&&b+5< 355))         //1
               b-=5;
            if ((245 <a&&a< 290)&&(730 <b+5&&b+5< 760))         //1
               b-=5;
            if ((715 <a&&a< 760)&&(505 <b+5&&b+5< 535))         //1
               b-=5;
            if ((1090<a&&a<1135)&&(175 <b+5&&b+5< 205))         //1
               b-=5;
            if ((905 <a&&a< 945)&&(195 <b+5&&b+5< 225))         //5
               b-=5;
            if ((185 <a&&a< 225)&&(195 <b+5&&b+5< 225))         //5
               b-=5;
            if ((980 <a&&a<1020)&&(532 <b+5&&b+5< 562))         //5
               b-=5;
            if ((225 <a&&a< 265)&&(505 <b+5&&b+5< 535))         //5
               b-=5;
            
            
            if (b+5>755)                                        //teleport
                b=-25;
           
           
            if ((x-35<a&&a<x+30)&&(355 <b+5&&b+5< 407))         //COIN
               i=-1;
            if ((y-35<a&&a<y+30)&&(78  <b+5&&b+5< 130))         //COIN
               j=-1;
            if ((1065<a&&a<1130)&&(z-22<b+5&&b+5<z+30))         //COIN
               k=-1;
            if ((40  <a&&a< 105)&&(s-22<b+5&&b+5<s+30))         //COIN
               m=-1;            
            if ((w-35<a&&a<w+30)&&(603 <b+5&&b+5< 655))         //COIN
               n=-1;
            
            
            b+=5;
            if (b==0)
                b+=1;
        }
        repaint();
    }

  
   
}