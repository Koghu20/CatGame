/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatGame;

import CatGame.p2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author kamal kumar
 */
public class P1 extends javax.swing.JFrame {

    /**
     * Creates new form P1
     */
    int Wpoints;
    float Apoints;
    float health;
    int count;
    public void read()
    {
        try{
            Scanner sc1=new Scanner(new FileInputStream("c1.txt"));
        count=sc1.nextInt();
        sc1.close();
        Scanner sc=new Scanner(new FileInputStream("health1.txt"));
        health=sc.nextFloat();
        sc.close();
        }catch(Exception e){}
    }
    public void save()
    {
        try{
        PrintWriter q=new PrintWriter(new FileOutputStream("c1.txt"));    
        PrintWriter p=new PrintWriter(new FileOutputStream("health1.txt"));
        p.print(health);
        q.print(count);
        q.close();
        p.close();
        }catch(Exception e){}
    }
    public P1() {
        health=500;
        count=0;
        out.start();
        initComponents();
    }
    public P1(float Apoints) {
        read();
        health-=Apoints;
        out.start();
        initComponents();
    }
    Timer out=new Timer(500,new ActionListener(){
@Override
 public void actionPerformed(ActionEvent e) { 
if(health<=0)
{   
    JOptionPane.showMessageDialog(null,"GAME OVER ! Player 2 WON");
    health=500;
            save();
    new Home(5).setVisible(true);
    dispose();

}

}
});

    public void select()
    { Random r=new Random();
       if(attack.getSelectedItem().equals("Direct")){
        switch((String)weapon.getSelectedItem())
        {
            case "knife":Wpoints=2; Apoints=(float) (Wpoints*(r.nextInt(4)));break;
            case "shotgun":Wpoints=5;Apoints=(float) (Wpoints*(r.nextInt(9))+1);break;
            case"Assault Rifles":Wpoints=7;Apoints=(float) (Wpoints*(r.nextInt(14))+2);break;
            case "Sniper Rifles":Wpoints=8;Apoints=(float) (Wpoints*(r.nextInt(17))+3);break;
         }
       }
       else
       {
           count++;
           if(count>=4)
           {
               health-=100;
               count=0;
           }
           else if(health==500)
               health=500;
           else{
            switch((String)weapon.getSelectedItem())
        {
            case "knife":health+=15;break;
            case "shotgun":health+=24;break;
            case"Assault Rifles":health+=27;break;
            case "Sniper Rifles":health+=38;break;
         }
       } 
       }
        
    }
   
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weapon = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        attack = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        weapon.setBackground(new java.awt.Color(204, 0, 0));
        weapon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        weapon.setForeground(new java.awt.Color(255, 255, 255));
        weapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "knife", "shotguns", "Assault Rifles", "Sniper Rifles" }));
        weapon.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(weapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 130, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PlAYER 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Attack Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 140, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Choose Weapon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 150));

        attack.setBackground(new java.awt.Color(255, 51, 51));
        attack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        attack.setForeground(new java.awt.Color(255, 255, 255));
        attack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direct", "Sneak", " " }));
        attack.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(attack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 130, -1));

        jProgressBar1.setBackground(new java.awt.Color(204, 0, 51));
        jProgressBar1.setForeground(new java.awt.Color(102, 204, 0));
        jProgressBar1.setMaximum(500);
        jProgressBar1.setValue((int)health);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("ATTACK");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 140, 40));

        status.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("    ");
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 50, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HEALTH ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attack.gif"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
if(health<=0)
        status.setText("0/500");
else
    status.setText((int)health+"/500");
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 select();
 save();
 new p2(Apoints).setVisible(true);
 this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
health=500;
        JOptionPane.showMessageDialog(null," Player 2 won") ;
        save();
          try{
         PrintWriter p=new PrintWriter(new FileOutputStream("health2.txt"));
        p.print(500);
        p.close();
        }catch(Exception e){}
        new Home(2).setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> attack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> weapon;
    // End of variables declaration//GEN-END:variables
}
