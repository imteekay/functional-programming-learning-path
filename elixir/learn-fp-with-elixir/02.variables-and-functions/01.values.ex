# values
"I'm TK" # string
27 # integer
10.5 # real number
true # boolean
:ok # atom
{:name, :age} # tuple
[1, 2] # list
%{name: "TK", age: 27} # map
nil # nil

# value expressions
37 + 3.7 # 40.7
(2 + 2) * 3 # 12
2 + 2 * 3 # 8

# logical expression
true and true # true
true or false # true
true and false # false
false or false # false

1 && "I'm TK" # "I'm TK"
"Hello, Word!" && true # true
nil || 1 # 1
1 || "hi" # 1

# Anonymous Functions
hello = fn name -> "Hello " <> name <> "!" end
IO.inspect hello.("TK")
IO.inspect hello.("Dan")
IO.inspect hello.("Kaio")

# using string interpolation
hello = fn name -> "Hello #{name}!" end
IO.inspect hello.("TK")
IO.inspect hello.("Dan")
IO.inspect hello.("Kaio")

# function without arguments
one_plus_one = fn -> 1 + 1 end
IO.inspect one_plus_one.() # 2

# functions as value
total_price = fn price, fee -> price * fee.(price) end
flat_fee = fn price -> 5 end
proportional_fee = fn price -> price * 0.12 end

IO.inspect total_price.(1000, flat_fee) # 1005
IO.inspect total_price.(1000, proportional_fee) # 1120.0

# working with modules
defmodule Checkout do
  def total_cost(price, tax_rate) do
    price * (tax_rate + 1)
  end
end

Checkout.total_cost(100, 0.2) # 120.0
