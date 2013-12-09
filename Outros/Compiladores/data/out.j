; Jasmin code
.class public out
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method
.method public static func()I
.limit locals 40
.limit stack 20
	ldc 0
	istore 0	; c
	ldc 0
	istore 1	; a
	ldc 10
	istore 1	; a
	ldc 5
	istore 0	; c
	iload 1	; a
	iload 0	; c
	isub
	ifge Else0
	ldc 0
	goto Done0
Else0:
	iload 1	; a
Done0:
	ireturn
.end method

.method public static main()V
.limit locals 40
.limit stack 20
	ldc 0
	istore 0	; b
	ldc 0
	istore 1	; c
	ldc 0
	istore 2	; y
	invokestatic out/func()I
	istore 0	; b
	ldc 3
	istore 1	; c
	ldc 5
	istore 2	; y
	iload 2	; y
	iload 1	; c
	iadd
	iload 0	; b
	iadd
	istore 1	; c
While0:
	iload 2	; y
	ldc 0
	isub
	ifle Done1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1	; c
	invokevirtual java/io/PrintStream/print(I)V
	iload 2	; y
	ldc 1
	isub
	istore 2	; y
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " - "
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 2	; y
	invokevirtual java/io/PrintStream/print(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "\n"
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	goto While0
Done1:
	return
.end method

.method public static main([Ljava/lang/String;)V
.limit locals 40
.limit stack 20
	invokestatic out/main()V
	return
.end method


