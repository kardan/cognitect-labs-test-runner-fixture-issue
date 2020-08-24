# Test fixture issue

## :each
Works as expected.
``` bash
daniel@dator % clj -A:test:each

Running tests in #{"test"}

Testing fixture-each-test

Ran 0 tests containing 0 assertions.
0 failures, 0 errors.
daniel@dator %
```

## :once
Evaluates the fixture even if there is no test to run.
``` bash
daniel@dator % clj -A:test:once

Running tests in #{"test"}

Testing fixture-once-test
Yikes - did some integration stuff

Ran 0 tests containing 0 assertions.
0 failures, 0 errors.
daniel@dator %
```
