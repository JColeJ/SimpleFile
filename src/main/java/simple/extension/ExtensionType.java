package simple.extension;

public enum ExtensionType {
  READ, WRITE, EXECUTE;

  public String getExecutionMethod() {
    String type = this.toString();
    return "do" + type.substring(0,1).toUpperCase() + type.substring(1).toLowerCase();
  }
}
