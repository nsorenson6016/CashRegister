/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Neal_2
 */
public class Customer {
    private String custID="";
    private String custName="";
    
    public Customer (String custID){
        CustomerData cd = new CustomerData();
        Customer c = cd.findCustomer(custID);
        this.custID = c.getCustID();
        this.custName = c.getCustName();
    }     
    
    public Customer (String custID, String custName){
        this.custID = custID;
        this.custName = custName;
    }
    
    /**
     * @return the custID
     */
    public final String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public final void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the custName
     */
    public final String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public final void setCustName(String custName) {
        this.custName = custName;
    }

}
