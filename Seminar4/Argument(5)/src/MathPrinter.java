
public final class MathPrinter {

    @Argument(42)
    public static void printMulTable(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                System.out.print(i + " * " + j + " = " + i * j);
                System.out.print("   ");
            }
            System.out.println();
        }
}
}