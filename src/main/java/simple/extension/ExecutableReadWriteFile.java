package simple.extension;

import java.nio.file.Path;

import simple.interfaces.ExecuteCommand;
import simple.interfaces.WriteCommand;

public class ExecutableReadWriteFile extends ReadableFile
    implements ExecuteCommand, WriteCommand {

  public ExecutableReadWriteFile(String name, String extension, Path location) {
    super(name, extension, location);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void doRead() {
    return;
  }

  @Override
  public boolean isWriteableFile() {
    return true;
  }

  @Override
  public void doWrite() {
    return;
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