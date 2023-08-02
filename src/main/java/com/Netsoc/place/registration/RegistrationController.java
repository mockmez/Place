package com.Netsoc.place.registration;

import org.springframework.web.bind.annotation.RequestBody;

public class RegistrationController {

    private RegistrationService registrationService;
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
