package UserIOClassLab;

public class AppUserPrompts {
    public static void main(String[] args) {

        UserPrompts obj = new UserPrompts();
        obj.readInt("Please enter an integer value:");
        obj.readInt("Please enter an integer value in range", 7, 25);
        obj.readString("Please enter your phrase here:");
        obj.readFloat("Please enter float here:");
        obj.readFloat("Please enter value for float", 2, 100);
        obj.readDouble("Please return this value for double");
        obj.readDouble("Please enter a double value", 11.1, 200.989);
        obj.print("Let's finish this code and go to sleep");



    }
}
