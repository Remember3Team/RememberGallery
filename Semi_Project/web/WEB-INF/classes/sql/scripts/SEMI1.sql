ALTER TABLE CAREER DROP COLUMN CAR_ETC;
ALTER TABLE CAREER DROP COLUMN CAR_FILE;

ALTER TABLE SELLER ADD(CAR_ETC NVARCHAR2(1000));

ALTER TABLE SELLER ADD(CAR_FILE NVARCHAR2(1000));

ALTER TABLE QUESTION DROP COLUMN Q_YN;
ALTER TABLE QUESTION ADD(Q_YN NVARCHAR2(20)	DEFAULT 'N');

ALTER TABLE BUY_LIST DROP COLUMN ORDER_DATE;

ALTER TABLE BUY_LIST ADD(ORDER_DATE DATE);

ALTER TABLE BUY_LIST ADD(SHIP_DATE DATE);

ALTER TABLE PAINT_Q ADD(PQ_YN NVARCHAR2(20) DEFAULT 'N');

ALTER TABLE MEMBER DROP COLUMN ENROLL_DATE;

ALTER TABLE MEMBER ADD(ENROLL_DATE DATE);

ALTER TABLE PAINT_PHOTO ADD(FILEPATH NVARCHAR2(100));

ALTER TABLE PAINT_PHOTO ADD(FILELEVEL NVARCHAR2(100));
