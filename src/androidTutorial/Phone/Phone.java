package androidTutorial.Phone;

public class Phone {
    private String name;
    private int screenSize;
    private int memoryRam;
    private int camera;

    // konstruktor
    Phone(String name,int screenSize,int memoryRam,int camera){
this.name=name;
this.screenSize=screenSize;
this.memoryRam=memoryRam;
this.camera=camera;


    }

    Phone() {
        this.name="name";
        this.screenSize=1;
        this.memoryRam=2;
        this.camera=3;
};
        
        

    public void getPhone() {
    System.out.println(name+","+screenSize+","+memoryRam+","+camera);
    }

    public void playMusic(String trackName) {

        System.out.println(trackName);
    }
    
    public void setName(String name) {
        this.name = name;
    };

    public String getName() {
        return name;
    }
    public void getScreenSize(int screenSize) {
        this.screenSize = screenSize;
    };

    public int getScreenSize() {
        return screenSize;
    }
    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    };

    public int getMemoryRam() {
        return memoryRam;
    }
    public void setCamera(int camera) {
        this.camera = camera;
    };

    public int getCamera() {
        return camera;
    }
    
}
