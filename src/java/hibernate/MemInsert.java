/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;
import org.hibernate.*;


/**
 *
 * @author Shashank
 */
public class MemInsert {
    public static void main(String args[])
    {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sess=sf.openSession();
        Transaction tx=null;
        Member s1=new Member();
       // s1.setRoll(14);
        s1.setName("Shashank");
        s1.setPass("mishra");
        s1.setEmail("shashankm429@gmail.com");
        s1.setMid("sm123");
        s1.setSex("M");



        try{
            tx=sess.beginTransaction();
            sess.save(s1);
            tx.commit();
            sess.close();
            System.out.println("Data saved!!!");





        }catch(Exception e){
            System.out.println(e.toString());


        }





    }

}
