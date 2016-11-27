

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class ReadXMLDataBase {
      String FoodName;
      String FoodPrice;
      String Iamge2Url;
      String Iamge1Url;
      String FoodDescrip;
         
 public void settingButton(NodeList nlist){
      Element[] eElement = new Element[6];
       for (int temp = 0; temp < nlist.getLength(); temp++) {
         Node nNode = nlist.item(temp);
         eElement[temp] = (Element) nNode;
       }
                    
MainWindow.food1_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(eElement[0].getElementsByTagName("food1Image").item(0).getTextContent())));
MainWindow.food1_jButton.setText(eElement[0].getElementsByTagName("foodName").item(0).getTextContent());
MainWindow.foodPrice1_jTextField.setText(" $"+eElement[0].getElementsByTagName("foodPrice").item(0).getTextContent());

MainWindow.food2_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(eElement[1].getElementsByTagName("food1Image").item(0).getTextContent())));
MainWindow.food2_jButton.setText(eElement[1].getElementsByTagName("foodName").item(0).getTextContent());
MainWindow.foodPrice2_jTextField.setText(" $"+eElement[1].getElementsByTagName("foodPrice").item(0).getTextContent());
                   
MainWindow.food3_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(eElement[2].getElementsByTagName("food1Image").item(0).getTextContent())));
MainWindow.food3_jButton.setText(eElement[2].getElementsByTagName("foodName").item(0).getTextContent());
MainWindow.foodPrice3_jTextField.setText(" $"+eElement[2].getElementsByTagName("foodPrice").item(0).getTextContent());
                   
MainWindow.food4_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(eElement[3].getElementsByTagName("food1Image").item(0).getTextContent())));
MainWindow.food4_jButton.setText(eElement[3].getElementsByTagName("foodName").item(0).getTextContent());
MainWindow.foodPrice4_jTextField.setText(" $"+eElement[3].getElementsByTagName("foodPrice").item(0).getTextContent());
                   
MainWindow.food5_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(eElement[4].getElementsByTagName("food1Image").item(0).getTextContent())));
MainWindow.food5_jButton.setText(eElement[4].getElementsByTagName("foodName").item(0).getTextContent());
MainWindow.foodPrice5_jTextField.setText(" $"+eElement[4].getElementsByTagName("foodPrice").item(0).getTextContent());
                   
