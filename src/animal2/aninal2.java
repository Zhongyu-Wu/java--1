package animal2;

public class aninal2 {
    /**private只允许在本类中进行访问
     * public 允许在任意位置访问
     * protected 允许在当前类，同包子类/非子类，跨包子类调用，跨包非子类不允许
     * 默认 允许在当前类，同包子类调用，跨包子类/非子类不允许调用
     */
    private String name;
    private int month;
    private String species;
    public int temp = 15;

    public aninal2(String huahua, int i) {
    }

    public aninal2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat(){
        System.out.println(this.getName()+"eating");
    }
}
