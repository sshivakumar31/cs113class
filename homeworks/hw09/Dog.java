// Dog.java

public class Dog extends Pet {
    // Instance variable
    private String size; // Size of the dog (small, medium, large)

    /**
     * Constructs a dog with the specified name, owner, weight, and size.
     * @param name the name of the dog
     * @param owner the name of the dog's owner
     * @param weight the weight of the dog
     * @param size the size of the dog (small, medium, large)
     */
    public Dog(String name, String owner, double weight, String size) {
        super(name, owner, weight);
        this.size = size;
    }

    /**
     * Returns the size of the dog.
     * @return the size of the dog
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size of the dog.
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Simulates a visit to the vet where the dog receives shots.
     * For medium and large dogs, a surcharge is added for each shot.
     * Additionally, nails are trimmed for all dogs.
     * @param numShots the number of shots the dog receives
     * @return the cost of the visit
     */
  


 @Override
    public double visit(int numShots) {
        double baseCost = 85.00; // Base cost for a visit
        double shotCost = 30.00 * numShots; // Cost for shots
        double totalCost = baseCost + shotCost;
        
        if (size.equalsIgnoreCase("medium")) {
            totalCost += 5.50 * numShots; // Surcharge for medium dogs
        } else if (size.equalsIgnoreCase("large")) {
            totalCost += 12.75 * numShots; // Surcharge for large dogs
        }
        
        totalCost += 25.00; // Cost for nails trimming
        
        return totalCost;
    }

    /**
     * Returns a string representation of the dog.
     * @return a string representation of the dog
     */
    @Override
    public String toString() {
        return super.toString() + " (" + size + ")";
    }
}


