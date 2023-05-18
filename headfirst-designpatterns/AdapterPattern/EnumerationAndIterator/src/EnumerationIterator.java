import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {
    // Enumeration을 Iterator에 적응시키고
    // 있기에 어댑터는 Iterator 인터페이스를
    // 구현해야 한다. 겉에서 봤을 때 Iterator 처럼
    // 생겨야 하기 때문이다.
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        // 적응시켜야 하는 Enumeration 객체.
        // 구성을 활용하고 있기에 인스턴스 변수에 저장한다.
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        // Iterator의 hasNext() 메소드는 Enumeration의 hasMoreElements() 메소드로 연결한다.
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        // Iterator의 next() 메소드는 Enumeration의 nextEl;ement() 메소드로 연결한다.
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        // 안타깝게 Iterator의 remove() 메소드는 지원되지 않아 포기해야한다.
        // 여기서는 예외를 던지도록 했다.
        throw new UnsupportedOperationException();
    }
}
