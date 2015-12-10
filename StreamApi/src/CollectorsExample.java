import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsExample {
  public static void main(String[] args) {
    new CollectorsExample().go();
  }

  private void go() {
    List<String> users = Arrays.asList("Alice", "Bob", "Bob", "Josh", "Zair", "Mat");
    counting(users);
    averageDouble(users);
    joinedList(users);
    third(users);

    // Good
    users.stream().filter((String a) -> a.length() == 5);
    // Better
    users.stream().filter((a) -> a.length() == 5);
    // Best
    users.stream().filter(a -> a.length() == 5);

    // Good
    users.stream().map(x -> {
      return x.toUpperCase();
    });
    // Better
    users.stream().map(x -> getUpper(x));
    // Best
    users.stream().map(x -> x.toUpperCase());

    // Correct
    Optional<String> str = getMyString();
    str.orElse("NO VALUE");

    // Incorrect
    if (!str.isPresent()) {
      str = Optional.of("NO VALUE");
    }

  }

  Optional<String> getMyString() {
    return Optional.of("Hello");
  }

  String getUpper(String s) {
    return s.toUpperCase();
  }

  private void third(List<String> users) {
    users.stream().collect(Collectors.reducing(null));

  }

  private void joinedList(List<String> users) {

    String joined = users.stream().collect(Collectors.joining("|"));
    System.out.println(joined);

  }

  private void averageDouble(List<String> users) {
    double avgLength = users.stream().collect(Collectors.averagingDouble(String::length));
    System.out.println("Average length: " + avgLength);
  }

  private void counting(List<String> users) {
    long c = users.stream().collect(Collectors.counting());
    System.out.println(c);
  }
}
