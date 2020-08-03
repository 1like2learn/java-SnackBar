package snackbar;
//define the package that the main java file is in

import java.text.DecimalFormat;
//import class that will help with formatting prices

public class Main{
  //every class has a file and the name of the file and class should be the same

  // creates a new decimal format that we can use on prices
  private static DecimalFormat df = new DecimalFormat("$#,##0.00");

  public static void executeProgram () {

    //customer constructor Customer(String name, double cash)
    //instantiate customers
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    //VendingMachine(String name)
    //instantiate vending machines
    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    //Snack(String name, double cost, int vendingMachineId, int quantity)
    //instantiate snacks
    Snack chips = new Snack("Chips", 1.75, food.getId(), 36);
    Snack chocBar = new Snack("Chocolate Bar", 1.00, food.getId(), 36);
    Snack pretzel = new Snack("Pretzel", 2.00, food.getId(), 30);
    Snack soda = new Snack("Soda", 2.50, drink.getId(), 24);
    Snack water = new Snack("Water", 2.75, drink.getId(), 20);

    buyItem(jane, soda, 3);
    
    buyItem(jane, pretzel, 1);

    buyItem(bob, soda, 2);
    
    //customer.addCash(double amountToAdd)
    System.out.println();
    jane.addCash(10);
    System.out.println("Customer " + jane.getId() + " cash on hand $" + df.format(jane.getCash()));

    buyItem(jane, chocBar, 1);

    //snack.addToQuantity(int addedStock)
    System.out.println();
    pretzel.addToQuantity(12);
    System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

    buyItem(bob, pretzel, 3);

    System.out.println();
    System.out.println("Stretch Goals");
    // displaySnack(Snack snack, VendingMachine VendingMachine)
    displaySnack(chips, food);
    displaySnack(chocBar, food);
    displaySnack(pretzel, food);
    displaySnack(soda, drink);
    displaySnack(water, drink);

  }

  //snack.removeFromQuantity(int amountToBuy)
  //snack double priceOfAmountToBuy(int amountToBuy)
  //customer buySnacks(double costToBuy)
  //Customer 1 cash on hand 37.75
  //Quantity of snack 4 is 21
  public static void buyItem(Customer customer, Snack snack, int quantity){
    System.out.println();
    snack.removeFromQuantity(quantity);
    customer.buySnacks(snack.priceOfAmountToBuy(quantity));
    System.out.println("Customer " + customer.getId() + " cash on hand " + df.format(customer.getCash()));
    System.out.println("Quantity of snack " + snack.getId() + " is " + snack.getQuantity());
  }
  public static void displaySnack(Snack snack, VendingMachine vendingMachine){
    System.out.println();
    System.out.println("Snack: " + snack.getName());
    System.out.println("Vending Machine: " + vendingMachine.getName());
    System.out.println("Quantity: " + snack.getQuantity());
    System.out.println("Total Cost: " + df.format(snack.getCost() * snack.getQuantity()));
  }

  
  public static void main(String[] args) {
      executeProgram();
  }

}