package gradle_spring_autowired_study.spring;

public class Main {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regSvc = new MemberRegisterService(memberDao);
		ChangePaswordService pwdSvc = new ChangePaswordService();
		pwdSvc.setMemberDao(memberDao);
	}
}
