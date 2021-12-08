import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class DriverCode {

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
        
        String line;
        while ((line = fin.readLine()) != null) {
            String[] splitStr = line.split(" ");
            
            employees.add(new Employee(Integer.parseInt(splitStr[0]), Double.parseDouble(splitStr[1])));
        }// end eof
        
        for (Employee i : employees) {
            System.out.println(i);
        }// end for
        
        employees.get(3).setHours(60);
        employees.get(3).setWage(32.12);
        
        System.out.println("Employee 3");
        System.out.println(String.format("%-10s%10d", "ID:", employees.get(3).getID()));
        System.out.println(String.format("%-10s%10d", "Hours:", employees.get(3).getHours()));
        System.out.println(String.format("%-10s%10.2f", "Wage:", employees.get(3).getWage()));
        System.out.println(String.format("%-10s%10.2f", "Regular:", employees.get(3).getRegularPay()));
        System.out.println(String.format("%-10s%10.2f", "Overtime:", employees.get(3).getOverTimePay()));
        System.out.println(String.format("%-10s%10.2f", "Gross:", employees.get(3).getGrossPay()));
    
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
