#-------------------------------------
# L_1		LABEL	0	0
# L_2		LABEL	0	48
# L_3		LABEL	0	80
# L_4		LABEL	0	112
# L_5		LABEL	0	128
# "i = j = %d\n"		STR	0	144
# L_6		LABEL	0	160
# L_7		LABEL	0	192
# L_8		LABEL	0	208
# L_9		LABEL	0	256
# L_10		LABEL	0	272
# L_11		LABEL	0	288
# "i += j = %d\n"		STR	0	304
# L_12		LABEL	0	320
# L_13		LABEL	0	336
# L_14		LABEL	0	352
# L_15		LABEL	0	400
# L_16		LABEL	0	416
# L_17		LABEL	0	432
# "i -= j = %d\n"		STR	0	448
# L_18		LABEL	0	464
# L_19		LABEL	0	480
# L_20		LABEL	0	496
# L_21		LABEL	0	544
# L_22		LABEL	0	560
# "i = j + 10 = %d\n"		STR	0	576
# L_23		LABEL	0	592
# L_24		LABEL	0	608
# L_25		LABEL	0	624
# L_26		LABEL	0	656
# L_27		LABEL	0	672
# "i = j - i = %d\n"		STR	0	688
# L_28		LABEL	0	704
# L_29		LABEL	0	720
# L_30		LABEL	0	736
# L_31		LABEL	0	784
# L_32		LABEL	0	800
# "i = i * 2 = %d\n"		STR	0	816
# L_33		LABEL	0	832
# L_34		LABEL	0	848
# L_35		LABEL	0	864
# L_36		LABEL	0	896
# L_37		LABEL	0	912
# "i = i / j = %d\n"		STR	0	928
# L_38		LABEL	0	944
# L_39		LABEL	0	960
# L_40		LABEL	0	976
# L_41		LABEL	0	1040
# L_42		LABEL	0	1072
# L_43		LABEL	0	1088
# L_44		LABEL	0	1104
# "i = i % 3 = %d\n"		STR	0	1120
# L_45		LABEL	0	1136
# L_46		LABEL	0	1152
# L_47		LABEL	0	1168
# L_48		LABEL	0	1216
# L_49		LABEL	0	1232
# L_50		LABEL	0	1248
# L_51		LABEL	0	1296
# "i = %d\n"		STR	0	1312
# L_52		LABEL	0	1328
# L_53		LABEL	0	1344
# L_54		LABEL	0	1360
# L_55		LABEL	0	1376
# L_56		LABEL	0	1392
# L_57		LABEL	0	1408
# L_58		LABEL	0	1424
# L_59		LABEL	0	1440
#-------------------------------------
#-------------------------------------
# main		VOID	0	0
# 1456		INT	0	1456
#-------------------------------------
#-------------------------------------
#-------------------------------------
#-------------------------------------
# i		INT	0	16
# j		INT	0	32
# 1		INT	0	64
# 2		INT	0	96
# printf		STR	0	176
# t_0		INT	0	224
# t_1		INT	0	240
# t_2		INT	0	368
# t_3		INT	0	384
# 10		INT	0	512
# t_4		INT	0	528
# t_5		INT	0	640
# 2		INT	0	752
# t_6		INT	0	768
# t_7		INT	0	880
# 3		INT	0	992
# t_8		INT	0	1008
# t_9		INT	0	1024
# t_10		INT	0	1056
# 0		INT	0	1184
# t_11		BOOLEAN	0	1200
#-------------------------------------
#-------------------------------------
# i		INT	0	1264
# 2		INT	0	1280
#-------------------------------------
#-------------------------------------
#-------------------------------------
.globl main
.data
str144: .asciz "i = j = %d\n"
str304: .asciz "i += j = %d\n"
str448: .asciz "i -= j = %d\n"
str576: .asciz "i = j + 10 = %d\n"
str688: .asciz "i = j - i = %d\n"
str816: .asciz "i = i * 2 = %d\n"
str928: .asciz "i = i / j = %d\n"
str1120: .asciz "i = i % 3 = %d\n"
str1312: .asciz "i = %d\n"
.text

#main:   
main: push %rbp
mov %rsp, %rbp


#L_1: 1456 frame 
L_1: sub $1456, %rsp


#L_2: i = 1 = 
L_2: mov $1, %rax
mov %rax, -16(%rbp)


#L_3: j = 2 = 
L_3: mov $2, %rax
mov %rax, -32(%rbp)


#L_4: i = j = 
L_4: mov -32(%rbp), %rax
mov %rax, -16(%rbp)


#L_5: "i = j = %d\n" rdi 
L_5: mov $str144, %rdi


#L_6: i rsi 
L_6: mov -16(%rbp), %rsi


#L_7:  = printf call 2
L_7: call printf


#L_8: t_0 = i = 
L_8: mov -16(%rbp), %rax
mov %rax, -224(%rbp)


#L_9: t_1 = t_0 + j
L_9: mov -224(%rbp), %rax
mov -32(%rbp), %rbx
add %rbx, %rax
mov %rax, -240(%rbp)


