# [v1.1.1]
# pong
defmodule Action do
  @pong "pong"
  def ping do
    IO.puts @pong
  end
end

Action.ping
