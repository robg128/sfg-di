package guru.springframework.sfgdi.services;


import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */
public class I18nEnglishGreetingService implements GreetingService {
    private final EnglishGreetingRepository greetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
