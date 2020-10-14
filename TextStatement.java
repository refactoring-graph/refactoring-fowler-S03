import java.util.Enumeration;

public class TextStatement extends Statement {
   public String value(Customer aCustomer, String[] msgs) {
      Enumeration rentals = aCustomer.getRentals();
      String result = msgs[0] + aCustomer.getName() + msgs[1];
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += msgs[2] + each.getMovie().getTitle() + msgs[3] + 
         String.valueOf(each.getCharge()) + msgs[4];
      }
      //add footer lines
      result += msgs[5] +
      String.valueOf(aCustomer.getTotalCharge()) + msgs[6];
      result += msgs[7] +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + msgs[8];
      return result;
   }
   
/*   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = "Rental Record for " + aCustomer.getName() +
      "\n";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
      }
      //add footer lines
      result += "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
      return result;
   }
*/
}
