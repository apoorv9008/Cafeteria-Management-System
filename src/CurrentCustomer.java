/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author tebgda he
 */
public class CurrentCustomer {
  public static String UserName;
  public static String Password;
  public static String Address;
  public static String City;
  public static String Zipcode;
  public static String Telephone;
  public static ArrayList<String[]> orderList = new ArrayList<>();
  public static ArrayList<String> favoritesList= new ArrayList<>();
   public static ArrayList<String> lastOrder= new ArrayList<>();
   
    public static void creatOrder(String course, String num, String price){
        for(int i=0;i<orderList.size();i++){
          if(course.equals(orderList.get(i)[0])){
           orderList.get(i)[1]=String.valueOf(Float.parseFloat(orderList.get(i)[1])+
                               Float.parseFloat(num));
           orderList.get(i)[3]=String.valueOf(Float.parseFloat(orderList.get(i)[1])*Float.parseFloat(orderList.get(i)[2]));
                return;
                  }
             }
        String[] temp = new String[4];
        temp[0]=course;
        temp[1]=num;
        temp[2]=price.substring(2);
        float n = Float.parseFloat(num);
        float p = Float.parseFloat(price.substring(2));
        //total price per food
        temp[3]=String.valueOf(n*p);
              orderList.add(temp);
    }
   
     public static Object[][] readOrder( ArrayList<String[]> a){
        Object[][]  b=new Object[a.size()][4] ;
         for(int i=0;i<a.size();i++){
          b[i][0] =a.get(i)[0];
          b[i][1] =" $"+a.get(i)[2];
          b[i][2] =a.get(i)[1];
          b[i][3] =" $"+a.get(i)[3];
              }
         return b;
    } 
     
    public static String calculateTotal( ArrayList<String[]> a){
        float total=0;
        for(int i=0; i<a.size();i++){
         String[] temp=  a.get(i);
         total= total+Float.parseFloat(temp[3]);
        }
        return String.valueOf(total);
    }
public static void creatFavorites(String course){
    if(!favoritesList.contains(course)){
        String temp = course;
        favoritesList.add(temp);
    }
}
public static Object[][] readList( ArrayList<String> a){
        Object[][]  b=new Object[a.size()][1] ;
         for(int i=0;i<a.size();i++){
          b[i][0] =a.get(i);
              }
         return b;
    } 

public static void changeToLastOrder(ArrayList<String[]> a){
     lastOrder.clear();
    for(int i=0; i<a.size();i++){    
       lastOrder.add(a.get(i)[0]);
    }
}

}


  
