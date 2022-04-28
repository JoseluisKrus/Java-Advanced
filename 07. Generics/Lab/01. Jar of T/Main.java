public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();
        jar.add(33);
        jar.add(41);
        jar.add(98);

        System.out.println(jar.remove());
    }
}
