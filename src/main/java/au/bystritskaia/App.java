package au.bystritskaia;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Philosopher> philosophers = List.of(
                new Philosopher("Ницше"),
                new Philosopher("Кант"),
                new Philosopher("Платон"),
                new Philosopher("Аристотель"),
                new Philosopher("Сократ")
        );

        philosophers.forEach(philosopher -> new Thread(philosopher).start());
    }
}
