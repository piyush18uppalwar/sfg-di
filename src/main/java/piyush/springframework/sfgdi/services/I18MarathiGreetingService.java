package piyush.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("MR")
@Service("i18nService")
public class I18MarathiGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Kas kay -- MR";
	}

}
