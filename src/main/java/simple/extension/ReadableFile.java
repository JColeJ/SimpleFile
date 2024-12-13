package simple.extension;

import java.nio.file.Path;

import simple.common.SimpleFile;
import simple.interfaces.ReadCommand;

public class ReadableFile extends SimpleFile implements ReadCommand {

  public ReadableFile(String name, String extension, Path location) {
    super(name, extension, location);
    // TODO Auto-generated constructor stub
  }

  public void doRead() {
    return;

  }

  public boolean isReadableFile() {
    return true;
  }
}
