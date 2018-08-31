package de.cdelmonte.schedulerservice.model;

public class Message {

  private String id;
  private String text;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "Message [id=" + id + ", text=" + text + "]";
  }
}