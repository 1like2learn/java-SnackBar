package snackbar;//declare package

public class VendingMachine{//create class
  //declare maxId private because only the function needs to know about it static because it won't need to be reassigned
  private static int maxId = 0;

  //declare variables
  public int id;
  public String name;

  //declare constructor
  public VendingMachine(String name){
    //iterate id
    maxId++;

    //assign iterated id to new vending machine
    id = maxId;
    this.name = name;
  }

  //create getters
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }

  //create setter
  public void setName(String name){
    this.name = name;
  }
}