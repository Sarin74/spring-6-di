package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Firiends dont let friends to propertiy injection";
    }
}
