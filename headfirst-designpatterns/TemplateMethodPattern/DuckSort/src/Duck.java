public class Duck implements Comparable<Duck> {
    String name;
    int weight; // Duck에는 이름과 체중이 부여된다.

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "체중: " + weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        // sort() 메소드에 필요로 하는 것
        // compareTo() 메소드는 다른 Duck 객체를
        // 인자로 받아서 이 객체와 비교한다.

        // Duck 객체들을 비교하는 방법이 들어이쓴ㄴ 부분.
        // 이 오리의 무게가 otherDuck보다 가벼우면 01을,
        // 무거우면 1을, 무게가 같으면 0을 리턴한다.
        if(this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight
            return 1;
        }
    }
}
