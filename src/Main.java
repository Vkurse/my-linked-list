import ru.yandex.practicum.linkedList.Linked;
import ru.yandex.practicum.linkedList.LinkedContainer;

public class Main {

    public static void main(String[] args) {

        Linked<String> list= new LinkedContainer<>();


        list.addLast("Первый");
        list.addLast("Теперь я первый");
        list.addLast("Ласт");
        list.addFirst("qwerty");



        System.out.println(list.size());
        System.out.println(list.getElementByIndex(0));
        System.out.println(list.getElementByIndex(1));
        System.out.println(list.getElementByIndex(2));
        System.out.println(list.getElementByIndex(3));
    }
}
