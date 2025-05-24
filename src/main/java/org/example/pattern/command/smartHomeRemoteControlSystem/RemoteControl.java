package org.example.pattern.command.smartHomeRemoteControlSystem;

public class RemoteControl {
    private Command slot;
    private Command lastCommand;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressButton() {
        if (slot != null) {
            slot.execute();
            lastCommand = slot;
        } else {
            System.out.println("No command set.");
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("No command to undo.");
        }
    }
}
