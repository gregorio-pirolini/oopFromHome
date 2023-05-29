package androidTutorial.singlePattern;

 
public class Database {
    private String name;
    private static Database instance;

    public static synchronized Database getInstance(String name) {
        if (null == instance) {
            instance = new Database(name);
        }
         return instance;
    }
    // Constructor 

    private Database(String name) {
        this.name = name;
    }


    // setter
    public void setName(String name) {
        this.name = name;
    }


    // getter
    public String getName(){
        return name;
    }
}