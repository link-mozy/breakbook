import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{
    @Override
    protected void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    @Override
    boolean customerWantsCondiments() {
        // 후크를 오버라이드해서 원하는 기능을 넣는다.

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            // 첨가물을 추가할지 말지를 고객에게 물어보고,
            // 고객이 입력한 내용에 따라 true 또는 false 를 리턴한다.
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        // 이 코드는 고객에게 우유와 설탈을 추가할지 말지를
        // 물어보고, 명령줄로 추가 여부를 입력 받는다.
        String answer = null;

        System.out.println("차에 레몬을 넣을까요? (y/n)");;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO 오류");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
