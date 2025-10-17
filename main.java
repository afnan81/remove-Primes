import.java.util.*;

public class r




import java.util.ArrayList;

public static void main(String[] args){
    scanner scn= new Scanner(System.in);

    System.out.println("Enter the number of integers you want to input:");
    int n=scn.nxtInt();

    ArrayList<Integer> al=new ArrayList<>();
    System.out.println("Enter the" +n+"integers:");
    for(int i = 0; i<n; i++){
        al.add(scn.nextInt());
    }

    solution(al);

System.out.println("Modified list(without primes):" +al)

}


}