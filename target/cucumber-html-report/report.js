$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login_FF.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"testuserFF\" and \"testpassword\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.User_is_on_Home_Page()"
});
formatter.result({
  "duration": 126868443,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.User_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 167328,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.User_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 278673,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuserFF",
      "offset": 13
    },
    {
      "val": "testpassword",
      "offset": 30
    }
  ],
  "location": "Test_Steps.User_enters_UserName_and_Password(String,String)"
});
formatter.result({
  "duration": 2336682,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.Message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 75889,
  "status": "passed"
});
formatter.uri("Login_GC.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"testuserGC\" and \"testpassword\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.User_is_on_Home_Page()"
});
formatter.result({
  "duration": 78999,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.User_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 46652,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.User_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 134360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuserGC",
      "offset": 13
    },
    {
      "val": "testpassword",
      "offset": 30
    }
  ],
  "location": "Test_Steps.User_enters_UserName_and_Password(String,String)"
});
formatter.result({
  "duration": 144935,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.Message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 60959,
  "status": "passed"
});
formatter.uri("Login_IE.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"testuserIE\" and \"testpassword\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.User_is_on_Home_Page()"
});
formatter.result({
  "duration": 95793,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.User_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 48519,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.User_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 97349,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuserIE",
      "offset": 13
    },
    {
      "val": "testpassword",
      "offset": 30
    }
  ],
  "location": "Test_Steps.User_enters_UserName_and_Password(String,String)"
});
formatter.result({
  "duration": 364513,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.Message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 48519,
  "status": "passed"
});
});