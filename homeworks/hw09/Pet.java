//Pet.java

public class Pet {
    // Instance variables
    private String name; // Name of the pet
    private String owner; // Name of the pet's owner
    private double weight; // Weight of the pet
    public int NumVisits; // Number of Visits
    public double totalCost; // Total Cost

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
	this.NumVisits = 0;
    }


    public String getName() {
        return name;
    }


    public String getOwner() {
        return owner;
    }

  
    public double getWeight() {
        return weight;
    }

   
    public int getNumVisits() {
        return NumVisits;
    }
  

    @Override
    public String toString() {
       return this.name + " (owner " + this.owner + ") " + this.weight
           + " lbs, $" + this.avgCost() + " avg cost/visit  ";
    }
 


    /**
     * Simulates a visit to the vet where the pet receives shots.
     * @param numShots the number of shots the pet receives
     * @return the cost of the visit
     */
 	
      public double visit(int numShots) {
        NumVisits++;
        double Cost = 85.00 + 30 * numShots;
        totalCost += Cost;
        return Cost;
    }

    public double avgCost() {
        double AvgCost = totalCost/NumVisits;
        if (NumVisits != 0) {
            return AvgCost;
        }
       else {
         AvgCost = 0;
         return AvgCost;  
       }
    }

    public boolean equals(Pet otherPet) {
        String name2 = otherPet.getName();
        String owner2 = otherPet.getOwner();
        if (this.getName().toLowerCase().compareTo(name2.toLowerCase())==0 && this.getOwner().toLowerCase().compareTo(owner2.toLowerCase())==0) {
            return true;
        }
        else {
            return false;
        }
    }
}


