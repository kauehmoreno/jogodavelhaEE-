/**
 * 
 */
package jogodavelhaEE.src.model.util;

/**
 * @author kaueh
 *
 */
public enum OpcaoDeJogo {
	
	X("X"),O("O");
	
	 private final String value;

     private OpcaoDeJogo(final String newValue) {
         value = newValue;
     }

     public String getValue() { 
    	 return value; 
     }

}
