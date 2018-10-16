Feature: Eating Stuff
  Stuff is delicious.

  Scenario: I eat some cucumbers
    Given I have 4 cucumbers
    When I eat 2 cucumbers
    Then I should still have 2 more cucumbers to eat

  Scenario: I eat my only cucumber
    Given I have 1 cucumber
    When I eat 1 cucumber
    Then I should not have any more cucumbers to eat

  Scenario: I eat a whole lot of bananas
    Given I have 123456789101112 bananas in a basket
    When I eat 123456789101111 bananas from said basket
    Then I should still have 1 more bananas to eat

  Scenario: I eat a bunch of bananas
    Given I have 12345678910 bananas in a bag
    When I eat 2 bananas from that bag
    Then I should still have 12345678908 more bananas to eat  