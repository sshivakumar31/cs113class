// Vet.java

public class Vet implements Database {
    private int maxClients;
    private String clinicName;
    private Pet[] clientList;
    private int numClients;

    public Vet(int maxClients, String clinicName) {
        this.maxClients = maxClients;
        this.clinicName = clinicName;
        this.clientList = new Pet[maxClients];
        this.numClients = 0;
    }

    @Override
public int size() {
    int numClients = 0;
    for (int i = 0; i < maxClients; i++) {
        if (clientList[i] != null) {
            numClients++;
        }
    }
    return numClients;
}

    @Override
    public void display() {
	System.out.println("Vet Pets R Us client list:");
	for (int i = 0; i < numClients; i++) {
            System.out.println(clientList[i]);
        }
    }


@Override
public Object find(Object o) {
    Pet notFound = new Pet("", "", 0); // Create an empty Pet object
    for (int i = 0; i < numClients; i++) {
        if (clientList[i] != null && clientList[i].equals((Pet) o)) {
            return clientList[i];
        }
    }
    return notFound; // Return the empty Pet object if not found
}

    @Override
    public boolean add(Object o) {
        if (o instanceof Pet && numClients < maxClients) {
            Pet newPet = (Pet) o;
            clientList[numClients++] = newPet;
            return true;
        }
        return false;
    }

    @Override
    public Object delete(Object o) {
        if (o instanceof Pet) {
            Pet petToDelete = (Pet) o;
            for (int i = 0; i < numClients; i++) {
                if (clientList[i].equals(petToDelete)) {
                    Pet deletedPet = clientList[i];
                    clientList[i] = clientList[numClients - 1];
                    clientList[numClients - 1] = null;
                    numClients--;
                    return deletedPet;
                }
            }
        }
        return null;
    }

    // Additional methods specific to Vet class
    public double averageWeight() {
        if (numClients == 0) {
            return 0;
        }
        double totalWeight = 0;
        for (int i = 0; i < numClients; i++) {
            totalWeight += clientList[i].getWeight();
        }
        return totalWeight / numClients;
    }
}
