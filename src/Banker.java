import java.util.HashMap;

/**
 * Created by idnsmu on 7/24/2014.
 */
public class Banker {

    public void setupMachineWith(HashMap<Integer, Integer> cashInHand) {
        Machine.refill(cashInHand);
    }

    public HashMap<Integer, Integer> getMachineInfo() {
        return Machine.getAvailableCashInMachine();
    }
}
