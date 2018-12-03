package jin.com.service;

import java.util.List;
 
import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import jin.com.dao.MemberDAO;
import jin.com.dto.MemberVO;
 
@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
        return dao.selectMember();
    }
    
    @Override
    public int insertMember(MemberVO membervo) throws Exception {
        return dao.insertMember(membervo);
    }
 
}






