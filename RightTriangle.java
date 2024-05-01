public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean d = ((c * c) == (a * a) + (b * b)) || ((a * a) == (b * b) + (c * c)) || ((b * b)
                == (a * a) + (c * c));
        System.out.println(d);
    }
}
