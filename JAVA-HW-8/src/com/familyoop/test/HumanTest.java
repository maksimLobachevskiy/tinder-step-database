package com.familyoop.test;
import com.familyoop.human.Human;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanTest {
  Human father = new Human("Maksim", "Lobachevskiy", 1984);

  @Test
  public void testHumanToStringSuccess() {
    String expected = "Human{name=Maksim, surname=Lobachevskiy, year=1984, iq=0, schedulenull}";
    assertEquals(expected, father.toString());
  }
}
