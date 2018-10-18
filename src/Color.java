public class Color extends CardAttribute {
  enum COLOR_VALUES{
    RED,
    BLUE,
    YELLOW,
    WHITE,
    GREEN
  }

  public String getString() {
    return toString().toLowerCase();
  }
}
