%f(x) = sin(x)

%a.)
x_vals = [0, pi/2, pi, 3*pi/2, 2*pi];
y_vals = sin(x_vals);
t = 0 : 0.01 : 2*pi;
x = pi/4;
spline_rez = spline(x_vals, y_vals, x);
clamped_spline_rez = ppval(spline(x_vals, [1 y_vals 1]), x);
printf("a.)\n");
printf("f(x) = %f\n", sin(x));
printf("spline = %f\n", spline_rez);
printf("clamped spline = %f\n", clamped_spline_rez);




%b.)
i1 = spline(x_vals, y_vals, t);
i2 = ppval(spline(x_vals, [1 y_vals 1]), t);
f = sin(t);
plot(t, f, t, i1, t, i2, pi/4, sin(pi/4), "*");
legend;
input("");