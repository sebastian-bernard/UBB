%f(x) = ln(x)
format long
ans = hermite([1, 2], [0, 0.69], [1, 0.5], 1.5);
error = abs(log(1.5) - ans);

printf("f(1.5)=%f\n", ans);
printf("max_error = %f\n", error);