/**
 * Represents a veterinary clinic.
 * Implements the Database interface.
 */
public class Vet implements Database {
    // Instance variables
    private int maxClients; // Maximum number of clients the vet can handle
    private String clinicName; // Name of the veterinary clinic
    private Pet[] clients; // Array to store pets as clients
    private int numClients; // Current number of clients

    /**
     * Constructs a Vet with the specified maximum number of clients and clinic name.
     * @param maxClients the maximum number of clients the vet can handle
     * @param clinicName the name of the veterinary clinic
     */
    public Vet(int maxClients, String clinicName) {
        this.maxClients = maxClients;
        this.clinicName = clinicName;
        this.clients = new Pet[maxClients];
        this.numClients = 0;
    }

    /**
     * Adds a pet to the vet's client list.
     * @param pet the pet to be added
     * @return true if the pet is successfully added, false otherwise
     */
    public boolean add(Pet pet) {
        if (numClients < maxClients) {
            clients[numClients] = pet;
            numClients++;
            return true;
        } else {
            return false; // Unable to add, client list full
        }
    }

    /**
     * Deletes a pet from the vet's client list.
     * @param pet the pet to be deleted
     * @return true if the pet is successfully deleted, false otherwise
     */
    public boolean delete(Pet pet) {
        for (int i = 0; i < numClients; i++) {
            if (clients[i].equals(pet)) {
                // Shift elements to fill the gap left by the deleted pet
                for (int j = i; j < numClients - 1; j++) {
                    clients[j] = clients[j + 1];
                }
                clients[numClients - 1] = null; // Set the last element to null
                numClients--;
                return true;
            }
        }
        return false; // Pet not found
    }

    /**
     * Finds a pet in the vet's client list.
     * @param pet the pet to be found
     * @return the found pet if it exists, null otherwise
     */
    public Pet find(Pet pet) {
        for (int i = 0; i < numClients; i++) {
            if (clients[i].equals(pet)) {
                return clients[i];
            }
        }
        return null; // Pet not found
    }

    /**
     * Returns the number of clients the vet currently has.
     * @return the number of clients
     */
    public int size() {
        return numClients;
    }

    /**
     * Displays the list of clients at the veterinary clinic.
     */
    public void display() {
        for (int i = 0; i < numClients; i++) {
            System.out.println(clients[i]);
        }
    }

    /**
     * Calculates and returns the average weight of all clients.
     * @return the average weight of all clients
     */
    public double averageWeight() {
        double totalWeight = 0;
        for (int i = 0; i < numClients; i++) {
            totalWeight += clients[i].getWeight();
        }
        if (numClients > 0) {
            return totalWeight / numClients;
        } else {
            return 0; // Avoid division by zero
        }
    }
}

