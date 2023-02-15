public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Анастасия";
        post.passport = "8888 № 88888888";
        post.patronymic = "Александровна";
        post.phone = "+7 (999)-111-11-11";
        post.surname = "Александровна";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 27;
        post.birthday.month = 3;
        post.birthday.year = 1994;
    }
}
