package com.apnacollege;

public class rightStarPattern {

    public static void main(String args[])
    {
//i for rows and j for columns
//row denotes the number of rows you want to print
        int i, j, row=6;
//outer loop
        for(i=0; i<row; i++)
        {
//inner loop
            for(j=0; j<=i; j++)
            {
//prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
/* Remember - Inner "for" loop will start afresh always (when the control exits out of it).
* Basically "j" har baar initial ("0" in this case) se start hoga aur "i"(regarding this case)
*  ki value jo bhi hai uss tak jayega aur loop utni baar execute hoga , then control will go to outer "for" loop.
* Outer "for" loop ki initial value systematically increment hogi aur incremented value previous initial value ko replace karegi.
* But inner "for" loop ki value loop exit hote hee firse initial se kaam chalu karegi.*/