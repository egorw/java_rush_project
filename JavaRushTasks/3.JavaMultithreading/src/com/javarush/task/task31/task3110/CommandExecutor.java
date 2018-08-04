package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.*;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Egor on 15.10.2017.
 */
public class CommandExecutor {
    private final static Map<Operation, Command> allKnownCommandsMap = new HashMap<Operation, Command>();

    static {

            allKnownCommandsMap.put(Operation.CREATE, new ZipCreateCommand());
            allKnownCommandsMap.put(Operation.ADD, new ZipAddCommand());
            allKnownCommandsMap.put(Operation.REMOVE, new ZipRemoveCommand());
            allKnownCommandsMap.put(Operation.EXTRACT, new ZipExtractCommand());
            allKnownCommandsMap.put(Operation.CONTENT, new ZipContentCommand());
            allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
    }

    private CommandExecutor(){

    }

    public static void execute(Operation operation) throws Exception {
        allKnownCommandsMap.get(operation).execute();
    }

}
