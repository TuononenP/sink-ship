Graphical user interface.

# Menu screen #
Upon starting the application, the user is presented with a menu screen which is divided in two logical sections.
In the first the user can join an existing game by entering the IP address.
In the other the user can create a new game and can see several settings.
  * Matrix dimensions (dx, dy)
  * number and size of ships
  * maximum number of players
  * visibility of guesses
  * timeout for too long guesses

# In-game screen #

There are two Battlefield Matrixes at one time, aligned horizontally.
The left one is used to position the own ships, and displays the guesses of other players (or not show guesses but only show about player's ship's sunken, or alive by the host's option selection).
The right one is for the own guesses or for all player's guesses (depending on configuration) and the hits for the selected player.
In addition to the two Matrixes, there is a list of all players, that shows the active player (who takes the next guess) by highlighting it. and selecting a player in that list, will load his guesses in the left map and the own hits on that player in the right map.