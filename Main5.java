public class Main5 {
    public static void main (String[] args){

        // printf() = a method used to format output

        // %[flags] width [.precision] [specifier-character]

        //specifier-characters

        String name  = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        // "s" is a specifier-character that specifies the data type being used.
        // in this case the data type is a string, so the we write "s".

        //Instead of using string concatenation, we will use separate arguments.

        System.out.printf("You name starts with a %c\n", firstLetter);

        //You need to insert the escape sequence "\n" (new line character)

        System.out.printf("You are %d years old\n", age);

        System.out.printf("You are %f inches tall\n", height);

        System.out.printf("Employed: %b\n", isEmployed);

        //Inserting Multiple variables in One Line

        System.out.printf("%s is %d years old", name, age);


        //Precision = Limit the amount of digits after a decimal.

        double price1 = 9.99;
        double price2 = 1.15;
        double price3 = -54.01;

        System.out.printf("\n\n% .1f\n", price1);
        System.out.printf("% .1f\n", price2);
        System.out.printf("% .1f\n", price3);

        //Normally without precision it will output 6 digits after the decimal point.
        //If you want a certain amount of decimal points, write point and then the
        //number of digits you want to the right.

        //[Flags]

        // + = output a plus
        // - = output a minus
        // , = comma grouping separator(Puts a comma for any number in the thousands.)
        // ( (Single left parenthesis)= negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive


        //If you want to put a positive and negative at the beginning of the number type
        //a plus sign (+) or minis (-) inbetween % and point(.).

        // Ex:
        //    System.out.printf("\n\n %+.1f\n", price1);
        //        System.out.printf("%+.1f\n", price2);
        //        System.out.printf("%+.1f\n", price3);


        // , = comma grouping separator

        //Ex:
        //   System.out.printf("\n\n %,.1f\n", price1);
        //        System.out.printf("%,.1f\n", price2);
        //        System.out.printf("%,.1f\n", price3);

        // ( = negative numbers are enclosed in () NEGATIVE ONLY

        //EX:
        // System.out.printf("\n\n%(.1f\n", price1);
        //        System.out.printf("%(.1f\n", price2);
        //        System.out.printf("%(.1f\n", price3);

        // space = display a minus if negative, space if positive POSITIVE ONLY

        //EX:
        // System.out.printf("\n\n% .1f\n", price1);
        //        System.out.printf("% .1f\n", price2);
        //        System.out.printf("% .1f\n", price3);

        //[Width]

        //0 = zero padding + the amount of zeros you want to pad.
        //System.out.printf("%04d\n", id1);
        //number(of amount of padding) = right justified padding(padding without the zero)
        //System.out.printf("%4d\n", id1);
        //negative number = left justified padding
        //System.out.printf("%-4d\n", id1);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        //If you want padding without the zero's, replace the zero with nothing.
        //No space, NOTHING.

        //Go to Project 1









    }
}
