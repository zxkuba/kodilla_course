package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class MainFindFlight {

    public static void main(String[] args) {

        FindFlight find = new FindFlight();

        try {
            Map<Flight, Boolean> zx = find.findFlight(new Flight("Chopina", "Kopernika"));
            zx.entrySet().stream()
                    .map(entry -> entry.getKey() + ", " + entry.getValue())
                    .forEach(System.out::println);
        }catch (RouteNotFoundException e){
            System.out.println("Nie ma połączenia");
        }
/**
 * Nie wiem jak zaimplementować tą logikę które będzie rozróżniła czy danie połączenie jest true czy false. Czy mam
 * zrobić if-a i na sztywno przypisać połączenia, które są true ? Czy jak inaczej to zrobić ? Nie jestem też pewnien czy
 * Flight jako klucz w Map to dobry pomysł. Ogólnie wsadziłem jakąś logikę żeby obsłużyć wyjątki ale jest ona
 * niezgodna  z treścią zadania. Będę wdzięczny za wskazówkę.
 * JK
 */



    }
}
