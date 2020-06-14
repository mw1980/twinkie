# twinkie
Twinkie is designed as a tool to support test automation of web surfaces. It should allow the user to enter test 
specification in human readable format and it should deliver testable code.


The main concepts:
 
 -> how to identify the ui elements on the surface: 
 - UiElement: each element on the user interface contains a name and the selector information (like "by-id" and "value") 
 - Selector: the input required by a test engine to identify a UiElement (like: "id=my-html-id")
  
 -> how to parse the test specification received in a natural language format:
  - TestAction: contains a list of steps and optional a check
  - Step: contains an action, a target element and optional additional value, like the text to enter in an edit field.
  
