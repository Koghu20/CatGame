/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatGame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Scanner;

/**
 *
 * @author kamal kumar
 */
public class timecal {
    long ut1,ut2,ut3;
    public void savetime()
    {   ut1=Instant.now().getEpochSecond();
        try{
         PrintWriter p=new PrintWriter(new FileOutputStream("time.txt"));
           p.print(ut1);
           p.close();
        }catch(Exception e){}
    }
    public void readtime()
    {
        try{
        Scanner sc=new Scanner(new FileInputStream("time.txt"));
        ut1=sc.nextLong();
        sc.close();
        }catch(Exception e){}
        manipulate();
    }
    public void manipulate()
    {
        ut2=Instant.now().getEpochSecond();
        ut3=ut2-ut1;
               if(ut3<300)
            ut3=0;
             else if(ut3==300)
                ut3=10;
             else{
                 ut3/=300;
                 ut3=ut3*10;
             }
    }

    public long getUt3() {
        return ut3;
    }
}
