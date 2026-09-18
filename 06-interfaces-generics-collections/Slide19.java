public class Slide19 {
    public static void main(String[] args) {
        Box<Integer> answer = new Box<>(42);
        Box<String> name = new Box<>("Ada");
        int doubled = answer.content() * 2;
        System.out.println(doubled);
        System.out.println(name.content().length());
    }
}

class Box<T> {
    private final T content;
    Box(T content) { this.content = content; }
    T content() { return content; }
}
