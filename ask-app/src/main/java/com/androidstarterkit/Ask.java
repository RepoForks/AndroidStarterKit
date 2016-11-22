package com.androidstarterkit;

import com.androidstarterkit.command.CommandParser;
import com.androidstarterkit.command.TabType;
import com.androidstarterkit.command.WidgetType;
import com.androidstarterkit.module.SampleModule;
import com.androidstarterkit.util.Console;

import java.util.List;

public class Ask {

  public static void main(String[] args) {
    CommandParser commandParser;
    try {
      commandParser = new CommandParser(args);
    } catch (CommandException e) {
      Console.log(e);
      return;
    }

    if (commandParser.hasHelpCommand()) {
      Console.printHelp();
      return;
    }

    final String projectPath = commandParser.getPath();
    final TabType tabType = commandParser.getTabType();
    final List<WidgetType> widgets = commandParser.getWidgets();

    SampleModule sampleModule;
    try {
      sampleModule = SampleModule
          .load(projectPath)
          .with(tabType, widgets);
    } catch (CommandException e) {
      Console.log(e);
      return;
    }

    System.out.println("Project path : " + sampleModule.getPath());
  }
}
