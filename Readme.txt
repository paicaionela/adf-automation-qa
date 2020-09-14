1. Test case were written in Eclipse Java EE IDE for Web Developers (Version: Photon Release (4.8.0))
2. Dependencies, according to POM: junit(Version 4.12), testng (Version 6.8), selenium-java (Version 3.141.59)
3. Other dependencies - browsers: 
	- chromedriver.exe: tests were run successful.
	- geckodriver.exe: tests were run successful.
	- IEDriverServer.exe: tests do not run on this browser.
	The browser can se set in "allTestsRun.xml", by setting the browser's value to: "Chrome", "Firefox" or "IE"
	The drivers location is set in "driversLocation" from TestData class.
	
4. All tests can be executed by running "allTestsRun.xml" as "TestNG Suite".

5. Considering that there are 3 different URL's, there are created 3 classes with tests for each URL. The test casess are available in "allTestsRun.xml, in "classes" section.
6. The tests can run in parallel, in thread-count=3 browser instances. The "thread-count" parameter value can be modified.
7. Considering the "groups" section from allTestsRun.xml", there are run only tests that have flag "P0".
	In "Login" test file , there are 2 test cases:
		"LoginWithCorrectCredentials" {P0}- passsed
		"VerifyFieldsLabels" - failed (as at stept3 from Exercise is requested to "Click Login", while the button is labeled "SIGN IN").
		In order to run all created tests, update the <groups> section with:
		<groups>
			<run>
				<include name="P0" />
				<include name="P1" />
			</run>
		</groups>
		There can be set different priorities for each test case by assigning tag priorities(P0, P1, P2 etc) and updating "groups" section from "allTestsRun.xml"  
8. The test setup has 4 sections:
   1. lib: easier when the scenarios is extended of for other projects, for project configuration, pages instantiation.
   2. PageElements: contains the 3 classes with its used elements from each classes
   3. Pages: the methods for each page
   4. Tests: 
	- the 3 test classes(that run scenarios for each page), 
	- the AbstractBaseClass: to manage the pages common elements execution 
    - the TestData class: containing all input test data, including the driversLocation - on yout local disk.