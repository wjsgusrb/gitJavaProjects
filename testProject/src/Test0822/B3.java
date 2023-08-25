package Test0822;



public class B3  {

    private String name;
    private int kcal;

 
    public B3() {
    }

    public B3(String name, int kcal) {
        this.name = name;
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }
    public int getKcal() {
        return kcal;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String toString() {
        return "name=" + name + ", kcal=" + kcal;
    }
}
