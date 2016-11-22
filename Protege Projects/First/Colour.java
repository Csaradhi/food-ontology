package First;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Colour <br>
 * @version generated on Wed Nov 16 17:10:01 IST 2016 by Sai
 */

public interface Colour extends Fruits {

    /* ***************************************************
     * Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Components
     */
     
    /**
     * Gets all property values for the Components property.<p>
     * 
     * @returns a collection of values for the Components property.
     */
    Collection<? extends InnerLayer> getComponents();

    /**
     * Checks if the class has a Components property value.<p>
     * 
     * @return true if there is a Components property value.
     */
    boolean hasComponents();

    /**
     * Adds a Components property value.<p>
     * 
     * @param newComponents the Components property value to be added
     */
    void addComponents(InnerLayer newComponents);

    /**
     * Removes a Components property value.<p>
     * 
     * @param oldComponents the Components property value to be removed.
     */
    void removeComponents(InnerLayer oldComponents);


    /* ***************************************************
     * Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Contains
     */
     
    /**
     * Gets all property values for the Contains property.<p>
     * 
     * @returns a collection of values for the Contains property.
     */
    Collection<? extends Content> getContains();

    /**
     * Checks if the class has a Contains property value.<p>
     * 
     * @return true if there is a Contains property value.
     */
    boolean hasContains();

    /**
     * Adds a Contains property value.<p>
     * 
     * @param newContains the Contains property value to be added
     */
    void addContains(Content newContains);

    /**
     * Removes a Contains property value.<p>
     * 
     * @param oldContains the Contains property value to be removed.
     */
    void removeContains(Content oldContains);


    /* ***************************************************
     * Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#FeelLike
     */
     
    /**
     * Gets all property values for the FeelLike property.<p>
     * 
     * @returns a collection of values for the FeelLike property.
     */
    Collection<? extends OuterLayer> getFeelLike();

    /**
     * Checks if the class has a FeelLike property value.<p>
     * 
     * @return true if there is a FeelLike property value.
     */
    boolean hasFeelLike();

    /**
     * Adds a FeelLike property value.<p>
     * 
     * @param newFeelLike the FeelLike property value to be added
     */
    void addFeelLike(OuterLayer newFeelLike);

    /**
     * Removes a FeelLike property value.<p>
     * 
     * @param oldFeelLike the FeelLike property value to be removed.
     */
    void removeFeelLike(OuterLayer oldFeelLike);


    /* ***************************************************
     * Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#LooksLikeInside
     */
     
    /**
     * Gets all property values for the LooksLikeInside property.<p>
     * 
     * @returns a collection of values for the LooksLikeInside property.
     */
    Collection<? extends Colour> getLooksLikeInside();

    /**
     * Checks if the class has a LooksLikeInside property value.<p>
     * 
     * @return true if there is a LooksLikeInside property value.
     */
    boolean hasLooksLikeInside();

    /**
     * Adds a LooksLikeInside property value.<p>
     * 
     * @param newLooksLikeInside the LooksLikeInside property value to be added
     */
    void addLooksLikeInside(Colour newLooksLikeInside);

    /**
     * Removes a LooksLikeInside property value.<p>
     * 
     * @param oldLooksLikeInside the LooksLikeInside property value to be removed.
     */
    void removeLooksLikeInside(Colour oldLooksLikeInside);


    /* ***************************************************
     * Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#LooksLikeOutside
     */
     
    /**
     * Gets all property values for the LooksLikeOutside property.<p>
     * 
     * @returns a collection of values for the LooksLikeOutside property.
     */
    Collection<? extends Colour> getLooksLikeOutside();

    /**
     * Checks if the class has a LooksLikeOutside property value.<p>
     * 
     * @return true if there is a LooksLikeOutside property value.
     */
    boolean hasLooksLikeOutside();

    /**
     * Adds a LooksLikeOutside property value.<p>
     * 
     * @param newLooksLikeOutside the LooksLikeOutside property value to be added
     */
    void addLooksLikeOutside(Colour newLooksLikeOutside);

    /**
     * Removes a LooksLikeOutside property value.<p>
     * 
     * @param oldLooksLikeOutside the LooksLikeOutside property value to be removed.
     */
    void removeLooksLikeOutside(Colour oldLooksLikeOutside);


    /* ***************************************************
     * Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#ColourName
     */
     
    /**
     * Gets all property values for the ColourName property.<p>
     * 
     * @returns a collection of values for the ColourName property.
     */
    Collection<? extends String> getColourName();

    /**
     * Checks if the class has a ColourName property value.<p>
     * 
     * @return true if there is a ColourName property value.
     */
    boolean hasColourName();

    /**
     * Adds a ColourName property value.<p>
     * 
     * @param newColourName the ColourName property value to be added
     */
    void addColourName(String newColourName);

    /**
     * Removes a ColourName property value.<p>
     * 
     * @param oldColourName the ColourName property value to be removed.
     */
    void removeColourName(String oldColourName);



    /* ***************************************************
     * Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#FruitName
     */
     
    /**
     * Gets all property values for the FruitName property.<p>
     * 
     * @returns a collection of values for the FruitName property.
     */
    Collection<? extends String> getFruitName();

    /**
     * Checks if the class has a FruitName property value.<p>
     * 
     * @return true if there is a FruitName property value.
     */
    boolean hasFruitName();

    /**
     * Adds a FruitName property value.<p>
     * 
     * @param newFruitName the FruitName property value to be added
     */
    void addFruitName(String newFruitName);

    /**
     * Removes a FruitName property value.<p>
     * 
     * @param oldFruitName the FruitName property value to be removed.
     */
    void removeFruitName(String oldFruitName);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
