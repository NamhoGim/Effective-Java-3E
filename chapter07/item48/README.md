## Item 48: Use caution when making streams parallel

Do not even attempt to parallelize a stream pipeline unless you have good reason to believe
that it will preserve the correctness of the computation and increase its speed.
The cost of inappropriately parallelizing a stream can be a program failure or performance disaster.
If you believe that parallelism may be justified, ensure that your code remains correct when run in parallel,
and do careful performance measurements under realistic conditions.
If your code remains correct and these experiments bear out your suspicion of increased performance,
then and only then parallelize the stream in production code.
