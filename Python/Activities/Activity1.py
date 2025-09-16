# Ask the user for their name and age
name = input("Enter your name: ")
age = int(input("Enter your age: "))

# Calculate the current year
from datetime import datetime
current_year = datetime.now().year

# Calculate the year they will turn 100
year_turn_100 = current_year + (100 - age)

# Print the message
print(f"Hello, {name}! You will turn 100 years old in the year {year_turn_100}.")
