package hibernate;
// Generated 27 Sep, 2015 9:29:00 AM by Hibernate Tools 3.2.1.GA



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private String logid;
     private String password;

    public Login() {
    }

	
    public Login(String logid) {
        this.logid = logid;
    }
    public Login(String logid, String password) {
       this.logid = logid;
       this.password = password;
    }
   
    public String getLogid() {
        return this.logid;
    }
    
    public void setLogid(String logid) {
        this.logid = logid;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


