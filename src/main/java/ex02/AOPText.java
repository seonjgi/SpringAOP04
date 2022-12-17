package ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPText {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ex02/aop.xml	");
		BoardService bs=ctx.getBean("boardSvc", BoardService.class);
		BoardVO vo=new BoardVO(1,"ù��° �Խñ��� ����մϴ�","ȫ�浿");
		bs.insertBoard(vo);
		
	}

}
