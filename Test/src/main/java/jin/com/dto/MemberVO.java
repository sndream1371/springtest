package jin.com.dto;

public class MemberVO {
	 
    private String id;
    private String pw;
    private String name;
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getPw() {
        return pw;
    }
 
    public void setPw(String pw) {
        this.pw = pw;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
	public String toString() {
		return "MemberVo [name="+name+"] id ["+id+"] pw["+pw+"]";
	}
 
}


