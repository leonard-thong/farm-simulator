package Class;

import org.jetbrains.annotations.NotNull;

public class Player {
    private int  money;
    private String season, diff, seed, name;
    private String[] inventory;

    public Player() {
        this(0, 20, "Normal", null, null, null);
    }

    public Player( int inventorySize, int money, String diff, String startingSeason, String startingSeed, String name) {
        this.setDiff(diff);
        this.inventory = new String[inventorySize];
        this.money = money;
        this.season = startingSeason;
        this.seed = startingSeed;
        this.name = name;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(@NotNull String diff) {
        this.diff = diff;

        switch (diff) {
            case "Easy":
                this.setMoney(100);
                break;
            case "Normal":
                this.setMoney(50);
                break;
            case "Hard":
                this.setMoney(25);
                break;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getStartingSeed() {
        return seed;
    }

    public void setSeed(String startingSeed) {
        this.seed = startingSeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
