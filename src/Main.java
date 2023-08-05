import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
// Задание 1  Дан List ‹String› names. Удалите первую букву из каждого имени и верните отсортированный список.
        List<String> names = List.of("Hello", "world", "", "I", "like", "java");
        System.out.println(names);
        List<String> newNames = names.stream()
                .filter(s -> !s.isEmpty())
                .map(s -> s.substring(1))
                .filter(s -> !s.isEmpty())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newNames);

// Задание 2  Переворачиваем массив
        int[]arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        int x;
        int size = arr.length;
        for (int i = 0; i < size/2; i++) {
            x = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = x;
        }
        System.out.println(Arrays.toString(arr));

/*  Задание 11 Дан массив строк, необходимо удалить из него все дубли,
оставшиеся строки объединить в одну в порядке следования в массиве.  */
        String[] str = {"Привет", ", ", "МИР", "Привет", "МИР", "!", "МИР", "Привет", "МИР", "!"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i].isEmpty()) continue;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    str[j] = "";                                    //   удаляем дубли
                }
            }
            sb.append(str[i]);
        }
        System.out.println(sb);
    }
}
