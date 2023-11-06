package seminar5Kostik.model;

public class Service {
    private NoteBook noteBook = new NoteBook();

    public Service() {
    }

    public void addNote(String text) {
        Note note = new Note(text);
        this.noteBook.addNote(note);
    }

    public String getNotes() {
        return this.noteBook.getNotes().toString();
    }
}
