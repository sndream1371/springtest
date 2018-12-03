package jin.com.dao;

import java.util.List;

import jin.com.dto.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
    
    public int insertMember(MemberVO membervo) throws Exception;
    
}


