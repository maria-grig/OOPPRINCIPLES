public class Main {
public static void main (String[] args) {
    Post post = new Post();
    post.name = "Иван";
    post.passport = "серия 1212 № 121212";
    post.patronymic = "Иванович";
    post.phone = "+79117267828";
    post.surname = "Иванов";
    post.subscription = true;
    post.birthday = new FormDate();
    post.birthday.day = 13;
    post.birthday.month = 10;
    post.birthday.year = 2000;
}
}

