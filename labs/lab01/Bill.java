public class Bill {
        public static void main(String[] args) {
        System.out.print("Room rate:");
        double rate = Double. parseDouble(System.console().readLine());
        System.out.print("Total nights:");
        double nights = Double. parseDouble(System.console().readLine());
 System.out.println("-------------------" );
 double tax = (.06) * (rate) * nights ;
 double fee = (.105) * (rate) * nights ;
        System.out.println("Tax: " + tax);
        System.out.println("Tourism Fee: " + fee);
        double total =((.06) * (rate) + (.105) * (rate) + rate) * nights;
                  System.out.println("Total: " + total);


        }
}

