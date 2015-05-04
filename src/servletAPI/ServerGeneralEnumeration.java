package servletAPI;

import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
@author Rachelle Scheijen
 */
abstract class ServerGeneralEnumeration implements Enumeration{
    protected int counter;
    protected int elements;
    protected ArrayList<Object> values;
    
    public ServerGeneralEnumeration(){
        this.reset();
        this.values         = new ArrayList<Object>();
        this.elements       = 0;
    }
    
    /**
     * Adds a element to the enumeration
     * 
     * @param name  The new element
     */
    protected void add(Object name){
        this.values.add(name);
        
        this.elements++;
    }

    /**
     * Returns the next element
     * 
     * @return  The next element
     */
    public Object nextElement(){
        this.counter++;
        
        return this.values.get(this.counter-1);
    }

    /**
     * Checks if the enumeration has more elements
     * 
     * @return True if the enumeration has more elements, otherwise false
     */
    public boolean hasMoreElements() {
        return this.counter < this.elements;
    }
    
    /**
     * Resets the internal element counter
     */
    public void reset(){
        this.counter    = 0;
    }    
}
