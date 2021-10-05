package com.family;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PetTest {

  Pet Gosha = new Pet(Species.PARROT, "Gosha");


  @Test
 public void testPetToStringSuccess() {
    String expected = "parrot{nickname=Gosha, age=0, trickLevel=0, habits=null}";
    assertEquals(expected, Gosha.toString());
  }
}
