package fr.lernejo.navy_battle;

public final class Query {
    private final String id;
    private final String url;
    private final String message;

    public Query(String id, String url, String message) {
        this.id = id;
        this.url = url;
        this.message = message;
    }

    public Query() {
        this.id = "";
        this.url = "";
        this.message = "";
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getMessage() {
        return message;
    }
}
