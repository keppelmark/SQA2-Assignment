# Sprint Backlog

| Task |   Estimated Time | Notes |
|------|-----------------|-------|
|Design controller class|3 hours| |
|Unit testing|3 hours||
|Test coverage|< 1 hour| Using EclEmma as coverage tool |
|Team version control|3 days| |
|Code-review checklist|3 hours|
|**TOTAL**|4 days|*estimated*|

To come up with these estimates, I gauged the relative difficulty and length of each task and how they correspond with each other. For example, version control was the longest as it involves every step of the project, whereas unit testing is done for different individual steps.
It is important to come up with estimates for a sprint backlog as it helps to determine how much work is needed in each sprint. By dividing up items into smaller tasks, it is easier to assess how heavy the workload is going to be and therefore increases the likelihood of finishing on time. Backlogs also help teams to coordinate their work.

# Test-Driven development






# Test Coverage

I am using EclEmma as my code coverage tool for this assignment. This tool can be installed from within Eclipse.

1. From your Eclipse menu select Help → Eclipse Marketplace.

2. Search for "EclEmma".

3. Hit Install for the entry "EclEmma Java Code Coverage".

4. Follow the steps in the installation wizard.

The tool highlights sections of the code which appear in green if they are included in the coverage and red if they are not.

[![Screenshot-2021-05-20-at-21-06-43.png](https://i.postimg.cc/QCDyLYFs/Screenshot-2021-05-20-at-21-06-43.png)](https://postimg.cc/R6PRKR1b)

# Code-review checklist

## Code Design
Code design is important because it applies to an area where the IDE is unable to help you. While some small issues may be caught, only another coder can judge how good the code design is and give appropriate feedback on where design can be improved.

## Test coverage
It is important that the code is well tested and includes unit tests for each feature. It is also important that the tests are performing the right actions. To guarantee this, it is recommended that code changes be small in order to make adequate testing easier.

## Readability
Code has to be readable in order for other developers to undertand it and to be able to make improvements if needs be. Constantly having to review the readability of code can slow down future releases and it is therefore important so make your code as clear and concise as possible. Ideally a person who has never seen the project before would be able to grasp what is happening.

## Documentation
Including documentation in your code review checklist may motivate devlopers to document their new code in smaller portions, as they are writing it. Documentation that is written at the time the code is merged will tend to be of better quality and more accurate than if a developer was to revisit it at a later time.

## Dependencies
Is there any change that requires updates to occur outside of the code ? Does the documentation, readme files or configuration require changing and was this implemented ? Do these changes affect any other areas of the software ?



