/*void test()
	int a, b, c;
	a=5;
	b=4;
	c=a+b;
	if 	a<c then
		print(c);
	end
	print("teste");
end

test();*/

void calc(int p)
	int a, b;
	a=5;
	b=10;
	if a < p then
		b = a + p;
	else
		b = a - p;
	end
	print(b);
	
	while(b <> 0)
		b = b - 1;
		print("valor de b:");
		print(b);
		print("---");
	end
end

void run()
	int a;
	a=20;
	calc(a);
end

run();
