import java.util.Scanner;

class JaggedArray {
    int[][] marks;
    String[] childNames = { "Child1", "Child2", "Child3", "Child4", "Child5" };
    int[] subjects = { 3, 5, 2, 6, 4 };

    JaggedArray() {
        marks = new int[5][];
        for (int i = 0; i < 5; i++) {
            marks[i] = new int[subjects[i]];
        }
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(childNames[i] + "(" + subjects[i] + "subjects):");
            for (int j = 0; j < subjects[i]; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
    }

    void showRowWise() {
        System.out.println("---- Marks Row-wise ----");
        for (int i = 0; i < 5; i++) {
            System.out.print(childNames[i] + ":");
            for (int j = 0; j < subjects[i]; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    void showTotal() {
        System.out.println("---- Total Marks ----");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < subjects[i]; j++) {
                total += marks[i][j];
            }
            System.out.println(childNames[i] + "=" + total);
        }
    }

    void countAbove80() {
        System.out.println("---- Marks>80 ----");
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < subjects[i]; j++) {
                if (marks[i][j] > 80)
                    count++;
            }
            System.out.println(childNames[i] + ":" + count);
        }
    }

    void showBelow30() {
        System.out.println("---- Marks < 30 (Needs Preparation) ----");
        for (int i = 0; i < 5; i++) {
            System.out.print(childNames[i] + ":");
            boolean first = true;
            for (int j = 0; j < subjects[i]; j++) {
                if (marks[i][j] < 30) {
                    if (!first)
                        System.out.print(",");
                    System.out.print(marks[i][j]);
                    first = false;
                }
            }
            System.out.println();
        }
    }
}

class Assignment12 {
    public static void main(String[] args) {
        JaggedArray ja = new JaggedArray();
        ja.input();
        ja.showRowWise();
        ja.showTotal();
        ja.countAbove80();
        ja.showBelow30();
    }
}