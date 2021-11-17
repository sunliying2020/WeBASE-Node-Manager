package com.webank.webase.node.mgr.statistic.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.math.BigDecimal;

/**
 * statistic of block cycle, block size, tps
 */
@Data
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class TbStat implements Serializable {

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.group_id
     *
     * @mbg.generated
     */
    private String groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.block_cycle
     *
     * @mbg.generated
     */
    private Double blockCycle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.tps
     *
     * @mbg.generated
     */
    private Integer tps;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.block_number
     * todo big int
     * @mbg.generated
     */
    private Integer blockNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.block_size
     *
     * @mbg.generated
     */
    private Integer blockSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.stat_timestamp
     *
     * @mbg.generated
     */
    private String statTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_stat.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_stat
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}
