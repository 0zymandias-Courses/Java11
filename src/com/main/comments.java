package com.main;

/** 
* <h1>Class comments </h1>  
*This class calculates the amount of days on X given years. 
* @author Warlock
* 
*/
class comments {

    /**
     * daysOfTheYears calculate the days on X years
     *
     * @param years the amount years to get their days
     * @return the days on X years given
     */
    private static int daysOfTheYears(int years) {
        return years * 365;
    }

    public static void main(String[] args) throws Exception {
        int years = 2;
        System.out.println("How many days " + 2 + "Years has : ");
        int days = daysOfTheYears(years);
        System.out.println(days);
    }
}
