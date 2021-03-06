Feature: "rm" command
    In order to remove features from the repository
    As a Geogit User
    I want to delete features and trees from the working tree

  Scenario: Try to delete a single feature
    Given I have a repository
      And I have staged "points1"
      And I have staged "points2"
      And I have staged "lines1"
      And I run the command "commit -m Test"
     When I run the command "rm Points/Points.1"
     Then the response should contain "Deleted 1 feature(s)"
      
  Scenario: Try to delete several features
    Given I have a repository
      And I have staged "points1"
      And I have staged "points2"
      And I have staged "lines1"
      And I run the command "commit -m Test"
     When I run the command "rm Points/Points.1 Points/Points.2"
     Then the response should contain "Deleted 2 feature(s)"
      
  Scenario: Try to delete a whole tree
    Given I have a repository
      And I have staged "points1"
      And I have staged "points2"
      And I have staged "lines1"
      And I run the command "commit -m Test"
     When I run the command "rm Points -r "
     Then the response should contain "Deleted Points tree"
      
  Scenario: Try to delete a whole tree without the -r modifier
    Given I have a repository
      And I have staged "points1"
      And I have staged "points2"
      And I have staged "lines1"
      And I run the command "commit -m Test"
     When I run the command "rm Points"
     Then the response should contain "Cannot remove tree Points if -r is not specified"
     
  Scenario: Try to delete an inexistent feature
    Given I have a repository
      And I have staged "points1"
      And I have staged "points2"
      And I have staged "lines1"
      And I run the command "commit -m Test"
     When I run the command "rm Points/Wrong.1"
     Then the response should contain "did not match any feature or tree"   
     