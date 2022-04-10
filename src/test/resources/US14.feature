Feature:  As a user, I should be able to search any item/ users from the homepage.

  Scenario: Verify users can search any files/folder/users from the search box.
    Given user on the dashboard page

    When   the user Clicks the magnifier icon on the right top
    And   User   Search Item "Talk"
    Then    Uerify the app displays the "Talk" Option

