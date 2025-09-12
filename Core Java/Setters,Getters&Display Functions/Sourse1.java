class Date {
    
    int day;
    int month;

    // constructor
    Date(int day, int month) 
    {
        this.day = day;
        this.month = month;
    }

    // getter for day
    int getDay() {
        return this.day;
    }

    // getter for month
    int getMonth() {
        return this.month;
    }
} // class Date ends here

class Test {
    public static void main(String[] args) {
        // creating two Date objects
        Date d1 = new Date(5, 9);  
        Date d2 = new Date(7, 9); 

        if (d1.getDay() > d2.getDay()) {
            System.out.println("d1 is greater");
        } else {
            System.out.println("d2 is greater");
        }
    }
}
