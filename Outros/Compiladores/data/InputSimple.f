int func() {
	int c;
	int a;
	a = 10;
	c = 5;
	if (a < c) {
		return 0;
	} else {
		return a;
	}
}

void main() {
	int b;
	int c;
	int y;
	b = func();
	c=3;
	y=5;
	c = y + c + b;
	while (y > 0) {
		print(c);
		y = y - 1;
		print(" - ");
		print(y);
		print("\n");
	}
}

main();
