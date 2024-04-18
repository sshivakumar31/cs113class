/**
 * Represents a pet.
 */
public class Pet {
    // Instance variables
    private String name; // Name of the pet
    private String owner; // Name of the pet's owner
    private double weight; // Weight of the pet

    /**
     * Constructs a pet with the specified name, owner, and weight.
     * @param name the name of the pet
     * @param owner the name of the pet's owner
     * @param weight the weight of the pet
     */
    public Pet(String name, String owner, double weight) {
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

    /**
     * Returns the name of the pet.
     * @return the name of the pet
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the name of the pet's owner.
     * @return the name of the pet's owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Returns the weight of the pet.
     * @return the weight of the pet
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the pet.
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Simulates a visit to the vet where the pet receives shots.
     * @param numShots the number of shots the pet receives
     * @return the cost of the visit
     */
    public double visit(int numShots) {
        double baseCost = 85.00; // Base cost for a visit
        double shotCost = 30.00 * numShots; // Cost for shots
        return baseCost + shotCost;
    }

    /**
     * Returns a string representation of the pet.
     * @return a string representation of the pet
     */
    @Override
    public String toString() {
        return name + " (owner " + owner + ") " + weight + " lbs";
    }
}

