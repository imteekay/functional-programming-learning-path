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

# maps
user_signup = %{username: "TK", email: "tk@mail.com", password: "123123123"}
IO.inspect user_signup

user_signup = %{:username => "TK", :email => "tk@mail.com", :password => "123123123"} # another map syntax

%{email: email} = user_signup
IO.inspect email

%{username: username = "TK"} = user_signup
IO.inspect username
