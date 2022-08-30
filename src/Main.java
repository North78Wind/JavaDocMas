public class Main {
    public static void main(String[] args) {
      int client = 250;
      int refill = 1755;

      int bonus = 0 ;
      if (refill > 1000) {
          bonus = refill / 100;

          client = client + refill + bonus;

          System.out.println("На Вашем счету: " + client);
          System.out.println("Пришло бонусов: " + bonus);
      }
    }
}