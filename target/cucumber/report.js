$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/stepDemo.feature");
formatter.feature({
  "line": 2,
  "name": "Search \"cucumber\" keyword",
  "description": "",
  "id": "search-\"cucumber\"-keyword",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "search-\"cucumber\"-keyword;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser baidu page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Input searchbox keyword",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The correct search result is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDemo.open_browser_baidu_page()"
});
formatter.result({
  "duration": 5535606910,
  "status": "passed"
});
formatter.match({
  "location": "stepDemo.send_keyword_into_searchbox()"
});
formatter.result({
  "duration": 226748654,
  "status": "passed"
});
formatter.match({
  "location": "stepDemo.i_click_search_button()"
});
formatter.result({
  "duration": 63072545,
  "status": "passed"
});
formatter.match({
  "location": "stepDemo.the_correct_search_result_is_returned()"
});
formatter.result({
  "duration": 2665743514,
  "status": "passed"
});
});