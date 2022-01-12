/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

//import static hospitalproject.HospitalProject.listofrecep;
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

public class patient extends Person implements Serializable {

//    private String recepName;
//    private int recepAge;
//    private String recepGender;
    protected String height;
    protected String weight;
    protected String RoomNo;
    protected String medicalCase;
    protected Date checkupDate;
    protected ArrayList<String> medicines;
    protected String DoctorName;
    protected int ID;
    protected int paid;

    public static HashMap<String, String> usersPat = new HashMap<String, String>();
    public static ArrayList<patient> listofPat = new ArrayList<>();
    
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
    public patient()  {
        this.height = "";
        this.weight = "";
        this.RoomNo = "";
        this.medicalCase = "";
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        try {
//            this.checkupDate = dateFormat.parse(checkupDate.toString());
//        } catch (ParseException ex) {
//            Logger.getLogger(patient.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //this.checkupDate = new Date();
        this.medicines = new ArrayList<>();
        this.DoctorName = "";
        this.ID = 0;
        this.paid = 0;
        this.name = "";
        this.username = "";
        this.age = "";
        this.phone = "";
        this.password = "";
        this.gender = "";

    }

    public patient(String height, String weight, String RoomNo, String medicalCase, String DoctorName, ArrayList<String> medicines, Date checkUpdate, int ID, int Paid, String patName, String patAge, String patGender, String patUsername, String patPhone, String patPassword) {
        this.height = height;
        this.weight = weight;
        this.RoomNo = RoomNo;
        this.medicalCase = medicalCase;
        this.checkupDate = checkUpdate;
        this.medicines = medicines;
        this.DoctorName = DoctorName;
        this.ID = ID;
        this.paid = Paid;
        this.name = patName;
        this.username = patUsername;
        this.age = patAge;
        this.phone = patPhone;
        this.password = patPassword;
        this.gender = patGender;

    }

    public static void WritingFile() throws IOException {
        //  ObjectOutputStream recep = new ObjectOutputStream(new FileOutputStream("recep.bin")) ;
        ObjectOutputStream listofPatobj = new ObjectOutputStream(new FileOutputStream("recep.bin"));
        

        //        recep.writeObject(listofrecep);
        listofPatobj.writeObject(listofPat);
        
        listofPatobj.close();
        

    }

    public static ArrayList<patient> ReadingFile() throws IOException, ClassNotFoundException {
        ObjectInputStream listofPatobjr = new ObjectInputStream(new FileInputStream("recep.bin"));
        listofPat = (ArrayList<patient>) listofPatobjr.readObject();
        listofPatobjr.close();
        return listofPat;

    }

    public String toString() {

        return "name: " + " " + name + "user name: " + " " + username + "age: " + " " + age + "phone: " + " " + phone + "password: " + " " + password + "gender: " + " " + gender + "ID: " + " " + ID + "doctor: " + " " + DoctorName + "medicines: " + " " + medicines + "case: " + " " + medicalCase + "room: " + " " + RoomNo + "weight: " + " " + weight + "height: " + " " + height
                + "checkup date: " + " " + checkupDate + "paid: " + " " + paid;

    }

    public static HashMap<String, String> getUsersPat() {
        return usersPat;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String RoomNo) {
        this.RoomNo = RoomNo;
    }

    public String getMedicalCase() {
        return medicalCase;
    }

    public void setMedicalCase(String medicalCase) {
        this.medicalCase = medicalCase;
    }

    public Date getCheckupDate() {
        return checkupDate;
    }

    public void setCheckupDate(Date checkupDate) {
        this.checkupDate = checkupDate;
    }

    public ArrayList<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<String> medicines) {
        this.medicines = medicines;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

   


    }





