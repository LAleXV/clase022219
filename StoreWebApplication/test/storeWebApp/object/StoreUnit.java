/*
Clase que me de el costo
 */
package storeWebApp.object;


public class StoreUnit {
    
    private String m_strName;
    private int m_iPrice;
    private int m_iQuantity;

    public StoreUnit(String p_strName, int p_iPrice, int p_iQuantity) {
        
    }
    
    

    public String getName() {
        return m_strName;
    }

    public void setName(String p_strName) {
        m_strName = p_strName;
    }

    public int getPrice() {
        return m_iPrice;
    }

    public void setPrice(int p_iprice) {
        m_iPrice = p_iprice;
    }

    public int getQuantity() {
        return m_iQuantity;
    }

    public void setQuantity(int p_iquantity) {
        m_iQuantity = p_iquantity;
    }
    
    public void getCost(){
        int iPrice = getPrice();
        int iQuantity = getQuantity();
        int iresult = iPrice * iQuantity;
        return iresult;
    }
    
}


