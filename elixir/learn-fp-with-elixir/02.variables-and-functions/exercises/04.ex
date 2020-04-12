defmodule MatchstickFactory do
  def boxes(matchsticks) do
    big = div(matchsticks, 50)
    remaining_after_big = rem(matchsticks, 50)

    medium = div(remaining_after_big, 20)
    remaining_after_medium = rem(remaining_after_big, 20)

    small = div(remaining_after_medium, 5)
    remaining_matchsticks = rem(remaining_after_medium, 5)

    %{
      big: big,
      medium: medium,
      small: small,
      remaining_matchsticks: remaining_matchsticks
    }
  end
end

IO.inspect MatchstickFactory.boxes(98)
IO.inspect MatchstickFactory.boxes(39)
