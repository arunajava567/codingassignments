package test.set2021;
import java.util.*;
class Currency {
	HashMap<String,String> currencyMap =new HashMap<String,String>();
	public Currency() {
	}
	public String toString() {
		return "";
	}
	public HashMap<String,String> addCountryCurrency(String country,String  currency  ) {
		currencyMap.put(country,currency);
		return  currencyMap;
	}
   public   String  getCurrency(String country ) {
	   String currency=null;
	   Collection c=currencyMap.entrySet();
	   Iterator i=c.iterator();
	   while(i.hasNext()) {
		   Map.Entry entry=(Map.Entry)i.next();
		   if(entry.getKey().equals(country))
			  currency=(String)entry.getValue(); 
	   }
		  return currency;
	}
   
   
   
   
   
   
   
  public    String  getCuntry(String currency ) {
	   String country=null;
	   Collection c=currencyMap.entrySet();
	   Iterator i=c.iterator();
	   while(i.hasNext()) {
		   Map.Entry entry=(Map.Entry)i.next();
		   if(entry.getValue().equals(currency))
			  country=(String)entry.getKey();       	 
		   }
	   return country;
 	}
  public HashMap<String,String> swapKeyValue() {
	  HashMap<String,String> newMap=new HashMap<String,String>();
	  Collection c=currencyMap.entrySet();
	   Iterator i=c.iterator();
	   while(i.hasNext()) {
		   Map.Entry entry=(Map.Entry)i.next();
		   newMap.put((String)entry.getValue(),(String)entry.getKey());  
	   }  return newMap;
  }
    public static void main(String[] args) {
		Currency c=new Currency();
		c.addCountryCurrency("Argentina","Peso");
		c.addCountryCurrency("Brazil","Real");
		c.addCountryCurrency("Cuba","CubaPeso");
		System.out.println(c.getCuntry("Real"));
		System.out.println(c.getCurrency("Cuba"));
		System.out.println(c.swapKeyValue());
    }
}

	
