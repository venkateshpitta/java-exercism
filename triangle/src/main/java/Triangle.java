public class Triangle {
    private final double a, b, c;
    public Triangle(double a, double b, double c) throws TriangleException {
        if (a <= 0   || b <= 0   || c <= 0 || 
            a+b <= c || a+c <= b || b+c <= a) {
            throw new TriangleException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public TriangleKind getKind() {
        TriangleKind kind;
        if (a == b && a == c && b == c) {
            kind = TriangleKind.EQUILATERAL;
        } else if (a == b || a == c || b == c) {
            kind = TriangleKind.ISOSCELES;
        } else {
            kind = TriangleKind.SCALENE;
        }
        return kind;
    }
}
