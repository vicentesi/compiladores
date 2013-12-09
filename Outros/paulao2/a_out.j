; Codigo Monty gerado para Jasmin
.class public a_out
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
	ldc 3
	istore 1	; c
	ldc 5
	istore 2	; y
	iload 2	; y
	iload 1	; c
	iadd
	istore 1	; c
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1	; c
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method

.method public static main([Ljava/lang/String;)V
.limit locals 40
.limit stack 20
	ldc 0
	istore 0	; t
	ldc 0.0
	fstore 1	; a
	invokestatic a_out/main()V
	return
.end method


