package seminar5Kostik.model;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Note> notes = new ArrayList();

    public NoteBook() {
    }

    public void addNote(Note note) {

        this.notes.add(note);
    }

    public List<Note> getNotes() {
        return this.notes;
    }
}
