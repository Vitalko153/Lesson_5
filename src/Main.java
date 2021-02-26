public class Main {

public static void main(String arg[]){
        Employe[] personal = new Employe[5];
        personal[0] = new Employe("Пушкин Александр", "писатель", "apushkin@mail.ru", "89005002134", 30000, 32);
        personal[1] = new Employe("Лев Толстой", "философ", "TolstiiLev@mail.ru", "89804235434", 60000, 43);
        personal[2] = new Employe("Геннадий Лещенко", "скульптор", "Lesha@mail.ru", "89523648134", 25000, 58);
        personal[3] = new Employe("Мустафа Исламович", "политик", "Mustafa@mail.ru", "8984004364", 450000, 28);
        personal[4] = new Employe("Виктор Преживальский", "солдат", "Pre*avVi@mail.ru", "8854236934", 33000, 37);

        for(int x = 0; x < personal.length; x++){
                if(personal[x].age > 40){
                        personal[x].voice();
                }
        }
}



}

