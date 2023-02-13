
import java.util.*;


class crd_card implements Cloneable {
    String Card_holder_name;
    String Card_Exp_Date;
    int Card_number;

    crd_card(String name,int num,String expdate) {
        Card_holder_name = name;
        Card_Exp_Date = expdate;
        Card_number = num;
    }

    public Object clone() throws CloneNotSupportedException

    {
        System.out.printf("\n Object has been Cloned Successfully ....\n");
        return super.clone();
    }

    int equals(int card_num1) {
        int result = (Card_number == card_num1) ? 1 : 0;
        return result;
    }

    void display() {
        System.out.println("  Card Holder Name  :  " +Card_holder_name+ "\n  Card Number       :  " +Card_number+ "\n  Card Expiry Date :  " +Card_Exp_Date);
    }

}

class CRDCARD {
    public static void main(String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n ----- Credit Card Using Cloning ----- \n\n");
        System.out.printf(" Enter 1st Card Details: \n");
        System.out.printf("\n Enter Card Holder Name : ");
        String name = sc.next();
        System.out.printf(" Enter Card Number : ");
        int card_num = sc.nextInt();
        System.out.printf(" Enter Expiry Date : ");
        String expdate = sc.next();
        crd_card obj = new crd_card(name,card_num,expdate);
        crd_card obj1 = (crd_card) obj.clone();
        System.out.printf("\n Enter 2nd Card Details: \n");
        System.out.printf("\n Enter Card Holder Name : ");
        String name1= sc.next();
        System.out.printf(" Enter Card Number : ");
        int card_num1 = sc.nextInt();
        System.out.printf(" Enter Expiry Date : ");
        String expdate1 = sc.next();
        crd_card obj2 = new crd_card(name1, card_num1,expdate1);
        System.out.printf("\n Members of Cloned Object -> \n\n");
        obj1.display();
        System.out.printf("\n Members of Object - 2 -> \n\n");
        obj2.display();
        int ans = obj1.equals(card_num1);
        if (ans == 1)
            System.out.printf("\n Both Credit Card Numbers are Same ");
        else
            System.out.printf("\n Both Credit Card Numbers are Not Same ");
    }
}
