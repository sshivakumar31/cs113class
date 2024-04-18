// Cat.java

public class Cat extends Pet {

    private boolean isInsideCat;
    


public Cat(String name, String owner, double weight) {
        super(name, owner, weight);
        this.isInsideCat = true; // By default, assume the cat is inside
    }

    public void goOutside() {
        isInsideCat = false;
    }

    @Override
    public double visit(int numShots) {

 	this.NumVisits++;

        double Cost = 85.00 + 30*(numShots) + 40.00;

        if (isInsideCat == false) {
            Cost += 30;
            this.totalCost +=Cost;
            return Cost;
        }
        else {
        
		this.totalCost += Cost;
       		 return Cost;
        }

   
    }

    @Override
    public String toString() {
        String location = isInsideCat ? "inside" : "outside";
        return "Cat (" + location + "): " + super.toString();
    }
}



