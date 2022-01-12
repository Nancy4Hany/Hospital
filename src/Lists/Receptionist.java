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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Receptionist extends Person implements Serializable {

//    private String recepName;
//    private int recepAge;
//    private String recepGender;
    protected String specialization;
    protected String salary;

    protected ArrayList<Date> schedule;
    protected int ID;


    public static HashMap<String, String> usersRec = new HashMap<String, String>();
    public static ArrayList<Receptionist> listofRec= new ArrayList<>();
    
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
    public Receptionist()  {
        
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

    public Receptionist( int ID, String RecName, String RecAge, String RecGender, String RecUsername, String RecPhone, String RecPassword) {
        this.ID = ID;
        this.name = RecName;
        this.username = RecUsername;
        this.age = RecAge;
        this.phone = RecPhone;
        this.password = RecPassword;
        this.gender = RecGender;

    }

    public static void WritingFile() throws IOException {
        //  ObjectOutputStream recep = new ObjectOutputStream(new FileOutputStream("recep.bin")) ;
        ObjectOutputStream listofRecobj = new ObjectOutputStream(new FileOutputStream("RECrecep.bin"));
        

        //        recep.writeObject(listofrecep);
        Person rec = new Person();
        rec.setName("nancy");
        rec.setGender("female");
        rec.setPassword("nancy");
        rec.setUsername("nancy");
        rec.setAge("20");
        listofRec.add((Receptionist) rec);
         Person rec2 = new Person();
        rec2.setName("sara");
        rec2.setGender("female");
        rec2.setPassword("sara");
        rec2.setUsername("sara");
        rec2.setAge("20");
        listofRec.add((Receptionist) rec2);
        listofRecobj.writeObject(listofRec);
        
        listofRecobj.close();
        

    }

    public static ArrayList<Receptionist> ReadingFile() throws IOException, ClassNotFoundException {
        ObjectInputStream listofRecobjr = new ObjectInputStream(new FileInputStream("RECrecep.bin"));
        listofRec = (ArrayList<Receptionist>) listofRecobjr.readObject();
        listofRecobjr.close();
        return listofRec;

    }


    public static HashMap<String, String> getUsersRec() {
        return usersRec;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    }

