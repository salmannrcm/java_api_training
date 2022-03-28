package fr.lernejo.navy_battle;

public final class Query
{
    private final String url;
    private final String message;

    private final String id;

    //private final String consequence;
    //private final boolean shipLeft;


    public Query(String id, String url, String message)
    {
        this.url = url;
        this.message = message;
        this.id = id;
    }

    /*public Query2(String consequence, boolean shipLeft)
    {
        this.consequence =consequence;
        this.shipLeft = shipLeft;
    }

    public Query2()
    {
        this.consequence = "";
        this.shipLeft = false;
    }*/

    /*public String getConsequence()
    {
        return consequence;
    }

    public boolean DidShipLeft()
    {
        return shipLeft;
    }*/
    
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
