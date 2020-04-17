public class Animal {

    private int size;
    private String breed, name;

    public int getSize() {
        return size;
    }

    static class Animaltestdrive {

    public static void main(String[] args) {

    }


    public void setSize(int s) {
        size = s;
    }

    void roar() {
        if (size > 80) {
            System.out.println("hello");
        } else if (size > 18) {
            System.out.println("hai");
        } else {
            System.out.println("bye");
        }


    }
}
