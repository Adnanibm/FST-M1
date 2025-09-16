# Ask the user for input: a sequence of comma-separated values
numbers = input("Enter a sequence of comma separated values: ").split(",")

# Initialize a variable to store the sum
total_sum = 0

# Loop through each number in the list
for number in numbers:
    # Remove any leading/trailing spaces and convert to integer
    total_sum += int(number.strip())

# Print the total sum
print(f"The sum of the numbers is: {total_sum}")
