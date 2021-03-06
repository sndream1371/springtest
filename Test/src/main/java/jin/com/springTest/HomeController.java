package jin.com.springTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jin.com.service.MemberService;
import jin.com.springTest.vo.MemberVo2;
import jin.com.dto.MemberVO;
//import jin.com.springTest.vo.MemberVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
    private MemberService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    //@RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping(value = "/homeDtoSelect")  //URL에서 호출할 정보 ex) http://localhost:8080/springTest/homeDtoSelect
    public String homeDtoSelect(Locale locale, Model model) throws Exception{
 
        logger.info("home........................");
        
        List<MemberVO> memberList = service.selectMember();
        logger.info("home memberList >"+memberList);
        
        model.addAttribute("memberList", memberList);
 
        return "home_dto_select"; //views폴더아래 home_dto_select.jsp를 호출한다.
    }

	@RequestMapping(value = "/homeDtoInsert")  //URL에서 호출할 정보 ex) http://localhost:8080/springTest/homeDtoInsert
    public String homeDtoInsert(MemberVO jspRecvParam, Model model) throws Exception{ //첫번째 파라미터는 jsp로부터 파리미터정보 받고, 두번째 파라미터는 jsp로 정보 전달
 
		String id = jspRecvParam.getId();
		String pw = jspRecvParam.getPw();
		String name = jspRecvParam.getName();
		
        logger.info("mysql db insert test...");
        if( !Objects.isNull(id) ) {
        	MemberVO memberVO = new MemberVO();
//          memberVO.setId("100");
//          memberVO.setPw("pw-100");
//          memberVO.setName("name-100");
          memberVO.setId(id);
          memberVO.setPw(pw);
          memberVO.setName(name);
          int retval = service.insertMember(memberVO);
          logger.info("mysql after db insert :"+retval);
          
          model.addAttribute("insertDBSuccess", retval);
        }else {
          model.addAttribute("insertDBSuccess", "0");
        }
        
        
        return "home_dto_insert"; //views폴더아래 home_dto_select.jsp를 호출한다.
    }
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home2(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	@RequestMapping(value = "/ex01/doA")
	public void jin01(Locale locale, Model model) {  //void 타입인경우 RequestMapping에서 설정된 위치의 jsp를 호출 views/ex01/doA.jsp
		logger.info("doA.... > {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		//return "doA";
	}
	
	@RequestMapping(value = "/ex01/doB")
	public String jin02(Locale locale, Model model) {
		logger.info("doB.... > {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		MemberVo2 memberVo = new MemberVo2();
		memberVo.setName("lim jin young");
		memberVo.setAge("30");
		memberVo.setSex("male");
		memberVo.setAddress("용인시 기흥구 동백");
		memberVo.setPhone("010-2233-98**");
		
		model.addAttribute("member",memberVo);
		return "doB"; //views폴더 바로아래 doA.jsp를 호출
	}
	

    @RequestMapping("/dbTest.do")
    public String dbTest(Model model) {
        Connection conn = null;
        Statement st = null;
        DataSource dataSource = null;
        
        try {
            conn = dataSource.getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select now() as now;");
            
            while(rs.next()) {
                model.addAttribute("serverTime", rs.getString("now"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();    
            
        } finally {
            try {
                if(st != null) st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            try {
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }                        
        }
        
        return "home";
    }
	
}
