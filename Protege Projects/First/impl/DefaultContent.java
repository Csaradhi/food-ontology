package First.impl;

import First.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultContent <br>
 * @version generated on Wed Nov 16 17:10:01 IST 2016 by Sai
 */
public class DefaultContent extends WrappedIndividualImpl implements Content {

    public DefaultContent(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Components
     */
     
    public Collection<? extends InnerLayer> getComponents() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_COMPONENTS,
                                               DefaultInnerLayer.class);
    }

    public boolean hasComponents() {
	   return !getComponents().isEmpty();
    }

    public void addComponents(InnerLayer newComponents) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_COMPONENTS,
                                       newComponents);
    }

    public void removeComponents(InnerLayer oldComponents) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_COMPONENTS,
                                          oldComponents);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Contains
     */
     
    public Collection<? extends Content> getContains() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_CONTAINS,
                                               DefaultContent.class);
    }

    public boolean hasContains() {
	   return !getContains().isEmpty();
    }

    public void addContains(Content newContains) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_CONTAINS,
                                       newContains);
    }

    public void removeContains(Content oldContains) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_CONTAINS,
                                          oldContains);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#FeelLike
     */
     
    public Collection<? extends OuterLayer> getFeelLike() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_FEELLIKE,
                                               DefaultOuterLayer.class);
    }

    public boolean hasFeelLike() {
	   return !getFeelLike().isEmpty();
    }

    public void addFeelLike(OuterLayer newFeelLike) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_FEELLIKE,
                                       newFeelLike);
    }

    public void removeFeelLike(OuterLayer oldFeelLike) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_FEELLIKE,
                                          oldFeelLike);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#LooksLikeInside
     */
     
    public Collection<? extends Colour> getLooksLikeInside() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_LOOKSLIKEINSIDE,
                                               DefaultColour.class);
    }

    public boolean hasLooksLikeInside() {
	   return !getLooksLikeInside().isEmpty();
    }

    public void addLooksLikeInside(Colour newLooksLikeInside) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_LOOKSLIKEINSIDE,
                                       newLooksLikeInside);
    }

    public void removeLooksLikeInside(Colour oldLooksLikeInside) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_LOOKSLIKEINSIDE,
                                          oldLooksLikeInside);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#LooksLikeOutside
     */
     
    public Collection<? extends Colour> getLooksLikeOutside() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_LOOKSLIKEOUTSIDE,
                                               DefaultColour.class);
    }

    public boolean hasLooksLikeOutside() {
	   return !getLooksLikeOutside().isEmpty();
    }

    public void addLooksLikeOutside(Colour newLooksLikeOutside) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_LOOKSLIKEOUTSIDE,
                                       newLooksLikeOutside);
    }

    public void removeLooksLikeOutside(Colour oldLooksLikeOutside) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_LOOKSLIKEOUTSIDE,
                                          oldLooksLikeOutside);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Carbohydrate
     */
     
    public Collection<? extends String> getCarbohydrate() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CARBOHYDRATE, String.class);
    }

    public boolean hasCarbohydrate() {
		return !getCarbohydrate().isEmpty();
    }

    public void addCarbohydrate(String newCarbohydrate) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CARBOHYDRATE, newCarbohydrate);
    }

    public void removeCarbohydrate(String oldCarbohydrate) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CARBOHYDRATE, oldCarbohydrate);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Cholestrol
     */
     
    public Collection<? extends String> getCholestrol() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CHOLESTROL, String.class);
    }

    public boolean hasCholestrol() {
		return !getCholestrol().isEmpty();
    }

    public void addCholestrol(String newCholestrol) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CHOLESTROL, newCholestrol);
    }

    public void removeCholestrol(String oldCholestrol) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CHOLESTROL, oldCholestrol);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Fat
     */
     
    public Collection<? extends String> getFat() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FAT, String.class);
    }

    public boolean hasFat() {
		return !getFat().isEmpty();
    }

    public void addFat(String newFat) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FAT, newFat);
    }

    public void removeFat(String oldFat) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FAT, oldFat);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#FruitName
     */
     
    public Collection<? extends String> getFruitName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FRUITNAME, String.class);
    }

    public boolean hasFruitName() {
		return !getFruitName().isEmpty();
    }

    public void addFruitName(String newFruitName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FRUITNAME, newFruitName);
    }

    public void removeFruitName(String oldFruitName) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FRUITNAME, oldFruitName);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Potassium
     */
     
    public Collection<? extends String> getPotassium() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_POTASSIUM, String.class);
    }

    public boolean hasPotassium() {
		return !getPotassium().isEmpty();
    }

    public void addPotassium(String newPotassium) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_POTASSIUM, newPotassium);
    }

    public void removePotassium(String oldPotassium) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_POTASSIUM, oldPotassium);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Protiens
     */
     
    public Collection<? extends String> getProtiens() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PROTIENS, String.class);
    }

    public boolean hasProtiens() {
		return !getProtiens().isEmpty();
    }

    public void addProtiens(String newProtiens) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PROTIENS, newProtiens);
    }

    public void removeProtiens(String oldProtiens) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PROTIENS, oldProtiens);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/mahe/ontologies/2016/9/untitled-ontology-8#Sodium
     */
     
    public Collection<? extends String> getSodium() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SODIUM, String.class);
    }

    public boolean hasSodium() {
		return !getSodium().isEmpty();
    }

    public void addSodium(String newSodium) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SODIUM, newSodium);
    }

    public void removeSodium(String oldSodium) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SODIUM, oldSodium);
    }


}
