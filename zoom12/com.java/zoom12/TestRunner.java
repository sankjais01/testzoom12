package zoom12;

import java.awt.List;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import smoke.SmokeTest;

public class TestRunner {

	public static void main(String[] args) {
		XmlSuite xmlsuit = new XmlSuite();
		xmlsuit.setName("ZoomSuite");
		xmlsuit.setParallel("false");
		xmlsuit.setVerbose(1);
		XmlTest xmltest = new XmlTest(xmlsuit);
		xmltest.setName("smoke.SmokeTest");
		xmltest.setPreserveOrder("true");

		XmlClass publictestclass = new XmlClass(SmokeTest.class);
		ArrayList<XmlClass> list = new ArrayList<XmlClass>();
		list.add(publictestclass);
		xmltest.setXmlClasses(list);

		TestNG testng = new TestNG();
		ArrayList<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(xmlsuit);
		testng.setXmlSuites(suites);
		testng.run();

	}

}
