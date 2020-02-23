package hw.hw6.task1;

public class Master {

  private String name;

  private Playable pet;

  public Master(String name, Playable pet) {
    this.name = name;
    this.pet = pet;
  }

  public void playWithOwnPet() {
    this.playWithPet(this.pet);
  }

  public void playWithPet(Playable pet) {
    System.out.print(this.name + " plays with " + pet.getName() + " :");
    pet.play();
  }

  public Playable getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

}
