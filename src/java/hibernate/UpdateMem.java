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
public class UpdateMem {
     public static void main(String args[])
    {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sess=sf.openSession();
        Transaction tx=null;
        Member s1=new Member();

        s1.setName("Shashank Mishra");
        s1.setPass("shanks");
        s1.setEmail("shashank.mishra2211@gmail.com");
        s1.setMid("sm123");
        s1.setSex("M");



        try{
            tx=sess.beginTransaction();
            sess.update(s1);
            tx.commit();
            sess.close();
            System.out.println("Data Updated!!!!!");





        }catch(Exception e){
            System.out.println(e.toString());


        }





    }


}
