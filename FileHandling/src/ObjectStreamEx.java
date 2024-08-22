

import java.io.*;

class User implements Serializable {
    String name;
    int age;

    transient String password;

    public User(String name, int age ,String password) {
        this.name = name;
        this.age = age;
        this.password=password;
    }
}

class ObjectStreamEx  {
    public static void main(String[] args) {

        User user = new User("Vedant", 23,"12345");
        try {
            ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("output.txt"));
            write.writeObject(user);

            ObjectInputStream read = new ObjectInputStream(new FileInputStream("output.txt"));
            User newUser = (User) read.readObject();

            System.out.println(newUser.name);
            System.out.println(newUser.age);
            System.out.println(newUser.password);

            read.close();
            write.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}