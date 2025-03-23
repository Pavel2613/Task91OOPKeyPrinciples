public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван"; // Имя
        post.surname = "Иванов"; // Фамилия
        post.patronymic = "Иванович"; // Отчество
        post.telephone = "+7(900)000-00-00"; // номер телефона
        post.passport = "0000 №000000"; // номер паспорта
        post.subscription = true; // наличие подписки
        post.birthday = new FormDate();
        post.birthday.day = 13; // день рождения
        post.birthday.month = 1; // месяц рождения
        post.birthday.year = 2000; // год рождения

    }
}
