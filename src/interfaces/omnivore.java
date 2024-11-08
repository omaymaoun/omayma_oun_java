package interfaces;

public interface omnivore <T> extends carnivore<T>,herbivore<T>{
   void eatPlantAndMeet(T food);

}
