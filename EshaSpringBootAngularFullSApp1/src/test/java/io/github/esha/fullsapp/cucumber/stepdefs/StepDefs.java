package io.github.esha.fullsapp.cucumber.stepdefs;

import io.github.esha.fullsapp.EshaSpringBootAngularFullSApp1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = EshaSpringBootAngularFullSApp1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
