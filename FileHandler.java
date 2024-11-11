import java.io.*;
import java.util.List;

public class FileHandler {
    
    public static void saveDesign(List<Room> rooms, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(rooms); 
            System.out.println("Design saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Room> loadDesign(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Room> rooms = (List<Room>) in.readObject(); 
            System.out.println("Design loaded successfully.");
            return rooms;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
