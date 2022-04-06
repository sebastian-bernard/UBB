time = [0, 3, 5, 8, 13];
distance = [0, 225, 383, 623, 993]; 
speed = [75, 77, 80, 74, 72];
x = 10;
eps = 0.01;
i = spline(time, [75 distance 72]);
f_val = ppval(i, x);
f_lim_val = ppval(i, x+eps);
f_deriv = (f_lim_val-f_val)/((x+eps) - x);

printf("car position: %d\n", f_val);
printf("car speed: %f\n", f_deriv);