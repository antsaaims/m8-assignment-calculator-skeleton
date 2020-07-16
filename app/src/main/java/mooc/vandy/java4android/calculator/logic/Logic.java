package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        //1=addition, 2=subtraction,
           //     3=multiplication, and 4=division



        Add myoperation;

        switch(operation) {


            case 2 :
                  myoperation= (Subtract) new Subtract(argumentOne,argumentTwo);

                break;
            case 3 :
                  myoperation= (Multiply) new Multiply(argumentOne,argumentTwo);
                break;
            case 4 :
                  myoperation=(Divide) new Divide(argumentOne,argumentTwo);
                break;
            default :
                  myoperation=(Add) new Add(argumentOne,argumentTwo);
                break;
        }



      mOut.print(myoperation.Result());



    }
}
