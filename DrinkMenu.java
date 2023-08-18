import java.util.Scanner;

// Ask the user what drink they would like, and give a list of the selections, which are water, coffee or tea.
// The users drinkChoice should be collected
// If the users drink choice was water the user should be given the options of hot or cold water
    // The users choice on whether they want hot water or not should be collected
    // If the user chose hot water they should be given a message telling them their final order of hot water
    // Else if the user chose cold water they should be given a choice between ice or no ice
        // The users choice on whether they want ice or not should be collected. 
        // If they chose ice a final message of their order should be given
        // If they chose no ice a final message of their order should be given
// Else if the user chose coffee they should be given the following choices:
    // Ask the user if they would like decaffinated or not 
    // collect the data
    // Ask the user if they would like milk, cream, or not 
    // collect the data
    // Ask the user if they would like sugar or not 
    // collect the data
    // print a message with their final order
// Else if they chose tea
    // Ask if theyd like green or black
    // collect the data
    // If black 
        // give final order message
    // Else green
        // give final order message
    

public class DrinkMenu {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("The drink choices are\n1. water\n2. coffe\n3. tea\nWhat would you like?: ");
       String drinkChoice = input.next();

       if(drinkChoice.equals("water")){
            System.out.print("Would you like your water to be hot or cold?: ");
            String waterTemp = input.next();

            if(waterTemp.equals("hot")){
                System.out.print("Your order is hot water.");
            }else{
                System.out.print("Would you like ice or no ice?: ");
                String iceOrNo = input.next();

                if(iceOrNo.equals("ice")){
                    System.out.print("Your order is ice water.");
                }else{
                    System.out.print("Your order is cold water no ice.");
                }
            }
       }else if(drinkChoice.equals("coffee")){
            System.out.print("Would you like decaf or no decaf?: ");
            String decaf = input.next();
            System.out.print("Would you like milk or cream?: ");
            String milkOrCream = input.next();
            System.out.print("Would you like sugar or no sugar?: ");
            String sugar = input.next();

            System.out.print("Your order is " + decaf + " coffee, with " + milkOrCream + ", and " + sugar);


       }else if(drinkChoice.equals("tea")){
            System.out.print("Would you like black or green tea?: ");
            String teaChoice = input.next();

            System.out.print("\nYour order is " + teaChoice + " tea");
       }
    }
}
