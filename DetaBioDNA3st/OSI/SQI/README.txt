This project bases on the Extension project of DETA Socket PLSQL DB.

### 20210320 Initon Math Yaoguang Luo
### 20210320 Ԫ����ѧ  ������

�Դ�����AOPM VECS IDUQ TXH DD ��16��Ԫ���ɷ֣��ҽ��춨��Ϊ16���Ƶ����֣���ӦΪ

#### ��Ȼ���Ͻ����壬 ��ȻҪ������������˫Ԫ�������������Ƶ���ʼ��
##### ������δ֪��ΪX
##### A     XXXX
##### O     XXXX
##### P     XXXX
##### M     XXXX
##### V     XXXX
##### E     XXXX
##### C     XXXX
##### S     XXXX
##### I     XXX1 
##### D     XXX0
##### U     XXX2 
##### Q     XXX3
##### T     XXXX
##### X     XXXX
##### HE    XXXX
##### HC    XXXX
##### DD    ����

���ݵ�һ�� �� �ڶ���283��284ҳ�������г����� ���� ��ϵʽ E -> HE, C -> HC.

���� �����߼� �� ��ɢ��ѧ λ�б� �� �Ĵ淨�� �Ƶ� VECS Ϊ ��
##### A     XXXX
##### O     XXXX
##### P     XXXX
##### M     XXXX

##### V     XXX1
##### E     XXX2
##### C     XXX0
##### S     XXX3

##### I     0001 
##### D     0000
##### U     0002 
##### Q     0003

##### T     XXXX
##### X     XXXX
##### HE    XXX2
##### HC    XXX0

##### DD    ����

׼��д��ŷ��·���㷨��ʼ���� �� ��һ��� ����Ԥ�� �� ��ʱ�������ó���

��������⡣

�ռ�����ŷ��Ԫ����· QUIVT+OSMAX-HEPCD
�Ҷ���17���Ƶ�����Ϊ 
##### QUIVT+OSMAX-HEPCD DD 
##### GFEDCBA9876543210 CARRY
����˼����ô������16���ơ�
�ȱ�֤�߼����Ͻ��ԣ�
������17������һ��·�̡�


#### 17���������Ѿ��������ҽ��������£�����Ԫ�����ӷ� ̽����wechat�Ѿ������ˣ���������������;
##### Ԫ�������� =  Ԫ������ =  ��������
##### 0	=		D  =   	�����                     
##### 1	=		C  =	������
##### 2 =		P  =	���������
##### 3 =		E  =	�������
##### 4 =		H  =	������
##### 5 =		-  =
##### 6 =		X  =	���������
##### 7 =		A  =    ���������
##### 8 =		M  =    ������
##### 9 =		S  = 	 ������
##### A =		O  =	 ���������
##### B =		+  =
##### C =		T  =    ����������
##### D =		V  = 	 ���������
##### E =		I  = 	�����
##### F =		U  =  	�����
##### G =		Q  = 	 �������

�����߼����Ƶ�(C=U+D+D)
#### ������չ��ʽ�Ƶ�
##### Ԫ������    =Ԫ������ =   ��չ��ʽ���ֱ任
##### 0	=	    D	=  	0 + 0           
##### 1	=		C   =   0 + F
##### 2 =		P   =	3 + 1
##### 3 =		E   = 	F + 0
##### 4 =		H   = 	3 OR 1
##### 5 =		-   =    
##### 6 =		X   = 	D + - 
##### 7 =		A   = 	D + 9
##### 8 =		M   = 	- + 9
##### 9 =		S   = 	G + E
##### A =		O   = 	3 + 9
##### B =		+   =     
##### C =		T   = 	D + 3
##### D =		V   =   F + G
##### E =		I   =  	
##### F =		U   =  	
##### G =		Q   = 	




### Ԫ����ѧ�ӷ��� ���� 4 �Ĺ��������Ƶ�����
#### Ԫ������  =   Ԫ������=   ��չ��ʽ���ֱ任
#### 0	=		D  = 	0 + 0           
#### 1	=		C  =  	0 + F
#### 2 	=		P  = 	3 + 1
#### 3 	=		E  =  	F + 0
#### 4 	=		H  =  	3 OR 1
#### 5 	=		-  =    4 + 1
#### 6 	=		X  =  	D + 5 
#### 7 	=		A  = 	D + 9
#### 8 	=		M  = 	5 + 9
#### 9 	=		S  = 	G + E
#### A 	=		O  = 	3 + 9
#### B 	=		+  =    4 + 3
#### C 	=		T  = 	D + B
#### D 	=		V  = 	F + G
#### E 	=		I  = 	E
#### F 	=		U  = 	E++ OR G--
#### G 	=		Q  =    G

