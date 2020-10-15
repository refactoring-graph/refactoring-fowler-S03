import java.util.Enumeration;

public class Statement {
   private String[] msgs;
   
   public void setMsgs(String[] _msgs) {
      msgs = _msgs;
   }
   
   final public String value(Customer aCustomer, String[] msgs) { //final, não pode ser alterado (template)
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
}
