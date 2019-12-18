
package CatGame;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kamal kumar
 */
public class Shop extends javax.swing.JFrame {
  
    public void saveobj(cat C){
    try {
 
            FileOutputStream fileOut = new FileOutputStream(active());
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(C);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
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
    public String active()
    {  String s="";
        try{
        Scanner sc=new Scanner(new FileInputStream("active.txt"));
       while(sc.hasNext())
        s=sc.next();
        }catch(Exception e){}
        return s;
    }
    public void save(cat c)
    {   try{
          PrintWriter p=new PrintWriter(new FileOutputStream("money.txt"));
          p.print(c.money);
          p.close();
    }catch(FileNotFoundException e){}
    }
    
    public void countsave()
    {   try
{
    PrintWriter pr = new PrintWriter("count.txt");    

    for (int i=0; i<arr.length ; i++)
        pr.println(arr[i]);
       pr.close();
}
catch (Exception e)
{
    e.printStackTrace();
    System.out.println("No such file exists.");
}
    }
    
public int getcount(int count)
{
    try{
    Scanner sc=new Scanner(new FileInputStream("count.txt"));
    for(int i=0;i<6;i++)
        arr[i]=sc.nextInt();
    }catch(Exception e){}
    return arr[count-1];
}
    public cat buy(int i, cat c)
    {
        switch(i)
        {
           case 1:
               c.money-=50;
               break;
           case 2:c.money-=25;
               break;
           case 3:c.money-=30;
               break;
           case 4:c.money-=65;
               break;
           case 5:c.money-=15;
               break;
           case 6:c.money-=20;
               break;
        }
        return c;
    }
    public Shop() {
        initComponents();
    }
        public void close(){
 
 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
public  cat c1=readobj();
int C1,C2,C3,C4,C5,C6;
int arr[]=new int[6];
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        p4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        p5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        p6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        p3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        p2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        Remain = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton4.setText("NutroChoice");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 40));

        p4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p4.setForeground(new java.awt.Color(0, 0, 0));
        p4.setText(" ");
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 40, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton5.setText(" Purina");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 180, -1));

        p5.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p5.setForeground(new java.awt.Color(0, 0, 0));
        p5.setText(" ");
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 40, -1));

        jButton6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton6.setText(" TSC");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 180, 160, -1));

        p6.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p6.setForeground(new java.awt.Color(0, 0, 0));
        p6.setText(" ");
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 40, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText(" Royal Canin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 420, 180, -1));

        p1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p1.setForeground(new java.awt.Color(0, 0, 0));
        p1.setText(" ");
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 476, 40, 30));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton2.setText("St. Paws");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 420, 170, -1));

        p3.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p3.setForeground(new java.awt.Color(0, 0, 0));
        p3.setText(" ");
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 476, 40, 30));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton3.setText("Pet Smart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 420, 160, -1));

        p2.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p2.setForeground(new java.awt.Color(0, 0, 0));
        p2.setText(" ");
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 30, 20));

        jButton7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton7.setText(" Save & Return");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 231, 62));

        Remain.setFont(new java.awt.Font("Calibri", 0, 21)); // NOI18N
        Remain.setForeground(new java.awt.Color(0, 0, 153));
        Remain.setText(" ");
        getContentPane().add(Remain, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 7, 84, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S.PNG"))); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
p1.setText(String.valueOf(getcount(1)));
        if(getcount(1)>=20)
  JOptionPane.showMessageDialog(null," Sorry ! Out of stock,Try something else ");  
 else if(c1.money<50)
    JOptionPane.showMessageDialog(null," Not Enough Money Press Return to return ");
else
 {
     C1=getcount(1);
     c1=buy(1,c1);
     if(C1!=20)
     C1++;
     arr[0]=C1;
      countsave();
 }
        Remain.setText(Float.toString(c1.money));
        save(c1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 p2.setText(String.valueOf(getcount(2)));
        if(getcount(2)>=20)
  JOptionPane.showMessageDialog(null," Sorry ! Out of stock,Try something else");  
 else if(c1.money<25)
    JOptionPane.showMessageDialog(null," Not Enough Money Press Return to return ");
else
 {
     C2=getcount(2);
     c1=buy(2,c1);
     if(C2!=20)
     C2++;
     arr[1] = C2;
      countsave();
 }
        Remain.setText(Float.toString(c1.money));
        save(c1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  p3.setText(String.valueOf(getcount(3)));
        if(getcount(3)>=20)
  JOptionPane.showMessageDialog(null," Sorry ! Out of stock,Try something else ");  
    else if(c1.money<30)
    JOptionPane.showMessageDialog(null," Not Enough Money Press Return to return ");
else
        {
            C3=getcount(3);
            c1=buy(3,c1);
            if(C3!=20)
            C3++;
            arr[2]=C3;
             countsave();
        }
        Remain.setText(Float.toString(c1.money));
        save(c1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 p4.setText(String.valueOf(getcount(4)));
        if(getcount(4)>=20)
  JOptionPane.showMessageDialog(null," Sorry ! Out of stock,Try something else");  
 else  if(c1.money<65)
    JOptionPane.showMessageDialog(null," Not Enough Money Press Return to return ");
else
 {
     C4=getcount(4);
     c1=buy(4,c1);
     if(C4!=20)
     C4++;
     arr[3]=C4;
      countsave();
 }
        Remain.setText(Float.toString(c1.money));
        save(c1);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
p5.setText(String.valueOf(getcount(5)));
        if(getcount(5)>=20)
  JOptionPane.showMessageDialog(null," Sorry ! Out of stock,Try something else ");  
else if(c1.money<15)
    JOptionPane.showMessageDialog(null," Not Enough Money Press Return to return ");
else
{ 
    C5=getcount(5);
    c1=buy(5,c1);
    if(C5!=20)
C5++;
arr[4]=C5;
 countsave();
}
       Remain.setText(Float.toString(c1.money));
       save(c1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
p6.setText(String.valueOf(getcount(6)));
        if(getcount(6)>=20)
  JOptionPane.showMessageDialog(null," Sorry ! Out of stock,Try something else ");  
else if(c1.money<20)
    JOptionPane.showMessageDialog(null," Not Enough Money Press Return to return ");
else
{
    C6=getcount(6);
    c1=buy(6,c1);
    if(C6!=20)
    C6++;
    arr[5]=C6;
     countsave();
}
        Remain.setText(Float.toString(c1.money));
        save(c1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Home().setVisible(true);
        saveobj(c1);
        countsave();
        close();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        p1.setText(String.valueOf(getcount(1)));
        p2.setText(String.valueOf(getcount(2)));
        p3.setText(String.valueOf(getcount(3)));
        p4.setText(String.valueOf(getcount(4)));
        p5.setText(String.valueOf(getcount(5)));
        p6.setText(String.valueOf(getcount(6)));
        Remain.setText(String.valueOf(c1.money));
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public  static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Remain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    // End of variables declaration//GEN-END:variables
}
