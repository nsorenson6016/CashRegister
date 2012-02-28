/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author nsorenson
 */
public class Product {
    private String productID;
    private String desc;
    private double unitCost;
    private double qty=0.0;
    private DiscStrategy ds;
    
    public Product(String productID){
        ProductData pd = new ProductData();
        Product p = pd.findItem(productID);
        this.productID = p.getProductID();
        this.desc = p.getDesc();
        this.unitCost = p.getUnitCost();
        this.ds = p.getDs();
    }
    
    public Product(String productID, String desc, double unitCost, DiscStrategy ds){
        this.productID = productID;
        this.desc = desc;
        this.unitCost = unitCost;
        this.ds = ds;
    }

    /**
     * @return the productID
     */
    public final String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * @return the desc
     */
    public final String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the unitCost
     */
    public final double getUnitCost() {
        return unitCost;
    }

    /**
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * @return the qty
     */
    public final double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(double qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public final double getDiscount() {
        return getDs().getDiscount(qty, unitCost);
    }

    /**
     * @return the ds
     */
    public final DiscStrategy getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(DiscStrategy ds) {
        this.ds = ds;
    }
}