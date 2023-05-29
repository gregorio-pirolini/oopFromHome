package androidTutorial.Doctor;

public class Stomach extends Organ {
    private boolean isEmpty;

    // konstruktor

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void getDetails() {
        super.getDetails();
        if (isEmpty) {
            System.out.println("needs to be fed");
        } else {
            System.out.println("is full");

        }
    }

    public void digest() {
    System.out.println("digesting begins");

}
    //getter

    //setter


    /**
     * @return boolean return the isEmpty
     */
    public boolean isIsEmpty() {
        return isEmpty;
    }

    /**
     * @param isEmpty the isEmpty to set
     */
    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

}