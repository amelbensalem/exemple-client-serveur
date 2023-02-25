# Client/Server project

## Project description

The goal is to create a public chat system (no messages
private) with authentication. The educational objective is:

1. Manipulation of Java: like creating Java Beans for
represent the model layer.
2. Creating a Swing UI.
3. Network programming in Java: connection and flow exchange
with a server using Sockets.
4. Manipulation of databases using JDBC.
5. Multithreaded programming.

To better assimilate these notions, the project will be presented in several
steps where each step represents the addition of a new feature
or a new aspect.

## Current status: Step 07:

Currently, the chat system works with an interface
user.

The interface consists of two frames:

1. An authentication window,
2. A chat window.

There are still a few details to fix. For example, closing the window
from chat the server throws an exception which is not yet fixed.