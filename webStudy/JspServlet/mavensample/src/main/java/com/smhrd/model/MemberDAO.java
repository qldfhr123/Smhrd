package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.smhrd.database.SqlSessionManager;

public class MemberDAO {
	// Java랑 Mybatis를 연결하는 역할

	SqlSessionFactory sessionFactory = SqlSessionManager.getSqlsessionFactory();

	public int join(MavenMember member) {
		// 1. factory 통해서 sqlSession 생성
		SqlSession sqlSession = sessionFactory.openSession(true);

		// 매개변수 어떤 sql문 실행 넘겨줄값
		int res = sqlSession.insert("com.smhrd.database.MemberMapper.join", member);

		/** 세션 사용후 자원 반환 */
		sqlSession.close();

		return res;

	}

	public MavenMember login(MavenMember member) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		MavenMember result = sqlSession.selectOne("com.smhrd.database.MemberMapper.login", member);
		sqlSession.close();
		return result;
	}

	public int update(MavenMember member) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		int result = sqlSession.update("com.smhrd.database.MemberMapper.update", member);
		sqlSession.close();
		return result;
	}

	public int idCheck(String id) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		int count = sqlSession.selectOne("com.smhrd.database.MemberMapper.idCheck", id);
		sqlSession.close();
		return count;
	}

}
