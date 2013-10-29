/**
 * This is the bean to hold and generate data for both the SelectOneListBox &
 * the SelectManyListBox values.
 * @author: Dawn Bykowski
 */
package controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserDataBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public String pizzaData = "Cheese & Sausage";
    

    public String getPizzaData() {
        return pizzaData;
    }

    public void setPizzaData(String pizzaData) {
        this.pizzaData = pizzaData;
    }
    
   public String[] toppingData = {"Mushrooms"};

   public String[] getToppingData() {
      return toppingData;
   }

   public void setToppingData(String[] toppingData) {
      this.toppingData = toppingData;
   }
     
}