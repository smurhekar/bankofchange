import java.util.HashMap;

/**
 * Created by idnsmu on 7/24/2014.
 */
public class Customer {
    public HashMap<Integer, Integer> askForChangeOf(int cashForChange) {
        return Machine.returnChangeFor(cashForChange);
    }
}
