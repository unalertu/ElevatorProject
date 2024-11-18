import java.util.*;
public class Project {
    public static void main(String[] args) {
        System.out.println("This is two person based elevator system.\nThere is 41 floor.\nJust 1 elevator exist.");
        Random random= new Random();
        Scanner scanner = new Scanner(System.in);
        boolean callTimeA= false;
                                                                        /*int call1 = random.nextInt(30)+1; int call2 = random.nextInt(30)+1;*/
        int elevator= random.nextInt(30)+1;
        System.out.println("Elevator's floor: "+ elevator);
        System.out.println("Enter first/second call floor(between -10 and 30):");
        int call1 = scanner.nextInt(); int call2 = scanner.nextInt();

        if (call1<-10||call1>30 || call2<-10||call2>30) {
            System.out.println("Invalid call number");
            System.exit(0); }
        scanner.nextLine();

        System.out.println("If the elevators are being called at the same time enter yes/no:");
        String callTime = scanner.nextLine().toUpperCase();
        if (callTime.equals("YES")) callTimeA = true;
        else if (callTime.equals("NO")) callTimeA = false;
        else {System.out.println("Invalid!"); System.exit(0);}

        if (callTimeA== true){
            if (Math.abs(call1-elevator)>Math.abs(call2-elevator))     System.out.println("Elevator went person2.");
            else if(Math.abs(call1-elevator)<Math.abs(call2-elevator)) System.out.println("Elevator went person1.");
            else System.out.println("Elevator went same floors."); }

        else {System.out.println("Which person called first 1/2:");
            int first= scanner.nextInt();
            while (first !=1 && first !=2){
                System.out.println("Invalid call number, enter again");
                first= scanner.nextInt(); }

            if (first==1)  System.out.println("Elevator went person1 then person2.");
            else           System.out.println("Elevator went person2 then person1.");
        }
    }
}
