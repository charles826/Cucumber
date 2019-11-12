package stepDefinitions;
import java.util.zip.CheckedOutputStream;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.Checkout;

public class Calculator {
    private static final String String = null;
	@Given("^打开计算器面板$")

    public void openCalculator() throws Exception {
        System.out.println("打开计算器面板");

    }
    @When("^已经输入1并按下+")

    public void alreadyInput1() {

        System.out.println("已经输入1并按下+");

    }
    @And("^输入 \"([^\"]*)\"$")

    public void input1() {
    	System.out.println("输入1");
    }
    @And("^按下=")

    public void pressEaualButton() throws Throwable{

        System.out.println("按下=");
        Checkout checkout = new Checkout();
		int alreadyInput1 = 0;
		int input1=0;
		checkout.add(alreadyInput1,input1);
    }
    @Then("^等待计算结果")

    public void wait_the_query_result() throws InterruptedException {

        System.out.println("等待计算结果");

    }
}