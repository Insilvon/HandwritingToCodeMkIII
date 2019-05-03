public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.show();
        try {
            gui.runDemo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
