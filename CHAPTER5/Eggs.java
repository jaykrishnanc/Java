class Dozens {
    int[] dz = {1,2,3,4,5,6,7,8,9,10,11,12};
  }
  public class Eggs {
    public static void main(String[] args) {
      Dozens [] da = new Dozens[3];
      da[0] = new Dozens();
     Dozens d = new Dozens();
     da[1] = d;
     d = null;
     da[1] = null;
     // do stuff
   }
 }


/*


da refers to an object of type "Dozens array" and each Dozens object that is created comes with its own "int array" object. When line 14 is reached, only the second Dozens object (and its " int array" object) are not reachable
*/
