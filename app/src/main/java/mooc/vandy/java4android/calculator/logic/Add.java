package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add { //I use Add as a base class as it will be the default choice
    // TODO -- start your code here
    protected int codeoperation=1;//It is the default value
    public int firstargument;//the first number
    public int secondargument;//the second number
    public Add()//Default constructor
       {
           this.firstargument=0;//The default will be setup to be 0
           this.secondargument=0;
       }
    public Add(int firstargument, int secondargument)//Another Constructor
        {
            this();
            this.firstargument=firstargument;
            this.secondargument=secondargument;//Change the arguments


        }




    public String Result(){//The result that will be outputed

           String l;


           switch (codeoperation) {


               case 2:
                   l = Integer.toString(this.firstargument - this.secondargument);//The case for subtraction

                   break;
               case 3:
                   l = Integer.toString(this.firstargument * this.secondargument);//The case for multiplication
                   break;
               case 4:
                   if (secondargument==0)
                      {
                       return "Error zero division"
                       }
                   l = Integer.toString(this.firstargument / this.secondargument);//The case for division
                   l += " R: " + Integer.toString(this.firstargument % this.secondargument);
                   break;
               default:
                   l = Integer.toString(this.firstargument + this.secondargument);//The default case
                   break;
           }
           return l;




    }

}
