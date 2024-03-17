public class Flat {
    int width1;
    int width2;
    int height;
    Room[] rooms;

    public Flat(int width1, int width2, int height, Room[] rooms) {
        this.width1 = width1;
        this.width2 = width2;
        this.height = height;
        this.rooms = rooms;
    }

    public String getFlatDescription() {
        return String.format("Flat dimensions are %d * %d * %d. " +
                "It has %d rooms with dimensions: two children's rooms %d * %d * %d, " +
                "master's bedroom %d * %d * %d, two bathrooms %d * %d * %d, living room " +
                "with kitchen %d * %d * %d.", width1, width2, height, rooms.length,
                rooms[0].width1, rooms[0].width2, rooms[0].height, rooms[2].width1,
                rooms[2].width2, rooms[2].height, rooms[3].width1, rooms[3].width2,
                rooms[3].height, rooms[5].width1, rooms[5].width2, rooms[5].height);
    }
}