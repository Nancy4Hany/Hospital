/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

public class Person {

    protected String name;
    protected String username;
    protected String age;
    protected String phone;
    protected String password;
    protected String gender;

    public Person() {
        this.username = "";
        this.password = "";
        this.name = "";
        this.age = "";
        this.phone = "";
        this.gender = "";
    }

    public Person(String username, String password, String phone, String name, String age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.phone = phone;

    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
