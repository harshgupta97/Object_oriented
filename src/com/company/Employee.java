package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private static int numberOFEmployee;

    // Constructor
    public Employee (int baseSalary, int HourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(HourlyRate);
        numberOFEmployee++;
    }

    // Constructor overloading
    public Employee(int baseSalary){
        this(50_000, 0);
    }

    public static void printNumberOfEmployee(){
        System.out.println(numberOFEmployee);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }

    public int calculateWage(int extraHour){ return baseSalary + (hourlyRate * extraHour); }
}
