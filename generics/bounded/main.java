package generics.project.boundedgenerics.content;

public class main {
    public static void main(String args[]){
        limit_for_numbers <Double> l=new limit_for_numbers<>();
        l.setDigit(12.00);
        System.out.println(l.getDigit());
    }
}
/* in the limits_for_numbers we extends datatype T to access
  or allow only number datatype
  so that,it allows only
  .integer
  .float
  .double
  .short
  .long  datatypes
  instead of this we give other datatypes it will throws the error
 */
