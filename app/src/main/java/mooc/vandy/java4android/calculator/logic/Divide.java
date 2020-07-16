package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Add{
    // TODO -- start your code here
    public Divide(){
        super();
        this.codeoperation=4;//I use Add as the basic class so I just need to change my codeoperation for each subclasses
    }
    public Divide(int firstargument, int secondargument)
    {
        super(firstargument, secondargument);
        this.codeoperation=4;
    }

}
