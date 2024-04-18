/**
 * An interface with common collection operations.
 */
public interface Database {

    /**
     * Find out how many items are actually in the database.
     * @return the number of items
     */
    int size();

    /**
     * Display the items in the database on the screen.
     */
    void display();

    /**
     * Find a particular item in the database.
     * @param o the object to search for, based on equals
     * @return the object if found, null otherwise
     */
    Object find(Object o);

    /**
     * Add an item to the end of the database.
     * @param o the object to add
     * @return true if added, false otherwise
     */
    boolean add(Object o);

    /**
     * Delete an item from the database, if it is there.
     * Make sure to maintain the current ordering of the list.
     * @param o the object to delete
     * @return the item if deleted, null otherwise
     */
    Object delete(Object o);
}

