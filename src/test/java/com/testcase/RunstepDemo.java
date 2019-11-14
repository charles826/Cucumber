package com.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
//https://github.com/charles826/cucumber.git
//https://github.com/jenkinsci/cucumber-reports-plugin
//


/**
 * https://www.cnblogs.com/rechin/p/9406774.html
 * @author rechin
 *@RunWith(Cucumber.class) ����һ�������� ��ָ��Cucumber�����в���
 * @CucumberOptions�е�features������ָ��������Ŀ��Ҫ���е�feature��Ŀ¼
 * @CucumberOptions�е�format������ָ��������Ŀ��Ҫ����ʱ���ɵı��棬��ָ��֮�������targetĿ¼���ҵ���Ӧ�Ĳ��Ա���
 * @CucumberOptions�е�glue������ָ����Ŀ����ʱ����ʵ��step�����ļ���Ŀ¼
 *
 * ��ʵ����Ŀ�У�������Ŀ�Ľ��У�һ�����Թ��̿����ɶ��feature�ļ���ɣ�����ÿ��feature�ļ��п���Ҳ���ɶ��scenario��ɡ�Ĭ������£�
 * ÿ����������������feature�е�����scenario���������ܵ����������������һ�β��Խű�����Ҫ�ǳ�����ʱ�����ȴ����Խ����
 * ����ʵ�ʹ����У����������������ȼ������ֵġ�����smokeTest��regressionTest�ȡ�������ʱ������ر�С���ֵ�����������ȼ���critical��
 * ��Щ������Ҫ��ʱ�����������ϵͳ�Ƿ�û�а�ҳ����ҳ��404������
 * �������Ǳ������ֿ����е�scenario������ʹ�������������Խű�ʱ�����Ը���������Ҫ��������Щģ���scenaro����ʱ���ǿ���ʹ��Tags
 * ��Cucumber��Tag��ֱ����Feature��Scenari��Scenario Outline�ؼ���ǰ��feature��scenario�������������ǰ׺Ϊ@��tags�����tag�ÿո����ָ�
 */

@RunWith(Cucumber.class)
//@ContextConfiguration("classpath:cucumber.xml")
//@CucumberOptions(plugin={"pretty"}, features={"src/test/resources/features/testBaidu.feature"},glue=("stepDefinition"),
//tags= {"@tag1"})
 
@CucumberOptions(
		features = {"src/test/resources/features/stepDemo.feature"},
		//plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/extent-report/report.html"},
		plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber"},
        glue = {"testCucumber"},tags = {"@tag"})
public class RunstepDemo {
	@BeforeClass
    public static void setup() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("target/extent-report/myreport.html");
        //  extentProperties.setExtentXServerUrl("http://localhost:1337");
        extentProperties.setProjectName("xxx");
    }
   
	@AfterClass
    public static void tearDown() {

    }
}