/********************************************************************
 * Programmer:    Hiebert
 * Class:  CS30S
 *
 * Assignment: Lab 1.5
 *
 * Description: print program info
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    private String assignment;
    private String nl = System.lineSeparator();
    
    //*** Constructors ***
    public ProgramInfo(String a) {
        this.assignment = a;
    }
    
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
    
    //*** Setters ***
    
    //*** Other ***
    /*****************************************
    * Description:  print banner
    * 
    * Interface:
    * ****************************************/
    public String getBanner() {
        String st;
        st  = "*****************************" + nl;
        st += "Name:        Hiebert" + nl;
        st += "Class:       CS30S" + nl;
        st += "Assignment:  " + this.assignment + nl;
        st += "*****************************" + nl + nl;
        return st;
    }// end printBanner
    
    /*****************************************
    * Description:  print closing message
    * 
    * Interface:
    * ****************************************/
    public String getClosingMsg() {
        return "end of program.";
    }// end printClosingMsg
    
} // end of public class
