package hibernate;
// Generated 27 Sep, 2015 9:29:00 AM by Hibernate Tools 3.2.1.GA



/**
 * Member generated by hbm2java
 */
public class Member  implements java.io.Serializable {


     private String mid;
     private String pass;
     private String name;
     private String email;
     private String sex;
     
    public Member() {
    }

	
    public Member(String mid) {
        this.mid = mid;
    }
    public Member(String mid, String pass, String name, String email, String sex) {
       this.mid = mid;
       this.pass = pass;
       this.name = name;
       this.email = email;
       this.sex = sex;
    }
   
    public String getMid() {
        return this.mid;
    }
    
    public void setMid(String mid) {
        this.mid = mid;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the acc
     */
   




}


