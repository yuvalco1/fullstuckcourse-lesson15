package editor;

public class EditorMain {

    public static void main(String[] args) {

        Editor editor = new Editor("This is the first content", "This is the first title", "This is the first author");

        System.out.println(editor.getContent());
        System.out.println(editor.getTitle());
        System.out.println(editor.getAuthor());

        editor.setContent("This is the second content");
        editor.setTitle("This is the second title");
        editor.setAuthor("this is the 2nd Author");

        System.out.println(editor.getContent());
        System.out.println(editor.getTitle());
        System.out.println(editor.getAuthor());


        editor.restoreState();

        System.out.println(editor.getContent());
        System.out.println(editor.getTitle());
        System.out.println(editor.getAuthor());


        editor.restoreState();

        System.out.println(editor.getContent());
        System.out.println(editor.getTitle());
        System.out.println(editor.getAuthor());

        editor.restoreState();

        System.out.println(editor.getContent());
        System.out.println(editor.getTitle());
        System.out.println(editor.getAuthor());
    }
}
