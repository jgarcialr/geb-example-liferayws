# geb-example-liferayws

Sample Liferay Workspace with a module that has a E2E test made using Geb and Spock using Liferay v.7.2.
to run the tests just use ./gradlew test 
If you want to run just one test you could use it as follows.

Go inside modules/testgeb, run:

../../gradlew chromeTest
../../gradlew firefoxTest 
../../gradlew chromeHeadlessTest

You should have a webcontent inside Liferay that has yet inside it's title or content.
