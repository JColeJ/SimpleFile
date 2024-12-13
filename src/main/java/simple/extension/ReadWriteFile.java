package simple.extension;

import java.nio.file.Path;

import simple.interfaces.WriteCommand;

public class ReadWriteFile extends ReadableFile implements WriteCommand {

  public ReadWriteFile(String name, String extension, Path location) {
    super(name, extension, location);
    // TODO Auto-generated constructor stub
  }


  @Override
  public boolean isWriteableFile() {
    return true;
  }

  @Override
  public void doWrite() {
    return;
  }

}