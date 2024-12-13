package simple.common;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class SimpleFile {

  private String name;
  private String extension;
  private Path location;
  private String data;
  private String charset;

  private LocalDateTime creationDate;
  private LocalDateTime lastModifiedDate;
  private LocalDateTime deletionDate;
  private LocalDateTime lastAccessedDate;

  public SimpleFile(String name, String extension, Path location) {
    this.name = name;
    this.extension = extension;
    this.location = location;
    this.charset = "UTF-8";
    this.creationDate = LocalDateTime.now();
  }

  public SimpleFile(String name, String extension, Path location, String data) {
    this(name, extension, location);
    this.data = data;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getExtension() {
    return extension;
  }

  public void setExtension(String name) {
    this.extension = extension;
  }

  public Path getLocation() {
    return location;
  }

  public void setLocation(String name) {
    this.location = location;
  }

  public String getData() {
    return data;
  }

  public void setData(String name) {
    this.data = data;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public LocalDateTime getlastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public LocalDateTime getdeletionDate() {
    return deletionDate;
  }

  public void setDeletionDate(LocalDateTime deletionDate) {
    this.deletionDate = deletionDate;
  }

  public LocalDateTime getlastAccessedDate() {
    return lastAccessedDate;
  }

  public void setLastAccessedDate(LocalDateTime lastAccessedDate) {
    this.lastAccessedDate = lastAccessedDate;
  }

  public long getSize() {
    byte[] utf8Bytes = data.getBytes(StandardCharsets.UTF_8);

    return utf8Bytes.length;
  }

  public boolean isPresent() {
    return deletionDate != null;
  }

  public boolean isValid() {
    return data.lastIndexOf('\u001a') == (data.length() - 1);
  }

}