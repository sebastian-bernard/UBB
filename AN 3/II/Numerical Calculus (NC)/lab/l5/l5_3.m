%f : [5; 5] -> R; f(x) = sin(2x)
format long
%f(x) = sin(2x)
x = -5 : 0.01 : 5;
y = sin(2.*x);

%Hermite
x_vals = linspace(-5, 5, 15);
f_vals = sin(2.*x_vals);
deriv_vals = 2.*cos(2.*x_vals);
sol = [];
for i = 1:length(x)
	sol = [sol hermite(x_vals, f_vals, deriv_vals, x(i))];
end

%plot 
plot(x, y, x, sol);