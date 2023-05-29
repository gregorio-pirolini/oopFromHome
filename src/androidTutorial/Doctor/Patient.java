package androidTutorial.Doctor;

public class Patient {
    private String name;
    private int age;
    private Eye rightEye;
    private Eye leftEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;


    public Patient(String name, int age, Eye rightEye, Eye leftEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.rightEye = rightEye;
        this.leftEye = leftEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getRightEye() {
        return this.rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public Eye getLeftEye() {
        return this.leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Heart getHeart() {
        return this.heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return this.stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return this.skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }




}
