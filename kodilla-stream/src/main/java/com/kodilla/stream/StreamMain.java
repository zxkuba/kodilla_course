package com.kodilla.stream;



import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.util.Map;
import java.util.stream.Collectors;



public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
                .filter(s->s.getSex()=='M')
                .filter(d->d.getNumbersOfPost()>1)

                //Nie wiem jak z tą datą urodzin sobie poradzić
               //.map(z->z.getBirthDate())
               // .filter(forumUser->forumUser.compareTo(LocalDate.now().minusYears(20)) <= 0)

                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

                theResultMapOfForumUser.entrySet().stream()
                        .map(e->e.getKey() + " "+e.getValue())
                        .forEach(System.out::println);
    }
}

