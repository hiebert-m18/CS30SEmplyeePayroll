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
    
    //*** Instance Variables ***
    private int id;
    private int hours;
    private double wage;
    
    //*** Constructors ***
    public Employee() {
        id = nextID++;
    }// end no-arg constructor
    
    public Employee(int hours, float wage) {
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
    
} // end of public class
