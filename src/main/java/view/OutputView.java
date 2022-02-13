package view;

public class OutputView {
    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String HYPHEN = "-";

    public void printResultMessage() {
        System.out.println(RESULT_MESSAGE + "\n");
    }

    public void printPosition(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print(HYPHEN);
        }
        System.out.println();
    }
}
