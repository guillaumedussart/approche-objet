package maps;

public class Employes {
    String name;
    Integer salary;

    public Employes(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return salary
     */
    public Integer getSalary() {
        return this.salary;
    }

    /**
     * set field
     *
     * @param salary
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
