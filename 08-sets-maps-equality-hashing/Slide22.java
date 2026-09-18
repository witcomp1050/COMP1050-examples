import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Slide22 {
    public static void main(String[] args) {
        Tag t = new Tag("urgent");
        Set<Tag> tags = new HashSet<>(Set.of(t));
        t.name = "normal";
        System.out.println(tags.contains(t));
        System.out.println(tags.size());
    }
}

final class Tag {
    String name;
    Tag(String name) { this.name = name; }
    @Override public boolean equals(Object o) { return o instanceof Tag other && name.equals(other.name); }
    @Override public int hashCode() { return Objects.hash(name); }
}
