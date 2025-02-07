public class NodeStack <E>{

    private E content;
    private Node<E> nextNode;

    // Konstruktor
    public NodeStack(E pContent) {
        this.content = pContent;
        this.nextNode = null;
    }

    // Getter für Content
    public E getContent() {
        return content;
    }

    // Setter für Content
    public void setContent(E pContent) {
        this.content = pContent;
    }

    // Getter für nächsten Node
    public Node<E> getNextNode() {
        return nextNode;
    }

    // Setter für nächsten Node
    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
}
}
