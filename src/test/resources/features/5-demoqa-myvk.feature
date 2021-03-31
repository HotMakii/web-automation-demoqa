Feature: DemoQA - Elements page
    Background:
        Given I am on the "Home" page
        And   I click "Interactions"
        Then  I am on the "Interactions" page

    Scenario: Selectable
        When I click "Selectable option"
        And I click "Grid tab"
        And  I click "Origin tab"
        Then "Content" should contain "Contrary to popular belief, Lorem Ipsum is not simply random text."
        When I click "Use tab"
        Then "Content" should contain "Various versions have evolved over the years"
        When I click "What tab"
        Then "Content" should contain "unknown printer took a galley"