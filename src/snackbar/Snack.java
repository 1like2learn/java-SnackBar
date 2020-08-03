package snackbar;
//declare package of class

public class Snack{
  //declare class of Snack
  private static int maxId = 0;

  //declare variables of snack objects
  private int id;
  private String name;
  private double cost;
  private int vendingMachineId;
  private int quantity;

  //Create constructor function with those variables
  public Snack(String name, double cost, int vendingMachineId, int quantity){
    maxId++;//add one to the last id used

    id = maxId;//make the id of the snack the last id used plus one
    //make these items in the object equal to the arguments that will be passed in
    this.name = name;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
    this.quantity = quantity;
  }

  //declare methods to read those variables
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public double getCost(){
    return cost;
  }
  public int getVendingMachineId(){
    return vendingMachineId;
  }
  public int getQuantity(){
    return quantity;
  }

  //declare methods to change those variables
  public void setName(String name){
    this.name = name;
  }
  public void setCost(int cost){
    this.cost = cost;
  }
  public void setVendingMachineId(int vendingMachineId){
    this.vendingMachineId = vendingMachineId;
  }

  //method to add to quantity
  public void addToQuantity(int addedStock){
    this.quantity = quantity + addedStock;
  }

  //method to buy snack
  public void buyAmount(int amountToBuy){
    this.quantity = quantity - amountToBuy;
  }
  
  //method to return price of amount bought
  public double priceOfAmountToBuy(int amountToBuy){
    return amountToBuy * this.cost;
  }
}