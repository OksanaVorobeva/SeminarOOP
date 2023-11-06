package seminar5Kostik.model;

import java.time.LocalDate;

public class Note {
    private LocalDate date;
    private String text;

    public Note(String text) {
        this.text = text;
        this.date = LocalDate.now();
    }

    public String toString() {
        String var10000 = String.valueOf(this.date);
        return var10000 + ": " + this.text;
    }
}
