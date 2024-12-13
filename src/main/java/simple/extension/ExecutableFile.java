package simple.extension;

import java.nio.file.Path;

import simple.common.SimpleFile;
import simple.interfaces.ExecuteCommand;

public class ExecutableFile extends SimpleFile implements ExecuteCommand {

  public ExecutableFile(String name, String extension, Path location) {
    super(name, extension, location);
    //TODO Auto-generated constructor stub
  }


  public boolean isExecutableFile() {
    return true;
  }

  public void doExecute() {
    return;
  }


}