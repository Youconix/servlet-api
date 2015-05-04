package servletAPI;

import java.security.Principal;

/**
 *
 * @author Rachelle Scheijen
 */
public class PrincipalStub implements Principal{
    private String name = "";
    
    /**
     * Sets the name
     * 
     * @param name  The name
     */
    public void setName(String name){
        this.name   = name;
    }
    
    /**
     * Returns the name
     * 
     * @return  The name
     */
    public String getName() {
        return this.name;
    }
    
}
