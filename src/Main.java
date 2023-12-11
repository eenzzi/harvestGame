import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Vegetable[] field = new Vegetable[5];

    public static void main(String[] args)  {

        while (true) {
            System.out.println("1. 심기 2. 물주기 3. 팔기 4. 종료");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    plant();
                    break;
                case 2:
                    water();
                    break;
                case 3:
                    sell();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }

    }

    static void plant() {

        for (int i = 0; i < field.length; i++) {
            System.out.println((i + 1) + "번 밭에 어떤 작물을 심을지 선택하세요.");
            System.out.println("1.당근 2.배추 3.무");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    field[i] = new Carrot(i);
                    break;
                case 2:
                    field[i] = new Cabbage(i);
                    break;
                case 3:
                    field[i] = new Radish(i);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    i--; // 잘못된 입력 처리
                    break;
            }
        }
    }

    static void water() {
        System.out.println("어떤 밭에 물을 줄지 선택하세요.");
        int input = sc.nextInt() - 1;

        if (field[input] != null) {
            field[input].water();
        } else {
            System.out.println("작물을 심어주세요.");
        }
    }

    static void sell() {
        System.out.println("어떤 밭의 작물을 팔지 선택하세요.");
        int input = sc.nextInt() - 1;

        if (field[input] != null) {
            boolean sold = field[input].sell();
            if (sold) {
                field[input] = null;
            } else {
                System.out.println("작물을 팔 수 없습니다.");
            }
        } else {
            System.out.println("작물을 심어주세요.");
        }

    }
}