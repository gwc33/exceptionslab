package lab0;

import java.util.Calendar;
import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    private int maxVacationDays;

    public int getMaxVacationDays() {
        return maxVacationDays;
    }

    public void setMaxVacationDays(int maxVacationDays) {
        this.maxVacationDays = maxVacationDays;
    }

//    public Employee() {
//        firstName = "Unknown";
//        lastName = "Unknown";
//        ssn = "Unknown";
//        hireDate = new Date();
//        daysVacation = 0;
//    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation, int maxVacationDays) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setMaxVacationDays(maxVacationDays);
        setHireDate(hireDate);
        setDaysVacation(daysVacation);
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
//cannot be less than zero or greater than max
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if(daysVacation<0 || daysVacation > maxVacationDays){
            throw new IllegalArgumentException("daysVacation cannot be less than zero or greater than max");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }
//must be > 0, and not be null, and must be < 50
    public final void setFirstName(String firstName) {
        if(firstName == null || firstName.length() <= 0 || firstName.length()>50 ){
            throw new IllegalArgumentException("firstName cannot be null, be greater than zero characters, and less than 50 characters.");
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }
//plus minus 30 days
    public void setHireDate(Date hireDate) {
        Calendar todaysDate = Calendar.getInstance();
        Calendar calendarHireDate = Calendar.getInstance();
        calendarHireDate.setTime(hireDate);
        
        if(calendarHireDate.after(todaysDate)){
            throw new IllegalArgumentException("Error");
        }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
