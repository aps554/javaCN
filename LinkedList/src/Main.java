import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addNewCity("Taj Mahal",placesToVisit);
        addNewCity("Shimla",placesToVisit);
        addNewCity("Goa",placesToVisit);
        addNewCity("Bankok",placesToVisit);
        addNewCity("Sydeny",placesToVisit);
        addNewCity("Melborn",placesToVisit);
        addNewCity("Bankok",placesToVisit);

        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> curr = list.iterator();
        while (curr.hasNext()) {
            System.out.print(curr.next() + " ");
        }
        System.out.println();

    }

    // method too add the any new city coming in the alphabetical order

    private static boolean addNewCity(String newCity, LinkedList<String> list) {
        ListIterator<String> itr = (ListIterator<String>) list.iterator();
        while (itr.hasNext()) {
            String curr = itr.next();
            int comp = curr.compareTo(newCity);
            if (comp == 0) {
                System.out.println("Already Exist");
                return false;
            } else if(comp<0){
                // continue;
            }else{
                itr.previous();
                itr.add(newCity);
                return true;
            }
        }
        itr.add(newCity);
        return true;
    }


}
