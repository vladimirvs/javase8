import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {
  public static void main(String[] args) {
    new MainClass().go();
  }

  private void go() {

    List<String> users = Arrays.asList("Alice", "Bob", "Bob", "Josh", "Zair", "Mat");
    
    map(users);
    distinct(users);
    count(users);
    mapToint(users);
    filterExample(users);
    another(users);
    collectors(users);
   
  }

  
  
  
  
  private void collectors(List<String> users) {
    long c = users.stream().collect(Collectors.counting());
    System.out.println(c);
    
  }

  private void another(List<String> users) {
    List<String> limited = users.stream().limit(4).collect(Collectors.toList());
    System.out.println(limited);
    
  }

  private void map(List<String> users) {
    List<String> uppercased =  users.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println(uppercased);
    
    //or
    uppercased =  users.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
    System.out.println(uppercased);
    
  }

  private void distinct(List<String> users) {
    List<String> usersunique = users.stream().distinct().collect(Collectors.toList());
    usersunique.stream().forEach(System.out::println);
  }

  private void count(List<String> users) {
    System.out.println(users.stream().count());
    
  }
  
  
  


  private void mapToint(List<String> users) {
    users
    .stream()
    .mapToInt(String::length)
    .forEach(System.out::println);
  }

  private void filterExample(List<String> users) {
    
    users
    .stream()
    .filter(x -> x.length() == 4)
    .forEach(x -> System.out.println(x));
  }
}
