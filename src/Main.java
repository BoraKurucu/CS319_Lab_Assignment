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

            Player Tom = new Player("Tom");
            Player John = new Player("John");
            Player James = new Player("James");
            Player Henry = new Player("Henry");

            Die die = new Die();

            for(int i = 0;i < 5;i++)
            {
                    Tom.addScore(die.rollDie());
                    John.addScore(die.rollDie());
                    James.addScore(die.rollDie());
                    Henry.addScore(die.rollDie());


            }
            System.out.println(Tom.toString());
            System.out.println(John.toString());
            System.out.println(James.toString());
            System.out.println(Henry.toString());




        }
    }
