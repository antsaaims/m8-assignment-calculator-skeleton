package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Add{
    // TODO -- start your code here
    public Subtract(){
        super();
        this.codeoperation=2;
    }
    public Subtract(int firstargument, int secondargument)
          {
              super(firstargument, secondargument);
              this.codeoperation=2;//Change the codeoperation to output the correct result
          }



}
