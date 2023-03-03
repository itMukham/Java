public class Department extends Firm{
    private String nameDep; //название отдела
    private int count; //кол-во сотрудников
  //  String nameFirm; //наименование фирмы
    private boolean shtat;

    public boolean isShtat() {
        return shtat;
    }
    public void setShtat(boolean shtat) {
        this.shtat = shtat;
    }


    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Department() {
  }
    public Department(String nameDep, int count) {
        this.nameDep = nameDep;
        this.count = count;
    }

    public Department(String nameFirma, String nameDep, int count) {
        super(nameFirma);
        this.nameDep = nameDep;
        this.count = count;
    }

}

