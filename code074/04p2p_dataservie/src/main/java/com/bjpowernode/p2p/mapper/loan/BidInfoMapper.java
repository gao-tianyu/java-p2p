package com.bjpowernode.p2p.mapper.loan;

import com.bjpowernode.p2p.model.loan.BidInfo;

import java.util.List;
import java.util.Map;

public interface BidInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri May 10 15:36:32 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri May 10 15:36:32 CST 2019
     */
    int insert(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri May 10 15:36:32 CST 2019
     */
    int insertSelective(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri May 10 15:36:32 CST 2019
     */
    BidInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri May 10 15:36:32 CST 2019
     */
    int updateByPrimaryKeySelective(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri May 10 15:36:32 CST 2019
     */
    int updateByPrimaryKey(BidInfo record);

    Double selectSumBidMoney();

    List<BidInfo> selectBidInfoByLoanId(Map<String, Object> bidMap);

    List<BidInfo> selectBidInfoByUid(Map<String, Object> parMap);

    List<BidInfo> selectBidInfoListByLoanId(Integer id);
}