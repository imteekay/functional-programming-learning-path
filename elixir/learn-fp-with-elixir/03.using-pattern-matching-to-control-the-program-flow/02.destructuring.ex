# strings
"Authentication: " <> credentials = "Authentication: Basic dXNlcjpwYXNz"
IO.inspect credentials

# tuples
{a, b, c} = {1, 2, 3}
IO.inspect a
IO.inspect b
IO.inspect c

# lists
[a, b, c] = [1, 2, 3]
IO.inspect a
IO.inspect b
IO.inspect c

[_, x, _] = [1, 2, 3] # this _ operator is called wild card
IO.inspect x

[head | rest] = [1, 2, 3, 4, 5]
IO.inspect head # 1
IO.inspect rest # [2, 3, 4, 5]

[first, second | rest] = [1, 2, 3, 4, 5]
IO.inspect first # 1
IO.inspect second # 2
IO.inspect rest # [2, 3, 4, 5]

[head | rest] = [:a]
IO.inspect head # :a
IO.inspect rest # []
