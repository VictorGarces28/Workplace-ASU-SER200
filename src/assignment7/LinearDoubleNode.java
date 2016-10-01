package assignment7;

/**
 * Program to create a LinearDoubleNode structure.
 *
 * Completion time: 2 hours
 *
 * @author Kiran Gautam
 * @version V1.0
 */

	public class LinearDoubleNode<T>
	{
	   private LinearDoubleNode<T> next,previous;
	   private T element;

	   /**
	    * Creates an empty node.
	    */
	   public LinearDoubleNode()
	   {
	       previous.next = next;
	       next.previous = previous;
	   }

	   /**
	    * Creates a node storing the specified element.
	    * @param elem element to be stored
	    */
	   public LinearDoubleNode(T elem)
	   {
	       element = elem;
	   }

	   /**
	    * Returns the node that follows this one.
	    * @return reference to next node
	    */
	   public LinearDoubleNode<T> getNext()
	   {
	       return next;
	   }

	   /**
	    * Sets the node that follows this one.
	    * @param node node to follow this one
	    */
	   public void setNext(LinearDoubleNode<T> node)
	   {
	       next = node;
	   }

	   public LinearDoubleNode<T> getPrev()
	   {
		   return previous;
	   }
	   
	   public void setPrev(LinearDoubleNode<T> node)
	   {
		   previous = node;
	   }
	   
	   /**
	    * Returns the element stored in this node.
	    * @return element stored at the node
	    */
	   public T getElement()
	   {
	       return element;
	   }

	   /**
	    * Sets the element stored in this node.
	    * @param elem element to be stored at this node
	    */
	   public void setElement(T elem)
	   {
	       element = elem;
	   }
	}
	
	