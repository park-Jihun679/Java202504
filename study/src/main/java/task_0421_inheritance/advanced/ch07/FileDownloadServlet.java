package task_0421_inheritance.advanced.ch07;

public class FileDownloadServlet extends HttpServlet {

    @Override
    public void service() {
        System.out.println("파일 다운로드합니다.");
    }
}
