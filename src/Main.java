public class Main {

    public static void main(String[] args) {
           Firm f=new Firm();
             f.setNameFirma("Google");
           Department d=new Department();
             d.setNameFirma("Google");
             d.setNameDep("Statistic");
             d.setCount(20);
           Employee e=new Employee();
             e.setNameFirma("Google");
             e.setJobTitle("Manager");
             e.setNameDep("Statistic");
             e.setCount(20);
             e.setSalary(2500);
             e.setFullName("Aleksand Sergeyevich Ivanov");
             e.setShtat(true);
            Firm [] frm=new Firm[10];//определяем массив из 10 обїектов
            for (int i=0; i<frm.length; i++) {
                frm[i]=new Firm("Firma-"+i); //создаем объекты
               // frm[i].Vivod();
            }
    }
}


