# Hello World

The classical introductory exercise. Just say "Hello, World!".

["Hello, World!"](http://en.wikipedia.org/wiki/%22Hello,_world!%22_program) is
the traditional first program for beginning programming in a new language
or environment.

The objectives are simple:

- Write a function that returns the string "Hello, World!".
- Run the test suite and make sure that it succeeds.
- Submit your solution and check it at the website.

If everything goes well, you will be ready to fetch your first real exercise.

### Project Structure

Clojure exercises in exercism use [leiningen](http://leiningen.org/) to configure and run your code
and use [leiningen standard directory structure](https://github.com/technomancy/leiningen/blob/master/doc/TUTORIAL.md#directory-layout).

You will find a test file named `hello_world_test.clj` inside `test` directory.
Write your code in `src/hello_world.clj`. It should use the namespace `hello-world` so that tests can pick it up.

### Running tests

Run the tests using `lein test` command and make them pass:

```
$ lein test

lein test hello-world-test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
```

Then submit the exercise using:

```
$ exercism submit src/hello_world.clj
```

For more detailed instructions and learning resources refer [exercism's clojure language page](http://exercism.io/languages/clojure).

## Source

This is an exercise to introduce users to using Exercism [http://en.wikipedia.org/wiki/%22Hello,_world!%22_program](http://en.wikipedia.org/wiki/%22Hello,_world!%22_program)

## Submitting Incomplete Solutions
It's possible to submit an incomplete solution so you can see how others have completed the exercise.
