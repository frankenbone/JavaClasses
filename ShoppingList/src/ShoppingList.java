import java.util.Scanner;

public class ShoppingList {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		ItemNode headNode;
		ItemNode currNode;
		ItemNode lastNode;
		ItemNode tmpNode;

		String item;
		int i;

		headNode = new ItemNode();
		lastNode = headNode;
		int input = scnr.nextInt();
		for (i = 0; i < input; i++) {
			item = scnr.next();
			currNode = new ItemNode(item);
			lastNode.insertAtEnd(headNode,currNode);
			lastNode = currNode;
		}

		ItemNode headNodeRef = headNode.getNext();
		while(headNodeRef!=null) {
			headNodeRef.printNodeData();
			headNodeRef =headNodeRef.getNext();
		}
	}
}

