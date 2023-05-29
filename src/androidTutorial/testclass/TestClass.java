package androidTutorial.testclass;

public class TestClass {
    public static String name;
    public int age;
    public String skinColor;

    public TestClass() {
    }

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public static void printSomething() {
        System.out.println("printin something...");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return this.skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

 

 

    @Override
    public String toString() {
        return "{" +
            " age='" + getAge() + "'" +
            ", skinColor='" + getSkinColor() + "'" +
            "}";
    }

   

    
}
