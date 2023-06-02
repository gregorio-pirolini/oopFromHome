
package christin;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.util.ArrayList;
public class Main extends Application {


    private ArrayList<Car> myCars = new ArrayList<>();

    Car car1= new Car("1","Brand","Model","HP");
    Car car2= new Car("2","Brand","Model","HP");
    Car car3= new Car("3","Brand","Model","HP");


    public static void main(String[] args) {
        launch(args);
    }





    @Override
    public void start(Stage primaryStage) {


        primaryStage.setTitle("My First JavaFX App");

//        Label label1 = new Label("JavaFX!");
//        Label label2 = new Label("Hello World!");
//        TextField tf = new TextField();
//        Button b1= new Button("self-destruct");
//        Button b2= new Button("find target");
//
//
//        GridPane gp = new GridPane();
//        gp.add(label1,0,0);
//        gp.add(label2,1,0);
//        gp.add(tf,2,0);
//        gp.add(b1,1,1);
//        gp.add(b2,2,1);





        primaryStage.setTitle("AUTO App");
//
        Label labelId = new Label("id");
        Label labelBrand = new Label("Brand");
        Label labelModel = new Label("Model");
        Label labelHp = new Label("Hp");
////
        TextField tfId = new TextField();
        TextField tfBrand = new TextField();
        TextField tfModel= new TextField();
        TextField tfHp = new TextField();
//
        Button destruct= new Button("Self-Destruct");
        Button target= new Button("Find Target");
        Button attack= new Button("Attack");
        Button bAnlegen= new Button("anlegen");
        Button bAnzeigen= new Button("anzeigen");
        Button bLoeschen= new Button("löschen");



        String taText= getValuesFromMyCars();

        TextArea ta= new TextArea(taText);
//

// Load the image
          Image image = new Image(getClass().getResource("christine.png").toString(), true);



        // Create an ImageView and set the image
           ImageView imageView = new ImageView(image);
           imageView.setFitWidth(400); // Set the width to 200 pixels
            imageView.setFitHeight(300); // Set the height to 150 pixels




        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10); // Horizontal spacing between nodes
        gp.setVgap(10); // Vertical spacing between nodes
////
//
        gp.add(labelId,0,0);
        gp.add(labelBrand,0,1);
        gp.add(labelModel,0,2);
        gp.add(labelHp,0,3);
//
        gp.add(tfId,1,0);
        gp.add(tfBrand,1,1);
        gp.add(tfModel,1,2);
        gp.add(tfHp,1,3);
//
//
//
        gp.add(bAnlegen,2,0);
        gp.add(bAnzeigen,2,1);
        gp.add(bLoeschen,2,2);

        gp.add( destruct,2,4);

        gp.add(target,2,5);
        gp.add(attack,2,6);

//        add(Node child, int columnIndex, int rowIndex, int colspan, int rowspan)
        gp.add(ta,0,7, 4,1);


                                              // Add the ImageView to the GridPane
                                                gp.add(imageView,0,8, 4,1);




// | labelId   | tfId        |bAnlegen      |      ||||
// | labelBrand|  tfBrand    |bAnzeigen     |      ||||
// | labelModel|  tfModel    |bLoeschen     |      ||||
// | labelHp|      tfHp      |              |           ||||
// |         |               |        |           ||||
// |  |||||||
// |  |||||||
// |  |||||||

        Scene scene = new Scene(gp,500,800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String getValuesFromMyCars() {

        String stringBuilder = "";
        for (Car car : myCars) {
            car.toString();
        }


        return stringBuilder;
    }
}
