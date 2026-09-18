public class Slide81 {
    public static void main(String[] args) {
        String line = "30,45,0,15";
        String[] parts = line.split(",");
        System.out.println(parts.length);
        
        int total = 0;
        for (String part : parts) {
            total += Integer.parseInt(part.trim());
        }
        System.out.println(total);
        
        String[] words = "to be or not to be".split(" ");
        System.out.println(words[2] + " " + words.length);
        System.out.println(String.join("-", words));
    }
}
