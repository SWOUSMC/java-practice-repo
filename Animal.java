public class Animal {
  // Instance variable
  private String species;

  // Default constructor
  public Animal() {
      this.species = "Unknown";
  }

  // Full constructor
  public Animal(String species) {
      this.species = species;
  }

  // Getter method
  public String getSpecies() {
      return species;
  }

  // Setter method
  public void setSpecies(String species) {
      this.species = species;
  }

  // toString method
  @Override
  public String toString() {
      return "Animal [species=" + species + "]";
  }

  // equals method
  @Override
  public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Animal animal = (Animal) obj;
      return species.equals(animal.species);
  }