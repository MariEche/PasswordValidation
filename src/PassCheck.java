/*
 Write a Java program to validate if a password satisfies the following requirements:

1. The password's length is between 8 and 16 (inclusive)

2. The password must be a combination of at least three out of the following four categories:

(1) lower case letters, i.e., a-z **

(3) numbers, i.e., 0-9

(4) the following special symbols: ~!@#$%^&*()-=+_
 */
import java.util.Scanner;


public class PassCheck {

    static int lengthCheck(String password){
        int passVal = 0;
        if(password.length() < 8 ){
            passVal = -1;

        }
        if(password.length() > 16){
            passVal = 1;

        }
        return passVal;
    }

    static int SymbolCheck(String password){

        String[] Symbols = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "=", "+", "_"};

       int SymbolVal = 0;

       for (int i = 0; i < Symbols.length; i++){
        
        if (password.contains(Symbols[i])){
            SymbolVal++;
        }

        }
    return SymbolVal;
}
    static int lowcaseCheck(String password){
        int LowcaseVal =  0;

        //ASCII for lowercase letters 97-122

        for (int i=0; i< password.length(); i++){
            char letter = password.charAt(i);
            int num = (int) letter;

            if (num >= 97 && num <= 122){
                LowcaseVal++;
            }
        }

    return LowcaseVal;
}
static int numCheck(String password){

    String[] Nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

   int numVal = 0;

   for (int i = 0; i < Nums.length; i++){
    
    if (password.contains(Nums[i])){
        numVal++;
    }

    }
return numVal;
}


    public static void main(String[] args){
        String userpassword;

        java.util.Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your password to be checked:");
        userpassword = Scanner.nextLine();

        Scanner.close();
        
        int lenReq = lengthCheck(userpassword);
        int symReq = SymbolCheck(userpassword);
        int lowcaseReq = lowcaseCheck(userpassword);
        int numReq = numCheck(userpassword);

        if (lenReq == 0){
            System.out.println("Your password met the length requirement! \n");
        }
        if (lenReq > 0){
            System.out.println("Password too long \n");
        }
        
        if (lenReq < 0){
            System.out.println("Password too short \n");
        }
        
        if (symReq > 0){
            System.out.println("Your password met the requirement of containing a special symbol! \n");
        }
        else{
            System.out.println("Password must contain a symbol \n");
        }

        if (lowcaseReq > 0){
            System.out.println("Your password met the requirement of containing lower case letters! \n");
        }
        else{
            System.out.println("Password must contain a lowercase letter \n");
        }
        if (numReq > 0){
            System.out.println("Your password met the requirement of containing a number! \n");
        }
        else{
            System.out.println("Password must contain a number \n");
        }


       

    }

        

        
    
}
