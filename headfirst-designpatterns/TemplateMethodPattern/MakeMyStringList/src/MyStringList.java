import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    // AbstractList를 확장해서 나만의 리스트를 만든다.
    private String [] myList;

    @Override
    public String get(int index) {
        // subList() 템플릿 메소드에서 사용하는 get()과 size() 메소드를 구현해야 한다.
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        // 리스트를 수정할 수 있도록 set() 메소드로 구현한다.
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }
}
