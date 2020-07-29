import java.util.*;
import java.io.*;
public class testAccFiles 
{
    
    
    public static final int MAX_ACC_NUMBER = 5;
    

    public static void main(String[] args) 
    {
        String idNumber, nameAccountMember, testDataLine, code;
        String[]testDataAnswers;
        double overDraftLimit, minBalance1, interestRate, accountBalance;
        int count = 0;
        //DECLARE ARRAY
        Account [] testArray = new Account[MAX_ACC_NUMBER];

        try 
        {
            Scanner reader =  new Scanner(new File("testData.txt"));
            while(reader.hasNext())
            {
                testDataLine = reader.nextLine();
                testDataAnswers = testDataLine.split("#");
                
                code = testDataAnswers[0];
                if(code.equals("1"))
                {
                    System.out.println("###This is a cheque account###"); 
                    
                    idNumber = testDataAnswers[1];
                    
                    accountBalance = Double.parseDouble(testDataAnswers[2]);
                    
                    interestRate = Double.parseDouble(testDataAnswers[3]);
                    
                    nameAccountMember = testDataAnswers[4];

                    overDraftLimit = Double.parseDouble(testDataAnswers[5]);

                    //fill the Checking account data
                    testArray[count] = new Checkings(idNumber, accountBalance, interestRate, nameAccountMember, overDraftLimit);

                    System.out.println(testArray[count].toString());
                }

                if(code.equals("2"))
                {
                    
                    System.out.println("###This is a savings account###"); 
                    idNumber = testDataAnswers[1];
                    accountBalance = Double.parseDouble(testDataAnswers[2]);
                    interestRate = Double.parseDouble(testDataAnswers[3]);
                    nameAccountMember = testDataAnswers[4];
                    minBalance1 = Double.parseDouble(testDataAnswers[5]);

                    testArray[count] = new Savings(idNumber, accountBalance, interestRate, nameAccountMember, minBalance1);

                    //((Checkings)testArray[count]).setName("Johannes");
                    System.out.print("\n\n####THIS IS THE MINIMUM BALANCE####\n\n");
                    System.out.println(minBalance1 + "\n\n###\n");
                    System.out.println(testArray[count].toString());

                }
            }
        }
        
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found " + e);
        }
        //1 is a cheque account
        /*
        1st: String account ID

        2nd: Double account balance
            
        3rd: Double Interest rate
            
        4th: String account holder name

        5th: Double Overdraft limit

        */




        //2 is a savings account
        /*
        1st: String account ID

        2nd: Double account balance
        
        3rd: Double Interest rate
        
        4th: String account holder name
        
        5th: Double Overdraft limit

        */

    }


}