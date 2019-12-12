/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatGame;

import java.io.Serializable;
import java.time.Instant;

/**
 *
 * @author hp
 */
public class cat implements Serializable{
    String name;
    double happiness;
    float money;
    double hunger;
    int level;
    long timeOfbirth;
     double exp;
     int age;
     double expage;
     double expn;
    public cat(String name) {
long seconds=Instant.now().getEpochSecond();;
        this.name = name;
        this.happiness=100;
        this.hunger=100;
        this.money=200;
        this.level=1;
        this.timeOfbirth=seconds;
        this.exp=0;
        this.age=1;
        this.expage=0.7;
        this.expn=9;
    }
     public void expage(){
        if (age>=0 && age<=2)
            expage=0.7;
        else if(age>2 && age<=7)
            expage=2;
        else if (age>7 && age<=9)
            expage =1.6;
        else if(age>9 && age<=11)
            expage =1;
        else if (age>11 && age<=14)
            expage=0.5;
    }
    
     public void sethunger(int a){
      hunger = a;
   }
   


    
    public void setage(int a){
        age=a;
        expn=9*a;
    }

    public void setexpneeded(){
        expn=9*age;
    }
    
    public void expgained(int a){
        
        exp=exp+((a*0.4*expage)+(0.02*level)+(0.005*happiness));
        if(exp>=expn)
        {
            exp=0;
            level++;
            expn=9*level;
        
        }
    
    }
}
