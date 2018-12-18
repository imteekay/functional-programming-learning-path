# Assign functions to a variable
def add(a, b):
    return a + b


plus = add
value = plus(1, 2)
print(value) # 3

# Lambda
value = (lambda a, b: a + b)(1, 2)
print(value) # 3

addition = lambda a, b: a + b
value = addition(1, 2)
print(value) # 3

authors = [
    'Octavia Butler',
    'Isaac Asimov',
    'Neal Stephenson',
    'Margaret Atwood',
    'Usula K Le Guin',
    'Ray Bradbury'
]

sorted_authors_by_name_length = sorted(authors, key=len)
print(sorted_authors_by_name_length)

sorted_authors_by_last_name = sorted(authors, key=lambda name: name.split()[-1])
print(sorted_authors_by_last_name)
