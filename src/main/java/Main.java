public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        String res = director.force((count) -> {
            for (int i = 0; i < count; i++) {
                System.out.println("Work...");
            }
            return "success";
        }, 2);

        System.out.println(res);

    }
}