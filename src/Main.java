import java.util.ArrayList;
import java.util.Collections;

public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            list1.add(100);
            list1.add(500);
            list1.add(900);
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            list2.add(800);
            list2.add(600);
            list2.add(300);
            ArrayList<Integer> list3 = new ArrayList<Integer>();
            list2.add(400);
            list2.add(700);
            list2.add(200);
            ArrayOrganizer organizer = new ArrayOrganizer();
            ArrayList<Integer> result = organizer.concatAndSort(list1,list2,list3);
            System.out.println(result);
            System.out.println("Successfully reverted in Git");



        }
    }
