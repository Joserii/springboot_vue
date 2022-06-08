package com.example.service;

import com.example.dao.FundRepository;
import com.example.entity.Fund;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FundService {

    @Resource
    private FundRepository fundRepository;

    /**
     * 新增和修改接口
     * @param fund
     */
    public void save(Fund fund) {
        fundRepository.save(fund);
    }

    /**
     * 删除接口
     * @param id
     */
    public void delete(Long id) {
        fundRepository.deleteById(id);
    }

    /**
     * 根据id查询基金
     * @param id
     * @return
     */
    public Fund findById(Long id) {
        return fundRepository.findById(id).orElse(null);
    }

    /**
     * 分页查询基金
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Page<Fund> findPage(Integer pageNum, Integer pageSize, String name) {
        // 构建分页查询条件
        Sort sort = new Sort(Sort.Direction.DESC, "create_time");
        PageRequest pageRequest = PageRequest.of(pageNum - 1, pageSize, sort);
        return fundRepository.findNameLike(name, pageRequest);
    }
}
