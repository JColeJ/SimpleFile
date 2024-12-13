package simple.extension;

import java.nio.file.Path;

import simple.interfaces.ExecuteCommand;

public class ExecutableReadOnlyFile extends ReadableFile implements ExecuteCommand {

  public ExecutableReadOnlyFile(String name, String extension, Path location) {
    super(name, extension, location);
    //TODO Auto-generated constructor stub
  }

  @Override
  public boolean isExecutableFile() {
    return true;
  }

  @Override
  public void doExecute() {
    return;
  }
  
}
