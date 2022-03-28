package fr.lernejo.navy_battle;

public final class Query
{
    private final String url;
    private final String message;

    private final String id;
    public Query(String id, String url, String message)
    {
        this.url = url;
        this.message = message;
        this.id = id;
    }

    public Query()
    {
        this.message = "";
        this.id = "";
        this.url = "";
    }
    public String getUrl() {
        return url;
    }

    public String getMessage() {
        return message;
    }

    public String getId() {
        return id;
    }
}
