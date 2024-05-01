public class CMYKtoRGB {
    public static void main(String[] args) {
        // white=1−black
        // red=255×white×(1−cyan)
        // green=255×white×(1−magenta)
        // blue=255×white×(1−yellow)

        long white = Math.round((1 - Double.parseDouble(args[3])));
        long red = Math.round((255 * (white * (1 - Double.parseDouble(args[0])))));
        long green = Math.round((255 * (white * (1 - Double.parseDouble(args[1])))));
        long blue = Math.round((255 * (white * (1 - Double.parseDouble(args[2])))));
        System.out.println("red = " + red + "\n green = " + green + "\n blue = " + blue);
    }
}
