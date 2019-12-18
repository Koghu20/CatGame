/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatGame;

import javax.swing.JFrame;

/**
 *
 * @author kamal kumar
 */
public class MyFrame extends JFrame {
    
    MyFrame()
    {
        keylist app=new keylist();
        setSize(1200,750);
        add(app);
        app.init();
        app.start();
    }
}
