# JDBCLearn
learn  jdbc

1������mysql-connector-java-version-bin.jar ��
2����д������
3������������ 
	Class.forName("com.mysql.jdbc.Driver");
4����������
	Connection connection = 
	DriverManager.getConnection("jdbc:mysql://host:port/database", "user", "password");
5��ִ��SQL���
	