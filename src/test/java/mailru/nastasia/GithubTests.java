package mailru.nastasia;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubTests {

    @DisplayName("Check existence of JUnit5 code example on page soft assertions " +
            "in Wiki project on selenide page in github")
    @Test
    void checkExistenceOfJUnit5CodeExampleOnPageSoftAssertionsInWikiProjectOnSelenidePageInGithub() {

        open("https://github.com/");
        Configuration.holdBrowserOpen=true;
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $("#wiki-pages-box .wiki-more-pages-link button").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions")).
                $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }

}
