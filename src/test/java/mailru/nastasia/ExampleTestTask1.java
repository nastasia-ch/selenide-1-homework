package mailru.nastasia;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ExampleTestTask1 {

    // Тест - кликнуть на блок API в левом боковом меню

    // Этот тест пройдет, т.к. будет найден первый элемент div в классе left-menu,
    // внутри которого есть элемент a (как раз соответствует ссылке на блок API)
    @Test
    void testClickOnBlockAPILeftMenuShouldPassed() {
        open("https://selenide.org/documentation.html");
        Configuration.holdBrowserOpen=true;
        $(".left-menu div a").click();
    }

    // Тест упадет, т.к. первый элемент div в классе left-menu не имеет внутри элемента a
    // (соответствет названию меню Docs)
    @Test
    void testClickOnBlockAPILeftMenuShouldFailed() {
        open("https://selenide.org/documentation.html");
        Configuration.holdBrowserOpen=true;
        $(".left-menu div").$("a").click();
    }

}
