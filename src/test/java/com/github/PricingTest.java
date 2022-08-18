package com.github;

import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PricingTest {
    @BeforeAll
    static void config() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void pircingHoverClickToComparePlansTest() {
        open("https://github.com");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(".HeaderMenu").$(byText("Compare plans")).click();
        $(".h2-mktg").shouldHave(text("Choose the plan that’s right for you."));
    }

}
