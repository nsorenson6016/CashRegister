/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author nsorenson
 */
public class LineItem {
    private Product product;
    private double qty;
    
    public LineItem(String prodID, double qty){
        product = new Product (prodID);
        product.setQty(qty);
    }

    public final String getProductID(){
        return product.getProductID();
    }
    
    public final String getDesc(){
        return product.getDesc();
    }
    
    public final double getQty(){
        return product.getQty();
    }
    
    public final double getUnitCost(){
        return product.getUnitCost();
    }
    
    public final double getDiscount(){
        return product.getDiscount();
    }
    
    public final double getsubTotal(){
        return ((product.getUnitCost() * product.getQty()) - (product.getDiscount()));
    }
    
    public void setQty(double qty){
        this.qty = qty;
    }
    
    public void setDiscStrategy(DiscStrategy ds){
        product.setDs(ds);
    }
    
    public final DiscStrategy getDs(){
        return product.getDs();
    }
    
    public void setProduct(Product p){
        this.product = p;
    }
    
    public final Product getProduct(){
        return product;
    }
}