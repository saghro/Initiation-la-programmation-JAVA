
package serie4.ex3;

public class Ex3 {

    public static void main(String[] args) {
       Chef chf  = new Chef("yuba", "saghru", 8000 , 1000);
        System.out.println(chf.getSalaire()+" DH");
        Employer emp = new Employer("khalid", "rafiq", 5000);
        System.out.println(emp.getSalaire()+" DH");
    }
}
