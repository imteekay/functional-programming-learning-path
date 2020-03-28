# simple functions
add2 = fn (n) -> n + 2 end
result = add2.(2)
IO.inspect result

# passing functions as arguments
animals = ["cat", "dog", "fish"]
uppercase_animals = Enum.map(animals, &String.upcase/1)
IO.inspect uppercase_animals

# using pipes to process data
def capitalize_words(title) do
  title
  |> String.split
  |> capitalize_all
  |> join_with_whitespace
end
