* jdbc��װ��ʹ���ֲ�
	* ����jdbc��Դ���jar�ļ�����������jar�ļ���
	* ��src�´���db-config.properties�����������ã�
		driver=org.gjt.mm.mysql.Driver
		url=jdbc:mysql://localhost:3306/qxgl
		username=root
		password=root
	* �Զ���dao�̳�BaseDao����
	* �����ṩCRUD������
		* ������ʾ�����ݲ���
		super.insert("insert into t_user values(?,?,?,?)",1001,"dmc","123","DMC");
		List<User> users = super.select("select * from t_user" ,User.class) ;
		List<Long> count = super.select("select count(*) from t_user");