# Function to determine the winner
def determine_winner(player1_choice, player2_choice):
    if player1_choice == player2_choice:
        return "It's a tie!"
    elif (player1_choice == "rock" and player2_choice == "scissors") or \
         (player1_choice == "scissors" and player2_choice == "paper") or \
         (player1_choice == "paper" and player2_choice == "rock"):
        return "Player 1 wins!"
    else:
        return "Player 2 wins!"

# Main function to play the game
def play_game():
    # Ask for player choices
    player1_choice = input("Player 1, enter your choice (rock, paper, or scissors): ").lower()
    player2_choice = input("Player 2, enter your choice (rock, paper, or scissors): ").lower()

    # Check if the choices are valid
    valid_choices = ["rock", "paper", "scissors"]
    if player1_choice not in valid_choices or player2_choice not in valid_choices:
        print("Invalid input! Please choose rock, paper, or scissors.")
        return

    # Determine the winner
    result = determine_winner(player1_choice, player2_choice)
    
    # Display the result
    print(f"Player 1 chose {player1_choice}")
    print(f"Player 2 chose {player2_choice}")
    print(result)

# Play the game
play_game()
