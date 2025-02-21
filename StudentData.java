import java.io.*;

public class StudentData {
    public static void main(String[] args) {
        String file = "student.dat";
        writeData(file, 101, "Ayushi", 9.2);
        readData(file);
    }

    static void writeData(String file, int roll, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Data saved!");
        } catch (IOException e) {}
    }

    static void readData(String file) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            System.out.println(dis.readInt() + " | " + dis.readUTF() + " | " + dis.readDouble());
        } catch (IOException e) {}
    }
}
