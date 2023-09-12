public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int counter = 0;

        while (i != 0){
            if (i % 2 == 1){
                i = i - 1;
            } else {
                i = i / 2;
            }
            counter = counter + 1;
        }

        System.out.println(counter);
    }
}
