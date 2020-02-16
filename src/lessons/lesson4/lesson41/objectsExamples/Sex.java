package lessons.lesson4.lesson41.objectsExamples;

public enum Sex {

  MALE(false),
  FEMALE(false),
  UNKNOWN(true);

  Sex(boolean wasChanged) {
    this.wasChanged = wasChanged;
  }

  private boolean wasChanged;

  public boolean isWasChanged() {
    return wasChanged;
  }

  public void setWasChanged(boolean wasChanged) {
    this.wasChanged = wasChanged;
  }
}
