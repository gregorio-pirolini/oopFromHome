package Projekt;

public class Liste {


    private String name;
    private Produkt eigenschaften;


    public Liste(String name, Produkt eigenschaften) {
        this.name = name;
        this.eigenschaften = eigenschaften;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getEigenschaften() {
        return eigenschaften;
    }

    public void setEigenschaften(Produkt eigenschaften) {
        this.eigenschaften = eigenschaften;
    }


    public String getDetails() {
        // TODO Auto-generated method stub
        return "name: "+ name +" eigenschaften: "+ eigenschaften.getDetails();


}
}