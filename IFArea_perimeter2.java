import java.util.Scanner;

interface ishape {
    double area();
    double perimeter();
}

class rectangle implements ishape {
    double l, b;

    public rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }

    public double perimeter() {
        return 2 * (l + b);
    }
}

class circle implements ishape {
    double r;

    public circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

class IFArea_perimeter2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter no.of.objects");
            int n = scanner.nextInt();
            ishape obj[] = new ishape[n];
            for (int i = 0; i < n; i++) {
                System.out.println("1.Rectangle\n2.Circle");
                int ch = scanner.nextInt();
                if (ch == 1) {
                    System.out.println("Enter l and b");
                    double l = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    obj[i] = new rectangle(l, b);
                } else {
                    System.out.println("Enter r");
                    double r = scanner.nextDouble();
                    obj[i] = new circle(r);
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Area: " + obj[i].area());
                System.out.println("Perimeter: " + obj[i].perimeter());
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}
