package egovframework;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

import egovframework.com.config.EgovWebApplicationInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @EnableJpaAuditing
 * 자동으로 시간대를 매핑하여 추가해주는 어노테이션
 * 생성일자, 수정일자를 넣기 위해서 반드시 필요한 어노테이션입니다.
 * */
@EnableJpaAuditing
@ServletComponentScan
@SpringBootApplication
@Import({EgovWebApplicationInitializer.class})
public class EgovBootApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		//springApplication.setLogStartupInfo(false);
		springApplication.run(args);
	}

}
