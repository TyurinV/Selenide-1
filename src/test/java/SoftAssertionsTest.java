import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTest {

    @Test
    void SoftAssertionsShouldBeInWiki() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();

        $(".wiki-more-pages-link button").click();
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();

        $(".clearfix").shouldHave(text("Using JUnit5 extend test class:"));

    }

}
