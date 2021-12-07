/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: AxQy
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
    private static int nextID = 1000;
    private String nl = System.lineSeparator();
    
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
    
    public double getRegularPay() {
        if (this.hours <= 40) {
            return this.hours * this.wage;
        } else {
            return 40 * this.wage;
        }//end if
    }// end getRegularPay
    
    public double getOverTimePay() {
        if (this.hours > 40) {
            return (this.hours - 40) * (1.5 * this.wage);
        } else {
            return 0.0;
        }
    }// end getOverTimePay
    
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
        String st = "";
        
        st += "ID: " + this.getID() + nl;
        st += "Hours worked: " + this.getHours() + nl;
        st += "Hourly wage: " + this.getWage() + nl;
        st += "Regular pay: " + this.getRegularPay() + nl;
        st += "Overtime pay: " + this.getOverTimePay() + nl;
        st += "Gross pay: " + this.getGrossPay() + nl;
        
        return st;
    }
    
} // end of public class
