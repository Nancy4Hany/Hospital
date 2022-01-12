/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Doctor extends Person implements Serializable {

//    private String recepName;
//    private int recepAge;
//    private String recepGender;
    protected String specialization;
    protected String salary;

    protected ArrayList<Date> schedule;
    protected int ID;


    public static HashMap<String, String> usersDoc = new HashMap<String, String>();
    public static ArrayList<Doctor> listofDoc = new ArrayList<>();
    
//    Most popular
//Dermatology (Skin)
//Dentistry (Teeth)
//Psychiatry (Mental, Emotional or Behavioral Disorders)
//Pediatrics and New Born (Child)
//Neurology (Brain & Nerves)
//Orthopedics (Bones)
//Gynaecology and Infertility
//Ear, Nose and Throat
//Cardiology and Vascular Disease (Heart)

//    public receptionist() {
//
//    }
    public Doctor()  {
        
        this.specialization = "";
        this.salary = "";
        this.schedule =  new ArrayList<>();
        this.ID = 0;
        this.name = "";
        this.username = "";
        this.age = "";
        this.phone = "";
        this.password = "";
        this.gender = "";

    }

    public Doctor( String spec , String salary,ArrayList<Date> schedule, int ID, String DocName, String DocAge, String DocGender, String DocUsername, String DocPhone, String DocPassword) {
        this.specialization = spec ;
        this.salary = salary;
        this.schedule = schedule ; 
        this.ID = ID;
        this.name = DocName;
        this.username = DocUsername;
        this.age = DocAge;
        this.phone = DocPhone;
        this.password = DocPassword;
        this.gender = DocGender;

    }

    public static void WritingFile() throws IOException {
        //  ObjectOutputStream recep = new ObjectOutputStream(new FileOutputStream("recep.bin")) ;
        ObjectOutputStream listofDocobj = new ObjectOutputStream(new FileOutputStream("Docrecep.bin"));
        

        //        recep.writeObject(listofrecep);
        listofDocobj.writeObject(listofDoc);
        
        listofDocobj.close();
        

    }

    public static ArrayList<Doctor> ReadingFile() throws IOException, ClassNotFoundException {
        ObjectInputStream listofDocobjr = new ObjectInputStream(new FileInputStream("Docrecep.bin"));
        listofDoc = (ArrayList<Doctor>) listofDocobjr.readObject();
        listofDocobjr.close();
        return listofDoc;

    }


    public static HashMap<String, String> getUsersPat() {
        return usersDoc;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public ArrayList<Date> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<Date> schedule) {
        this.schedule = schedule;
    }
   


    }

