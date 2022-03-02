package de.fherfurt.Campus.test;

import static de.fherfurt.Campus.Main.*;
import static org.junit.jupiter.api.Assertions.*;

import de.fherfurt.Campus.Room;
import de.fherfurt.Campus.DataCollector;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RoomTest {

    DataCollector Collector = new DataCollector();

    private final List<String> Persons = new ArrayList<>();

    Room MyRoom = new Room("Room1", 1, Persons, "Haus 1", Collector);

    @Test
    @DisplayName("Function to set title works fine.")
    void testSetTitleForRoom(){
        String NewTitle = "Room2";
        MyRoom.setTitleForRoom(NewTitle, Collector);

        assertEquals(MyRoom.getRoomTitle(), Collector.RoomData.get(MyRoom.getRoomTitle()).get(TITLE).get(0));
    }

    @Test
    @DisplayName("Function to set floor works fine.")
    void testSetFloorForRoom(){
        Integer NewFloor = 2;
        MyRoom.setFloorForRoom(NewFloor, Collector);

        assertEquals(MyRoom.getFloorNumber().toString(), Collector.RoomData.get(MyRoom.getFloorNumber()).get(FLOOR).get(0));
    }
}