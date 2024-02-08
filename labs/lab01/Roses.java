public class Roses {
        public static void main(String[] args) {
        System.out.print("Please give me one color:");
        String input = System.console().readLine();
        System.out.print("Please give me a second color:");
        String input2 = System.console().readLine();
	System.out.print("Please give me an adjective:");
        String adj = System.console().readLine();
  

        System.out.println(" Roses are " + input );
	System.out.println(" Violets are " + input2 );
	System.out.println(" Sugar is " + adj);
	System.out.println(" and so are you!");
        }
}

