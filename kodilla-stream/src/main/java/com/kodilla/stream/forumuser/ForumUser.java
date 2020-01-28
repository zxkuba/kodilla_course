package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int idUser;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numbersOfPost;

    public ForumUser(int idUser, String userName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth
            , int numbersOfPost) {
        this.idUser = idUser;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numbersOfPost = numbersOfPost;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumbersOfPost() {
        return numbersOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numbersOfPost=" + numbersOfPost +
                '}';
    }
}
