

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        
        Suitcase newSuit = new Suitcase(200);
        Item book = new Item("Book", 10);
        Item heavyBook = new Item("Heavy Book", 150);
        
        newSuit.addItem(book);
        newSuit.addItem(heavyBook);
        
        System.out.println(newSuit.totalWeight());
        newSuit.printItems();
        
        Hold newHold = new Hold(300);
        newHold.addSuitcase(newSuit);
        System.out.println(newHold.totalWeight());
        newHold.printItems();
    }

}
