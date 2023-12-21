package au.bystritskaia;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Philosopher implements Runnable{

    String name;

    public synchronized void eat() {
        System.out.println("Философ '%s' ест".formatted(this.name));
        try {
            Thread.sleep(500);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void think() {
        System.out.println("Философ '%s' думает".formatted(this.name));
        try {
            Thread.sleep(500);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            think();
            eat();
        }
    }

}
