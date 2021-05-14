public class ItemNode {
	private String item;
	private ItemNode nextNodeRef;

	//default constructor.
	public ItemNode() {
		item = "";
		nextNodeRef = null;
	}
	//constructor.
	public ItemNode(String item) {
		this.item = item;
		this.nextNodeRef = null;
	}
	//constructor.
	public ItemNode(String item, ItemNode nextLoc) {
		this.item = item;
		this.nextNodeRef = nextLoc;
	}
	//insertAfter Method.
	public void insertAfter(ItemNode nodeLoc) {
		ItemNode tempNext;
		tempNext = this.nextNodeRef;
		this.nextNodeRef = nodeLoc;
		nodeLoc.nextNodeRef = tempNext;
	}
	//insertAtEnd Method
	public void insertAtEnd(ItemNode headNode,ItemNode currNode) {
		ItemNode headRef = headNode;//takes headNode in headRef.
		//loop until we get null
		while(headRef.nextNodeRef!=null) {
			headRef = headRef.nextNodeRef;//changing node
		}
		//adding currNode at the end of the linked list.
		headRef.nextNodeRef = currNode;
	}
	//getter to get the item
	public String getItem() {
		return item;
	}
	//getter to get nextNodeRef.
	public ItemNode getNext() {
		return nextNodeRef;
	}
	//prints the item of the node.
	public void printNodeData() {
		System.out.println(item);
	}
}