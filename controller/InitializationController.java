package controller;

import service.strategy.InitializationService;

public class InitializationController {
    private InitializationService initializationService;

    public InitializationController(InitializationService initializationService) {
        this.initializationService = initializationService;
    }

    public void init(){
        initializationService.init();
    }
}
