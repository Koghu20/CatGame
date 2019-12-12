
package CatGame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author kamal kumar
 */
public class customize implements Serializable {
      Random r=new Random();
    String Dname,Dbreed,haircolor[]={"/White.gif","/Black.gif","/Grey.gif","/Fawn.gif"},eye[]={"Blue","Green","Black","Brown"},hair[]={"Long","Short","Wavy long"};
    String Dhaircolor,Dhair,Deye,file;
    public customize(String Dname,String Dbreed) {
        this.Dbreed=Dbreed;
        this.Dname = Dname;
        this.Dhair=hair[r.nextInt(3)];
        this.Deye=eye[r.nextInt(4)];
        this.Dhaircolor=haircolor[r.nextInt(4)];
        saveobj(this);
    }
    public customize()
    {
        customize c=readobj();
        this.file=c.Dhaircolor;
    }
public String obj()
{
    customize f=new customize();
    f=readobj();
    return f.Dhaircolor;
}
        public void saveobj(customize d)
    {
         try {
 
            FileOutputStream fileOut = new FileOutputStream(Dname+"1");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(d);
            objectOut.close();
 
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    public customize readobj()
    { 
        customize c;
         try {
 
            FileInputStream fileOut = new FileInputStream((Dname+"1"));
            ObjectInputStream objectOut = new ObjectInputStream(fileOut);
             c = (customize) objectOut.readObject();
            objectOut.close();
            return c;
        } catch (IOException | ClassNotFoundException ex) {
             System.out.println(ex);
        }
         return  null;
    }
}
