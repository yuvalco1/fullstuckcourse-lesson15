package editor;

public class EditorState {

    private final String content;

    private final String title;

    private final String author;

    public EditorState(String content, String title , String author) {

        this.content = content;
        this.title = title;
        this.author = author;

    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() { return author;}

    }

