package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Add{
    // TODO -- start your code here


    public Multiply(){
        super();
        this.codeoperation=3;//I used the Add as super class so I just need to change the codeoperation for this
    }
    public Multiply(int firstargument, int secondargument)
    {
        super(firstargument, secondargument);
        this.codeoperation=3;
    }

}
