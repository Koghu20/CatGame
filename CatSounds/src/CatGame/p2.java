/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatGame;

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
public class p2 extends javax.swing.JFrame {
float Apoints;
int count;
float health;
int Wpoints;

    
    public p2() {
        initComponents();
        health=500;
        count=0;
        out.start();
        
    }
       public p2(float Apoints) {
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
        public void read()
    {
        try{
            Scanner sc1=new Scanner(new FileInputStream("c2.txt"));
        count=sc1.nextInt();
        sc1.close();
        Scanner sc=new Scanner(new FileInputStream("health2.txt"));
        health=sc.nextFloat();
        sc.close();
        }catch(Exception e){}
    }
    public void save()
    {
        try{
        PrintWriter q=new PrintWriter(new FileOutputStream("c2.txt"));    
        PrintWriter p=new PrintWriter(new FileOutputStream("health2.txt"));
        p.print(health);
        q.print(count);
        q.close();
        p.close();
        }catch(Exception e){}
    }
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
           if(count>=4)
           {
               health-=85;
               count=0;
           }
           else if(health==500)
               health=500;
           else{
            switch((String)weapon.getSelectedItem())
        {
            case "knife":health+=15;
            case "shotgun":health+=24;
            case"Assault Rifles":health+=27;
            case "Sniper Rifles":health+=38;
         }
       } 
       }
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        weapon = new javax.swing.JComboBox<>();
        attack = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person.png"))); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 110, 150));

        weapon.setBackground(new java.awt.Color(204, 0, 0));
        weapon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        weapon.setForeground(new java.awt.Color(255, 255, 255));
        weapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "knife", "shotguns", "Assault Rifles", "Sniper Rifles" }));
        weapon.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(weapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 130, -1));

        attack.setBackground(new java.awt.Color(255, 51, 51));
        attack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        attack.setForeground(new java.awt.Color(255, 255, 255));
        attack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direct", "Sneak", " " }));
        attack.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(attack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 130, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("ATTACK");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Choose Weapon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Attack Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PLAYER 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, 40));

        jProgressBar1.setBackground(new java.awt.Color(204, 0, 51));
        jProgressBar1.setForeground(new java.awt.Color(102, 204, 0));
        jProgressBar1.setMaximum(500);
        jProgressBar1.setValue((int)health);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HEALTH ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attack.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        select();
        save();
         try{
         PrintWriter p=new PrintWriter(new FileOutputStream("health1.txt"));
        p.print(500);
        p.close();
        }catch(Exception e){}
        new P1(Apoints).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    JOptionPane.showMessageDialog(null,"PLayer 1 won");
        health=500;
            save();   
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
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p2().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JComboBox<String> weapon;
    // End of variables declaration//GEN-END:variables
}
