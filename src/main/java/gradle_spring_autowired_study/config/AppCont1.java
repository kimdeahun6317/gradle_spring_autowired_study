package gradle_spring_autowired_study.config;

import org.springframework.context.annotation.Bean;

import gradle_spring_autowired_study.spring.MemberDao;
import gradle_spring_autowired_study.spring.MemberPrinter;



public class AppCont1 {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

}
