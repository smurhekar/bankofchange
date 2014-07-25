import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by idnsmu on 7/24/2014.
 */
public class BankOfChangeTest {

    @Test
    public void bankerShouldBeAbleToSetupMachine(){
        Banker banker = new Banker();
        HashMap<Integer, Integer> cashInHand = new HashMap<Integer, Integer>();
        cashInHand.put(100, 10);
        cashInHand.put(50, 20);
        cashInHand.put(10, 30);
        cashInHand.put(5, 50);
        cashInHand.put(1, 100);
        banker.setupMachineWith(cashInHand);
        HashMap<Integer, Integer> cashInHandActual = banker.getMachineInfo();
        assertEquals(cashInHandActual.get(100), new Integer(10));
        assertEquals(cashInHandActual.get(50), new Integer(20));
        assertEquals(cashInHandActual.get(10), new Integer(30));
        assertEquals(cashInHandActual.get(5), new Integer(50));
        assertEquals(cashInHandActual.get(1), new Integer(100));
    }

    @Test
    public void canCustomerBeAbleToGetChangeOf100Rs(){
        Banker banker = new Banker();
        HashMap<Integer, Integer> cashInHand = new HashMap<Integer, Integer>();
        cashInHand.put(100, 10);
        cashInHand.put(50, 20);
        cashInHand.put(10, 30);
        cashInHand.put(5, 50);
        cashInHand.put(1, 100);
        banker.setupMachineWith(cashInHand);
        Customer customer = new Customer();
        HashMap<Integer, Integer> changeReturn = customer.askForChangeOf(100);
        assertTrue(changeReturn.size() > 0);
        assertEquals(changeReturn.get(50), new Integer(2));
    }


}
