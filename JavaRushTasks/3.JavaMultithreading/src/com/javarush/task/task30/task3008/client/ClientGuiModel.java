package com.javarush.task.task30.task3008.client;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Egor on 11.10.2017.
 */
public class ClientGuiModel {
    private final Set<String> allUserNames = new HashSet<>();
    private String newMessage;

    public Set<String> getAllUserNames() {

        return Collections.unmodifiableSet(allUserNames);
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    // Добавь метод void addUser(String newUserName), который должен добавлять имя участника во множество, хранящее всех участников
    public void addUser(String newUserName) {

        allUserNames.add(newUserName);
    }


    // Добавь метод void deleteUser(String userName), который будет удалять имя участника из множества
    public void deleteUser(String userName) {

        allUserNames.remove(userName);
    }
}
