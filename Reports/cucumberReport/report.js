$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/GunsanjamKaur/eclipse-workspace/com.DataTableinbdd.HRM/src/test/java/FeatureFile/Login.feature");
formatter.feature({
  "name": "Checking Login functionality of the application.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Checking Login functionalty with valid login credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "enters \"\u003cusername\u003e\" and enters the \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Checking Login functionalty with valid login credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_is_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"admin\" and enters the \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "login.enters_username_and_enters_the_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "login.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking Login functionalty with valid login credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_is_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"Admin\" and enters the \"admin123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "login.enters_username_and_enters_the_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "login.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
});