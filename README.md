# Test fixture issue

Stumbled into this issue since we run unit tests in an isolated docker image
before we run integration tests in a docker-compose environment where we can
test with other services available.

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
