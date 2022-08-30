public class Main {
    public static void main(String[] orgs) {
        int client = 250;
        int refill = 1755;
        int bonus = refill > 1000 ? refill / 100 : 0;

        client = client + refill + bonus;
        System.out.println("На Вашем счету: " + client);
        System.out.println("Пришло бонусов: " + bonus);
    }
}

