

/**
 * Created by Joey on 9/29/2016.
 */
public class employeeClass {

    private int fName, lName;
    private double monthlySalary;

    public employeeClass(int fN, int lN, int mS){
        fName = fN;
        lName = lN;
        monthlySalary = mS;

    }
    public double getYearlySalary() {
        return monthlySalary * 12;


    }
    public double getTenPerc() {
        return monthlySalary *(monthlySalary * .10) * 12;

    }



}
