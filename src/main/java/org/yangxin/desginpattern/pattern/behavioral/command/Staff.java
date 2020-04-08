package org.yangxin.desginpattern.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxin
 * 2020/04/08 20:41
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        commandList.forEach(Command::execute);
        commandList.clear();
    }
}
