import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {

    private final String path; // 생성자로 부터 파일경로를 받아와 저장

    public FileProcessor(String path) {
        this.path = path;
    }

    // 템플릿 메소드 (오버라이딩 못하게 final 처리)
    public final int process() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = getResult();
            String line = null;

            while ((line = reader.readLine()) != null) {
                result = calculate(result, Integer.parseInt(line));
            }
            return result;

        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    protected abstract int calculate(int result, int number);
    protected abstract int getResult();
}
