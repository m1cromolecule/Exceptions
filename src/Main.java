import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static String getCackeKey(int first, String operation, int second) {
        StringBuilder builder = new StringBuilder();
        builder.append(first);
        builder.append(operation);
        builder.append(second);
        return builder.toString();
    }
    public static void main(String[] args) throws AuthenticationException, LoginException, OperatorException {
        Scanner scanner = new Scanner(System.in);
        int first = 0, second = 0;
        String operation = null, resalt = null;

        HashMap<String, String> users = new HashMap<>();
        users.put("bobr", "123");
        users.put("tron", "qwe");
        users.put("kill_bill", "asd");

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        if (!users.containsKey(login)) {
            throw new LoginException();
        }

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (!users.get(login).equals(password)) {
            throw new AuthenticationException();
        }

        if (!users.containsKey(login) | !users.containsValue(password)) {
            throw new AuthenticationException();
        }


        for (int i = 0; i < 1; i++) {
            System.out.println("input first number");
            first = scanner.nextInt();
            System.out.println("input operation symbol");
            operation = scanner.next();
            System.out.println("input second number");
            second = scanner.nextInt();
        }


        switch (operation) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                throw new OperatorException();
        }


        String a = getCackeKey(first, operation, second);

        Map<String, String> map = new HashMap<>();

        if (map.containsKey(getCackeKey(first, operation, second)) && map.containsValue(resalt)) {
            System.out.println(map);
        }

        map.put(a, resalt);
        System.out.println(map);
    }
}