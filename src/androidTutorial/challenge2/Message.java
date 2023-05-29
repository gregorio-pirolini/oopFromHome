package androidTutorial.challenge2;

public class Message {
    private String text;
    private String recipient;
    private int id;

//konstructor

Message(String text, String recipient, int id) {
    this.text = text;
    this.recipient = recipient;
    this.id = id;
}

public void getDetails(){

    System.out.println(" recipient: "+recipient+ "\ntext: "+text+"\nid: "+id);
}
//setter

public void setText(String text) {
    this.text = text;
}
public void setRecipient(String recipient) {
    this.recipient = recipient;
}
public void setId(int id) {
    this.id = id;
}
//getter

public String getText() {

    return text;
}
public String getRecipient() {

    return recipient;
}
public int getId() {

    return id;
}


}
