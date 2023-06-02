package christin;
public class Car {
    private String Id;
    private String Brand;
    private String Model;

    private String HP;

    public Car(String Id, String Brand, String Model, String HP) {
        this.Id = Id;
        this.Brand = Brand;
        this.Model = Model;
        this.HP = HP;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id='" + Id + '\'' +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", HP='" + HP + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }
}
