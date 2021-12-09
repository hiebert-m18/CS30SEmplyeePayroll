import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Hiebert
 *  Class:          CS30S
 * 
 *  Assignment:     Employee Payroll
 * 
 *  Description:    use Employee class to display employee records
 * 
 *************************************************************/

public class EmployeeDriver {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
        ArrayList<Employee> employees = new ArrayList<>();
        
        ProgramInfo programinfo = new ProgramInfo("Employee Payroll");
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = null;
        
        try {
            fin = new BufferedReader(new FileReader("EmployeeDecemberExamData.txt"));
        } catch (Exception e) {
            System.out.println("No such file");
        }// end try/catch
        
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        System.out.println(programinfo.getBanner());
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
        System.out.println(String.format("|%10s|%10s|%15s|%15s|%15s|%15s|", "ID", "Hours", "Wage", "Regular", "Overtime", "Gross"));
        
        String line;
        while ((line = fin.readLine()) != null) {
            String[] splitStr = line.split(" ");
            
            employees.add(new Employee(Integer.parseInt(splitStr[0]), Double.parseDouble(splitStr[1])));
        }// end eof
        
        for (Employee i : employees) {
            System.out.println(i);
        }// end for
        
        System.out.println();
        System.out.println();
        
        // change hours and wage of employee 3
        employees.get(3).setHours(60);
        employees.get(3).setWage(32.12);
        
        // print out employee 3 again
        System.out.println("Employee 3's hours and wage have been changed.");
        System.out.println("Employee 3's records printed out using getter:");
        
        System.out.println(String.format("|%-10s|%-10s|%-15s|%-15s|%-15s|%-15s|", "ID", "Hours", "Wage", "Regular", "Overtime", "Gross"));
        System.out.print(String.format("|%10d|", employees.get(3).getID()));
        System.out.print(String.format("%10d|", employees.get(3).getHours()));
        System.out.print(String.format("%15s|", currency.format(employees.get(3).getWage())));
        System.out.print(String.format("%15s|", currency.format(employees.get(3).getRegularPay())));
        System.out.print(String.format("%15s|", currency.format(employees.get(3).getOverTimePay())));
        System.out.print(String.format("%15s|\n", currency.format(employees.get(3).getGrossPay())));
        
        System.out.println();
        System.out.println();
        
        // remove employee 5
        employees.remove(5);
        
        System.out.println("Employee 5 has been removed:");
        
        // print out everything again to show that employee 5 is missing
        for (Employee i : employees) {
            System.out.println(i);
        }// end for
        
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println(programinfo.getClosingMsg());
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
