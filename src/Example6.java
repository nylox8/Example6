import java.util.Scanner;
class Example6 {
    public static void main (String [] argv) {
        float retailPrice, realPrice, discount;
        System.out.println("Enter the retail price:");

        //Reading Value
        Scanner givenValue;
        givenValue = new Scanner (System.in);
        retailPrice = givenValue.nextFloat();

        System.out.println("Enter the real price:");
        realPrice = givenValue.nextFloat();

        discount = (retailPrice - realPrice)/realPrice*100;
        System.out.println("The discount is: "+discount+"%");
    }
}

