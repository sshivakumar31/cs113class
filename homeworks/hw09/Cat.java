/**
 * Represents a cat, which is a type of pet.
 */
public class Cat extends Pet {
    // Instance variable
    private boolean isOutside; // Indicates whether the cat is an outside cat

    /**
     * Constructs a cat with the specified name, owner, weight, and outside status.
     * @param name the name of the cat
     * @param owner the name of the cat's owner
     * @param weight the weight of the cat
     * @param isOutside true if the cat is an outside cat, false otherwise
     */
    public Cat(String name, String owner, double weight, boolean isOutside) {
        super(name, owner, weight);
        this.isOutside = isOutside;
    }

    /**
     * Checks if the cat is an outside cat.
     * @return true if the cat is an outside cat, false otherwise
     */
    public boolean isOutside() {
        return isOutside;
    }

    /**
     * Sets the outside status of the cat.
     * @param isOutside true if the cat is an outside cat, false otherwise
     */
    public void setOutside(boolean isOutside) {
        this.isOutside = isOutside;
    }

    /**
     * Simulates a visit to the vet where the cat receives shots.
     * For outside cats, an additional shot is given.
     * @param numShots the number of shots the cat receives
     * @return the cost of the visit
     */
    @Override
    public double visit(int numShots) {
        double baseCost = 85.00; // Base cost for a visit
        double shotCost = 30.00 * numShots; // Cost for shots
        double totalCost = baseCost + shotCost;
        
        if (isOutside) {
            totalCost += 30.00; // Additional shot cost for outside cats
        }

        return totalCost;
    }

    /**
     * Returns a string representation of the cat.
     * @return a string representation of the cat
     */
    @Override
    public String toString() {
        return super.toString() + (isOutside ? " (outside)" : "");
    }
}