#### 20210322 �����ʮ�߽��Ƶ�Ԫ�������ѧ�任 �����ˣ������������£�
#### �ҵ�˼·�� Ԫ���ȶ���DEFG�任
#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ���任                         
##### 0	=		D  =    00               
##### 1	=		C  =  	02
##### 2 =		P  =    2002
##### 3 =		E  =  	20
##### 4 =		H  =  	20, 02
##### 5 =		-  =    2002, 0202
##### 6 =		X  =  	23(2002, 0202) 
##### 7 =		A  = 	2331
##### 8 =		M  = 	(2002, 0202)31
##### 9 =		S  = 	31
##### A =		O  = 	2031
##### B =		+  =    2020, 0220
##### C =		T  = 	23(2020, 0220)
##### D =		V  = 	23
##### E =		I  = 	1
##### F =		U  = 	2
##### G =		Q  =    3
#### �ȶ���������Ԫ���滻Ϊ  0123-> DIUQ ����

##### 0	=		D  =    D + D               
##### 1	=		C  =  	DU
##### 2 =		P  =    UDDU
##### 3 =		E  =  	UD
##### 4 =		H  =  	UD, DU
##### 5 =		-  =    (UD, DU)DU
##### 6 =		X  =  	UQ(UD, DU)DU
##### 7 =		A  = 	UQQI
##### 8 =		M  = 	(UD, DU)DUQI
##### 9 =		S  = 	QI
##### A =		O  = 	UDQI
##### B =		+  =    (UD, DU)UD
##### C =		T  = 	UQ(UD, DU)UD
##### D =		V  = 	UQ
##### E =		I  = 	I
##### F =		U  = 	U
##### G =		Q  =    Q

����˼�� ��������ڵ�Ԫ���������֮������Ψһ����
������ ʮ���Ƴ�������Ԫ���� �任��˼·�Ѿ������ˣ���һ�������ƾ���ʵӦ�á�
����� 568B ���Ʋ�����һ�����Կ�������ơ���Ҳ����ʵӦ�ò�����֤��


�������һ���Ƶ����Ұ�0��G��ŷ��˳�� �ĳ� ������ѧ˳��۲����£�
##### 0	=		D  =    D + D   
##### E =		I  = 	I
##### F =		U  = 	U
##### G =		Q  =    Q
##### 1	=		C  =  	DU
##### D =		V  = 	UQ
##### 3 =		E  =  	UD
##### 9 =		S  = 	QI
##### 7 =		A  = 	UQQI
##### 2 =		P  =    UDDU
##### A =		O  = 	UDQI
##### 4 =		H  =  	UD, DU
##### 5 =		-  =    (UD, DU)DU
##### B =		+  =    (UD, DU)UD
##### 6 =		X  =  	UQ(UD, DU)DU
##### C =		T  = 	UQ(UD, DU)UD
##### 8 =		M  = 	(UD, DU)DUQI

#### �������˳�������;���ȸ��á�
#### ��һ�� H ����HE+, HC- , Ȼ������������������
##### 0	=		D  =    D   
##### E =		I  = 	I
##### F =		U  = 	U
##### G =		Q  =    Q
##### 1	=		C  =  	DU
##### 3 =		E  =  	UD
##### 4 =		H  =  	UD, DU
##### D =		V  = 	UQ
##### 9 =		S  = 	QI
##### 5 =		-  =    DUDU
##### 2 =		P  =    UDDU
##### B =		+  =    UDUD
##### A =		O  = 	UDQI
##### 7 =		A  = 	UQQI
##### 8 =		M  = 	DUDUQI
##### 6 =		X  =  	UQDUDU
##### C =		T  = 	UQUDUD

����������
##### 0	=		D  =    D   
##### E =		I  = 	I
##### F =		U  = 	U
##### G =		Q  =    Q
##### 1	=		C  =  	DI
##### 3 =		E  =  	UD
##### 4 =		H  =  	UD, DU
##### D =		V  = 	UQ
##### 9 =		S  = 	QI
##### 5 =		-  =    DUDU
##### 2 =		P  =    UDDU
##### B =		+  =    UDUD
##### A =		O  = 	UDQI
##### 7 =		A  = 	UQQI
##### 8 =		M  = 	DUDUQI
##### 6 =		X  =  	UQDUDU
##### C =		T  = 	UQUDUD

