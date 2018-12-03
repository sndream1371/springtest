package jin.com.service;

import java.util.List;
 
import jin.com.dto.MemberVO;
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
    public int insertMember(MemberVO membervo) throws Exception;
}


