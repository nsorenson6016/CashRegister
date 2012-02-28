/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author nsorenson
 */
public class CustomerData {
    static Customer [] cust = {
        new Customer ("A000", "Andrew Andrews"),
        new Customer ("B111", "Brad Bradley"),
        new Customer ("C222", "Charlie Brown"),
        new Customer ("D333", "Danny Daniels")
};

    
    public Customer findCustomer(String custID){
        Customer c = new Customer("ZZZZ","ID Not Found");
        for (int i=0;i<cust.length;i++){
            if (cust[i].getCustID().equals(custID)){
                  c = cust[i];
            }
        }
        return c;
    }
}
