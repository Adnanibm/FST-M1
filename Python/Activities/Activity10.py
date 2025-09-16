
numbers = (10, 23, 45, 67, 90, 100, 7)

print("Numbers divisible by 5 in the predefined tuple:")
for num in numbers:
    if num % 5 == 0:
        print(num)

user_input = input("\nEnter numbers separated by commas: ")
user_tuple = tuple(map(int, user_input.split(",")))

print("Numbers divisible by 5 in your tuple:")
for num in user_tuple:
    if num % 5 == 0:
        print(num)
