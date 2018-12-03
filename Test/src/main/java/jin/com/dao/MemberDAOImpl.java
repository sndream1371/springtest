package jin.com.dao;

import java.util.List;
 
import javax.inject.Inject;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
 
import jin.com.dto.MemberVO;
 
@Repository
public class MemberDAOImpl implements MemberDAO {
 
    @Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "jin.com.mapper.memberMapper";
    
    //mysql select
    @Override
    public List<MemberVO> selectMember() throws Exception {
        return sqlSession.selectList(Namespace+".selectMember");
    }
    
    //mysql insert
    @Override
    public int insertMember(MemberVO membervo) throws Exception {
        return sqlSession.insert(Namespace+".insertMember",membervo);
    }
    
    
    
 
}




