package io.hmb.jhmicrosrv.cucumber.stepdefs;

import io.hmb.jhmicrosrv.JhmicrosrvApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhmicrosrvApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
