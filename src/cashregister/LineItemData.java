/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Neal
 */
public class LineItemData {
    private LineItem [] items;
    
    public LineItemData(LineItem [] itemArray){
        items = itemArray;
    }
    
    public void addItem(LineItem [] itemArray, String prodID, double qty){
        LineItem [] copies = new LineItem [itemArray.length+1];
        for (int i = 0;i<itemArray.length;i++){
            copies[i] = itemArray[i];
        }
        copies[(copies.length-1)] = new LineItem(prodID,qty);
        items = copies;
    }
    
    public final LineItem [] getItems(){
        return items;
    }
}


