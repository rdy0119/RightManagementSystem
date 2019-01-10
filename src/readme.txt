* jdbc封装的使用手册
	* 引入jdbc的源码或jar文件，引入驱动jar文件。
	* 在src下创建db-config.properties。做如下配置：
		driver=org.gjt.mm.mysql.Driver
		url=jdbc:mysql://localhost:3306/qxgl
		username=root
		password=root
	* 自定义dao继承BaseDao父类
	* 父类提供CRUD方法。
		* 根据提示，传递参数
		super.insert("insert into t_user values(?,?,?,?)",1001,"dmc","123","DMC");
		List<User> users = super.select("select * from t_user" ,User.class) ;
		List<Long> count = super.select("select count(*) from t_user");