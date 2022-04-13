x = [1 2 3 4 5 6 7];
temperature = [13 15 20 14 15 13 10];
m = length(x);
a = (sum(m * x .* temperature) - sum(x) * sum(temperature)) / (m * sum(x.*x) - sum(x)^2)
b = (sum(x.^2) * sum(temperature) - sum(x.*temperature) * sum(x)) / (m * sum(x.^2) - sum(x)^2)

%f(8)
eight = a * 8 + b;

% E(a; b) = (sum of the difference between actual value and predicted value)^2
values = a .* x + b;
min_sum = sum((temperature .- values) .^ 2);

%plot
t = 1 : 0.01 : 7;
ft = a .* t + b;
plot(x, temperature, "*", t, ft);

printf("f(8)=%f\n", eight);
printf("minimized sum = %f\n", min_sum);