public class Employe {

    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;


    Employe(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void voice(){
        System.out.println(name + " Работает в должности: " + position + " Электронный ящик: " + email + " Номер телефона: " + phone + " Заработная плата: " + salary + " Возвраст: " + age);

    }
}
