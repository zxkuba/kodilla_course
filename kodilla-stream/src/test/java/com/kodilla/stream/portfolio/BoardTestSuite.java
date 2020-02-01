package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoardTestSuite {



    public Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");
        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));
        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);

        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);

        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);
        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    public void testAddTaskList() {
        //Given
        Board project = prepareTestData();
        //When

        //Then
        Assert.assertEquals(3, project.getTaskLists().size());
    }
        @Test
    public void testAddTaskListFindUsersTasks(){
        //Given
        Board project = prepareTestData();
        //When
            User user = new User("developer1", "John Smith");
            List<Task> tasks = project.getTaskLists().stream()
                    .flatMap(k->k.getTasks().stream())
                    .filter(g->g.getAssignedUser().equals(user))
                    .collect(Collectors.toList());
            //Then
            Assert.assertEquals(2, tasks.size());
            Assert.assertEquals(user, tasks.get(0).getAssignedUser());
            Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }
    @Test
    public void testAddTaskListFindOutdatedTasks(){
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(d->d.getTasks().stream())
                .filter(a->a.getDeadline().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
        //Then
        //Then
        Assert.assertEquals(1, tasks.size());
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());

        }
    @Test
    public void testAddTaskListFindLongTasks(){
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTask  = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(f-> f.getTasks().stream())
                .map(c-> c.getCreated())
                .filter(r-> r.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();
        //Then
        Assert.assertEquals(2, longTask);
    }
    /**Zadanie nr 7.6

     uznałem, że najlepszą drogą do wykonia tego zadania będzie popbranie Listy inProgresTask aż do getCreated, ale
     brakuje mi tu  getDeadline no i nie wiem jak się tym czasem obsłużyć definitywnie. Z góry dzięki za pomoc.
     JK

    @Test
    public void testAddTaskListAverageWorkingOnTask(){
        //Given
        Board project = prepareTestData();
        //When
       List<TaskList> inProgressTasks = new ArrayList<>();
       inProgressTasks.add(new TaskList("In progress"));
        long longTask  = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(f->f.getTasks().stream())
                .map(c->c.getCreated())
                .filter()
        //Then
            */





    }

