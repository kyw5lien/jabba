/**
 * 
 */
// package collectionsPackage;

/**
 * @author kyw5lien
 *	Implements a LinkedList data structure.
 */
public class ImplementedLinkedList {
	/**
	 *	Attributes / Field Declaration
	 */
	private Node firstElement;
	private int nodesCounter;
	
	/*
	 * Internal Node class Implementation
	 */
	private class Node {
		/**
		 *	Attributes / Field Declaration
		 */
		Object nodeElement;
		Node nextNode;
		
		/*
		 *  Constructor(s)
		 */
		Node(Object nodeElement){
			this.nodeElement = nodeElement;
		}
		
		Node(Object nodeElement, Node nextNode){
			this.nodeElement = nodeElement;
			this.nextNode = nextNode;
		}
	}
	
	/*
	 * 	Default Constructor
	 */
	public ImplementedLinkedList() {
		this.firstElement = null;
		this.nodesCounter = 0;
	}
	
	/* 
	 * 	ImplementedLinkedList method(s).
	 */
	
	/*
	 *	addNodeElement(Object nodeElement)
	 * 	Adds a node Element to the existing LinkedList.
	 */
	public void addNodeElement(Object nodeElement) {
		
		if(firstElement == null) {
			firstElement = new Node(nodeElement);
			nodesCounter++;
			return;
		}
	
		Node node = firstElement;
		
		while(node.nextNode != null)
			node = node.nextNode;
		
		node.nextNode = new Node(nodeElement);
		nodesCounter++;
				
	}
	
	/*
	 *	addNodeElement(int index, Object nodeElement)
	 * 	Adds a node Element in the provided index position of the existing LinkedList.
	 */
	public void addNodeElement(int index, Object nodeElement) throws IndexOutOfBoundsException {
		// Checks if index is within size bounds of the ImplementedLinkedList, otherwise throws Exception.
		try{
			
			if(index == 0) {
				firstElement = new Node(nodeElement, firstElement);
				nodesCounter++;
				return;
			}
			
			Node node = firstElement;
			for(int i = 1; i < index; i++)
				node = node.nextNode;
			
			node.nextNode = new Node(nodeElement, node.nextNode);
			nodesCounter++;
			return;
			
		}
		catch(IndexOutOfBoundsException e) {
			// ...
		}		
	}
	
	/*
	 *	getNodeElement(int index)
	 * 	Retrieves the node Element in the specified index of the existing LinkedList.
	 */
	
	public Object getNodeElement(int index) throws IndexOutOfBoundsException {
		if(index >= getSize())
			throw new IndexOutOfBoundsException();
		
		Node node = firstElement;
		
		for(int i = 1; i <= index; i++)
			node = node.nextNode;
				
		return node.nodeElement;
	}
	
	/*
	 *	removeNodeElement(Object nodeElement)
	 * 	Removes the node Element in the specified index of the LinkedList.
	 */
	public void removeNodeElement(int index) throws IndexOutOfBoundsException {
		if(index >= getSize())
			throw new IndexOutOfBoundsException();
		
		if(index == 0) {
			firstElement = firstElement.nextNode;
			nodesCounter--;
			return;
		}
		
		Node node = firstElement;
		
		for(int i = 1; i < index; i++) {
			node = node.nextNode;
		}
		
		node.nextNode = node.nextNode.nextNode;
		nodesCounter--;
	}
	
	/*
	 *	getSize()
	 * 	Retrieves the size/number of nodes of the LinkedList.
	 */
	public int getSize() {
		return this.nodesCounter;
	}
}
