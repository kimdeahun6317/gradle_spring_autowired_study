package gradle_spring_autowired_study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import spring.ChangePaswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;
import spring.VersionPrinter;

public class AppCont2 {
	@Autowired
	private MemberDao memberDao;

	@Autowired
	private MemberPrinter memberPrinter;

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao);
	}

	@Bean
	public ChangePaswordService changePwdSvc() {
		ChangePaswordService pwdSvc = new ChangePaswordService();
		pwdSvc.setMemberDao(memberDao);
		return pwdSvc;
	}

	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao, memberPrinter);
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao);
		infoPrinter.setPrinter(memberPrinter);
		return infoPrinter;
	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
