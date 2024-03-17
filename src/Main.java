public class Main {
    public static void main(String[] args) {
                Room[] rooms = {
                new Room(5,5,3),
                new Room(5,5,3),
                new Room(7,10,4),
                new Room(3,4,3),
                new Room(3,4,3),
                new Room(6,7,4)
        };
        Flat flatOfDream = new Flat(14, 15, 4, rooms);
        System.out.println(flatOfDream.getFlatDescription());
    }
}