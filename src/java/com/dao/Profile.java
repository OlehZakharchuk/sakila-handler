package com.dao;
// Generated Oct 8, 2018 6:36:55 PM by Hibernate Tools 4.3.1



/**
 * Profile generated by hbm2java
 */
public class Profile  implements java.io.Serializable {


     private int id;
     private String name;
     private String password;

    public Profile() {
    }

    public Profile(int id, String name, String password) {
       this.id = id;
       this.name = name;
       this.password = password;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


