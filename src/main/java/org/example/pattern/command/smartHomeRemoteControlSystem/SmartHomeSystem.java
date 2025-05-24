package org.example.pattern.command.smartHomeRemoteControlSystem;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a light object
        Light livingRoomLight = new Light();

        // Create a command to turn on the light
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // Create macro commands
        Command partyMode = new MacroCommand(Arrays.asList(lightOnCommand));


        // Create a remote control and set the command
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOnCommand);

        // Execute the command to turn on the light
        remoteControl.pressButton();
        remoteControl.pressUndo();

        remoteControl.setCommand(partyMode);
        remoteControl.pressButton();
        remoteControl.pressUndo();

    }
}