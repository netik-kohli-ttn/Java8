import java.util.Optional;

public class ExerciseOptional {
    public Optional<String> getting(){
        String val = null;
        return Optional.ofNullable(val);
    }

    public static void main(String[] args) {
        Optional<String> op = new ExerciseOptional().getting();

        op.ifPresent(System.out::println);

        Optional<String> name = Optional.empty();
        System.out.println(name.orElse("To The New"));

    }
}
