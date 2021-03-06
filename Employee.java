/********************************************************************
 * Programmer:      hiebert
 * Class:           CS30S
 *
 * Assignment:      Employee Payroll
 *
 * Description:     display employee records
 ***********************************************************************/

// import libraries as needed here
import java.text.NumberFormat;

public class Employee {
    //*** Class Variables ***
    private static int nextID = 1000;
    private String nl = System.lineSeparator();
    private final int fullDay = 40;
    private final double overtimeMult = 1.5;
    private NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    //*** Instance Variables ***
    private int id;
    private int hours;
    private double wage;
    
    //*** Constructors ***
    public Employee() {
        id = nextID++;
    }// end no-arg constructor
    
    public Employee(int hours, double wage) {
        id = nextID++;
        this.hours = hours;
        this.wage = wage;
    }// end full arg constructor
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    /*****************************************
    * Description:  get id of employee
    * 
    * @return       id
    * ****************************************/
    public int getID() {
        return this.id;
    }
    
    /*****************************************
    * Description:  get number of hours worked
    * 
    * @return       number of hours
    * ****************************************/
    public int getHours() {
        return this.hours;
    }// end getHours()
    
    /*****************************************
    * Description:  get hourly wage
    * 
    * @return       wage in dollars
    * ****************************************/
    public double getWage() {
        return this.wage;
    }// end getWage()
    
    /*****************************************
    * Description:  calculate regular pay
    * 
    * @return       regular pay in dollars
    * ****************************************/
    public double getRegularPay() {
        if (this.hours <= this.fullDay) {
            return this.hours * this.wage;
        } else {
            return this.fullDay * this.wage;
        }//end if
    }// end getRegularPay
    
    /*****************************************
    * Description:  calculate overtime pay
    * 
    * @return       overtime pay in dollars
    * ****************************************/
    public double getOverTimePay() {
        if (this.hours > this.fullDay) {
            return (this.hours - this.fullDay) * (this.overtimeMult * this.wage);
        } else {
            return 0.0;
        }
    }// end getOverTimePay
    
    /*****************************************
    * Description:  calculate gross pay
    * 
    * @return       gross pay in dollars
    * ****************************************/
    public double getGrossPay() {
        return getRegularPay() + getOverTimePay();
    }// end getGrossPay
    
    //*** Setters ***
    /*****************************************
    * Description:  set the number of hours worked
    * 
    * @param        new number of hours
    * ****************************************/
    public void setHours(int hours) {
        this.hours = hours;
    }// end setHours()
    
    /*****************************************
    * Description:  set hourly wage
    * 
    * @param        new hourly wage
    * ****************************************/
    public void setWage(double wage) {
        this.wage = wage;
    }// end setWage()
    
    // Other Methods
    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        
        st.append(String.format("|%10d|", this.getID()));
        st.append(String.format("%10d|", this.getHours()));
        st.append(String.format("%15s|", currency.format(this.getWage())));
        st.append(String.format("%15s|", currency.format(this.getRegularPay())));
        st.append(String.format("%15s|", currency.format(this.getOverTimePay())));
        st.append(String.format("%15s|", currency.format(this.getGrossPay())));
        
        return st.toString();
    }
    
} // end of public class
