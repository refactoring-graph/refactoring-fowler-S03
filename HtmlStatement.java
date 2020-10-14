import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
   
/* public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
      }
      //add footer lines
      result += "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
      return result;
   }
*/
}
