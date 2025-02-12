class Node {
    String text;
    Node next;
    Node prev;

    public Node(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}

class TextEditor {
    Node current;
    int size;
    int maxSize;

    public TextEditor(int maxSize) {
        this.current = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void addText(String newText) {
        Node newNode = new Node(newText);
        if (size == maxSize) {
            current = current.prev;
            current.next = null;
            size--;
        }
        if (current == null) {
            current = newNode;
        } else {
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        size++;
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.text);
        } else {
            System.out.println("No more actions to undo.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.text);
        } else {
            System.out.println("No more actions to redo.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.text);
        } else {
            System.out.println("No content.");
        }
    }
}

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.addText("Hello");
        editor.displayCurrentState();
        editor.addText("World");
        editor.displayCurrentState();
        editor.addText("How");
        editor.displayCurrentState();

        editor.undo();
        editor.undo();
        editor.redo();
        editor.redo();
    }
}
