package com.ch.object.work;

/**
 * @author procedure sail
 * @date 2021/10/8 20:03
 */
public class User {

    private int id;
    private String password;
    private String email ;

    public User() {
    }

    public User(int id, String password ) {
        this.id = id;
        this.password = password;
        this.email  = this.id+"@gameschool.com";
    }
    public User(int id, String password, String email ) {
        this.id = id;
        this.password = password;
        this.email  = email ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        User user = new User(1, "ch123456");
        System.out.println("用户id:"+user.getId()+",用户密码:"+user.getPassword()+",用户邮箱:"+user.getEmail());
    }
}
