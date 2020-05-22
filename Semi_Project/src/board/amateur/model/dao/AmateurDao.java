package board.amateur.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;
import board.amateur.model.vo.Reply;
import product.model.vo.MasterpieceCount;
public class AmateurDao {

	public int insertBoard(Connection conn, Amateur a) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		String query = "INSERT INTO EVENT VALUES(EVENT_SEQ.NEXTVAL, ?,?,SYSDATE,?,DEFAULT,DEFAULT)";
		
		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, a.getEvent_title());
			pstmt.setString(2, a.getUser_id());
			pstmt.setString(3, a.getEvent());
			
			System.out.println("[dao] insert data _ 제목:"+a.getEvent_title());
			System.out.println("[dao] insert data _ 작성자:"+a.getUser_id());
			System.out.println("[dao] insert data _ 내용:"+a.getEvent());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertAmateurFile(Connection conn, ArrayList<FileManagement> fileList) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO EVENT_FILE VALUES(EVENT_SEQ.CURRVAL,?,?)";
		
		try {
			for(int i = 0; i<fileList.size();i++) {
				FileManagement fm = fileList.get(i);
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, fm.getEvent_file());
				pstmt.setString(2, fm.getEvent_path());
				
				result=pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*) FROM EVENT";
		int listCount = 0;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		return listCount;
	}

	public ArrayList<Amateur> selectList(Connection conn, int currentPage, int limit) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		Amateur am = new Amateur();
		
		ArrayList<Amateur> list = new ArrayList<>();
//		list.add(am);
		String query = "SELECT * FROM EVENT WHERE EVENT_NO BETWEEN ? AND ?";
		
		int startRow = (currentPage -1)*limit+1;
		int endRow = startRow+limit-1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Amateur a = new Amateur(rset.getInt("event_no"),
										rset.getString("event_title"),
										rset.getString("user_id"),
										rset.getDate("event_date"),
										rset.getString("event"),
										rset.getInt("hit"),
										rset.getString("event_like"));
				list.add(a);		
			}
			System.out.println("[dao] 게시글 불러오기:"+list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<FileManagement> selectList(Connection conn, Amateur getEventNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		FileManagement fm1 = new FileManagement();
		ArrayList<FileManagement> list = new ArrayList<>();
		
//		list.add(fm1);
		String query = "SELECT * FROM EVENT_FILE";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				FileManagement fm = new FileManagement(rset.getInt("event_no"),
										rset.getString("event_file"),
										rset.getString("event_path"));
				
				list.add(fm);
			}
			System.out.println("[dao] 파일리스트 출력결과:"+list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public int updateCount(Connection conn, int aid) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "UPDATE EVENT SET HIT = HIT+1 WHERE EVENT_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, aid);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public Amateur selectBoard(Connection conn, int aid) {

		PreparedStatement pstmt = null;
		ResultSet rset= null;
		
		String query = "SELECT * FROM EVENT WHERE EVENT_NO=?";
		Amateur a = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, aid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				a = new Amateur(rset.getInt("EVENT_NO"),
								rset.getString("EVENT_TITLE"),
								rset.getString("USER_ID"),
								rset.getDate("EVENT_DATE"),
								rset.getString("EVENT"),
								rset.getInt("HIT"),
								rset.getString("EVENT_LIKE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
			return a;
	
	}

	public FileManagement selectFile(Connection conn, int aid) {
		PreparedStatement pstmt = null;
		ResultSet rset= null;
		
		String query = "SELECT * FROM EVENT_FILE WHERE EVENT_NO=?";
		FileManagement fm = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, aid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				fm = new FileManagement(rset.getInt("EVENT_NO"),
								rset.getString("EVENT_FILE"),
								rset.getString("EVENT_PATH"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
			return fm;
	}

	public ArrayList<Reply> selectReplyList(Connection conn, int event_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Reply> rList = null;
		
		String query = "SELECT * FROM EVENT_REPLY WHERE EVENT_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, event_no);
			
			rset = pstmt.executeQuery();
			rList = new ArrayList<Reply>();
			while(rset.next()) {
				rList.add(new Reply(rset.getInt("REPLY_NO"),
									rset.getInt("EVENT_NO"),
									rset.getString("REPLY"),
									rset.getDate("REPLY_DATE"),
									rset.getString("USER_ID")));
			}
			System.out.println("[아마추어게시판에서 게시글을 클릭했을 때(dao)] event_no 값:"+event_no);
			System.out.println("[아마추어게시판에서 게시글을 클릭했을 때(dao)] rList 값:"+rList);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return rList;
	}

	public int insertReply(Connection conn, Reply r) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		System.out.println("AmateurDao"+r.getEvent_no());
		System.out.println("AmateurDao"+r.getReply());
		System.out.println("AmateurDao"+r.getUser_id());
		
		String query = "INSERT INTO EVENT_REPLY VALUES(REPLY_SEQ.NEXTVAL,?,?,SYSDATE,?)";
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, r.getEvent_no());
			pstmt.setString(2, r.getReply());
			pstmt.setString(3, r.getUser_id());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("[댓글 insert]Amateur Dao:"+result);
		return result;
	}

	public int insertPlus(Connection conn, String user, int event_no) {
		PreparedStatement pstmt = null;

		int result = 0;

		String query = "INSERT INTO EVENT_LIKE VALUES(?,?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, event_no);
			pstmt.setString(2, user);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		System.out.println(result);
		
		return result;
	}

	public int insertMinus(Connection conn, String user, int event_no) {
		PreparedStatement pstmt = null;

		int result = 0;

		String query = "DELETE FROM EVENT_LIKE WHERE USER_ID=? AND EVENT_NO =?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, user);
			pstmt.setInt(2, event_no);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		System.out.println(result);
		
		return result;
	}

	public int selectTotalCount(Connection conn, int event_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int count =0;
		String query="SELECT COUNT(*)좋아요수 FROM EVENT_LIKE WHERE EVENT_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, event_no);
			
			rset = pstmt.executeQuery();
			while (rset.next()) {
				count = rset.getInt("좋아요수");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("[dao]좋아요 갯수:"+count);
		return count;
	}

	public MasterpieceCount selectHCount(Connection conn, int event_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		MasterpieceCount mc = new MasterpieceCount();
		String query = "SELECT COUNT(*)좋아요수 FROM EVENT_LIKE WHERE EVENT_NO = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, event_no);
			
			rset = pstmt.executeQuery();
			while (rset.next()) {
				mc = new MasterpieceCount(rset.getInt("좋아요수"));
									}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
		return mc;
	}

}
