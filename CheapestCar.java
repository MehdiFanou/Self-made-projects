/**
 * @author: Mehdi Fanou
 * Module 11 part 2
 * Finding the cheapest car
 **/
public class CheapestCar{
   
   public static String findCheapestCar(String[] cars, Integer[] prices){
      
      int cheapestCarIndex = 0;
      
      
      for(int i=1; i<cars.length; i++){
         
         if(prices[i] < prices[cheapestCarIndex]){
            
            cheapestCarIndex = i;
         }
      }
      
      
      return cars[cheapestCarIndex] + "," + prices[cheapestCarIndex];     
   }
   
   
   public static void main(String[] args){
      String cars[]={"Honda Accord", "Chevrolet Suburban", "Dodge Charger", "Kia Optima", "Acura TLX"};
      Integer prices[]={17000, 48000, 24000, 22500, 17999};
      
      
      System.out.println(findCheapestCar(cars, prices));
   }
}