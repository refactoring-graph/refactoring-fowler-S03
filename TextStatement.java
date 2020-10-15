import java.util.Enumeration;

public class TextStatement extends Statement {
   public TextStatement(){
      String[] msgsTxt = {"Rental Record for ", "\n", "\t", "\t", "\n", "Amount owed is ", "\n", "You earned ", " frequent renter points"};
      setMsgs(msgsTxt);
   }
}