������ C=DU�ĳ� DI, ��Ϊ��չ��ʽ(�������) C= DDU, DD�ǲ���
### ��չ��ʽ���Ƶ�(��չ����)(C=I+D)
### ��ʼ������չ��ʽ��֤### Ԫ����ѧ�ӷ��� ���� 4 �Ĺ��������Ƶ�����
### Ԫ������  =   Ԫ������=   ��չ��ʽԪ���任
#### 0	=		D  = 	D + D           
#### 1	=		C  =  	I + D 
#### 2 	=		P  = 	E + C
#### 3 	=		E  =  	I + U, D + U
#### 4 	=		H  =  	E OR C
#### 5 	=		-  =    H + C
#### 6 	=		X  =  	V + HC 
#### 7 	=		A  = 	V + S
#### 8 	=		M  = 	HC + S

#### 9 	=		S  = 	Q + I
#### A 	=		O  = 	E + S
#### B 	=		+  =    H + E

#### C 	=		T  = 	V + HE
#### D 	=		V  = 	U + Q
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q

###����Ԫ�����ֹ���
#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任
#### 0	=		D  = 	0 + 0           
#### 1	=		C  =  	1 + 0 
#### 2 	=		P  = 	(12, 02) + 10
#### 3 	=		E  =  	1 + 2, 0 + 2
#### 4 	=		H  =  	(12, 02) OR 10
#### 5 	=		HC =    (12, 02) OR 10 + 10
#### 6 	=		X  =  	23 + (12, 02) OR 10 + 10
#### 7 	=		A  = 	23 + 31
#### 8 	=		M  = 	(12, 02) OR 10 + 10 + 31

#### 9 	=		S  = 	3 + 1
#### A 	=		O  = 	(12, 02) + 31
#### B 	=		HE =    (12, 02) OR 10 + 12, 02

#### C 	=		T  = 	23 + (12, 02) OR 10 + (12, 02)
#### D 	=		V  = 	2 + 3
#### E 	=		I  = 	1
#### F 	=		U  = 	1++ OR 3--
#### G 	=		Q  =    3

###����Ԫ����չ��������
#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任
#### 0	=		D  = 	D + D           
#### 1	=		C  =  	I + D 
#### 2 	=		P  = 	(IU, DU) + ID
#### 3 	=		E  =  	I + U, D + U
#### 4 	=		H  =  	(IU, DU) OR ID
#### 5 	=		HC =    (IU, DU) OR ID + ID
#### 6 	=		X  =  	UQ + (IU, DU) OR ID + ID
#### 7 	=		A  = 	UQ + QI
#### 8 	=		M  = 	(IU, DU) OR ID + ID + QI

#### 9 	=		S  = 	Q + I
#### A 	=		O  = 	(IU, DU) + QI
#### B 	=		HE =    (IU, DU) OR ID + (IU, DU)

#### C 	=		T  = 	UQ + (IU, DU) OR ID + (IU, DU)
#### D 	=		V  = 	U + Q
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q

###��ʼ����
#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任
#### 0	=		D  = 	DD           
#### 1	=		C  =  	ID 
#### 2 	=		P  = 	IUID, DUID
#### 3 	=		E  =  	IU, DU
#### 4 	=		H  =  	(IU, DU) OR ID
#### 5 	=		HC =    (IU, DU) OR ID + ID
#### 6 	=		X  =  	UQ + (IU, DU) OR ID + ID
#### 7 	=		A  = 	UQQI
#### 8 	=		M  = 	(IU, DU) OR ID + ID + QI

#### 9 	=		S  = 	QI
#### A 	=		O  = 	(IU, DU) + QI
#### B 	=		HE =    (IU, DU) OR ID + (IU, DU)

#### C 	=		T  = 	UQ + (IU, DU) OR ID + (IU, DU)
#### D 	=		V  = 	UQ
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q


�ҵõ�һ�����ۣ���չ��ʽ���Ƶ�(C=I+D)�������߼����Ƶ�(C=U+D+D)��׼ȷ��

###��ʼ��������
#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任
#### 0	=		D  = 	DD           
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q

#### 1	=		C  =  	ID 
#### 3 	=		E  =  	IU, DU
#### 4 	=		H  =  	(IU, DU) OR ID
#### D 	=		V  = 	UQ
#### 9 	=		S  = 	QI


