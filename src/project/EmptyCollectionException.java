package project;

/**
 * Represents the situation in which a collection is empty.
 *
 * @author Java Foundations
 * @version 4.0
 */
@SuppressWarnings("serial")
public class EmptyCollectionException extends RuntimeException {

	public EmptyCollectionException(String collection) {
		super("The " + collection + " is empty.");
	}
}