package au.bystritskaia;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * Стол
 */
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public final class Table {

    /**
     * Признак занятости
     */
    @Setter
    static boolean busy = false;

    /**
     * Получает статус стола
     * @return Статус
     */
    public static synchronized boolean isBusy() {
        return busy;
    }
}
