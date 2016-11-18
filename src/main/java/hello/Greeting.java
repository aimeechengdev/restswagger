package hello;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    public Greeting() {
        this.id = 100;
        this.content = "contentcb";
    }
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
