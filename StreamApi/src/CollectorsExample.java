import java.util.Arrays;
import java.util.List;
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
    System.out.println("Average length: "+avgLength);
  }

  private void counting(List<String> users) {
    long c = users.stream().collect(Collectors.counting());
    System.out.println(c);
  }
}
