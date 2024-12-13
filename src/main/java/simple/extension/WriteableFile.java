package simple.extension;

import java.nio.file.Path;

import simple.common.SimpleFile;
import simple.interfaces.WriteCommand;

public class WriteableFile extends SimpleFile implements WriteCommand {

  public WriteableFile(String name, String extension, Path location) {
    super(name, extension, location);
    // TODO Auto-generated constructor stub
  }

  public boolean isWriteableFile() {
    return true;
  }

  public void doWrite() {
    return;
  }
}
