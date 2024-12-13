package simple;

import simple.extension.ExecutableFile;
import simple.extension.ExecutableReadOnlyFile;
import simple.extension.ExecutableReadWriteFile;
import simple.extension.ExtensionType;
import simple.extension.ReadableFile;
import simple.extension.ReadWriteFile;
import simple.common.SimpleFile;
import java.nio.file.Path;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    final Path directoryPath = Path.of("E:\\Java Code\\Abstraction\\simple-file-app\\src\\main\\java\\simple");
    List<SimpleFile> simpleFiles = List.of(new ExecutableFile("executableFile", ".exe", directoryPath),
        new ExecutableReadOnlyFile("executableReadOnlyFile", ".exe", directoryPath),
        new ExecutableReadWriteFile("executableReadWriteFile", ".exe", directoryPath),
        new ReadableFile("readOnlyFile", ".txt", directoryPath),
        new ReadWriteFile("readWriteFile", ".txt", directoryPath)

    );

    simpleFiles.stream().map(file -> file.getClass()).forEach(fileClass -> getSupportedMethods(fileClass));
  }

  private static void getSupportedMethods(Class<?> fileClass) {
    System.out.println("Class: " + fileClass.getSimpleName());

    List.of(ExtensionType.values()).forEach(type -> {
      if (hasMethod(fileClass, type))
        System.out.println("Supports " + type);
    });
  }

  private static boolean hasMethod(Class<?> clazz, ExtensionType type) {
    return !List.of(clazz.getMethods()).stream().filter(method -> method.getName().equals(type.getExecutionMethod()))
        .toList().isEmpty();
  }
}

// TO DO:

// Use Streams to print out specific use cases/questions around files that are
// contained within the list above
// print out do doRead, doWrite, doExecute in all respective classes.
// how to figure out if a specific class/file implements a certain
// method/interface - which can be used for our System.out.println statements.
