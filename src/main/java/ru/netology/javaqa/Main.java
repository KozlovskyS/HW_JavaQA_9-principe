package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Иван";
        post.patronymic = "Макарович";
        post.surname = "Сидоров";
        post.passport = "1234 № 123456";
        post.phone = "+7 (123) 000-98-76";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 1999;
    }
}
