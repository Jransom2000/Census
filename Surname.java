package edu.cscc;

public class Surname {
    private String name;
    private int rank;
    private int count;
    private double proportion;



    // TODO - Add constructor

    /**
     *
     * @param name parameter name
     * @param rank parameter rank
     * @param count parameter count
     * @param proportion parameter proportion
     */
    public Surname(String name, int rank, int count, double proportion) {
        this.name = name;
        this.rank = rank;
        this.count = count;
        this.proportion = proportion;
    }


    // TODO - Add getters and setters

    /**
     *
     * @return get name
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @param name set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return get count
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @param count set count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     *
     * @return get the rank
     */

    public int getRank() {
        return rank;
    }

    /**
     *
     * @param rank set the rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     *
     * @return get the proportion
     */
    public double getProportion() {
        return proportion;
    }

    /**
     *
     * @param proportion set the proportion variable
     */
    public void setProportion(double proportion) {
        this.proportion = proportion;
    }
}
