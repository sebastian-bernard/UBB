format long
x10 = hermite([0, 3, 5, 8, 13], [0, 225, 383, 623, 993], [75, 77, 80, 74, 72], 10);
eps = 0.001;
x10_plus_eps = hermite([0, 3, 5, 8, 13], [0, 225, 383, 623, 993], [75, 77, 80, 74, 72], 10 + eps);
printf("Distance = %f\n", x10);
printf("Speed = %f\n", (x10_plus_eps-x10)/eps);