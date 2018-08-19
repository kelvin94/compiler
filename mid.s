#-------------------------------------
# 10		INT	0	0
# a		INT	10	16
# L_1		LABEL	0	0
# L_2		LABEL	0	32
# L_3		LABEL	0	48
# L_4		LABEL	0	96
# L_5		LABEL	0	112
# L_6		LABEL	0	128
# "%d is a positive number\n"		STR	0	144
# L_7		LABEL	0	160
# L_8		LABEL	0	208
# L_9		LABEL	0	224
# L_10		LABEL	0	240
# "%d is a negative number\n"		STR	0	256
# L_11		LABEL	0	272
# L_12		LABEL	0	320
# L_13		LABEL	0	336
# L_14		LABEL	0	352
# L_15		LABEL	0	0
# L_16		LABEL	0	16
# L_17		LABEL	0	96
# L_18		LABEL	0	112
# L_19		LABEL	0	176
# L_20		LABEL	0	192
# L_21		LABEL	0	224
# L_22		LABEL	0	240
# L_23		LABEL	0	256
#-------------------------------------
#-------------------------------------
# fun		VOID	0	32
# 368		INT	0	368
# main		VOID	0	384
# 272		INT	0	272
#-------------------------------------
#-------------------------------------
# n		INT	0	16
#-------------------------------------
#-------------------------------------
# 0		INT	0	64
# t_0		BOOLEAN	0	80
#-------------------------------------
#-------------------------------------
# printf		STR	0	176
# 2		INT	0	192
#-------------------------------------
#-------------------------------------
# printf		STR	0	288
# 2		INT	0	304
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# 2		INT	0	32
# t_1		INT	0	48
# 8		INT	0	64
# 16		INT	0	80
# 2		INT	0	128
# t_2		INT	0	144
# t_3		INT	0	160
# 1		INT	0	208
#-------------------------------------
.globl main
.data
a: .quad 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
str144: .asciz "%d is a positive number\n"
str256: .asciz "%d is a negative number\n"
.text

#fun:   
fun: push %rbp
mov %rsp, %rbp


#L_1: 368 frame 
L_1: sub $368, %rsp


#L_2:  push %rdi 
L_2: mov %rdi, -16(%rbp)


#L_3: t_0 = n cmp 0
L_3: mov -16(%rbp), %rax
mov $0, %rbx
cmp %rax, %rbx
mov %rax, -80(%rbp)


#L_4: L_6 = t_0 jle 
L_4: jle L_6


#L_5: L_10 = t_0 jg 
L_5: jg L_10


#L_6: "%d is a positive number\n" rdi 
L_6: mov $str144, %rdi


#L_7: n rsi 
L_7: mov -16(%rbp), %rsi


#L_8:  = printf call 2
L_8: call printf


#L_9: L_13 goto 
L_9: jmp L_13


#L_10: "%d is a negative number\n" rdi 
L_10: mov $str256, %rdi


#L_11: n rsi 
L_11: mov -16(%rbp), %rsi


#L_12:  = printf call 2
L_12: call printf


#L_13: 368 ret 
L_13: add $368, %rsp
pop %rbp
ret


#main:   
main: push %rbp
mov %rsp, %rbp


#L_15: 272 frame 
L_15: sub $272, %rsp


#L_16: t_1 = 2 * 8
L_16: mov $2, %rax
mov $8, %rbx
mulq %rbx
mov %rax, -48(%rbp)


#L_17: a = t_1 []= 16
L_17: mov $a, %rax
mov -48(%rbp), %rbx
add %rbx, %rax
mov $16, %rbx
mov %rbx, (%rax)


#L_18: t_2 = 2 * 8
L_18: mov $2, %rax
mov $8, %rbx
mulq %rbx
mov %rax, -144(%rbp)


#L_19: t_3 = a [] t_2
L_19: mov $a, %rax
mov -144(%rbp), %rbx
add %rbx, %rax
mov (%rax), %rbx
mov %rbx, -160(%rbp)


#L_20: t_3 rdi 
L_20: mov -160(%rbp), %rdi


#L_21:  = fun call 1
L_21: call fun


#L_22: 272 ret 
L_22: add $272, %rsp
pop %rbp
ret

