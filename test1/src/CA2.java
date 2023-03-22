import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CA2 {
    //empty set declaration,add four names remove two, display the contents from before and after removal of names ,size of set
    public static void main(String[] args) {
        Set<String> names= new HashSet<String>();
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print((i+1)+". ");
            names.add(sc.nextLine());
        }
        System.out.println(names);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name to remove");
            String re=sc.nextLine();
            if (names.contains(re)) {
                names.remove(re);
            } else {
                System.out.println("Enter correct name!!!!!!!!!!!!");
            }
        }
        System.out.println(names);
        System.out.println("Set size is "+names.size());
    }
}