#### 2 	=		P  = 	(IU, DU) + ID
#### A 	=		O  = 	(IU, DU) + QI
#### 5 	=		HC =    ((IU, DU) OR ID) + ID
#### B 	=		HE =    ((IU, DU) OR ID) + (IU, DU)
#### 8 	=		M  = 	((IU, DU) OR ID) + ID + QI

#### 7 	=		A  = 	UQQI
#### 6 	=		X  =  	UQ + ((IU, DU) OR ID) + ID
#### C 	=		T  = 	UQ + ((IU, DU) OR ID) + (IU, DU)


###���������Ż�
#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任
#### 0	=		D  = 	DD           
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q

#### 1	=		C  =  	ID 
#### 3 	=		E  =  	IU, DU
#### 4 	=		H  =  	(IU, DU) OR ID
#### 5 	=		HC =    ((IU, DU) OR ID) + ID
#### B 	=		HE =    ((IU, DU) OR ID) + (IU, DU)
#### D 	=		V  = 	UQ
#### 9 	=		S  = 	QI


#### 2 	=		P  = 	(IU, DU) + ID
#### A 	=		O  = 	(IU, DU) + QI
#### 7 	=		A  = 	UQQI


#### 8 	=		M  = 	((IU, DU) OR ID) + ID + QI
#### 6 	=		X  =  	UQ + ((IU, DU) OR ID) + ID
#### C 	=		T  = 	UQ + ((IU, DU) OR ID) + (IU, DU)

### ���Ƶ�������Ԫ���Ĵ���Ϊ 
#### A O P M - T X H DD - V E C S - I D U Q
### ���ڵ�Ԫ�������߼�����Ϊ
#### M X T - P O A - C E H HC HE V S - D I U Q



###�����չ����������
#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任 = (�ĸ���չ�������߼�����)
#### 0	=		D  = 	DD =(D, DD)         
#### E 	=		I  = 	I  =(I) 
#### F 	=		U  = 	I++ OR Q--  =(I, Q) 
#### G 	=		Q  =    Q  =(Q) 

#### 1	=		C  =  	ID  =(ID) 
#### 3 	=		E  =  	IU, DU  =(IU, DU) 
#### 4 	=		H  =  	(IU, DU) OR ID  =(IU, DU, ID) 
#### D 	=		V  = 	UQ  =(UQ) 
#### 9 	=		S  = 	QI  =(QI) 


#### 2 	=		P  = 	(IU, DU) + ID  =(IUID, DUID) 
#### 5 	=		HC =    ((IU, DU) OR ID) + ID  =(IUID, DUID, IDID) 
#### B 	=		HE =    ((IU, DU) OR ID) + (IU, DU)  =(IUIU, IUDU, DUIU, DUDU, IDIU, IDDU) 
#### A 	=		O  = 	(IU, DU) + QI  =(IUQI, DUQI) 
#### 7 	=		A  = 	UQQI  =(UQQI) 


#### 8 	=		M  = 	((IU, DU) OR ID) + ID + QI  =(IUIDQI, DUIDQI, IDIDQI) 
#### 6 	=		X  =  	UQ + ((IU, DU) OR ID) + ID  =(UQIUID, UQDUID, UQIDID) 
#### C 	=		T  = 	UQ + ((IU, DU) OR ID) + (IU, DU)  =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQIDIU, UQIDDU) 

### ���ɺ��Ԫ�������߼�����Ϊ
#### M X T - P HC HE O A - C E H V S - D I U Q

### ���ɺ��Ԫ�����ֻ��Դ���Ϊ
#### T X M - HE HC O P A - H E C V S - U D I Q

### ׼��Ӧ�������ƾ�DNA�Ӿ����м���֤�£��Ż�������DNA���ݿ�����ֲ���㡣

����������D��I��ǰ�棬������׼������C=IDΪDI���������£�


### ����C���������չ���㹫ʽ�۲�
#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任 = (�ĸ���չ�������߼�����)
#### 0	=		D  = 	DD =(D, DD)         
#### E 	=		I  = 	I  =(I) 
#### F 	=		U  = 	I++ OR Q--  =(I, Q) 
#### G 	=		Q  =    Q  =(Q) 

