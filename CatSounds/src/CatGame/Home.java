
package CatGame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Home extends javax.swing.JFrame {
    

String gif="";
 public customize readdobj()
    { 
        customize c;
         try {
 
            FileInputStream fileOut = new FileInputStream(active()+"1");
            ObjectInputStream objectOut = new ObjectInputStream(fileOut);
             c = (customize) objectOut.readObject();
            objectOut.close();
            return c;
        } catch (IOException | ClassNotFoundException ex) {
             System.out.println(ex);
        }
         return  null;
    }
  public Home()
    {
        customize d=readdobj();
       gif=d.Dhaircolor;
          initComponents();
    }
  public void close()
    {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
Timer timeage=new Timer(1800000,new ActionListener(){
@Override
 public void actionPerformed(ActionEvent e) {
 cat c=readobj();
   c.expage();
   c.age++;
 if(c.age>15)
 {
     time.stop(); 
     timeage.stop();
        int test =JOptionPane.showConfirmDialog(
            null,
            "Your cat died of aging, do you want to create new cat?",
            "CONFIRM",
            JOptionPane.YES_NO_OPTION);
                     if(test==0)
                {
                    new acc_creation().setVisible(true);
                    dispose();
                }
                     else{
                          try{
          PrintWriter p=new PrintWriter(new FileOutputStream("active.txt"));
          p.print(2);
          p.close();
                }catch(Exception ex){}
                          new signup().setVisible(true);
                         dispose();
                     }
                         
 }
 saveobj(c);
 }
});
    
  Timer time=new Timer(20000,new ActionListener() {
       @Override
    public void actionPerformed(ActionEvent e) {
          cat c=readobj();

          double temp=c.hunger;
          timecal t=new timecal();
          t.readtime();
        c.happiness-=(t.getUt3());
        if(c.happiness<1)
             c.happiness=0;
       c.hunger-=(t.getUt3()/2);
       
            
       if(c.hunger<1)
               {
                   time.stop();
                   timeage.stop();
                  JOptionPane.showMessageDialog(null," Sorry your cat died of hunger ! Please create a new cat ");
                try{      
                    PrintWriter p= new PrintWriter(new FileOutputStream("active.txt"));
                    p.print(1);
                   p.close();
                   }catch(FileNotFoundException ex){}
                  System.exit(0);
          }
      else{
           notif(c.hunger,c.age,c.happiness);  
          saveobj(c);
            }
              if(c.hunger!=temp)
          t.savetime();

        
           
       }
   } );
             

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
              public void notif(double hunger,int age,double happiness)
       {
           Random r=new Random();
           while(true)
           {   
               int num=r.nextInt(2);
               if(num%2==0)
               {    if(hunger<75 &&  hunger>1 && age<15)
             JOptionPane.showMessageDialog(null,hunger+"%  Only Stomach full ! Please Feed Me ");
               }
               else
               { 
                   if(happiness<60 && happiness>1 && age<14)
             JOptionPane.showMessageDialog(null,happiness+"% - Play with me Please ");  
               }
              break;
           }
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 153, 102));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText(" TALK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 133, 50));

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText(" FEED");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 133, 50));

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText(" SHOP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 133, 50));

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText(" PLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 133, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(gif)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 250, 200));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText(" HOME ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOME1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 620));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 51));

        jMenu1.setBackground(new java.awt.Color(0, 0, 51));
        jMenu1.setText("CHOOSE ");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuItem3.setBackground(new java.awt.Color(0, 0, 102));
        jMenuItem3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItem3.setText(" ACCOUNT");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setBackground(new java.awt.Color(0, 0, 102));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItem1.setText("  LOGOUT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(0, 0, 102));
        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuItem2.setText(" EXIT");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      new CatSound().setVisible(true);
      close();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new MyFrame().setVisible(true);        
close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          int test =JOptionPane.showConfirmDialog(
            null,
            "Do you want to Logout ?",
            "CONFIRM",
            JOptionPane.YES_NO_OPTION);
      if(test==0){
          {
              time.stop();
          }
        try{
          PrintWriter p=new PrintWriter(new FileOutputStream("active.txt"));
          p.print(3);
          p.close();
        }catch(FileNotFoundException e){System.out.println(e);}
        close();
      new menu().setVisible(true);
      }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          int test =JOptionPane.showConfirmDialog(
            null,
            "Do you want to exit the game?",
            "CONFIRM",
            JOptionPane.YES_NO_OPTION);
       if(test==0)
           System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
time.start();
timeage.start();
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Eat().setVisible(true);
        close();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   new Shop().setVisible(true);
   close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//    cat d=readobj();
//    expn.setText(String.valueOf(d.expn));
//    expage.setText(String.valueOf(d.expage));
//    lvl.setText(String.valueOf(d.level));
//        happy.setText(String.valueOf(d.happiness));
//        hun.setText(String.valueOf(d.hunger));
//        xp.setText(String.valueOf(d.exp));
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
new AccountInfo().setVisible(true);
this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
