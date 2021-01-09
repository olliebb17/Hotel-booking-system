
package hotelmangingwork;
import java.util.Scanner;

public class Hotelmangingwork {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int Single = 50;
        int family = 105;
        int board = 0;
        int Double = 75;
        double Bill = 0;
        System.out.println("Hello would you like to book a room");
        String YorN = input.next();
        if (YorN.equals("Yes")){
            System.out.println("There is a special promotion if you book rooms for more then a week you get 20% off per day over one week");
            System.out.println("What board would you like, £0 Self-Catering(1), £10 Half-Board(2), £20 Full Board(3) ");
            int boardchoice = input.nextInt();
            if(boardchoice == 1){
                System.out.println("You have chosen to do Self-Catering");
                System.out.println("this will not cost you anything");
                System.out.println("Your Bill is currently " +Bill);
            }
            if(boardchoice == 2){
                System.out.println("You have chosen to do Half-Board");
                System.out.println("this will cost you £10");
                Bill = (Bill + 10);
                System.out.println("Your Bill is currently " +Bill);
            }
            if(boardchoice == 3){
                System.out.println("You have chosen to do Full Board");
                System.out.println("this will cost you £20");
                Bill = (Bill + 20);
                System.out.println("Your Bill is currently " +Bill);
            }
            System.out.println("There are three rooms. Single(£50) Double(£75) Family(£105");
            System.out.println("what room would you like to get. Single(1), Double(2), Family(3)");
            int roomnum = input.nextInt();
            switch(roomnum){
                case 1:{
                    System.out.println("how many days do you want to stay here?");
                    int daysstay = input.nextInt();
                    if (daysstay > 7){
                        double daysextra = daysstay - 7;
                        double costofdays = 7 * 50;
                        daysextra = daysextra * 50;
                        daysextra = daysextra - (daysextra*0.2);
                        double daytotalcost = daysextra + costofdays + Bill;
                        System.out.println("total cost of room for " + daysstay + " days is " + "£" + daytotalcost);
                    }
                    else{
                        double costdays = (daysstay * 50) + Bill; 
                        System.out.println("total cost of room for " + daysstay + " days is " + "£" + costdays );
                    }
                }
                    case 2:{
                    System.out.println("how many days do you want to stay here?");
                    int daysstay = input.nextInt();
                    if (daysstay > 7){
                        double daysextra = daysstay - 7;
                        double costofdays = 7 * 75;
                        daysextra = daysextra * 75;
                        daysextra = daysextra - (daysextra*0.2);
                        double daytotalcost = daysextra + costofdays;
                        System.out.println("total cost of room for " + daysstay + " days is " + "£" + daytotalcost);
                    }
                    else{
                        double costdays = (daysstay * 75) + Bill;  
                        System.out.println("total cost of room for " + daysstay + " days is " + "£" + costdays );
                    }
                    }
                    case 3:{
                    System.out.println("how many days do you want to stay here?");
                    int daysstay = input.nextInt();
                    if (daysstay > 7){
                        double daysextra = daysstay - 7;
                        double costofdays = 7 * 105;
                        daysextra = daysextra * 105;
                        daysextra = daysextra - (daysextra*0.2);
                        double daytotalcost = daysextra + costofdays + Bill;
                        System.out.println("total cost of room for " + daysstay + " days is " + "£" + daytotalcost);
                    }
                    else{
                        double costdays = (daysstay * 105) + Bill; 
                        System.out.println("total cost of room for " + daysstay + " days is " + "£" + costdays );
                    }
                    }
        }
        
    }
   if (YorN.equals("No")){
            System.out.println("Okay bye then");
         
}
   else{
       System.out.println("Please restart program");
   }
}
}
