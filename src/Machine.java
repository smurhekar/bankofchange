import java.util.*;

/**
 * Created by idnsmu on 7/24/2014.
 */
public class Machine {
    private static HashMap<Integer, Integer> cashInMachine;

    public static void refill(HashMap<Integer, Integer> cashInHand) {
        cashInMachine = cashInHand;
    }

    public static HashMap<Integer, Integer> getAvailableCashInMachine() {
        return cashInMachine;
    }

    public static HashMap<Integer, Integer> returnChangeFor(int cashForChange) {
        HashMap<Integer, Integer> change = new HashMap<Integer, Integer>();
        TreeSet<Integer> notesInMachine = new TreeSet<Integer>(cashInMachine.keySet());
        Iterator<Integer> descendingIterator = notesInMachine.descendingIterator();

        while(descendingIterator.hasNext()){
            Integer note = descendingIterator.next();
            if(note >= cashForChange){continue;}

            if(cashForChange % note == 0){
                int numberOfNotes = cashForChange / note;
                int countInMachine = cashInMachine.get(note);
                if(countInMachine >= numberOfNotes){
                    change.put(note, numberOfNotes);
                    cashInMachine.put(note, countInMachine - numberOfNotes);
                    return change;
                }
            }
        }
        return change;
    }
}