#L_10: i = t_1 = 
L_10: mov -240(%rbp), %rax
mov %rax, -16(%rbp)


#L_11: "i += j = %d\n" rdi 
L_11: mov $str304, %rdi


#L_12: i rsi 
L_12: mov -16(%rbp), %rsi


#L_13:  = printf call 2
L_13: call printf


#L_14: t_2 = i = 
L_14: mov -16(%rbp), %rax
mov %rax, -368(%rbp)


#L_15: t_3 = t_2 - j
L_15: mov -368(%rbp), %rax
mov -32(%rbp), %rbx
sub %rbx, %rax
mov %rax, -384(%rbp)


#L_16: i = t_3 = 
L_16: mov -384(%rbp), %rax
mov %rax, -16(%rbp)


#L_17: "i -= j = %d\n" rdi 
L_17: mov $str448, %rdi


#L_18: i rsi 
L_18: mov -16(%rbp), %rsi


#L_19:  = printf call 2
L_19: call printf


#L_20: t_4 = j + 10
L_20: mov -32(%rbp), %rax
mov $10, %rbx
add %rbx, %rax
mov %rax, -528(%rbp)


#L_21: i = t_4 = 
L_21: mov -528(%rbp), %rax
mov %rax, -16(%rbp)


#L_22: "i = j + 10 = %d\n" rdi 
L_22: mov $str576, %rdi


#L_23: i rsi 
L_23: mov -16(%rbp), %rsi


#L_24:  = printf call 2
L_24: call printf


#L_25: t_5 = j - i
L_25: mov -32(%rbp), %rax
mov -16(%rbp), %rbx
sub %rbx, %rax
mov %rax, -640(%rbp)


#L_26: i = t_5 = 
L_26: mov -640(%rbp), %rax
mov %rax, -16(%rbp)


#L_27: "i = j - i = %d\n" rdi 
L_27: mov $str688, %rdi


#L_28: i rsi 
L_28: mov -16(%rbp), %rsi


#L_29:  = printf call 2
L_29: call printf


#L_30: t_6 = i * 2
L_30: mov -16(%rbp), %rax
mov $2, %rbx
mulq %rbx
mov %rax, -768(%rbp)


#L_31: i = t_6 = 
L_31: mov -768(%rbp), %rax
mov %rax, -16(%rbp)


#L_32: "i = i * 2 = %d\n" rdi 
L_32: mov $str816, %rdi


#L_33: i rsi 
L_33: mov -16(%rbp), %rsi


#L_34:  = printf call 2
L_34: call printf


#L_35: t_7 = i / j
L_35: mov $0, %rdx
mov -16(%rbp), %rax
mov -32(%rbp), %rbx
idiv %rbx
mov %rax, -880(%rbp)


#L_36: i = t_7 = 
L_36: mov -880(%rbp), %rax
mov %rax, -16(%rbp)


#L_37: "i = i / j = %d\n" rdi 
L_37: mov $str928, %rdi


#L_38: i rsi 
L_38: mov -16(%rbp), %rsi


#L_39:  = printf call 2
L_39: call printf


#L_40: t_8 = i / 3
L_40: mov $0, %rdx
mov -16(%rbp), %rax
mov $3, %rbx
idiv %rbx
mov %rax, -1008(%rbp)


#L_41: t_9 = t_8 * 3
L_41: mov -1008(%rbp), %rax
mov $3, %rbx
mulq %rbx
mov %rax, -1024(%rbp)


#L_42: t_10 = i - t_9
L_42: mov -16(%rbp), %rax
mov -1024(%rbp), %rbx
sub %rbx, %rax
mov %rax, -1056(%rbp)


#L_43: i = t_10 = 
L_43: mov -1056(%rbp), %rax
mov %rax, -16(%rbp)


#L_44: "i = i % 3 = %d\n" rdi 
L_44: mov $str1120, %rdi


#L_45: i rsi 
L_45: mov -16(%rbp), %rsi


#L_46:  = printf call 2
L_46: call printf


#L_47: t_11 = i cmp 0
L_47: mov -16(%rbp), %rax
mov $0, %rbx
cmp %rax, %rbx
mov %rax, -1200(%rbp)


#L_48: L_50 = t_11 jl 
L_48: jl L_50


#L_49: L_55 = t_11 jge 
L_49: jge L_55


#L_50: i = 2 = 
L_50: mov $2, %rax
mov %rax, -1264(%rbp)


#L_51: "i = %d\n" rdi 
L_51: mov $str1312, %rdi


#L_52: i rsi 
L_52: mov -1264(%rbp), %rsi


#L_53:  = printf call 2
L_53: call printf


#L_54: L_58 goto 
L_54: jmp L_58


#L_55: "i = %d\n" rdi 
L_55: mov $str1312, %rdi


#L_56: i rsi 
L_56: mov -16(%rbp), %rsi


#L_57:  = printf call 2
L_57: call printf


#L_58: 1456 ret 
L_58: add $1456, %rsp
pop %rbp
ret