#### 1	=		C  =  	DI  =(DI) 
#### 3 	=		E  =  	IU, DU  =(IU, DU) 
#### 4 	=		H  =  	(IU, DU) OR DI  =(IU, DU, DI) 
#### D 	=		V  = 	UQ  =(UQ) 
#### 9 	=		S  = 	QI  =(QI) 


#### 2 	=		P  = 	(IU, DU) + DI  =(IUDI, DUDI) 
#### 5 	=		HC =    ((IU, DU) OR DI) + DI  =(IUDI, DUDI, DIDI) 
#### B 	=		HE =    ((IU, DU) OR DI) + (IU, DU)  =(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU) 
#### A 	=		O  = 	(IU, DU) + QI  =(IUQI, DUQI) 
#### 7 	=		A  = 	UQQI  =(UQQI) 


#### 8 	=		M  = 	((IU, DU) OR DI) + DI + QI  =(IUDIQI, DUDIQI, DIDIQI) 
#### 6 	=		X  =  	UQ + ((IU, DU) OR DI) + DI  =(UQIUDI, UQDUDI, UQDIDI) 
#### C 	=		T  = 	UQ + ((IU, DU) OR DI) + (IU, DU)  =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU, UQDIDU) 


#### ����������������ɢ��ѧ�� H  =  	(IU, DU) OR DI= (IU, DU) + DI= IUDI, DUDI, �������չ��ʽ�� ��ɢ��ѧ�п��Լ���չ������

#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任 = (�ĸ���չ�������߼�����)
#### 0	=		D  = 	DD =(D, DD)         
#### E 	=		I  = 	I  =(I) 
#### F 	=		U  = 	I++ OR Q--  =(I, Q) 
#### G 	=		Q  =    Q  =(Q) 

#### 1	=		C  =  	DI  =(DI) 
#### 3 	=		E  =  	IU, DU  =(IU, DU) 
#### 4 	=		H  =  	(IU, DU) OR DI  =(IU, DU, DI) OR (IUDI, DUDI) 
#### D 	=		V  = 	UQ  =(UQ) 
#### 9 	=		S  = 	QI  =(QI) 


#### 2 	=		P  = 	(IU, DU) + DI  =(IUDI, DUDI) 
#### 5 	=		HC =    ((IU, DU) OR DI) + DI  =(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI)
#### B 	=		HE =    ((IU, DU) OR DI) + (IU, DU)  =(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU) OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU) 
#### A 	=		O  = 	(IU, DU) + QI  =(IUQI, DUQI) 
#### 7 	=		A  = 	UQQI  =(UQQI) 


#### 8 	=		M  = 	((IU, DU) OR DI) + DI + QI  =(IUDIQI, DUDIQI, DIDIQI) OR (IUDIDIQI, DUDIDIQI) 
#### 6 	=		X  =  	UQ + ((IU, DU) OR DI) + DI  =(UQIUDI, UQDUDI, UQDIDI) OR (UQIUDIDI, UQDUDIDI)
#### C 	=		T  = 	UQ + ((IU, DU) OR DI) + (IU, DU)  =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU) 

#### �ƺ���ʼ���������ǻ���˳���ִ����ˣ������������£�

#### Ԫ������  =   Ԫ������=   ��չ��ʽԪ�����ֱ任 = (�ĸ���չ�������߼�����)
#### 1λ  
##### E 	=		I  = 	I  =(I) 
##### F 	=		U  = 	I++ OR Q--  =(I, Q) 
##### G 	=		Q  =    Q  =(Q) 
#### 1~2λ
##### 0		=		D  = 	DD =(D, DD)    
#### 2λ
##### 1		=		C  =  	DI  =(DI) 
##### 3 	=		E  =  	IU, DU  =(IU, DU)
##### D 	=		V  = 	UQ  =(UQ) 
##### 9 	=		S  = 	QI  =(QI) 
#### 2~4λ
##### 4 	=		H  =  	(IU, DU) OR DI  =(IU, DU, DI) OR (IUDI, DUDI) 
#### 4λ
##### 2 	=		P  = 	(IU, DU) + DI  =(IUDI, DUDI) 
##### A 	=		O  = 	(IU, DU) + QI  =(IUQI, DUQI) 
##### 7 	=		A  = 	UQQI  =(UQQI) 
#### 4~6λ
##### 5 	=		HC- =    ((IU, DU) OR DI) + DI  =(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI)
##### B 	=		HE+ =    ((IU, DU) OR DI) + (IU, DU)  =(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU) OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU) 
#### 6~8λ
##### 8 	=		M  = 	((IU, DU) OR DI) + DI + QI  =(IUDIQI, DUDIQI, DIDIQI) OR (IUDIDIQI, DUDIDIQI) 
##### 6 	=		X  =  	UQ + ((IU, DU) OR DI) + DI  =(UQIUDI, UQDUDI, UQDIDI) OR (UQIUDIDI, UQDUDIDI)
##### C 	=		T  = 	UQ + ((IU, DU) OR DI) + (IU, DU)  =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU) 

