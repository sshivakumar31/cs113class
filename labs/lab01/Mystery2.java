public class Mystery2 {

    public static void main(String[] args) {
    
        String input = System.console().readLine();
        int value = Integer.parseInt(input);
        double fraction = value / 10;
        System.out.println("The fraction is "+fraction);
    }
}

