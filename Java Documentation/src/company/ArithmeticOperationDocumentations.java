package src.company;

/**
 * This Documentation is all about the Arithmetic Operations.
 * @author Chetan Pawar
 * @version 29.9.04
 * @since 2020
 * @see <a href="https://github.com/chetanpawar2355" target="_blank">GitHub</a>
 */
public class ArithmeticOperationDocumentations {
    /**
     * This is the Addition Operator.
     * @param a This is Integer variable a
     * @param b This is Integer variable b
     * @deprecated No Deprecated keywords
     * @return This return keyword gives the Output a+b.
     */
    public static int addition(int a, int b){
        return a+b;
    }

    /**
     * This is the Division Operator.
     * @param a This is Integer variable a
     * @param b This is Integer variable b
     * @return This return keyword gives the Output a/b.
     * @throws Exception is Divisible by Zero is not possible.
     */
    public static int division(int a, int b) throws Exception{
        if(b==0){
            throw new Exception("Divide by Zero is not possible.");
        }
        else{
            return a/b;
        }
    }

    /**
     * This main method is about Arithmetic Operations.
     * @param args main Method of our Program.
     */
    public static void main(String[] args) throws Exception {
        int sum = addition(10,20);
        int div = division(10,2);
        System.out.println(sum);
        System.out.println(div);

    }
}


