package ex02;

import java.util.ArrayList;
import java.util.List;
//Target :  �ٽ� ������ ���� Ŭ����
public class BoardServiceImpl implements BoardService {
	
	
	List<BoardVO> boardArr=new ArrayList<>();
	@Override
	public int insertBoard(BoardVO vo) {
		
		System.out.println("***�ٽ� ������ �����ϴ� �޼���: insertBoard"+vo.getTitle()+"���� ����մϴ�...***");
		//boardArr=null;//�Ϻη� ���ܸ� �߻���Ű�� ���� �ڵ�
		boardArr.add(vo);
		boardArr.add(vo);
		//boardArr.add(null);
		boardArr.add(vo);
		
		return boardArr.size(); //3
	}
}