MainWindow.food6_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(eElement[5].getElementsByTagName("food1Image").item(0).getTextContent())));
MainWindow.food6_jButton.setText(eElement[5].getElementsByTagName("foodName").item(0).getTextContent());
MainWindow.foodPrice6_jTextField.setText(" $"+eElement[5].getElementsByTagName("foodPrice").item(0).getTextContent());
 }


 public void readData(String cata) {
  try {
	File fXmlFile = new File("src/XMLfiles/foodCategory.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setValidating(true);
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
      
	doc.getDocumentElement().normalize();
      if(cata.equals("Specials") ){
        Node node =  doc.getElementsByTagName("Specials").item(0);
        Element aElement = (Element) node;
        NodeList list= aElement.getElementsByTagName("food"); 
        settingButton(list);
        MainWindow.Category_jLabel.setText("Today's Special:");
        
     String[] test={"a1", "a2", "a3", "a4", "a5", "a6"};
      MainWindow.buttonID=test;
      }
      else if(cata.equals("Appetizers") ){
        Node node =  doc.getElementsByTagName("Appetizers").item(0);
        Element aElement = (Element) node;
        NodeList list= aElement.getElementsByTagName("food"); 
        settingButton(list);
        MainWindow.Category_jLabel.setText("Today's Appetizer :");
       
       String[] test={"b1", "b2", "b3", "b4", "b5", "b6"};
      MainWindow.buttonID=test;
      }
      else if(cata.equals("Soup") ){
        Node node =  doc.getElementsByTagName("Soup").item(0);
        Element aElement = (Element) node;
        NodeList list= aElement.getElementsByTagName("food"); 
        settingButton(list);
        MainWindow.Category_jLabel.setText("Today's Soup :");
        
      String[] test={"c1", "c2", "c3", "c4", "c5", "c6"};
      MainWindow.buttonID=test;
      }
      else if(cata.equals("Salad")){
        Node node =  doc.getElementsByTagName("Salad").item(0);
        Element aElement = (Element) node;
        NodeList list= aElement.getElementsByTagName("food"); 
        settingButton(list);
        MainWindow.Category_jLabel.setText("Today's Salads :");
        
        String[] test={"d1", "d2", "d3", "d4", "d5", "d6"};
      MainWindow.buttonID=test;
      }
      else if(cata.equals("Entrees") ){
        Node node =  doc.getElementsByTagName("Entrees").item(0);
        Element aElement = (Element) node;
        NodeList list= aElement.getElementsByTagName("food"); 
        settingButton(list);
        MainWindow.Category_jLabel.setText("Today's Entrees :");
        
         String[] test={"e1", "e2", "e3", "e4", "e5", "e6"};
      MainWindow.buttonID=test;
      }
      else if(cata.equals("Desserts") ){
        Node node =  doc.getElementsByTagName("Desserts").item(0);
        Element aElement = (Element) node;
        NodeList list= aElement.getElementsByTagName("food"); 
        settingButton(list);
        MainWindow.Category_jLabel.setText("Today's Desserts :");
        
         String[] test={"f1", "f2", "f3", "f4", "f5", "f6"};
        MainWindow.buttonID=test;
      }
      else if(cata.equals("Beverage") ){
        Node node =  doc.getElementsByTagName("Beverage").item(0);
        Element aElement = (Element) node;
        NodeList list= aElement.getElementsByTagName("food"); 
        settingButton(list);
        MainWindow.Category_jLabel.setText("Today's Beverage :");
        
        String[] test={"g1", "g2", "g3", "g4", "g5", "g6"};
        MainWindow.buttonID=test;
      }  
     else{
    FoodName = doc.getElementById(cata).getElementsByTagName("foodName").item(0).getTextContent();
    FoodPrice= doc.getElementById(cata).getElementsByTagName("foodPrice").item(0).getTextContent();
    Iamge2Url =doc.getElementById(cata).getElementsByTagName("food2Image").item(0).getTextContent();  
    FoodDescrip = doc.getElementById(cata).getElementsByTagName("foodDescription").item(0).getTextContent(); 
     }
		}
  
     catch (Exception e) {
	e.printStackTrace();
    }
  }
public boolean checkCustomerData(String target, String targetword){
    boolean t=false;
    try { 
	File fXmlFile = new File("src/XMLfiles/customersRoll.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setValidating(true);
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
     NodeList nlist = doc.getElementsByTagName("customer");  
     for(int i=0;i<nlist.getLength();i++){
         Node nNode = nlist.item(i);
        Element element = (Element) nNode;
        String name1=element.getElementsByTagName("name").item(0).getTextContent();
        if (name1.equals(target)){
            if( MainWindow.signInState.equals("register")){
                t= true;
                 break;
            }
            
            else{
            String password1=element.getElementsByTagName("password").item(0).getTextContent();
            if(password1.equals(targetword)){
               CurrentCustomer.UserName=element.getElementsByTagName("name").item(0).getTextContent();
               CurrentCustomer.Password=element.getElementsByTagName("password").item(0).getTextContent();
               CurrentCustomer.Address=element.getElementsByTagName("address").item(0).getTextContent();
               CurrentCustomer.City=element.getElementsByTagName("city").item(0).getTextContent();
               CurrentCustomer.Zipcode=element.getElementsByTagName("zipcode").item(0).getTextContent();
               CurrentCustomer.Telephone=element.getElementsByTagName("telephone").item(0).getTextContent();
                    String[] temp=element.getElementsByTagName("lastorder").item(0).getTextContent().split(", ");
                   CurrentCustomer.lastOrder=new ArrayList(Arrays.asList(temp));
     
               temp=element.getElementsByTagName("favorites").item(0).getTextContent().split(", ");
           CurrentCustomer.favoritesList=new ArrayList(Arrays.asList(temp));
                t= true;
                break;
               }
            }
        }
     }
    
   }
      catch (Exception e) {
	e.printStackTrace();
    } return t;
}

public void writeCustomerData(String mode ){
        try { 
	File fXmlFile = new File("src/XMLfiles/customersRoll.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        dbFactory.setValidating(true);
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
        
        if(mode.equals("write")){   
         Element rootElement = doc.getDocumentElement();
        
        Element newCustomer = doc.createElement("customer");
        rootElement.appendChild(newCustomer);
        
          Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(CurrentCustomer.UserName));
            newCustomer.appendChild(name);
            
          Element password = doc.createElement("password");
          password.appendChild(doc.createTextNode(CurrentCustomer.Password));
            newCustomer.appendChild(password);
            
          Element address = doc.createElement("address");
          address.appendChild(doc.createTextNode(CurrentCustomer.Address));
            newCustomer.appendChild(address);
            
          Element city = doc.createElement("city");
          city.appendChild(doc.createTextNode(CurrentCustomer.City));
            newCustomer.appendChild(city);
            
          Element zipcode = doc.createElement("zipcode");
          zipcode.appendChild(doc.createTextNode(CurrentCustomer.Zipcode));
            newCustomer.appendChild(zipcode);
          
          Element telephone = doc.createElement("telephone");
          telephone.appendChild(doc.createTextNode(CurrentCustomer.Telephone));
            newCustomer.appendChild(telephone);
        
            Element lastorder = doc.createElement("lastorder");
             newCustomer.appendChild(lastorder); 
            
           Element favorites = doc.createElement("favorites");
           newCustomer.appendChild(favorites);
      //    newCustomer.appendChild(favorites);
          
            }
        else if(mode.equals("change")){
               NodeList nlist = doc.getElementsByTagName("customer");  
     for(int i=0;i<nlist.getLength();i++){
         Node nNode = nlist.item(i);
        Element element = (Element) nNode;
        String name1=element.getElementsByTagName("name").item(0).getTextContent();
        if (name1.equals(UserAccount.tempName)){
            element.getElementsByTagName("name").item(0).setTextContent(CurrentCustomer.UserName);
            element.getElementsByTagName("password").item(0).setTextContent(CurrentCustomer.Password);
            element.getElementsByTagName("address").item(0).setTextContent(CurrentCustomer.Address);
            element.getElementsByTagName("city").item(0).setTextContent(CurrentCustomer.City);
            element.getElementsByTagName("zipcode").item(0).setTextContent(CurrentCustomer.Zipcode);
            element.getElementsByTagName("telephone").item(0).setTextContent(CurrentCustomer.Telephone);
          
         String  temp= CurrentCustomer.favoritesList.toString();
            element.getElementsByTagName("favorites").item(0).setTextContent(temp.substring(1,temp.length()-1 ));
        }
        }
        }
              DOMSource source = new DOMSource(doc);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult result = new StreamResult("src/XMLfiles/customersRoll.xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "customerslist.dtd");
        transformer.transform(source, result);  
        
              }
      catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	   } catch (TransformerException tfe) {
		tfe.printStackTrace();
	   }
        catch (Exception e) {
	e.printStackTrace();
    }
     
}

public void changeLastOrder( ){
        try { 
	File fXmlFile = new File("src/XMLfiles/customersRoll.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        dbFactory.setValidating(true);
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
        NodeList nlist = doc.getElementsByTagName("customer");  
     for(int i=0;i<nlist.getLength();i++){
         Node nNode = nlist.item(i);
        Element element = (Element) nNode;
        String name1=element.getElementsByTagName("name").item(0).getTextContent();
        if (name1.equals(CurrentCustomer.UserName)){
                      String temp= CurrentCustomer.lastOrder.toString();
           element.getElementsByTagName("lastorder").item(0).setTextContent(temp.substring(1,temp.length()-1 ));
	}
     }
        DOMSource source = new DOMSource(doc);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult result = new StreamResult("src/XMLfiles/customersRoll.xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "customerslist.dtd");
        transformer.transform(source, result);  
        
              }
 catch (Exception e) {
	e.printStackTrace();
    }
}

public void readDataByID(String id){
    try {
	File fXmlFile = new File("src/XMLfiles/foodCategory.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setValidating(true);
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
      
	doc.getDocumentElement().normalize();
        FoodName = doc.getElementById(id).getElementsByTagName("foodName").item(0).getTextContent();
        Iamge1Url = doc.getElementById(id).getElementsByTagName("food1Image").item(0).getTextContent();
        FoodPrice = doc.getElementById(id).getElementsByTagName("foodPrice").item(0).getTextContent();
        }
         catch (Exception e) {
	e.printStackTrace();
    }
}

}


  
