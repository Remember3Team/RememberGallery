package artistapply.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import artistapply.model.dao.ApplyDao;
import artistapply.model.vo.Apply;
import artistapply.model.vo.Career;
import mypage_artist.RefundQnACard.model.dao.ArtistDao;
import product.model.vo.Attachment;

import static common.JDBCTemplate.*;

public class ApplyService {

	public int insertApply(Apply apply, ArrayList<Career> carlist) {
		Connection conn = getConnection();
		
		ApplyDao ad = new ApplyDao();
		
		int result1 = ad.insertApply(conn, apply);
		int result2 = ad.insertCareer(conn, carlist);
		
		if(result1 > 0 && result2 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		return result2;
	}

	

}
