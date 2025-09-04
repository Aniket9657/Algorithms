# all string topics 
# 1. Creating a string
s = "Hello, World!"
print(s)

# 2. Accessing characters
print(s[0])   # First character
print(s[-1])  # Last character

# 3. String slicing
print(s[0:5])   # 'Hello'
print(s[7:])    # 'World!'

# 4. String length
print(len(s))

# 5. Changing case
print(s.upper())   # HELLO, WORLD!
print(s.lower())   # hello, world!
print(s.title())   # Hello, World!

# 6. Removing spaces
txt = "   Python   "
print(txt.strip())   # removes leading/trailing spaces

# 7. String concatenation
a = "Python"
b = "Rocks"
print(a + " " + b)

# 8. String repetition
print("Hi! " * 3)

# 9. Checking substrings
print("World" in s)      # True
print("Java" not in s)   # True

# 10. Replace substring
print(s.replace("World", "Python"))

# 11. Split and Join
words = s.split(",")       # ['Hello', ' World!']
print(words)
print("-".join(words))     # Hello- World!

# 12. f-strings (string formatting)
name = "Aniket"
age = 22
print(f"My name is {name} and I am {age} years old.")
