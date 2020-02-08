package lessons.lesson4;

public enum Sex//Константы (через запятую)
{
    MALE(false),
    FEMALE(false),
    UNKNOWN(true);

    Sex(boolean wasChange)
    {
        this.wasChange = wasChange;
    }

    private boolean wasChange;

    public boolean iswasChange()
    {
        return wasChange;
    }


}
