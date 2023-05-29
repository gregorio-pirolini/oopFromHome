package androidTutorial.Doctor;

public class Organ {
    private String name;
    private String medicalCondition;

    /*
     * konstructor
     */
    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void getDetails() {
    System.out.println("name " + name+" medicalCondition:  " + medicalCondition);
}

    //setter
public void setName(String name){
    this.name = name;
}
public void setMedicalCondition(String medicalCondition){
    this.medicalCondition = medicalCondition;
}
    //  getter

    public String getName() {
        return name;
}
    public String getMedicalCondition() {
        return medicalCondition;
}

    
}
