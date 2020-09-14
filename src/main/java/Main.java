import services.ParentService;

import java.util.Scanner;

public class Main {
    final static String addParent = "1 Добавить родителя";
    final static String addChild =  "2 Добавить ребенка";
    final static String changeAdress = "Сменить адрес";
    final static String changeSchool = "Сменить школу";
    static Scanner in = new Scanner(System.in);

    public static void main(final String[] args) throws Exception {
        System.out.println("Выберете номер действия: ");
        System.out.println(addParent);
        System.out.println(addChild);

        String mode = in.nextLine();

        if (mode.equals("1")) {
            ParentService ps = new ParentService();
            ps.addParent();
        } else if (mode.equals(addChild)) {

        }

    }
}