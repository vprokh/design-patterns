package headfirst.designpatterns.creation.prototype;

public class Client {
    public static void main(String[] args) {
        Dragon p1 = new Dragon("name", false);
        Drakon p2 = new Drakon("name1", 1, true);

        // ... later ...
        operation(p2);
    }

    public static void operation(Drakon p) {
        // This code doesn't know or care what the concrete type of p is
        Monster pCopy = null;
        try {
            pCopy = p.copy();
            // do something useful with pCopy
            System.out.println("Operating with pCopy!");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}