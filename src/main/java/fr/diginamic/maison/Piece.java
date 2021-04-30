package fr.diginamic.maison;

public abstract class Piece {
    public int level;
    public int area;

    public Piece(int level, int area) {
        this.level = level;
        this.area = area;
    }

    /**
     * get field
     *
     * @return level
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * set field
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * get field
     *
     * @return area
     */
    public int getArea() {
        return this.area;
    }

    /**
     * set field
     *
     * @param area
     */
    public void setArea(int area) {
        this.area = area;
    }
}
