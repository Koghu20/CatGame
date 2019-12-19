
package CatGame;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Eat extends javax.swing.JFrame {
    public String active()
    {  String s="";
        try{
        Scanner sc=new Scanner(new FileInputStream("active.txt"));
       while(sc.hasNext())
        s=sc.next();
        }catch(Exception e){}
        return s;
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

    int arr[]=new int[6];
    int C1,C2,C3,C4,C5,C6;
    cat c=readobj();
        public void close(){
 
 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 
 }
        public void confirm()
        {  int test =JOptionPane.showConfirmDialog(
            null,
            "Would you like to shop ?",
            "CONFIRM",
            JOptionPane.YES_NO_OPTION);
if(test==0)
{new Shop().setVisible(true);close();}
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
    System.out.println("No such file exists.");
          }
    }
      
      
    public Eat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText(" Royal Canin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 370, -1, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton3.setText("Pet Smart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 160, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton2.setText("St. Paws");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 160, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton4.setText("NutroChoice");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton5.setText(" Purina");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 170, -1));

        jButton6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton6.setText(" TSC");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 150, -1));

        p1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p1.setText(" ");
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 426, 47, 20));

        p2.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p2.setText(" ");
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 424, 47, -1));

        p3.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p3.setText(" ");
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 426, 47, 20));

        p4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p4.setText(" ");
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 206, 47, 20));

        p5.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p5.setText(" ");
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 206, 47, 20));

        p6.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        p6.setText(" ");
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 47, 20));

        jButton7.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jButton7.setText(" DONE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/F.PNG"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
p2.setText(String.valueOf(getcount(2)));
if(getcount(2)==0)
confirm();
else
      {
         C2=getcount(2);
     if(C2!=0)
     {  C2--;
     arr[1]=C2;
      countsave();
     if(c.happiness==100 || (c.happiness+10)>=100||c.hunger==100||c.hunger+10>=100)
            {    c.happiness=100; c.hunger=100; c.expgained(3);}
      else
            {  c.happiness+=10;   c.hunger+=10; c.expgained(3);}
        
      }   }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
p3.setText(String.valueOf(getcount(3)));
        if(getcount(3)==0)
       confirm();
else
       {
         C3=getcount(3);
     if(C3!=0)
     {C3--;
     arr[2]=C3;
      countsave();
        if(c.happiness==100 || (c.happiness+14)>=100||c.hunger==100||c.hunger+10>=100)
            {    c.happiness=100; c.hunger=100; c.expgained(3);}
      else
            {  c.happiness+=14;   c.hunger+=10; c.expgained(3); }
     }
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
p4.setText(String.valueOf(getcount(4)));
        if(getcount(4)==0)
confirm();
else
        {
         C4=getcount(4);
     if(C4!=0)
     {C4--;
     arr[3]=C4;
      countsave();
  if(c.happiness==100 || (c.happiness+20)>=100||c.hunger==100||c.hunger+10>=100)
            {    c.happiness=100; c.hunger=100; c.expgained(3);}
      else
            {  c.happiness+=20;   c.hunger+=10; c.expgained(3);}
        }}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
p5.setText(String.valueOf(getcount(5)));
        if(getcount(5)==0)
confirm();
else
        {
         C5=getcount(5);
     if(C5!=0)
     {C5--;
     arr[4]=C5;
      countsave();
        if(c.happiness==100 || (c.happiness+5)>=100||c.hunger==100||c.hunger+10>=100)
            {    c.happiness=100; c.hunger=100; c.expgained(3);}
      else
            {  c.happiness+=5;   c.hunger+=10; c.expgained(3);}
        
        }}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  p6.setText(String.valueOf(getcount(6)));
        if(getcount(6)==0)
confirm();
else
        {
         C6=getcount(6);
     if(C6!=0)
     { C6--;
     arr[5]=C6;
      countsave();
            if(c.happiness==100 || (c.happiness+7)>=100||c.hunger==100||c.hunger+10>=100)
            {    c.happiness=100; c.hunger=100; c.expgained(3);}
      else
            {  c.happiness+=7;   c.hunger+=10; c.expgained(3);}
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 p1.setText(String.valueOf(getcount(1)));
 p2.setText(String.valueOf(getcount(2)));
 p3.setText(String.valueOf(getcount(3)));
 p4.setText(String.valueOf(getcount(4)));
 p5.setText(String.valueOf(getcount(5)));
 p6.setText(String.valueOf(getcount(6)));
 
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
p1.setText(String.valueOf(getcount(1)));
        if(getcount(1)==0)
confirm();
else
        {
         C1=getcount(1);
     if(C1!=0)
     { 
         C1--;
        arr[0]=C1;
      countsave();
        if(c.happiness==100 || (c.happiness+17)>=100||c.hunger==100||c.hunger+10>=100)
            {    c.happiness=100; c.hunger=100; c.expgained(3);}
      else
            {  c.happiness+=17;   c.hunger+=10; c.expgained(3);}
     }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
    }//GEN-LAST:event_jButton6KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     saveobj(c);
    new Home().setVisible(true);
        close();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Eat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    // End of variables declaration//GEN-END:variables
}
