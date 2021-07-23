public class Employee {

         String name;
         String emp_id;
         int salary;

        Employee(String name, String emp_id, int salary)
        {
            this.name=name;
            this.emp_id=emp_id;
            this.salary=salary;
        }

        public void performance() {
            System.out.println(" every year performance");
        }

         public void getextravactiondate() {
             System.out.println("every employess get 10 extra days vacation");
         }
          public void empDisplay()
          {
              System.out.println("Name :" + name);
              System.out.println("emp_id :" + emp_id);
              System.out.println("salary :" + salary);
          }

}
