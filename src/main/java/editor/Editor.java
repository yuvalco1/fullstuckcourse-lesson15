package editor;

import java.util.Stack;

public class Editor {

    private String content;

    private String title;

    private String author;

    private Stack<EditorState> stateHistoy = new Stack<>();

    public Editor(String content, String title, String author) {

        this.content = content;
        this.title = title;
        this.author = author;
        createState(content, title , author);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        createState(content, this.title , this.author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        createState(this.content, title , this.author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        createState(this.content, this.title , author);
    }


    private void createState(String content, String title, String author) {
        stateHistoy.push(new EditorState(content, title, author));
    }


    public void restoreState() {
        stateHistoy.pop();
        EditorState editorState = stateHistoy.peek();
        this.content = editorState.getContent();
        this.title = editorState.getTitle();
        this.author = editorState.getAuthor();
    }
}
