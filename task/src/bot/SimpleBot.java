package bot;

public class SimpleBot {
    public static void main(String[] args) {
        Bot bot = new Bot();
        bot.printGreetings();
    }
}

class Bot {
    String name = "Aid";
    int birthYear = 2018;

    public void printGreetings() {
        System.out.println("Hello! My name is " + name + ".\nI was created in " + birthYear + ".");
    }
}
