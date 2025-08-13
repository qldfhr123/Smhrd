package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿을 요청할때 소괄화 안에 있는 url 값을 사용
@WebServlet("/Servlet00")

// 파일을 요청할때 웹 기본 동작 (요청 - 응답) 을 사용하기 위해 상속받는다
public class Servlet00 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 주석 삭제 가능 : 가이드라인 
	
	public Servlet00() {
		// 부모클래스(Httpservelt) 기본 생성자 호출
		super();
	}

	// 메모리에 올라갈때 딱 한번 실행 되는 메소드
	// 주로 초기화 작업
	public void init(ServletConfig config) throws ServletException {

	}
	// 메모리에서 삭제 되기 직전에 실행되는 메소드
	// 주로 자원 해제 (DB 연결 종료....)
	public void destroy() {

	}
	
	// 클라언트가 get 방식으로 요청할때 실행
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 자바 기반 이기때문에 자바 문법 사용가능
		
		// 한글 깨짐 현상 해결 >> 인코딩 변경 코드상단에 표시
		response.setContentType("text/html; charset = UTF-8");
		
		int a = 3;
		int b = 31;
		int sum = a + b;

		// 클라이언트 servelt00 요청
		// -> doGet() 실행 > 로직 실행 > 결과값 응답
		
		// 응답 해줄 통로(스트링) 만들기
		PrintWriter out = response.getWriter();
//		 속성값을 주기위해 태그를 사용해야한다
//		out.print("<html>"); ....
		out.print("가나다");
		out.print(sum);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
