package snackbar;// package package

public class Customer{// create a class with the same name as file
  //declare maxId that will allow us to create a new id for every new customer
  private static int maxId = 0;

  //declare variables
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash){//declare constructor function
    //derive id from previously used id by iterating
    maxId++;

    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  //getters
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public double getCash(){
    return cash;
  }

  public void setName(String name){//setter for name
    this.name = name;
  }

  public void addCash(double amountToAdd){//add cash to customer
    this.cash = this.cash + amountToAdd;
  }

  public void buySnacks(double costToBuy){//remove cash from customer after purchase
    this.cash = this.cash - costToBuy;
  }
}