#### C���� = DI ���� ������һ���Ĺ�ʽ���ñ䶯��
### �����
#### Ԫ�����Դ���Ϊ <IUQ D CEVS H POA -+ MXT>

#### �ҵõ�һ�����ۣ�IDQ ���ȶ�Ԫ���� UH�ǻ���Ԫ��.��2021024 ���۸��£� IQ���ȶ�Ԫ���� DUH�ǻ���Ԫ����

#### ���ɳ�����
##### �����ʣ�������չ��Ԫ ����
##### ����ण����� Ѫ���� ����
##### ����ण����� ���� ����


#### ��չ��ʽ�ο��� 
##### AOPM VECS IDUQ ��չ��ʽ�Ƶ���Ԫ��������������Լ�����Ӧ�÷��� 1.2.2 ������������ ��ˮ�� <2020Z11L0356797> �������� 2021-A-00942587 (�л����񹲺͹� ���Ұ�Ȩ��)
##### AOPM-VECS-IDUQ Catalytic INITONS PDE LAW and Its Application
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/%E8%91%97%E4%BD%9C%E6%9D%83%E7%89%88%E6%9C%ACPDE_Formular_1_2_2.pdf
##### https://github.com/yaoguangluo/Deta_Resource/blob/master/%E8%91%97%E4%BD%9C%E6%9D%83%E7%89%88%E6%9C%ACPDE_Formular_1_2_2.pdf

#### Ԫ�������ο���
##### <������DNA�� ��Ԫ���ڴ߻�����ӳ����뷽ʽ V_1.2.2�汾������������ ��ˮ�� <2020Z11L0333706> ��������-2021-A-00097017
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/DNA%20%E7%BC%96%E7%A0%81%E6%96%B9%E5%BC%8F1.2.2%20%E4%B8%AD%E8%AF%91%E8%8B%B1%E6%B7%B7%E5%90%88%E7%89%88.pdf
##### https://github.com/yaoguangluo/Deta_Resource/blob/master/DNA%20%E7%BC%96%E7%A0%81%E6%96%B9%E5%BC%8F1.2.2%20%E4%B8%AD%E8%AF%91%E8%8B%B1%E6%B7%B7%E5%90%88%E7%89%88.pdf

#### DNA �߻� �� ��չ���� �� AOPM-TXH-VECS-IDUQ Ԫ������ V013_026���İ汾 ������������ ��ˮ�� <2020Z11L0386462> �������� 2021-A-00942586 (�л����񹲺͹� ���Ұ�Ȩ��)
##### https://github.com/yaoguangluo/Deta_Resource/blob/master/DNA%20Initon%20����%20013026���������������հ汾.pdf
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/DNA%20Initon%20����%20013026���������������հ汾.pdf
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/DNA%20Initon%20����%20013026���������������հ汾%20����'ʳ'��.pdf
##### https://github.com/yaoguangluo/Deta_Resource/blob/master/DNA%20Initon%20����%20013026���������������հ汾%20����'ʳ'��.pdf

#### Ԫ��ŷ��������ο���
##### https://gitee.com/DetaChina/dna_-db/blob/master/Initon_Math/org/math/initon/ouler/FindOulerRing.java

#### ˫Ԫ���̲ο���
##### ��������(������, ������) DNAԪ���߻����ļ���ڶ��� ���ƾ�Ӧ���о� 20210305 ������������ ��ˮ�� <2021Z11L1057159> 
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/������-DNA�߻����ļ���ڶ���20210305.pdf
##### https://github.com/yaoguangluo/Deta_Catalytic_DNA/blob/master/������-DNA�߻����ļ���ڶ���20210305.pdf

�ߵ��⣬Ԫ����ѧ ��ʽ���Ѿ������ˣ���һ���Ϳ�ʼ��Ӧ�á� 


#### Yaoguang.Luo
#### ������

##### ���� �� eclipse �Ĺ����� idea�� ������ԡ������� license�� ����������Ȩ�汾�� �ָĻ�eclipse