package serialization;

import java.io.*;

public class SerializationTest {
    public void run() throws IOException, ClassNotFoundException {
        User u = new User();
        User.setCountry("sss");
        u.setAge(10);
        u.setName("Dylan");
        u.setHeight(172);

        serialize(u);

        User ut = deserialize();

        int i = 0;
    }

    protected void serialize(User u) throws IOException {
        FileOutputStream file = new FileOutputStream("user.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(u);
        out.close();
        file.close();
    }

    protected User deserialize() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("user.txt");
        ObjectInputStream in = new ObjectInputStream(file);
        User u = (User) in.readObject();
        in.close();
        file.close();
        return u;
    }
}
