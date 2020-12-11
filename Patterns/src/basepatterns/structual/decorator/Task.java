package basepatterns.structual.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLeader(new SeniorDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
