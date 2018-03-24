package com.gb.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.gb.model.SexEnum;

public class SexEnumHandler implements TypeHandler<SexEnum>{

	// ����ռλ��
	//  select * from t_user where sex=?
	//  prst.setInt(1,1);
	
	@Override
	public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(i, parameter.getValue());
	}

	// ʹ��resultset����������ȡ��ֵ�����ݻ�ȡ��ֵ����SexEnum����
	@Override
	public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
		int id = rs.getInt(columnName);
		return SexEnum.getSexEnumById(id);
	}

	@Override
	public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		int id = rs.getInt(columnIndex);
		return SexEnum.getSexEnumById(id);
	}

	@Override
	public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
		int id = cs.getInt(columnIndex);
		return SexEnum.getSexEnumById(id);
	}

}
